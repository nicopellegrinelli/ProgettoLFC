package compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.Token;

import variables.*;


public class SemanticHandler {
	//codici di errori e warning
	private static final int ALREADY_DEF_HDR_ERR = 10;
	private static final int NO_HOST_ERR = 11;
	private static final int CHARSET_ERR = 12;
	private static final int BOUNDARY_ERR = 13;
	private static final int BASIC_ERR = 14;
	private static final int DIGEST_ERR = 15;
	private static final int DIGEST_ELEMENT_ERR = 16;
	private static final int ALREADY_DEF_DIGEST_ELEMENT_ERR = 17;
	private static final int LANGUAGE_ERR = 18;
	private static final int ENCODING_ELEMENT_ERR = 19;
	
	private static final int BODY_GET_WARN = 100;
	private static final int NO_BODY_POST_WARN = 101;
	private static final int NO_CT_POST_WARN = 102;
	private static final int CT_GET_WARN = 103;
	//liste di errori e warning
	private List<CompilerError> errors;
	private List<CompilerError> warnings;
	//lista di digest element (dell'header authorization digest) per controlli semantici
	private List<String> digestElements;
	//informazioni estratte dalla request line
	private RequestLine requestLine;
	//informazioni estratte dalla lista di header
	private List<Header> headers;
	//informazioni estratte dal body
	private String body;
	private boolean existsBody;
	//output finale
	private String javaCode;

	//costruttore
	public SemanticHandler () {
		errors = new ArrayList<CompilerError>();
		warnings = new ArrayList<CompilerError>();
		digestElements = new ArrayList<String>();
		
		headers = new ArrayList<Header>();
		body = "";
		existsBody = false;
		
		javaCode = "";
	}
	
	//getters
	public List<CompilerError> getErrors() {
		return errors;
	}
	public List<CompilerError> getWarnings() {
		return warnings;
	}
	public String getJavaCode() {
		return javaCode;
	}
	
	//ottiene le informazioni dalla request line
	public RequestLine createRequestLine(String method, String path, String version) {	
		return new RequestLine(method, path, version);
	}
	//salva le informazioni dalla request line
	public void addRequestLine(RequestLine rl) {
		requestLine = rl;
	}

	//aggiunge un header alla lista, se tale header non è mai stato definito in precedenza
	public void addHeader(Header hdr) {
		if(hdr == null) {
			return;
		}
		String hdr_key =  hdr.getKey().getText().replaceAll("'", "");;
		for(Header h: headers) {
			String h_key = h.getKey().getText().replaceAll("'", "");
			if(hdr_key.equals(h_key)) {
				addError(hdr.getKey(), ALREADY_DEF_HDR_ERR);
				return;
			}
		}					
		headers.add(hdr);
	}
	
	//controlla che l'Host header sia definito e che
	//il Content-Type header sia solo nelle richieste POST
	public void checkHeaders() {
		boolean foundHost = false;
		boolean foundCT = false;
		for(Header h: headers) {
			String h_key = h.getKey().getText().replaceAll("'", "");
			if(h_key.equals("Host"))
				foundHost = true;
			if(h_key.equals("Content-Type"))
				foundCT = true;
		}
		if(!foundHost)
			addError(NO_HOST_ERR);
		if(requestLine != null && requestLine.getMethod() != null && requestLine.getMethod().equals("POST") && !foundCT)
			addWarning(NO_CT_POST_WARN);
		if(requestLine != null && requestLine.getMethod() != null && requestLine.getMethod().equals("GET") && foundCT)
			addWarning(CT_GET_WARN);
	}

	//aggiunge il backslash \ prima di ogni doppio apice, rimuove i singoli apici
	public String handleQuotes(String text) {
		return text.replaceAll("\"", "\\\\\"").replaceAll("'", "");
	}
	
