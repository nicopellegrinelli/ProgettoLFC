// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-22 11:57:17

	package compiler; 		
	import variables.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "ACCEPT_ENCODING", "ACCEPT_LANGUAGE", 
		"ALPHA_CHAR", "ALPHA_NUM_CHAR", "AUTHORIZATION", "BODY_STRING", "CACHE_CONTROL", 
		"COLUMN", "COMMA", "COMMENT", "CONTENT_TYPE", "COOKIE", "DNS", "DNS_ELEMENT", 
		"EQUALS", "ERROR_TOKEN", "ESC_SEQ", "GET", "HEX_DIGIT", "HOST", "HTTP_VERSION", 
		"ID", "INT_NUM", "IPV4", "LANGUAGE_ELEMENT", "MAX_FORWARDS", "MIME", "MIME_SUBTYPE", 
		"MIME_TYPE", "MULTIPART_MIME", "NUM", "OCTAL_ESC", "PATH", "PATH_ELEMENT", 
		"POST", "PRODUCT", "PRODUCT_INFO", "Q", "QUERY", "QUERY_ELEMENT", "Q_VAL", 
		"SEMI_COLUMN", "STAR", "STRING", "TERMINAL", "UNICODE_ESC", "USER_AGENT", 
		"VERS_NUM", "WS"
	};
	public static final int EOF=-1;
	public static final int ACCEPT=4;
	public static final int ACCEPT_ENCODING=5;
	public static final int ACCEPT_LANGUAGE=6;
	public static final int ALPHA_CHAR=7;
	public static final int ALPHA_NUM_CHAR=8;
	public static final int AUTHORIZATION=9;
	public static final int BODY_STRING=10;
	public static final int CACHE_CONTROL=11;
	public static final int COLUMN=12;
	public static final int COMMA=13;
	public static final int COMMENT=14;
	public static final int CONTENT_TYPE=15;
	public static final int COOKIE=16;
	public static final int DNS=17;
	public static final int DNS_ELEMENT=18;
	public static final int EQUALS=19;
	public static final int ERROR_TOKEN=20;
	public static final int ESC_SEQ=21;
	public static final int GET=22;
	public static final int HEX_DIGIT=23;
	public static final int HOST=24;
	public static final int HTTP_VERSION=25;
	public static final int ID=26;
	public static final int INT_NUM=27;
	public static final int IPV4=28;
	public static final int LANGUAGE_ELEMENT=29;
	public static final int MAX_FORWARDS=30;
	public static final int MIME=31;
	public static final int MIME_SUBTYPE=32;
	public static final int MIME_TYPE=33;
	public static final int MULTIPART_MIME=34;
	public static final int NUM=35;
	public static final int OCTAL_ESC=36;
	public static final int PATH=37;
	public static final int PATH_ELEMENT=38;
	public static final int POST=39;
	public static final int PRODUCT=40;
	public static final int PRODUCT_INFO=41;
	public static final int Q=42;
	public static final int QUERY=43;
	public static final int QUERY_ELEMENT=44;
	public static final int Q_VAL=45;
	public static final int SEMI_COLUMN=46;
	public static final int STAR=47;
	public static final int STRING=48;
	public static final int TERMINAL=49;
	public static final int UNICODE_ESC=50;
	public static final int USER_AGENT=51;
	public static final int VERS_NUM=52;
	public static final int WS=53;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g"; }


		public SemanticHandler h = new SemanticHandler();
		
		@Override
		public void displayRecognitionError(String[] tokenNames, RecognitionException e) {		
			h.handleError(input.LT(1), getErrorHeader(e), getErrorMessage(e, tokenNames));
		}
		



	// $ANTLR start "request"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:32:1: request : rl= requestLine (hdr= header )* (b= body )? EOF ;
	public final void request() throws RecognitionException {
		RequestLine rl =null;
		Header hdr =null;
		String b =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:33:2: (rl= requestLine (hdr= header )* (b= body )? EOF )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:33:4: rl= requestLine (hdr= header )* (b= body )? EOF
			{
			pushFollow(FOLLOW_requestLine_in_request61);
			rl=requestLine();
			state._fsp--;

			 h.addRequestLine(rl); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:34:3: (hdr= header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ACCEPT && LA1_0 <= ACCEPT_LANGUAGE)||LA1_0==AUTHORIZATION||LA1_0==CACHE_CONTROL||(LA1_0 >= CONTENT_TYPE && LA1_0 <= COOKIE)||LA1_0==HOST||LA1_0==MAX_FORWARDS||LA1_0==STRING||LA1_0==USER_AGENT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:34:4: hdr= header
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

			 h.checkHeaders(); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:35:3: (b= body )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BODY_STRING) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:35:4: b= body
					{
					pushFollow(FOLLOW_body_in_request83);
					b=body();
					state._fsp--;

					 h.addBody(b); 
					}
					break;

			}

			match(input,EOF,FOLLOW_EOF_in_request91); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:40:1: requestLine returns [RequestLine rl] : m= method p= pathRule v= HTTP_VERSION TERMINAL ;
	public final RequestLine requestLine() throws RecognitionException {
		RequestLine rl = null;


		Token v=null;
		String m =null;
		String p =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:41:2: (m= method p= pathRule v= HTTP_VERSION TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:41:4: m= method p= pathRule v= HTTP_VERSION TERMINAL
			{
			pushFollow(FOLLOW_method_in_requestLine112);
			m=method();
			state._fsp--;

			pushFollow(FOLLOW_pathRule_in_requestLine118);
			p=pathRule();
			state._fsp--;

			v=(Token)match(input,HTTP_VERSION,FOLLOW_HTTP_VERSION_in_requestLine124); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_requestLine128); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:47:1: pathRule returns [String p] : ( (s= PATH (q= QUERY )? ) | (s= STRING ) );
	public final String pathRule() throws RecognitionException {
		String p = null;


		Token s=null;
		Token q=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:48:2: ( (s= PATH (q= QUERY )? ) | (s= STRING ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==PATH) ) {
				alt4=1;
			}
			else if ( (LA4_0==STRING) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:48:4: (s= PATH (q= QUERY )? )
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:48:4: (s= PATH (q= QUERY )? )
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:48:5: s= PATH (q= QUERY )?
					{
					s=(Token)match(input,PATH,FOLLOW_PATH_in_pathRule147); 
					 p = s.getText(); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:48:34: (q= QUERY )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==QUERY) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:48:35: q= QUERY
							{
							q=(Token)match(input,QUERY,FOLLOW_QUERY_in_pathRule154); 
							 p += q.getText(); 
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:49:4: (s= STRING )
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:49:4: (s= STRING )
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:49:5: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_pathRule167); 
					 p = h.handleQuotes(s.getText()); 
					}

					}
					break;

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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:52:1: method returns [String m] : (s= GET |s= POST ) ;
	public final String method() throws RecognitionException {
		String m = null;


		Token s=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:53:2: ( (s= GET |s= POST ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:53:4: (s= GET |s= POST )
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:53:4: (s= GET |s= POST )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==GET) ) {
				alt5=1;
			}
			else if ( (LA5_0==POST) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:53:5: s= GET
					{
					s=(Token)match(input,GET,FOLLOW_GET_in_method187); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:54:4: s= POST
					{
					s=(Token)match(input,POST,FOLLOW_POST_in_method194); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:1: header returns [Header hdr] : (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= maxForwardsRule |hd= genericHeaderRule ) ;
	public final Header header() throws RecognitionException {
		Header hdr = null;


		Header hd =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:2: ( (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= maxForwardsRule |hd= genericHeaderRule ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:4: (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= maxForwardsRule |hd= genericHeaderRule )
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:4: (hd= hostRule |hd= userAgentRule |hd= contentTypeRule |hd= acceptRule |hd= cookieRule |hd= authorizationRule |hd= acceptLanguageRule |hd= acceptEncodingRule |hd= chacheControlRule |hd= maxForwardsRule |hd= genericHeaderRule )
			int alt6=11;
			switch ( input.LA(1) ) {
			case HOST:
				{
				alt6=1;
				}
				break;
			case USER_AGENT:
				{
				alt6=2;
				}
				break;
			case CONTENT_TYPE:
				{
				alt6=3;
				}
				break;
			case ACCEPT:
				{
				alt6=4;
				}
				break;
			case COOKIE:
				{
				alt6=5;
				}
				break;
			case AUTHORIZATION:
				{
				alt6=6;
				}
				break;
			case ACCEPT_LANGUAGE:
				{
				alt6=7;
				}
				break;
			case ACCEPT_ENCODING:
				{
				alt6=8;
				}
				break;
			case CACHE_CONTROL:
				{
				alt6=9;
				}
				break;
			case MAX_FORWARDS:
				{
				alt6=10;
				}
				break;
			case STRING:
				{
				alt6=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:5: hd= hostRule
					{
					pushFollow(FOLLOW_hostRule_in_header215);
					hd=hostRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:59:4: hd= userAgentRule
					{
					pushFollow(FOLLOW_userAgentRule_in_header222);
					hd=userAgentRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:60:4: hd= contentTypeRule
					{
					pushFollow(FOLLOW_contentTypeRule_in_header229);
					hd=contentTypeRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:61:4: hd= acceptRule
					{
					pushFollow(FOLLOW_acceptRule_in_header236);
					hd=acceptRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:62:4: hd= cookieRule
					{
					pushFollow(FOLLOW_cookieRule_in_header243);
					hd=cookieRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:63:4: hd= authorizationRule
					{
					pushFollow(FOLLOW_authorizationRule_in_header250);
					hd=authorizationRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:64:4: hd= acceptLanguageRule
					{
					pushFollow(FOLLOW_acceptLanguageRule_in_header257);
					hd=acceptLanguageRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:65:4: hd= acceptEncodingRule
					{
					pushFollow(FOLLOW_acceptEncodingRule_in_header264);
					hd=acceptEncodingRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:66:4: hd= chacheControlRule
					{
					pushFollow(FOLLOW_chacheControlRule_in_header271);
					hd=chacheControlRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:67:4: hd= maxForwardsRule
					{
					pushFollow(FOLLOW_maxForwardsRule_in_header278);
					hd=maxForwardsRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:68:4: hd= genericHeaderRule
					{
					pushFollow(FOLLOW_genericHeaderRule_in_header285);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:72:1: hostRule returns [Header hd] :k= HOST COLUMN (v= ( DNS | IPV4 ) ) ( (c= COLUMN n= INT_NUM ) )? TERMINAL ;
	public final Header hostRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token v=null;
		Token c=null;
		Token n=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:73:2: (k= HOST COLUMN (v= ( DNS | IPV4 ) ) ( (c= COLUMN n= INT_NUM ) )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:73:4: k= HOST COLUMN (v= ( DNS | IPV4 ) ) ( (c= COLUMN n= INT_NUM ) )? TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,HOST,FOLLOW_HOST_in_hostRule311); 
			match(input,COLUMN,FOLLOW_COLUMN_in_hostRule313); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:75:3: (v= ( DNS | IPV4 ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:75:4: v= ( DNS | IPV4 )
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

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:3: ( (c= COLUMN n= INT_NUM ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLUMN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:4: (c= COLUMN n= INT_NUM )
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:4: (c= COLUMN n= INT_NUM )
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:5: c= COLUMN n= INT_NUM
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_hostRule338); 
					n=(Token)match(input,INT_NUM,FOLLOW_INT_NUM_in_hostRule342); 
					}

					 value += c.getText() + n.getText(); 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_hostRule351); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:1: userAgentRule returns [Header hd] :k= USER_AGENT COLUMN p= productRule (p1= productRule (e= extensionRule )* )? TERMINAL ;
	public final Header userAgentRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String p =null;
		String p1 =null;
		String e =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:2: (k= USER_AGENT COLUMN p= productRule (p1= productRule (e= extensionRule )* )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:4: k= USER_AGENT COLUMN p= productRule (p1= productRule (e= extensionRule )* )? TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,USER_AGENT,FOLLOW_USER_AGENT_in_userAgentRule374); 
			match(input,COLUMN,FOLLOW_COLUMN_in_userAgentRule376); 
			pushFollow(FOLLOW_productRule_in_userAgentRule382);
			p=productRule();
			state._fsp--;

			 value = p; 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:3: (p1= productRule (e= extensionRule )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PRODUCT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:4: p1= productRule (e= extensionRule )*
					{
					pushFollow(FOLLOW_productRule_in_userAgentRule391);
					p1=productRule();
					state._fsp--;

					 value += " " + p1; 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:85:3: (e= extensionRule )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==PRODUCT) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:85:4: e= extensionRule
							{
							pushFollow(FOLLOW_extensionRule_in_userAgentRule400);
							e=extensionRule();
							state._fsp--;

							 value += " " + e; 
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_userAgentRule410); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:89:1: productRule returns [String s] : p= PRODUCT (pi= PRODUCT_INFO )? ;
	public final String productRule() throws RecognitionException {
		String s = null;


		Token p=null;
		Token pi=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:90:2: (p= PRODUCT (pi= PRODUCT_INFO )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:90:4: p= PRODUCT (pi= PRODUCT_INFO )?
			{
			p=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_productRule429); 
			 s = p.getText(); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:91:3: (pi= PRODUCT_INFO )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==PRODUCT_INFO) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:91:4: pi= PRODUCT_INFO
					{
					pi=(Token)match(input,PRODUCT_INFO,FOLLOW_PRODUCT_INFO_in_productRule438); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:94:1: extensionRule returns [String s] : p= PRODUCT ;
	public final String extensionRule() throws RecognitionException {
		String s = null;


		Token p=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:2: (p= PRODUCT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:4: p= PRODUCT
			{
			p=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_extensionRule459); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:98:1: acceptRule returns [Header hd] : k= ACCEPT COLUMN value= mimeList TERMINAL ;
	public final Header acceptRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:2: (k= ACCEPT COLUMN value= mimeList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:4: k= ACCEPT COLUMN value= mimeList TERMINAL
			{
			k=(Token)match(input,ACCEPT,FOLLOW_ACCEPT_in_acceptRule478); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptRule480); 
			pushFollow(FOLLOW_mimeList_in_acceptRule486);
			value=mimeList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptRule490); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:104:1: mimeList returns [String s] : m= mimeElement (c= COMMA m1= mimeElement )* ;
	public final String mimeList() throws RecognitionException {
		String s = null;


		Token c=null;
		String m =null;
		String m1 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:2: (m= mimeElement (c= COMMA m1= mimeElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:4: m= mimeElement (c= COMMA m1= mimeElement )*
			{
			pushFollow(FOLLOW_mimeElement_in_mimeList509);
			m=mimeElement();
			state._fsp--;

			 s = m; 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:106:3: (c= COMMA m1= mimeElement )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:106:4: c= COMMA m1= mimeElement
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_mimeList518); 
					pushFollow(FOLLOW_mimeElement_in_mimeList522);
					m1=mimeElement();
					state._fsp--;

					 s += c.getText() + " " + m1; 
					}
					break;

				default :
					break loop11;
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:109:1: mimeElement returns [String s] : m= MIME (q= qValueRule )? ;
	public final String mimeElement() throws RecognitionException {
		String s = null;


		Token m=null;
		String q =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:110:2: (m= MIME (q= qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:110:4: m= MIME (q= qValueRule )?
			{
			m=(Token)match(input,MIME,FOLLOW_MIME_in_mimeElement543); 
			 s = m.getText();
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:3: (q= qValueRule )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==SEMI_COLUMN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:4: q= qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_mimeElement552);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:114:1: contentTypeRule returns [Header hd] :k= CONTENT_TYPE COLUMN (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule ) TERMINAL ;
	public final Header contentTypeRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token m=null;
		String cs =null;
		String b =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:2: (k= CONTENT_TYPE COLUMN (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:4: k= CONTENT_TYPE COLUMN (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule ) TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,CONTENT_TYPE,FOLLOW_CONTENT_TYPE_in_contentTypeRule578); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentTypeRule580); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:3: (m= MIME (cs= charsetRule )? |m= MULTIPART_MIME b= boundaryRule )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==MIME) ) {
				alt14=1;
			}
			else if ( (LA14_0==MULTIPART_MIME) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:4: m= MIME (cs= charsetRule )?
					{
					m=(Token)match(input,MIME,FOLLOW_MIME_in_contentTypeRule587); 
					 value = m.getText(); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:37: (cs= charsetRule )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==SEMI_COLUMN) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:38: cs= charsetRule
							{
							pushFollow(FOLLOW_charsetRule_in_contentTypeRule594);
							cs=charsetRule();
							state._fsp--;

							 value += cs; 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:118:4: m= MULTIPART_MIME b= boundaryRule
					{
					m=(Token)match(input,MULTIPART_MIME,FOLLOW_MULTIPART_MIME_in_contentTypeRule605); 
					pushFollow(FOLLOW_boundaryRule_in_contentTypeRule609);
					b=boundaryRule();
					state._fsp--;

					 value = m.getText() + b; 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentTypeRule617); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:1: charsetRule returns [String s] : sc= SEMI_COLUMN (cs= ID ) e= EQUALS str= STRING ;
	public final String charsetRule() throws RecognitionException {
		String s = null;


		Token sc=null;
		Token cs=null;
		Token e=null;
		Token str=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:2: (sc= SEMI_COLUMN (cs= ID ) e= EQUALS str= STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:4: sc= SEMI_COLUMN (cs= ID ) e= EQUALS str= STRING
			{
			sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_charsetRule636); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:19: (cs= ID )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:20: cs= ID
			{
			cs=(Token)match(input,ID,FOLLOW_ID_in_charsetRule641); 
			 h.checkCharset(cs); 
			}

			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_charsetRule648); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_charsetRule652); 
			 s = sc.getText() + " " + cs.getText() + e.getText() + h.handleQuotes(str.getText()); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:127:1: boundaryRule returns [String s] : sc= SEMI_COLUMN (b= ID ) e= EQUALS str= STRING ;
	public final String boundaryRule() throws RecognitionException {
		String s = null;


		Token sc=null;
		Token b=null;
		Token e=null;
		Token str=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:2: (sc= SEMI_COLUMN (b= ID ) e= EQUALS str= STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:4: sc= SEMI_COLUMN (b= ID ) e= EQUALS str= STRING
			{
			sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_boundaryRule674); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:19: (b= ID )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:20: b= ID
			{
			b=(Token)match(input,ID,FOLLOW_ID_in_boundaryRule679); 
			 h.checkBoundary(b); 
			}

			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boundaryRule686); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_boundaryRule690); 
			 s = sc.getText() + " " + b.getText() + e.getText() + h.handleQuotes(str.getText()); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:132:1: cookieRule returns [Header hd] : k= COOKIE COLUMN value= cookieList TERMINAL ;
	public final Header cookieRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:2: (k= COOKIE COLUMN value= cookieList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:4: k= COOKIE COLUMN value= cookieList TERMINAL
			{
			k=(Token)match(input,COOKIE,FOLLOW_COOKIE_in_cookieRule712); 
			match(input,COLUMN,FOLLOW_COLUMN_in_cookieRule714); 
			pushFollow(FOLLOW_cookieList_in_cookieRule720);
			value=cookieList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_cookieRule724); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:1: cookieList returns [String s] : ce= cookieElement (sc= SEMI_COLUMN ce1= cookieElement )* ;
	public final String cookieList() throws RecognitionException {
		String s = null;


		Token sc=null;
		String ce =null;
		String ce1 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:139:2: (ce= cookieElement (sc= SEMI_COLUMN ce1= cookieElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:139:4: ce= cookieElement (sc= SEMI_COLUMN ce1= cookieElement )*
			{
			pushFollow(FOLLOW_cookieElement_in_cookieList743);
			ce=cookieElement();
			state._fsp--;

			 s = ce; 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:140:3: (sc= SEMI_COLUMN ce1= cookieElement )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==SEMI_COLUMN) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:140:4: sc= SEMI_COLUMN ce1= cookieElement
					{
					sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_cookieList752); 
					pushFollow(FOLLOW_cookieElement_in_cookieList756);
					ce1=cookieElement();
					state._fsp--;

					 s += sc.getText() + " " + ce1; 
					}
					break;

				default :
					break loop15;
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:143:1: cookieElement returns [String s] : str1= STRING e= EQUALS str2= STRING ;
	public final String cookieElement() throws RecognitionException {
		String s = null;


		Token str1=null;
		Token e=null;
		Token str2=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:2: (str1= STRING e= EQUALS str2= STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:4: str1= STRING e= EQUALS str2= STRING
			{
			str1=(Token)match(input,STRING,FOLLOW_STRING_in_cookieElement778); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cookieElement782); 
			str2=(Token)match(input,STRING,FOLLOW_STRING_in_cookieElement786); 
			 s = h.handleQuotes(str1.getText()) + e.getText() + h.handleQuotes(str2.getText()); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:148:1: qValueRule returns [String s] : sc= SEMI_COLUMN q= Q e= EQUALS qv= Q_VAL ;
	public final String qValueRule() throws RecognitionException {
		String s = null;


		Token sc=null;
		Token q=null;
		Token e=null;
		Token qv=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:2: (sc= SEMI_COLUMN q= Q e= EQUALS qv= Q_VAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:4: sc= SEMI_COLUMN q= Q e= EQUALS qv= Q_VAL
			{
			sc=(Token)match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_qValueRule807); 
			q=(Token)match(input,Q,FOLLOW_Q_in_qValueRule811); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_qValueRule815); 
			qv=(Token)match(input,Q_VAL,FOLLOW_Q_VAL_in_qValueRule819); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:153:1: authorizationRule returns [Header hd] : k= AUTHORIZATION COLUMN bd= ID (value= basicAuthRule[$bd] |value= digestAuthRule[$bd] ) TERMINAL ;
	public final Header authorizationRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token bd=null;
		String value =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:154:2: (k= AUTHORIZATION COLUMN bd= ID (value= basicAuthRule[$bd] |value= digestAuthRule[$bd] ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:154:4: k= AUTHORIZATION COLUMN bd= ID (value= basicAuthRule[$bd] |value= digestAuthRule[$bd] ) TERMINAL
			{
			k=(Token)match(input,AUTHORIZATION,FOLLOW_AUTHORIZATION_in_authorizationRule841); 
			match(input,COLUMN,FOLLOW_COLUMN_in_authorizationRule843); 
			bd=(Token)match(input,ID,FOLLOW_ID_in_authorizationRule849); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:156:3: (value= basicAuthRule[$bd] |value= digestAuthRule[$bd] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==STRING) ) {
				alt16=1;
			}
			else if ( (LA16_0==ID) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:156:4: value= basicAuthRule[$bd]
					{
					pushFollow(FOLLOW_basicAuthRule_in_authorizationRule856);
					value=basicAuthRule(bd);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:157:5: value= digestAuthRule[$bd]
					{
					pushFollow(FOLLOW_digestAuthRule_in_authorizationRule865);
					value=digestAuthRule(bd);
					state._fsp--;

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_authorizationRule871); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:161:1: basicAuthRule[Token b] returns [String s] :str= STRING ;
	public final String basicAuthRule(Token b) throws RecognitionException {
		String s = null;


		Token str=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:162:2: (str= STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:162:4: str= STRING
			{
			 s = h.checkBasic(b); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_basicAuthRule896); 
			 s = " " + h.handleQuotes(str.getText()); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:167:1: digestAuthRule[Token d] returns [String s] :a= authRule (c= COMMA a1= authRule )* ;
	public final String digestAuthRule(Token d) throws RecognitionException {
		String s = null;


		Token c=null;
		String a =null;
		String a1 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:168:2: (a= authRule (c= COMMA a1= authRule )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:168:4: a= authRule (c= COMMA a1= authRule )*
			{
			 s = h.checkDigest(d); 
			pushFollow(FOLLOW_authRule_in_digestAuthRule923);
			a=authRule();
			state._fsp--;

			 s += " " + a; 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:170:3: (c= COMMA a1= authRule )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:170:4: c= COMMA a1= authRule
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_digestAuthRule932); 
					pushFollow(FOLLOW_authRule_in_digestAuthRule936);
					a1=authRule();
					state._fsp--;

					 s += c.getText() + " " + a1; 
					}
					break;

				default :
					break loop17;
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:173:1: authRule returns [String s] : t= ID e= EQUALS str= STRING ;
	public final String authRule() throws RecognitionException {
		String s = null;


		Token t=null;
		Token e=null;
		Token str=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:174:2: (t= ID e= EQUALS str= STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:175:2: t= ID e= EQUALS str= STRING
			{
			t=(Token)match(input,ID,FOLLOW_ID_in_authRule958); 
			 h.checkDigestElement(t); 
			e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_authRule965); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_authRule969); 
			 s = t.getText() + e.getText() + h.handleDigestElement(t.getText(), str.getText()); 
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



	// $ANTLR start "acceptLanguageRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:180:1: acceptLanguageRule returns [Header hd] : k= ACCEPT_LANGUAGE COLUMN value= languageList TERMINAL ;
	public final Header acceptLanguageRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:181:2: (k= ACCEPT_LANGUAGE COLUMN value= languageList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:181:4: k= ACCEPT_LANGUAGE COLUMN value= languageList TERMINAL
			{
			k=(Token)match(input,ACCEPT_LANGUAGE,FOLLOW_ACCEPT_LANGUAGE_in_acceptLanguageRule988); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptLanguageRule990); 
			pushFollow(FOLLOW_languageList_in_acceptLanguageRule996);
			value=languageList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptLanguageRule1000); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:186:1: languageList returns [String s] : le= languageElement (c= COMMA le1= languageElement )* ;
	public final String languageList() throws RecognitionException {
		String s = null;


		Token c=null;
		String le =null;
		String le1 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:2: (le= languageElement (c= COMMA le1= languageElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:4: le= languageElement (c= COMMA le1= languageElement )*
			{
			pushFollow(FOLLOW_languageElement_in_languageList1019);
			le=languageElement();
			state._fsp--;

			 s = le; 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:188:3: (c= COMMA le1= languageElement )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:188:4: c= COMMA le1= languageElement
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_languageList1028); 
					pushFollow(FOLLOW_languageElement_in_languageList1032);
					le1=languageElement();
					state._fsp--;

					 s += c.getText() + " " + le1; 
					}
					break;

				default :
					break loop18;
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:1: languageElement returns [String s] : ( (le= ID ) |le= LANGUAGE_ELEMENT |le= STAR ) (q= qValueRule )? ;
	public final String languageElement() throws RecognitionException {
		String s = null;


		Token le=null;
		String q =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:2: ( ( (le= ID ) |le= LANGUAGE_ELEMENT |le= STAR ) (q= qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:4: ( (le= ID ) |le= LANGUAGE_ELEMENT |le= STAR ) (q= qValueRule )?
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:4: ( (le= ID ) |le= LANGUAGE_ELEMENT |le= STAR )
			int alt19=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt19=1;
				}
				break;
			case LANGUAGE_ELEMENT:
				{
				alt19=2;
				}
				break;
			case STAR:
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:5: (le= ID )
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:5: (le= ID )
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:6: le= ID
					{
					le=(Token)match(input,ID,FOLLOW_ID_in_languageElement1056); 
					 h.checkLanguage(le); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:193:4: le= LANGUAGE_ELEMENT
					{
					le=(Token)match(input,LANGUAGE_ELEMENT,FOLLOW_LANGUAGE_ELEMENT_in_languageElement1066); 
					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:194:4: le= STAR
					{
					le=(Token)match(input,STAR,FOLLOW_STAR_in_languageElement1073); 
					}
					break;

			}

			 s = le.getText(); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:3: (q= qValueRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==SEMI_COLUMN) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:4: q= qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_languageElement1084);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:198:1: acceptEncodingRule returns [Header hd] : k= ACCEPT_ENCODING COLUMN value= encodingList TERMINAL ;
	public final Header acceptEncodingRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		String value =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:2: (k= ACCEPT_ENCODING COLUMN value= encodingList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:4: k= ACCEPT_ENCODING COLUMN value= encodingList TERMINAL
			{
			k=(Token)match(input,ACCEPT_ENCODING,FOLLOW_ACCEPT_ENCODING_in_acceptEncodingRule1105); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptEncodingRule1107); 
			pushFollow(FOLLOW_encodingList_in_acceptEncodingRule1113);
			value=encodingList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptEncodingRule1117); 
			 hd = new Header(k, value); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:204:1: encodingList returns [String s] : ee= encodingElement (c= COMMA ee1= encodingElement )* ;
	public final String encodingList() throws RecognitionException {
		String s = null;


		Token c=null;
		String ee =null;
		String ee1 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:205:2: (ee= encodingElement (c= COMMA ee1= encodingElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:205:4: ee= encodingElement (c= COMMA ee1= encodingElement )*
			{
			pushFollow(FOLLOW_encodingElement_in_encodingList1136);
			ee=encodingElement();
			state._fsp--;

			 s = ee; 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:206:3: (c= COMMA ee1= encodingElement )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:206:4: c= COMMA ee1= encodingElement
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_encodingList1145); 
					pushFollow(FOLLOW_encodingElement_in_encodingList1149);
					ee1=encodingElement();
					state._fsp--;

					 s += c.getText() + " " + ee1; 
					}
					break;

				default :
					break loop21;
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:209:1: encodingElement returns [String s] : (ee= ID |ee= STAR ) (q= qValueRule )? ;
	public final String encodingElement() throws RecognitionException {
		String s = null;


		Token ee=null;
		String q =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:2: ( (ee= ID |ee= STAR ) (q= qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:4: (ee= ID |ee= STAR ) (q= qValueRule )?
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:4: (ee= ID |ee= STAR )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ID) ) {
				alt22=1;
			}
			else if ( (LA22_0==STAR) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:5: ee= ID
					{
					ee=(Token)match(input,ID,FOLLOW_ID_in_encodingElement1172); 
					 h.checkEncodingElement(ee); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:211:4: ee= STAR
					{
					ee=(Token)match(input,STAR,FOLLOW_STAR_in_encodingElement1182); 
					}
					break;

			}

			 s = ee.getText(); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:213:3: (q= qValueRule )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==SEMI_COLUMN) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:213:4: q= qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_encodingElement1195);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:216:1: chacheControlRule returns [Header hd] :k= CACHE_CONTROL COLUMN str= STRING (c= COMMA str1= STRING )* TERMINAL ;
	public final Header chacheControlRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token str=null;
		Token c=null;
		Token str1=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:2: (k= CACHE_CONTROL COLUMN str= STRING (c= COMMA str1= STRING )* TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:4: k= CACHE_CONTROL COLUMN str= STRING (c= COMMA str1= STRING )* TERMINAL
			{
			 String value = ""; 
			k=(Token)match(input,CACHE_CONTROL,FOLLOW_CACHE_CONTROL_in_chacheControlRule1220); 
			match(input,COLUMN,FOLLOW_COLUMN_in_chacheControlRule1222); 
			str=(Token)match(input,STRING,FOLLOW_STRING_in_chacheControlRule1228); 
			 value = h.handleQuotes(str.getText()); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:3: (c= COMMA str1= STRING )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:4: c= COMMA str1= STRING
					{
					c=(Token)match(input,COMMA,FOLLOW_COMMA_in_chacheControlRule1237); 
					str1=(Token)match(input,STRING,FOLLOW_STRING_in_chacheControlRule1241); 
					 value += h.handleQuotes(c.getText()) + " " + h.handleQuotes(str1.getText()); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_chacheControlRule1249); 
			 hd = new Header(k, value); 
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



	// $ANTLR start "maxForwardsRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:224:1: maxForwardsRule returns [Header hd] : k= MAX_FORWARDS COLUMN value= INT_NUM TERMINAL ;
	public final Header maxForwardsRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token value=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:225:2: (k= MAX_FORWARDS COLUMN value= INT_NUM TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:225:4: k= MAX_FORWARDS COLUMN value= INT_NUM TERMINAL
			{
			k=(Token)match(input,MAX_FORWARDS,FOLLOW_MAX_FORWARDS_in_maxForwardsRule1267); 
			match(input,COLUMN,FOLLOW_COLUMN_in_maxForwardsRule1269); 
			value=(Token)match(input,INT_NUM,FOLLOW_INT_NUM_in_maxForwardsRule1275); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_maxForwardsRule1280); 
			 hd = new Header(k, value.getText()); 
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
	// $ANTLR end "maxForwardsRule"



	// $ANTLR start "genericHeaderRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:230:1: genericHeaderRule returns [Header hd] : k= STRING COLUMN value= STRING TERMINAL ;
	public final Header genericHeaderRule() throws RecognitionException {
		Header hd = null;


		Token k=null;
		Token value=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:231:2: (k= STRING COLUMN value= STRING TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:231:4: k= STRING COLUMN value= STRING TERMINAL
			{
			k=(Token)match(input,STRING,FOLLOW_STRING_in_genericHeaderRule1299); 
			match(input,COLUMN,FOLLOW_COLUMN_in_genericHeaderRule1301); 
			value=(Token)match(input,STRING,FOLLOW_STRING_in_genericHeaderRule1305); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_genericHeaderRule1309); 
			 hd = new Header(k, h.handleQuotes(value.getText())); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:235:1: body returns [String s] : str= BODY_STRING TERMINAL ;
	public final String body() throws RecognitionException {
		String s = null;


		Token str=null;

		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:236:2: (str= BODY_STRING TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:236:4: str= BODY_STRING TERMINAL
			{
			str=(Token)match(input,BODY_STRING,FOLLOW_BODY_STRING_in_body1327); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_body1331); 
			 s = h.handleBody(str.getText()); 
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



	public static final BitSet FOLLOW_requestLine_in_request61 = new BitSet(new long[]{0x0009000041018E70L});
	public static final BitSet FOLLOW_header_in_request70 = new BitSet(new long[]{0x0009000041018E70L});
	public static final BitSet FOLLOW_body_in_request83 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_request91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_requestLine112 = new BitSet(new long[]{0x0001002000000000L});
	public static final BitSet FOLLOW_pathRule_in_requestLine118 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_HTTP_VERSION_in_requestLine124 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_requestLine128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PATH_in_pathRule147 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_QUERY_in_pathRule154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_pathRule167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_method187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_in_method194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hostRule_in_header215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userAgentRule_in_header222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentTypeRule_in_header229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptRule_in_header236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieRule_in_header243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_authorizationRule_in_header250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptLanguageRule_in_header257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptEncodingRule_in_header264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_chacheControlRule_in_header271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maxForwardsRule_in_header278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericHeaderRule_in_header285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOST_in_hostRule311 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule313 = new BitSet(new long[]{0x0000000010020000L});
	public static final BitSet FOLLOW_set_in_hostRule321 = new BitSet(new long[]{0x0002000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule338 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_INT_NUM_in_hostRule342 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_hostRule351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USER_AGENT_in_userAgentRule374 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_userAgentRule376 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_productRule_in_userAgentRule382 = new BitSet(new long[]{0x0002010000000000L});
	public static final BitSet FOLLOW_productRule_in_userAgentRule391 = new BitSet(new long[]{0x0002010000000000L});
	public static final BitSet FOLLOW_extensionRule_in_userAgentRule400 = new BitSet(new long[]{0x0002010000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_userAgentRule410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_productRule429 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_PRODUCT_INFO_in_productRule438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_extensionRule459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_in_acceptRule478 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptRule480 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_mimeList_in_acceptRule486 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptRule490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList509 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_mimeList518 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList522 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_MIME_in_mimeElement543 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_qValueRule_in_mimeElement552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_TYPE_in_contentTypeRule578 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_contentTypeRule580 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_MIME_in_contentTypeRule587 = new BitSet(new long[]{0x0002400000000000L});
	public static final BitSet FOLLOW_charsetRule_in_contentTypeRule594 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_MULTIPART_MIME_in_contentTypeRule605 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_boundaryRule_in_contentTypeRule609 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentTypeRule617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_charsetRule636 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_charsetRule641 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQUALS_in_charsetRule648 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_charsetRule652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_boundaryRule674 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_boundaryRule679 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQUALS_in_boundaryRule686 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_boundaryRule690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COOKIE_in_cookieRule712 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_cookieRule714 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_cookieList_in_cookieRule720 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_cookieRule724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList743 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_cookieList752 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList756 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_STRING_in_cookieElement778 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQUALS_in_cookieElement782 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_cookieElement786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_qValueRule807 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_Q_in_qValueRule811 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQUALS_in_qValueRule815 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_Q_VAL_in_qValueRule819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTHORIZATION_in_authorizationRule841 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_authorizationRule843 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_authorizationRule849 = new BitSet(new long[]{0x0001000004000000L});
	public static final BitSet FOLLOW_basicAuthRule_in_authorizationRule856 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_digestAuthRule_in_authorizationRule865 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_authorizationRule871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_basicAuthRule896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule923 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_digestAuthRule932 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule936 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_authRule958 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQUALS_in_authRule965 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_authRule969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_LANGUAGE_in_acceptLanguageRule988 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptLanguageRule990 = new BitSet(new long[]{0x0000800024000000L});
	public static final BitSet FOLLOW_languageList_in_acceptLanguageRule996 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptLanguageRule1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_languageElement_in_languageList1019 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_languageList1028 = new BitSet(new long[]{0x0000800024000000L});
	public static final BitSet FOLLOW_languageElement_in_languageList1032 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_languageElement1056 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_LANGUAGE_ELEMENT_in_languageElement1066 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_STAR_in_languageElement1073 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_qValueRule_in_languageElement1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_ENCODING_in_acceptEncodingRule1105 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptEncodingRule1107 = new BitSet(new long[]{0x0000800004000000L});
	public static final BitSet FOLLOW_encodingList_in_acceptEncodingRule1113 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptEncodingRule1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_encodingElement_in_encodingList1136 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_encodingList1145 = new BitSet(new long[]{0x0000800004000000L});
	public static final BitSet FOLLOW_encodingElement_in_encodingList1149 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_encodingElement1172 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_STAR_in_encodingElement1182 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_qValueRule_in_encodingElement1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CACHE_CONTROL_in_chacheControlRule1220 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_chacheControlRule1222 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_chacheControlRule1228 = new BitSet(new long[]{0x0002000000002000L});
	public static final BitSet FOLLOW_COMMA_in_chacheControlRule1237 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_chacheControlRule1241 = new BitSet(new long[]{0x0002000000002000L});
	public static final BitSet FOLLOW_TERMINAL_in_chacheControlRule1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_FORWARDS_in_maxForwardsRule1267 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_maxForwardsRule1269 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_INT_NUM_in_maxForwardsRule1275 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_maxForwardsRule1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_genericHeaderRule1299 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLUMN_in_genericHeaderRule1301 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_genericHeaderRule1305 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_genericHeaderRule1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BODY_STRING_in_body1327 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_body1331 = new BitSet(new long[]{0x0000000000000002L});
}
