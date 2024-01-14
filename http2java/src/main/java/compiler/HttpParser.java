// $ANTLR 3.5.1 C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-14 17:08:23

	package compiler; 		
	import utils.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "ACCEPT_ENCODING", "ACCEPT_LANGUAGE", 
		"ALGORITHM", "ALPHA_CHAR", "ALPHA_NUM_CHAR", "AUTHORIZATION", "BASIC", 
		"BOUNDARY", "CACHE_CONTROL", "CHARSET", "CLOSE", "CNONCE", "COLUMN", "COMMA", 
		"COMMENT", "CONNECTION", "CONTENT_LENGTH", "CONTENT_TYPE", "COOKIE", "DIGEST", 
		"DNS", "DNS_ELEMENT", "ENCODING_ELEMENT", "EQUALS", "ERROR_TOKEN", "ESC_SEQ", 
		"GET", "HEX_DIGIT", "HOST", "HTTP_VERSION", "INT_NUM", "IPV4", "KEEP_ALIVE", 
		"LANGUAGE_ELEMENT", "MIME", "MIME_SUBTYPE", "MIME_TYPE", "MULTIPART_MIME", 
		"NC", "NONCE", "NUM", "OCTAL_ESC", "OPAQUE", "PATH", "PATH_ELEMENT", "POST", 
		"PRODUCT", "PRODUCT_INFO", "Q", "QOP", "QUERY_ELEMENT", "Q_VAL", "REALM", 
		"RESPONSE", "SEMI_COLUMN", "STAR", "STRING", "TERMINAL", "UNICODE_ESC", 
		"URI", "USERNAME", "USER_AGENT", "VERS_NUM", "WS"
	};
	public static final int EOF=-1;
	public static final int ACCEPT=4;
	public static final int ACCEPT_ENCODING=5;
	public static final int ACCEPT_LANGUAGE=6;
	public static final int ALGORITHM=7;
	public static final int ALPHA_CHAR=8;
	public static final int ALPHA_NUM_CHAR=9;
	public static final int AUTHORIZATION=10;
	public static final int BASIC=11;
	public static final int BOUNDARY=12;
	public static final int CACHE_CONTROL=13;
	public static final int CHARSET=14;
	public static final int CLOSE=15;
	public static final int CNONCE=16;
	public static final int COLUMN=17;
	public static final int COMMA=18;
	public static final int COMMENT=19;
	public static final int CONNECTION=20;
	public static final int CONTENT_LENGTH=21;
	public static final int CONTENT_TYPE=22;
	public static final int COOKIE=23;
	public static final int DIGEST=24;
	public static final int DNS=25;
	public static final int DNS_ELEMENT=26;
	public static final int ENCODING_ELEMENT=27;
	public static final int EQUALS=28;
	public static final int ERROR_TOKEN=29;
	public static final int ESC_SEQ=30;
	public static final int GET=31;
	public static final int HEX_DIGIT=32;
	public static final int HOST=33;
	public static final int HTTP_VERSION=34;
	public static final int INT_NUM=35;
	public static final int IPV4=36;
	public static final int KEEP_ALIVE=37;
	public static final int LANGUAGE_ELEMENT=38;
	public static final int MIME=39;
	public static final int MIME_SUBTYPE=40;
	public static final int MIME_TYPE=41;
	public static final int MULTIPART_MIME=42;
	public static final int NC=43;
	public static final int NONCE=44;
	public static final int NUM=45;
	public static final int OCTAL_ESC=46;
	public static final int OPAQUE=47;
	public static final int PATH=48;
	public static final int PATH_ELEMENT=49;
	public static final int POST=50;
	public static final int PRODUCT=51;
	public static final int PRODUCT_INFO=52;
	public static final int Q=53;
	public static final int QOP=54;
	public static final int QUERY_ELEMENT=55;
	public static final int Q_VAL=56;
	public static final int REALM=57;
	public static final int RESPONSE=58;
	public static final int SEMI_COLUMN=59;
	public static final int STAR=60;
	public static final int STRING=61;
	public static final int TERMINAL=62;
	public static final int UNICODE_ESC=63;
	public static final int URI=64;
	public static final int USERNAME=65;
	public static final int USER_AGENT=66;
	public static final int VERS_NUM=67;
	public static final int WS=68;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HttpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HttpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return HttpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g"; }


		SemanticHandler h = new SemanticHandler();
		
		public SemanticHandler getHandler() {
			return h;
		}
		
		public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String hdr = getErrorHeader(e);
			String msg = getErrorMessage(e, tokenNames);
			System.err.println(hdr + " -- " + msg);
		}
		



	// $ANTLR start "request"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:37:1: request : rl= requestLine (hdr= header )* (b= body )? ;
	public final void request() throws RecognitionException {
		RequestLine rl =null;
		Header hdr =null;
		String b =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:38:2: (rl= requestLine (hdr= header )* (b= body )? )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:38:4: rl= requestLine (hdr= header )* (b= body )?
			{
			pushFollow(FOLLOW_requestLine_in_request61);
			rl=requestLine();
			state._fsp--;

			 h.addRequestLine(rl); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:39:3: (hdr= header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==STRING) ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1==COLUMN) ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= ACCEPT && LA1_0 <= ACCEPT_LANGUAGE)||LA1_0==AUTHORIZATION||LA1_0==CACHE_CONTROL||(LA1_0 >= CONNECTION && LA1_0 <= COOKIE)||LA1_0==HOST||LA1_0==USER_AGENT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:39:4: hdr= header
					{
					pushFollow(FOLLOW_header_in_request70);
					hdr=header();
					state._fsp--;

					 h.addHeader(hdr); 
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:40:3: (b= body )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==STRING) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:40:4: b= body
					{
					pushFollow(FOLLOW_body_in_request81);
					b=body();
					state._fsp--;

					 h.addBody(b); 
					}
					break;

			}

			 h.generateJavaCode(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "request"



	// $ANTLR start "requestLine"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:44:1: requestLine returns [RequestLine rl] : m= method p= pathRule v= HTTP_VERSION TERMINAL ;
	public final RequestLine requestLine() throws RecognitionException {
		RequestLine rl = null;


		Token v=null;
		String m =null;
		String p =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:45:2: (m= method p= pathRule v= HTTP_VERSION TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:45:4: m= method p= pathRule v= HTTP_VERSION TERMINAL
			{
			pushFollow(FOLLOW_method_in_requestLine106);
			m=method();
			state._fsp--;

			pushFollow(FOLLOW_pathRule_in_requestLine112);
			p=pathRule();
			state._fsp--;

			v=(Token)match(input,HTTP_VERSION,FOLLOW_HTTP_VERSION_in_requestLine118); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_requestLine122); 
			 rl = h.createRequestLine(m, p, v.getText()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return rl;
	}
	// $ANTLR end "requestLine"



	// $ANTLR start "pathRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:51:1: pathRule returns [String p] : (s= PATH |s= STRING ) ;
	public final String pathRule() throws RecognitionException {
		String p = null;


		Token s=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:52:2: ( (s= PATH |s= STRING ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:52:4: (s= PATH |s= STRING )
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:52:4: (s= PATH |s= STRING )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==PATH) ) {
				alt3=1;
			}
			else if ( (LA3_0==STRING) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:52:5: s= PATH
					{
					s=(Token)match(input,PATH,FOLLOW_PATH_in_pathRule141); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:53:4: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_pathRule148); 
					}
					break;

			}

			 p = s.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "pathRule"



	// $ANTLR start "method"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:56:1: method returns [String m] : (s= GET |s= POST ) ;
	public final String method() throws RecognitionException {
		String m = null;


		Token s=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:2: ( (s= GET |s= POST ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:4: (s= GET |s= POST )
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:4: (s= GET |s= POST )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==GET) ) {
				alt4=1;
			}
			else if ( (LA4_0==POST) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:5: s= GET
					{
					s=(Token)match(input,GET,FOLLOW_GET_in_method168); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:4: s= POST
					{
					s=(Token)match(input,POST,FOLLOW_POST_in_method175); 
					}
					break;

			}

			 m = s.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return m;
	}
	// $ANTLR end "method"



	// $ANTLR start "header"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:61:1: header returns [Header hdr] : (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= contentLengthRule |hd= connectionRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= genericHeaderRule ) ;
	public final Header header() throws RecognitionException {
		Header hdr = null;


		Header hd =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:62:2: ( (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= contentLengthRule |hd= connectionRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= genericHeaderRule ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:62:4: (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= contentLengthRule |hd= connectionRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= genericHeaderRule )
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:62:4: (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= contentLengthRule |hd= connectionRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= genericHeaderRule )
			int alt5=12;
			switch ( input.LA(1) ) {
			case HOST:
				{
				alt5=1;
				}
				break;
			case USER_AGENT:
				{
				alt5=2;
				}
				break;
			case CONTENT_TYPE:
				{
				alt5=3;
				}
				break;
			case ACCEPT:
				{
				alt5=4;
				}
				break;
			case COOKIE:
				{
				alt5=5;
				}
				break;
			case AUTHORIZATION:
				{
				alt5=6;
				}
				break;
			case CONTENT_LENGTH:
				{
				alt5=7;
				}
				break;
			case CONNECTION:
				{
				alt5=8;
				}
				break;
			case ACCEPT_LANGUAGE:
				{
				alt5=9;
				}
				break;
			case ACCEPT_ENCODING:
				{
				alt5=10;
				}
				break;
			case CACHE_CONTROL:
				{
				alt5=11;
				}
				break;
			case STRING:
				{
				alt5=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:62:5: hd= hostRule
					{
					pushFollow(FOLLOW_hostRule_in_header196);
					hd=hostRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:63:4: hd= userAgentRule
					{
					pushFollow(FOLLOW_userAgentRule_in_header203);
					hd=userAgentRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:64:4: hd= contentTypeRule
					{
					pushFollow(FOLLOW_contentTypeRule_in_header210);
					hd=contentTypeRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:65:4: hd= acceptRule
					{
					pushFollow(FOLLOW_acceptRule_in_header217);
					hd=acceptRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:66:4: hd= cookieRule
					{
					pushFollow(FOLLOW_cookieRule_in_header224);
					hd=cookieRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:67:4: hd= authorizationRule
					{
					pushFollow(FOLLOW_authorizationRule_in_header231);
					hd=authorizationRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:68:4: hd= contentLengthRule
					{
					pushFollow(FOLLOW_contentLengthRule_in_header238);
					hd=contentLengthRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:69:4: hd= connectionRule
					{
					pushFollow(FOLLOW_connectionRule_in_header245);
					hd=connectionRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:70:4: hd= acceptLanguageRule
					{
					pushFollow(FOLLOW_acceptLanguageRule_in_header252);
					hd=acceptLanguageRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:71:4: hd= acceptEncodingRule
					{
					pushFollow(FOLLOW_acceptEncodingRule_in_header259);
					hd=acceptEncodingRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:72:4: hd= chacheControlRule
					{
					pushFollow(FOLLOW_chacheControlRule_in_header266);
					hd=chacheControlRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:73:4: hd= genericHeaderRule
					{
					pushFollow(FOLLOW_genericHeaderRule_in_header273);
					hd=genericHeaderRule();
					state._fsp--;

					}
					break;

			}

			 hdr = hd;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hdr;
	}
	// $ANTLR end "header"



	// $ANTLR start "hostRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:77:1: hostRule returns [Header hd] :k= HOST COLUMN (v= ( DNS | IPV4 ) ) ( (c= COLUMN n= INT_NUM ) )? TERMINAL ;
	public final Header hostRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token v=null;
		Token c=null;
		Token n=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:78:2: (k= HOST COLUMN (v= ( DNS | IPV4 ) ) ( (c= COLUMN n= INT_NUM ) )? TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:78:4: k= HOST COLUMN (v= ( DNS | IPV4 ) ) ( (c= COLUMN n= INT_NUM ) )? TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,HOST,FOLLOW_HOST_in_hostRule299); 
			match(input,COLUMN,FOLLOW_COLUMN_in_hostRule301); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:3: (v= ( DNS | IPV4 ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:4: v= ( DNS | IPV4 )
			{
			v=input.LT(1);
			if ( input.LA(1)==DNS||input.LA(1)==IPV4 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 value = v.getText(); 
			}

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:3: ( (c= COLUMN n= INT_NUM ) )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==COLUMN) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:4: (c= COLUMN n= INT_NUM )
					{
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:4: (c= COLUMN n= INT_NUM )
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:5: c= COLUMN n= INT_NUM
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_hostRule326); 
					n=(Token)match(input,INT_NUM,FOLLOW_INT_NUM_in_hostRule330); 
					}

					 value += c.getText() + n.getText(); 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_hostRule339); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "hostRule"



	// $ANTLR start "userAgentRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:85:1: userAgentRule returns [Header hd] :k= USER_AGENT COLUMN p= productRule (p1= productRule (e= extensionRule )* )? TERMINAL ;
	public final Header userAgentRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String p =null;
		String p1 =null;
		String e =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:86:2: (k= USER_AGENT COLUMN p= productRule (p1= productRule (e= extensionRule )* )? TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:86:4: k= USER_AGENT COLUMN p= productRule (p1= productRule (e= extensionRule )* )? TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,USER_AGENT,FOLLOW_USER_AGENT_in_userAgentRule362); 
			match(input,COLUMN,FOLLOW_COLUMN_in_userAgentRule364); 
			pushFollow(FOLLOW_productRule_in_userAgentRule370);
			p=productRule();
			state._fsp--;

			 value = p; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:89:3: (p1= productRule (e= extensionRule )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==PRODUCT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:89:4: p1= productRule (e= extensionRule )*
					{
					pushFollow(FOLLOW_productRule_in_userAgentRule379);
					p1=productRule();
					state._fsp--;

					 value += " " + p1; 
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:90:3: (e= extensionRule )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==PRODUCT) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:90:4: e= extensionRule
							{
							pushFollow(FOLLOW_extensionRule_in_userAgentRule388);
							e=extensionRule();
							state._fsp--;

							 value += " " + e; 
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_userAgentRule398); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "userAgentRule"



	// $ANTLR start "productRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:94:1: productRule returns [String s] : p= PRODUCT (pi= PRODUCT_INFO )? ;
	public final String productRule() throws RecognitionException {
		String s = null;


		Token p=null;
		Token pi=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:2: (p= PRODUCT (pi= PRODUCT_INFO )? )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:4: p= PRODUCT (pi= PRODUCT_INFO )?
			{
			p=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_productRule417); 
			 s = p.getText(); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:96:3: (pi= PRODUCT_INFO )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PRODUCT_INFO) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:96:4: pi= PRODUCT_INFO
					{
					pi=(Token)match(input,PRODUCT_INFO,FOLLOW_PRODUCT_INFO_in_productRule426); 
					 s += " " + pi.getText();
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "productRule"



	// $ANTLR start "extensionRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:1: extensionRule returns [String s] : p= PRODUCT ;
	public final String extensionRule() throws RecognitionException {
		String s = null;


		Token p=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:2: (p= PRODUCT )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:4: p= PRODUCT
			{
			p=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_extensionRule447); 
			 s = p.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "extensionRule"



	// $ANTLR start "acceptRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:103:1: acceptRule returns [Header hd] : k= ACCEPT COLUMN value= mimeList TERMINAL ;
	public final Header acceptRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:104:2: (k= ACCEPT COLUMN value= mimeList TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:104:4: k= ACCEPT COLUMN value= mimeList TERMINAL
			{
			k=(Token)match(input,ACCEPT,FOLLOW_ACCEPT_in_acceptRule466); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptRule468); 
			pushFollow(FOLLOW_mimeList_in_acceptRule474);
			value=mimeList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptRule478); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "acceptRule"



	// $ANTLR start "mimeList"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:109:1: mimeList returns [String s] : m= mimeElement (c= COMMA m1= mimeElement )* ;
	public final String mimeList() throws RecognitionException {
		String s = null;


		Token c=null;
		String m =null;
		String m1 =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:110:2: (m= mimeElement (c= COMMA m1= mimeElement )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:110:4: m= mimeElement (c= COMMA m1= mimeElement )*
			{
			pushFollow(FOLLOW_mimeElement_in_mimeList497);
			m=mimeElement();
			state._fsp--;

			 s = m; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:3: (c= COMMA m1= mimeElement )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:4: c= COMMA m1= mimeElement
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_mimeList506); 
					pushFollow(FOLLOW_mimeElement_in_mimeList510);
					m1=mimeElement();
					state._fsp--;

					 s += c.getText() + " " + m1; 
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "mimeList"



	// $ANTLR start "mimeElement"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:114:1: mimeElement returns [String s] : m= MIME (q= qValueRule )? ;
	public final String mimeElement() throws RecognitionException {
		String s = null;


		Token m=null;
		String q =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:2: (m= MIME (q= qValueRule )? )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:4: m= MIME (q= qValueRule )?
			{
			m=(Token)match(input,MIME,FOLLOW_MIME_in_mimeElement531); 
			 s = m.getText();
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:3: (q= qValueRule )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==SEMI_COLUMN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:4: q= qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_mimeElement540);
					q=qValueRule();
					state._fsp--;

					 s += q; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "mimeElement"



	// $ANTLR start "contentTypeRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:119:1: contentTypeRule returns [Header hd] :k= CONTENT_TYPE COLUMN (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule ) TERMINAL ;
	public final Header contentTypeRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token m=null;
		String cs =null;
		String b =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:120:2: (k= CONTENT_TYPE COLUMN (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule ) TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:120:4: k= CONTENT_TYPE COLUMN (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule ) TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,CONTENT_TYPE,FOLLOW_CONTENT_TYPE_in_contentTypeRule566); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentTypeRule568); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:3: (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==MIME) ) {
				alt13=1;
			}
			else if ( (LA13_0==MULTIPART_MIME) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:4: m= MIME (cs= charsetRule )?
					{
					m=(Token)match(input,MIME,FOLLOW_MIME_in_contentTypeRule575); 
					 value = m.getText(); 
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:37: (cs= charsetRule )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==SEMI_COLUMN) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:38: cs= charsetRule
							{
							pushFollow(FOLLOW_charsetRule_in_contentTypeRule582);
							cs=charsetRule();
							state._fsp--;

							 value += cs; 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:4: m= MULTIPART_MIME b= boundaryRule
					{
					m=(Token)match(input,MULTIPART_MIME,FOLLOW_MULTIPART_MIME_in_contentTypeRule593); 
					pushFollow(FOLLOW_boundaryRule_in_contentTypeRule597);
					b=boundaryRule();
					state._fsp--;

					 value = m.getText() + b; 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentTypeRule605); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "contentTypeRule"



	// $ANTLR start "charsetRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:127:1: charsetRule returns [String s] : sc= SEMI_COLUMN cs= CHARSET e= EQUALS str= STRING ;
	public final String charsetRule() throws RecognitionException {
		String s = null;


		Token sc=null;
		Token cs=null;
		Token e=null;
		Token str=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:2: (sc= SEMI_COLUMN cs= CHARSET e= EQUALS str= STRING )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:4: sc= SEMI_COLUMN cs= CHARSET e= EQUALS str= STRING
			{
			sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_charsetRule624); 
			cs=(Token)match(input,CHARSET,FOLLOW_CHARSET_in_charsetRule628); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_charsetRule632); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_charsetRule636); 
			 s = sc.getText() + " " + cs.getText() + e.getText() + h.substituteSingleQuote(str.getText(), ""); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "charsetRule"



	// $ANTLR start "boundaryRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:132:1: boundaryRule returns [String s] : sc= SEMI_COLUMN b= BOUNDARY e= EQUALS str= STRING ;
	public final String boundaryRule() throws RecognitionException {
		String s = null;


		Token sc=null;
		Token b=null;
		Token e=null;
		Token str=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:2: (sc= SEMI_COLUMN b= BOUNDARY e= EQUALS str= STRING )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:4: sc= SEMI_COLUMN b= BOUNDARY e= EQUALS str= STRING
			{
			sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_boundaryRule658); 
			b=(Token)match(input,BOUNDARY,FOLLOW_BOUNDARY_in_boundaryRule662); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boundaryRule666); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_boundaryRule670); 
			 s = sc.getText() + " " + b.getText() + e.getText() + h.substituteSingleQuote(str.getText(), ""); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "boundaryRule"



	// $ANTLR start "cookieRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:137:1: cookieRule returns [Header hd] : k= COOKIE COLUMN value= cookieList TERMINAL ;
	public final Header cookieRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:2: (k= COOKIE COLUMN value= cookieList TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:4: k= COOKIE COLUMN value= cookieList TERMINAL
			{
			k=(Token)match(input,COOKIE,FOLLOW_COOKIE_in_cookieRule692); 
			match(input,COLUMN,FOLLOW_COLUMN_in_cookieRule694); 
			pushFollow(FOLLOW_cookieList_in_cookieRule700);
			value=cookieList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_cookieRule704); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "cookieRule"



	// $ANTLR start "cookieList"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:143:1: cookieList returns [String s] : ce= cookieElement (sc= SEMI_COLUMN ce1= cookieElement )* ;
	public final String cookieList() throws RecognitionException {
		String s = null;


		Token sc=null;
		String ce =null;
		String ce1 =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:2: (ce= cookieElement (sc= SEMI_COLUMN ce1= cookieElement )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:4: ce= cookieElement (sc= SEMI_COLUMN ce1= cookieElement )*
			{
			pushFollow(FOLLOW_cookieElement_in_cookieList723);
			ce=cookieElement();
			state._fsp--;

			 s = ce; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:3: (sc= SEMI_COLUMN ce1= cookieElement )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==SEMI_COLUMN) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:4: sc= SEMI_COLUMN ce1= cookieElement
					{
					sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_cookieList732); 
					pushFollow(FOLLOW_cookieElement_in_cookieList736);
					ce1=cookieElement();
					state._fsp--;

					 s += sc.getText() + " " + ce1; 
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "cookieList"



	// $ANTLR start "cookieElement"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:148:1: cookieElement returns [String s] : str1= STRING e= EQUALS str2= STRING ;
	public final String cookieElement() throws RecognitionException {
		String s = null;


		Token str1=null;
		Token e=null;
		Token str2=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:2: (str1= STRING e= EQUALS str2= STRING )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:4: str1= STRING e= EQUALS str2= STRING
			{
			str1=(Token)match(input,STRING,FOLLOW_STRING_in_cookieElement758); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cookieElement762); 
			str2=(Token)match(input,STRING,FOLLOW_STRING_in_cookieElement766); 
			 s = h.substituteSingleQuote(str1.getText(), "") + e.getText() + h.substituteSingleQuote(str2.getText(), ""); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "cookieElement"



	// $ANTLR start "qValueRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:153:1: qValueRule returns [String s] : sc= SEMI_COLUMN q= Q e= EQUALS qv= Q_VAL ;
	public final String qValueRule() throws RecognitionException {
		String s = null;


		Token sc=null;
		Token q=null;
		Token e=null;
		Token qv=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:154:2: (sc= SEMI_COLUMN q= Q e= EQUALS qv= Q_VAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:154:4: sc= SEMI_COLUMN q= Q e= EQUALS qv= Q_VAL
			{
			sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_qValueRule787); 
			q=(Token)match(input,Q,FOLLOW_Q_in_qValueRule791); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_qValueRule795); 
			qv=(Token)match(input,Q_VAL,FOLLOW_Q_VAL_in_qValueRule799); 
			 s = sc.getText() + q.getText() + e.getText() + qv.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "qValueRule"



	// $ANTLR start "authorizationRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:158:1: authorizationRule returns [Header hd] : k= AUTHORIZATION COLUMN (value= basicAuthRule |value= digestAuthRule ) TERMINAL ;
	public final Header authorizationRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:2: (k= AUTHORIZATION COLUMN (value= basicAuthRule |value= digestAuthRule ) TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:4: k= AUTHORIZATION COLUMN (value= basicAuthRule |value= digestAuthRule ) TERMINAL
			{
			k=(Token)match(input,AUTHORIZATION,FOLLOW_AUTHORIZATION_in_authorizationRule821); 
			match(input,COLUMN,FOLLOW_COLUMN_in_authorizationRule823); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:160:3: (value= basicAuthRule |value= digestAuthRule )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BASIC) ) {
				alt15=1;
			}
			else if ( (LA15_0==DIGEST) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:160:4: value= basicAuthRule
					{
					pushFollow(FOLLOW_basicAuthRule_in_authorizationRule830);
					value=basicAuthRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:161:5: value= digestAuthRule
					{
					pushFollow(FOLLOW_digestAuthRule_in_authorizationRule838);
					value=digestAuthRule();
					state._fsp--;

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_authorizationRule843); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "authorizationRule"



	// $ANTLR start "basicAuthRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:165:1: basicAuthRule returns [String s] : b= BASIC str= STRING ;
	public final String basicAuthRule() throws RecognitionException {
		String s = null;


		Token b=null;
		Token str=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:166:2: (b= BASIC str= STRING )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:166:4: b= BASIC str= STRING
			{
			b=(Token)match(input,BASIC,FOLLOW_BASIC_in_basicAuthRule862); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_basicAuthRule866); 
			 s = b.getText() + " " + h.substituteSingleQuote(str.getText(), ""); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "basicAuthRule"



	// $ANTLR start "digestAuthRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:170:1: digestAuthRule returns [String s] : d= DIGEST a= authRule (c= COMMA a1= authRule )* ;
	public final String digestAuthRule() throws RecognitionException {
		String s = null;


		Token d=null;
		Token c=null;
		String a =null;
		String a1 =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:171:2: (d= DIGEST a= authRule (c= COMMA a1= authRule )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:171:4: d= DIGEST a= authRule (c= COMMA a1= authRule )*
			{
			d=(Token)match(input,DIGEST,FOLLOW_DIGEST_in_digestAuthRule887); 
			 s = d.getText(); 
			pushFollow(FOLLOW_authRule_in_digestAuthRule895);
			a=authRule();
			state._fsp--;

			 s += " " + a; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:173:3: (c= COMMA a1= authRule )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:173:4: c= COMMA a1= authRule
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_digestAuthRule904); 
					pushFollow(FOLLOW_authRule_in_digestAuthRule908);
					a1=authRule();
					state._fsp--;

					 s += c.getText() + " " + a1; 
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "digestAuthRule"



	// $ANTLR start "authRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:1: authRule returns [String s] : (t= USERNAME |t= REALM |t= URI |t= ALGORITHM |t= NONCE |t= NC |t= CNONCE |t= QOP |t= RESPONSE |t= OPAQUE ) e= EQUALS str= STRING ;
	public final String authRule() throws RecognitionException {
		String s = null;


		Token t=null;
		Token e=null;
		Token str=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:177:2: ( (t= USERNAME |t= REALM |t= URI |t= ALGORITHM |t= NONCE |t= NC |t= CNONCE |t= QOP |t= RESPONSE |t= OPAQUE ) e= EQUALS str= STRING )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:177:4: (t= USERNAME |t= REALM |t= URI |t= ALGORITHM |t= NONCE |t= NC |t= CNONCE |t= QOP |t= RESPONSE |t= OPAQUE ) e= EQUALS str= STRING
			{
			 String substituter = "\\\\\""; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:178:2: (t= USERNAME |t= REALM |t= URI |t= ALGORITHM |t= NONCE |t= NC |t= CNONCE |t= QOP |t= RESPONSE |t= OPAQUE )
			int alt17=10;
			switch ( input.LA(1) ) {
			case USERNAME:
				{
				alt17=1;
				}
				break;
			case REALM:
				{
				alt17=2;
				}
				break;
			case URI:
				{
				alt17=3;
				}
				break;
			case ALGORITHM:
				{
				alt17=4;
				}
				break;
			case NONCE:
				{
				alt17=5;
				}
				break;
			case NC:
				{
				alt17=6;
				}
				break;
			case CNONCE:
				{
				alt17=7;
				}
				break;
			case QOP:
				{
				alt17=8;
				}
				break;
			case RESPONSE:
				{
				alt17=9;
				}
				break;
			case OPAQUE:
				{
				alt17=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:178:3: t= USERNAME
					{
					t=(Token)match(input,USERNAME,FOLLOW_USERNAME_in_authRule934); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:179:4: t= REALM
					{
					t=(Token)match(input,REALM,FOLLOW_REALM_in_authRule942); 
					}
					break;
				case 3 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:180:4: t= URI
					{
					t=(Token)match(input,URI,FOLLOW_URI_in_authRule949); 
					}
					break;
				case 4 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:181:4: t= ALGORITHM
					{
					t=(Token)match(input,ALGORITHM,FOLLOW_ALGORITHM_in_authRule957); 
					 substituter = ""; 
					}
					break;
				case 5 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:182:4: t= NONCE
					{
					t=(Token)match(input,NONCE,FOLLOW_NONCE_in_authRule966); 
					}
					break;
				case 6 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:183:4: t= NC
					{
					t=(Token)match(input,NC,FOLLOW_NC_in_authRule973); 
					 substituter = ""; 
					}
					break;
				case 7 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:184:4: t= CNONCE
					{
					t=(Token)match(input,CNONCE,FOLLOW_CNONCE_in_authRule982); 
					}
					break;
				case 8 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:185:4: t= QOP
					{
					t=(Token)match(input,QOP,FOLLOW_QOP_in_authRule989); 
					 substituter = ""; 
					}
					break;
				case 9 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:186:4: t= RESPONSE
					{
					t=(Token)match(input,RESPONSE,FOLLOW_RESPONSE_in_authRule998); 
					}
					break;
				case 10 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:4: t= OPAQUE
					{
					t=(Token)match(input,OPAQUE,FOLLOW_OPAQUE_in_authRule1005); 
					}
					break;

			}

			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_authRule1012); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_authRule1016); 
			 s = t.getText() + e.getText() + h.substituteSingleQuote(str.getText(), substituter); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "authRule"



	// $ANTLR start "contentLengthRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:1: contentLengthRule returns [Header hd] : k= CONTENT_LENGTH COLUMN value= INT_NUM TERMINAL ;
	public final Header contentLengthRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token value=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:193:2: (k= CONTENT_LENGTH COLUMN value= INT_NUM TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:193:4: k= CONTENT_LENGTH COLUMN value= INT_NUM TERMINAL
			{
			k=(Token)match(input,CONTENT_LENGTH,FOLLOW_CONTENT_LENGTH_in_contentLengthRule1035); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentLengthRule1037); 
			value=(Token)match(input,INT_NUM,FOLLOW_INT_NUM_in_contentLengthRule1043); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentLengthRule1047); 
			 hd = new Header(k.getText(), value.getText()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "contentLengthRule"



	// $ANTLR start "connectionRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:198:1: connectionRule returns [Header hd] : k= CONNECTION COLUMN (value= KEEP_ALIVE |value= CLOSE ) TERMINAL ;
	public final Header connectionRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token value=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:2: (k= CONNECTION COLUMN (value= KEEP_ALIVE |value= CLOSE ) TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:4: k= CONNECTION COLUMN (value= KEEP_ALIVE |value= CLOSE ) TERMINAL
			{
			k=(Token)match(input,CONNECTION,FOLLOW_CONNECTION_in_connectionRule1066); 
			match(input,COLUMN,FOLLOW_COLUMN_in_connectionRule1068); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:3: (value= KEEP_ALIVE |value= CLOSE )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KEEP_ALIVE) ) {
				alt18=1;
			}
			else if ( (LA18_0==CLOSE) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:4: value= KEEP_ALIVE
					{
					value=(Token)match(input,KEEP_ALIVE,FOLLOW_KEEP_ALIVE_in_connectionRule1075); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:23: value= CLOSE
					{
					value=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_connectionRule1081); 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_connectionRule1086); 
			 hd = new Header(k.getText(), value.getText()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "connectionRule"



	// $ANTLR start "acceptLanguageRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:204:1: acceptLanguageRule returns [Header hd] : k= ACCEPT_LANGUAGE COLUMN value= languageList TERMINAL ;
	public final Header acceptLanguageRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:205:2: (k= ACCEPT_LANGUAGE COLUMN value= languageList TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:205:4: k= ACCEPT_LANGUAGE COLUMN value= languageList TERMINAL
			{
			k=(Token)match(input,ACCEPT_LANGUAGE,FOLLOW_ACCEPT_LANGUAGE_in_acceptLanguageRule1105); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptLanguageRule1107); 
			pushFollow(FOLLOW_languageList_in_acceptLanguageRule1113);
			value=languageList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptLanguageRule1117); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "acceptLanguageRule"



	// $ANTLR start "languageList"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:1: languageList returns [String s] : le= languageElement (c= COMMA le1= languageElement )* ;
	public final String languageList() throws RecognitionException {
		String s = null;


		Token c=null;
		String le =null;
		String le1 =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:211:2: (le= languageElement (c= COMMA le1= languageElement )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:211:4: le= languageElement (c= COMMA le1= languageElement )*
			{
			pushFollow(FOLLOW_languageElement_in_languageList1136);
			le=languageElement();
			state._fsp--;

			 s = le; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:212:3: (c= COMMA le1= languageElement )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:212:4: c= COMMA le1= languageElement
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_languageList1145); 
					pushFollow(FOLLOW_languageElement_in_languageList1149);
					le1=languageElement();
					state._fsp--;

					 s += c.getText() + " " + le1; 
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "languageList"



	// $ANTLR start "languageElement"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:215:1: languageElement returns [String s] : (le= LANGUAGE_ELEMENT |le= STAR ) (q= qValueRule )? ;
	public final String languageElement() throws RecognitionException {
		String s = null;


		Token le=null;
		String q =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:216:2: ( (le= LANGUAGE_ELEMENT |le= STAR ) (q= qValueRule )? )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:216:4: (le= LANGUAGE_ELEMENT |le= STAR ) (q= qValueRule )?
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:216:4: (le= LANGUAGE_ELEMENT |le= STAR )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LANGUAGE_ELEMENT) ) {
				alt20=1;
			}
			else if ( (LA20_0==STAR) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:216:5: le= LANGUAGE_ELEMENT
					{
					le=(Token)match(input,LANGUAGE_ELEMENT,FOLLOW_LANGUAGE_ELEMENT_in_languageElement1172); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:216:25: le= STAR
					{
					le=(Token)match(input,STAR,FOLLOW_STAR_in_languageElement1176); 
					}
					break;

			}

			 s = le.getText(); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:3: (q= qValueRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==SEMI_COLUMN) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:4: q= qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_languageElement1186);
					q=qValueRule();
					state._fsp--;

					 s += q; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "languageElement"



	// $ANTLR start "acceptEncodingRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:1: acceptEncodingRule returns [Header hd] : k= ACCEPT_ENCODING COLUMN value= encodingList TERMINAL ;
	public final Header acceptEncodingRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:2: (k= ACCEPT_ENCODING COLUMN value= encodingList TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:4: k= ACCEPT_ENCODING COLUMN value= encodingList TERMINAL
			{
			k=(Token)match(input,ACCEPT_ENCODING,FOLLOW_ACCEPT_ENCODING_in_acceptEncodingRule1207); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptEncodingRule1209); 
			pushFollow(FOLLOW_encodingList_in_acceptEncodingRule1215);
			value=encodingList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptEncodingRule1219); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "acceptEncodingRule"



	// $ANTLR start "encodingList"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:226:1: encodingList returns [String s] : ee= encodingElement (c= COMMA ee1= encodingElement )* ;
	public final String encodingList() throws RecognitionException {
		String s = null;


		Token c=null;
		String ee =null;
		String ee1 =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:227:2: (ee= encodingElement (c= COMMA ee1= encodingElement )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:227:4: ee= encodingElement (c= COMMA ee1= encodingElement )*
			{
			pushFollow(FOLLOW_encodingElement_in_encodingList1238);
			ee=encodingElement();
			state._fsp--;

			 s = ee; 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:228:3: (c= COMMA ee1= encodingElement )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:228:4: c= COMMA ee1= encodingElement
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_encodingList1247); 
					pushFollow(FOLLOW_encodingElement_in_encodingList1251);
					ee1=encodingElement();
					state._fsp--;

					 s += c.getText() + " " + ee1; 
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "encodingList"



	// $ANTLR start "encodingElement"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:231:1: encodingElement returns [String s] : (ee= ENCODING_ELEMENT |ee= STAR ) (q= qValueRule )? ;
	public final String encodingElement() throws RecognitionException {
		String s = null;


		Token ee=null;
		String q =null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:2: ( (ee= ENCODING_ELEMENT |ee= STAR ) (q= qValueRule )? )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:4: (ee= ENCODING_ELEMENT |ee= STAR ) (q= qValueRule )?
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:4: (ee= ENCODING_ELEMENT |ee= STAR )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ENCODING_ELEMENT) ) {
				alt23=1;
			}
			else if ( (LA23_0==STAR) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:5: ee= ENCODING_ELEMENT
					{
					ee=(Token)match(input,ENCODING_ELEMENT,FOLLOW_ENCODING_ELEMENT_in_encodingElement1274); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:25: ee= STAR
					{
					ee=(Token)match(input,STAR,FOLLOW_STAR_in_encodingElement1278); 
					}
					break;

			}

			 s = ee.getText(); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:233:3: (q= qValueRule )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==SEMI_COLUMN) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:233:4: q= qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_encodingElement1288);
					q=qValueRule();
					state._fsp--;

					 s += q; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "encodingElement"



	// $ANTLR start "chacheControlRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:236:1: chacheControlRule returns [Header hd] :k= CACHE_CONTROL COLUMN str= STRING (c= COMMA str1= STRING )* TERMINAL ;
	public final Header chacheControlRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token str=null;
		Token c=null;
		Token str1=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:237:2: (k= CACHE_CONTROL COLUMN str= STRING (c= COMMA str1= STRING )* TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:237:4: k= CACHE_CONTROL COLUMN str= STRING (c= COMMA str1= STRING )* TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,CACHE_CONTROL,FOLLOW_CACHE_CONTROL_in_chacheControlRule1313); 
			match(input,COLUMN,FOLLOW_COLUMN_in_chacheControlRule1315); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_chacheControlRule1321); 
			 value = h.substituteSingleQuote(str.getText(), ""); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:240:3: (c= COMMA str1= STRING )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:240:4: c= COMMA str1= STRING
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_chacheControlRule1330); 
					str1=(Token)match(input,STRING,FOLLOW_STRING_in_chacheControlRule1334); 
					 value += h.substituteSingleQuote(c.getText(), "") + " " + h.substituteSingleQuote(str1.getText(), ""); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_chacheControlRule1342); 
			 hd = new Header(k.getText(), value); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "chacheControlRule"



	// $ANTLR start "genericHeaderRule"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:244:1: genericHeaderRule returns [Header hd] : k= STRING COLUMN value= STRING TERMINAL ;
	public final Header genericHeaderRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token value=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:2: (k= STRING COLUMN value= STRING TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:4: k= STRING COLUMN value= STRING TERMINAL
			{
			k=(Token)match(input,STRING,FOLLOW_STRING_in_genericHeaderRule1361); 
			match(input,COLUMN,FOLLOW_COLUMN_in_genericHeaderRule1363); 
			value=(Token)match(input,STRING,FOLLOW_STRING_in_genericHeaderRule1367); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_genericHeaderRule1371); 
			 hd = new Header(h.substituteSingleQuote(k.getText(), ""), h.substituteSingleQuote(value.getText(), "")); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return hd;
	}
	// $ANTLR end "genericHeaderRule"



	// $ANTLR start "body"
	// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:249:1: body returns [String s] : str= STRING TERMINAL ;
	public final String body() throws RecognitionException {
		String s = null;


		Token str=null;

		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:250:2: (str= STRING TERMINAL )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:250:4: str= STRING TERMINAL
			{
			str=(Token)match(input,STRING,FOLLOW_STRING_in_body1389); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_body1393); 
			 s = h.substituteSingleQuote(str.getText(), ""); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "body"

	// Delegated rules



	public static final BitSet FOLLOW_requestLine_in_request61 = new BitSet(new long[]{0x2000000200F02472L,0x0000000000000004L});
	public static final BitSet FOLLOW_header_in_request70 = new BitSet(new long[]{0x2000000200F02472L,0x0000000000000004L});
	public static final BitSet FOLLOW_body_in_request81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_requestLine106 = new BitSet(new long[]{0x2001000000000000L});
	public static final BitSet FOLLOW_pathRule_in_requestLine112 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_HTTP_VERSION_in_requestLine118 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_requestLine122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PATH_in_pathRule141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_pathRule148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_method168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_in_method175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hostRule_in_header196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userAgentRule_in_header203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentTypeRule_in_header210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptRule_in_header217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieRule_in_header224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_authorizationRule_in_header231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentLengthRule_in_header238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connectionRule_in_header245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptLanguageRule_in_header252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptEncodingRule_in_header259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_chacheControlRule_in_header266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericHeaderRule_in_header273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOST_in_hostRule299 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule301 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_set_in_hostRule309 = new BitSet(new long[]{0x4000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule326 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INT_NUM_in_hostRule330 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_hostRule339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USER_AGENT_in_userAgentRule362 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_userAgentRule364 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_productRule_in_userAgentRule370 = new BitSet(new long[]{0x4008000000000000L});
	public static final BitSet FOLLOW_productRule_in_userAgentRule379 = new BitSet(new long[]{0x4008000000000000L});
	public static final BitSet FOLLOW_extensionRule_in_userAgentRule388 = new BitSet(new long[]{0x4008000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_userAgentRule398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_productRule417 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_PRODUCT_INFO_in_productRule426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_extensionRule447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_in_acceptRule466 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptRule468 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_mimeList_in_acceptRule474 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptRule478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList497 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_mimeList506 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList510 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_MIME_in_mimeElement531 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_qValueRule_in_mimeElement540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_TYPE_in_contentTypeRule566 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_contentTypeRule568 = new BitSet(new long[]{0x0000048000000000L});
	public static final BitSet FOLLOW_MIME_in_contentTypeRule575 = new BitSet(new long[]{0x4800000000000000L});
	public static final BitSet FOLLOW_charsetRule_in_contentTypeRule582 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_MULTIPART_MIME_in_contentTypeRule593 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_boundaryRule_in_contentTypeRule597 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentTypeRule605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_charsetRule624 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CHARSET_in_charsetRule628 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_charsetRule632 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_charsetRule636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_boundaryRule658 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BOUNDARY_in_boundaryRule662 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_boundaryRule666 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_boundaryRule670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COOKIE_in_cookieRule692 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_cookieRule694 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_cookieList_in_cookieRule700 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_cookieRule704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList723 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_cookieList732 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList736 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_STRING_in_cookieElement758 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_cookieElement762 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_cookieElement766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_qValueRule787 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Q_in_qValueRule791 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_qValueRule795 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_Q_VAL_in_qValueRule799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTHORIZATION_in_authorizationRule821 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_authorizationRule823 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_basicAuthRule_in_authorizationRule830 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_digestAuthRule_in_authorizationRule838 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_authorizationRule843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_in_basicAuthRule862 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_basicAuthRule866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGEST_in_digestAuthRule887 = new BitSet(new long[]{0x0640980000010080L,0x0000000000000003L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule895 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_digestAuthRule904 = new BitSet(new long[]{0x0640980000010080L,0x0000000000000003L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule908 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_USERNAME_in_authRule934 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_REALM_in_authRule942 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_URI_in_authRule949 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ALGORITHM_in_authRule957 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_NONCE_in_authRule966 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_NC_in_authRule973 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CNONCE_in_authRule982 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_QOP_in_authRule989 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RESPONSE_in_authRule998 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_OPAQUE_in_authRule1005 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_authRule1012 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_authRule1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_LENGTH_in_contentLengthRule1035 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_contentLengthRule1037 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INT_NUM_in_contentLengthRule1043 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentLengthRule1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONNECTION_in_connectionRule1066 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_connectionRule1068 = new BitSet(new long[]{0x0000002000008000L});
	public static final BitSet FOLLOW_KEEP_ALIVE_in_connectionRule1075 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_CLOSE_in_connectionRule1081 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_connectionRule1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_LANGUAGE_in_acceptLanguageRule1105 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptLanguageRule1107 = new BitSet(new long[]{0x1000004000000000L});
	public static final BitSet FOLLOW_languageList_in_acceptLanguageRule1113 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptLanguageRule1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_languageElement_in_languageList1136 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_languageList1145 = new BitSet(new long[]{0x1000004000000000L});
	public static final BitSet FOLLOW_languageElement_in_languageList1149 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_LANGUAGE_ELEMENT_in_languageElement1172 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_STAR_in_languageElement1176 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_qValueRule_in_languageElement1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_ENCODING_in_acceptEncodingRule1207 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptEncodingRule1209 = new BitSet(new long[]{0x1000000008000000L});
	public static final BitSet FOLLOW_encodingList_in_acceptEncodingRule1215 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptEncodingRule1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_encodingElement_in_encodingList1238 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_encodingList1247 = new BitSet(new long[]{0x1000000008000000L});
	public static final BitSet FOLLOW_encodingElement_in_encodingList1251 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ENCODING_ELEMENT_in_encodingElement1274 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_STAR_in_encodingElement1278 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_qValueRule_in_encodingElement1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CACHE_CONTROL_in_chacheControlRule1313 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_chacheControlRule1315 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_chacheControlRule1321 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_chacheControlRule1330 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_chacheControlRule1334 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_TERMINAL_in_chacheControlRule1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_genericHeaderRule1361 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_genericHeaderRule1363 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_genericHeaderRule1367 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_genericHeaderRule1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_body1389 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_body1393 = new BitSet(new long[]{0x0000000000000002L});
}