	//aggiunge il backslash \ prima di ogni doppio apice,
	//in base al tipo di digest element sostituisce i singoli apici
	//con la stringa vuota o con \"
	public String handleDigestElement(String de, String str) {
		List<String> des_without_dq = new ArrayList<String>(
				Arrays.asList("algorithm", "nc", "qop"));
		if(des_without_dq.contains(de)) {
			return str.replaceAll("\"", "\\\\\"").replaceAll("'", "");
		}
		return str.replaceAll("'", "\"").replaceAll("\"", "\\\\\"");
	}
	
	//aggiunge il backslash \ prima di ogni doppio apice, rimuove i #
	public String handleBody(String text) {
		return text.replaceAll("\"", "\\\\\"").replaceAll("#", "");
	}
	
	//salva il contenuto del body
	public void addBody(String b) {
		body = b;
		existsBody = true;
	}
	
	//genera e salva la traduzione della richiesta in Java
	public void generateJavaCode() {
		if(requestLine != null && requestLine.getMethod() != null && requestLine.getMethod().equals("POST") && !existsBody)
			addWarning(NO_BODY_POST_WARN);
		if(requestLine != null && requestLine.getMethod() != null && requestLine.getMethod().equals("GET") && existsBody)
			addWarning(BODY_GET_WARN);
		
		if(!errors.isEmpty())
			return;
		
		//prima linea
		javaCode =  "HttpRequest request = HttpRequest.newBuilder()\n";
		
		//versione http
		if(requestLine.getVersion().equals("HTTP/1.1"))
			javaCode += "\t.version(HttpClient.Version.HTTP_1_1)\n";
		else
			javaCode += "\t.version(HttpClient.Version.HTTP_2)\n";
		
		//header & uri
		String headersStr = "";
		for(Header h: headers) {
			String key = h.getKey().getText().replaceAll("'", "");
			if(key.equals("Host")) {
				javaCode += "\t.uri(new URI(\"http://" + h.getValue() + requestLine.getPath() + "\"))\n";
			} else {
				headersStr += "\t.header(\"" + key +"\", \"" + h.getValue() + "\")\n";
			}
		}
		javaCode += headersStr;
		
		//method & body
		if(requestLine.getMethod().equals("GET")) {
			javaCode += "\t.GET()\n";
		} else {
			if(existsBody)
				javaCode += "\t.POST(HttpRequest.BodyPublishers.ofString(\"" + body + "\"))\n";
			else
				javaCode += "\t.POST(HttpRequest.BodyPublishers.noBody())\n";
		}
		
		//build
		javaCode += "\t.build();";
	}

	//genera errori sitattici e lessicali
	public void handleError(Token tk, String hdr, String msg) {
		String coord = "  [" + tk.getLine() + ":" + (tk.getCharPositionInLine()+1) + "] - ";
		errors.add(new CompilerError(tk.getLine(), 
					(tk.getCharPositionInLine()+1), coord + "Wrong information: " + msg + "."));
	}
	
	//genera errori semantici senza coordinate
	public void addError(int errorCode) {
		String err = "";
		switch (errorCode) {
		case NO_HOST_ERR:
			err = "  Missing information: 'Host' header never defined.";
			break;
		}
		errors.add(new CompilerError(Integer.MAX_VALUE, Integer.MAX_VALUE, err));
	}
	
	//genera errori semantici con coordinate
	public void addError(Token tk, int errorCode) {
		String err = "  [" + tk.getLine() + ":" + (tk.getCharPositionInLine()+1) + "] - ";
		switch (errorCode) {
		case ALREADY_DEF_HDR_ERR:
			err +=  "Duplicate information: '" + tk.getText() + "' header is already defined.";
			break;
		case CHARSET_ERR:
			err += "Wrong information: expected 'charset' but found '" + tk.getText() + "'.";
			break;
		case BOUNDARY_ERR:
			err += "Wrong information: expected 'boundary' but found '" + tk.getText() + "'.";
			break;
		case BASIC_ERR:
			err += "Wrong information: expected 'Basic' but found '" + tk.getText() + "'.";
			break;
		case DIGEST_ERR:
			err += "Wrong information: expected 'Digest' but found '" + tk.getText() + "'.";
			break;
		case DIGEST_ELEMENT_ERR:
			err += "Wrong information: '" + tk.getText() + "' is not a valid digest parameter.";
			break;
		case ALREADY_DEF_DIGEST_ELEMENT_ERR:
			err += "Duplicate information: '" + tk.getText() + "' digest parameter is already defined.";
			break;
		case LANGUAGE_ERR:
			err += "Wrong information: base language tag '" + tk.getText() + "' must have 2 or 3 characters.";
			break;
		case ENCODING_ELEMENT_ERR:
			err += "Wrong information: '" + tk.getText() + "' is not a valid encoding element.";
			break;
		}
		errors.add(new CompilerError(tk.getLine(), (tk.getCharPositionInLine()+1), err));
	}
	
	//genera warning senza coordinate
	public void addWarning(int warningCode) {
		String err = "  Warning: ";
		switch (warningCode) {
		case BODY_GET_WARN:
			err += "GET requests should not have a body, the current body will be ignored.";
			break;
		case NO_BODY_POST_WARN:
			err += "POST requests should have a body.";
			break;
		case NO_CT_POST_WARN:
			err += "POST requests should have the 'Content-Type' header.";
			break;
		case CT_GET_WARN:
			err += "GET requests should not have the 'Content-Type' header.";
			break;
		}
		warnings.add(new CompilerError(Integer.MAX_VALUE, Integer.MAX_VALUE, err));
	}

	//controlla che il token passato (di tipo ID) abbia valore "charset"
	public void checkCharset(Token tk) {
		if(!tk.getText().equals("charset"))
			addError(tk, CHARSET_ERR);
	}

	//controlla che il token passato (di tipo ID) abbia valore "boundary"
	public void checkBoundary(Token tk) {
		if(!tk.getText().equals("boundary"))
			addError(tk, BOUNDARY_ERR);
	}

	//controlla che il token passato (di tipo ID) abbia 2 o 3 caratteri
	public void checkLanguage(Token tk) {
		if(tk.getText().length() < 2 || tk.getText().length() > 3)
			addError(tk, LANGUAGE_ERR);
	}

	//controlla che il token passato (di tipo ID) abbia valore tra quelli ammessi per
	//gli encoding element
	public void checkEncodingElement(Token tk) {
		List<String> ees = new ArrayList<String>(Arrays.asList("gzip", "compress", "deflate", "br", "identity"));
		if(!ees.contains(tk.getText()))
			addError(tk, ENCODING_ELEMENT_ERR);
	}
	
	//controlla che il token passato (di tipo ID) abbia valore "basic"
	public String checkBasic(Token tk) {
		if(!tk.getText().equals("Basic"))
			addError(tk, BASIC_ERR);
		return tk.getText();
	}

	//controlla che il token passato (di tipo ID) abbia valore "digest"
	public String checkDigest(Token tk) {
		if(!tk.getText().equals("Digest"))
			addError(tk, DIGEST_ERR);
		return tk.getText();
	}

	//controlla che il token passato (di tipo ID) abbia valore tra quelli ammessi per
	//i digest element e che non ce ne siano due identici
	public void checkDigestElement(Token tk) {
		List<String> des = new ArrayList<String>(
				Arrays.asList("username", "realm", "uri", "algorithm", "nonce", "nc", "cnonce", "qop", "response", "opaque"));
		if(!des.contains(tk.getText())) {
			addError(tk, DIGEST_ELEMENT_ERR);
			return;
		}
		for(String d: digestElements) {
			if(d.equals(tk.getText())) {
				addError(tk, ALREADY_DEF_DIGEST_ELEMENT_ERR);
				return;
			}
		}
		digestElements.add(tk.getText());
	}
}
