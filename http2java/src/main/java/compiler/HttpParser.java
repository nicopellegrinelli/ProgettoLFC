// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-13 11:54:39

package compiler; 		
import utils.Variable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "ALGORITHM", "ALPHA_CHAR", 
		"ALPHA_NUM_CHAR", "AUTHORIZATION", "BASIC", "BOUNDARY", "CHARSET", "CNONCE", 
		"COLUMN", "COMMA", "COMMENT", "CONTENT_TYPE", "COOKIE", "DIGEST", "DNS", 
		"DNS_ELEMENT", "EQUALS", "ERROR_TOKEN", "ESC_SEQ", "GET", "HEX_DIGIT", 
		"HOST", "INT_NUM", "IPV4", "MIME", "MIME_SUBTYPE", "MIME_TYPE", "MULTIPART_MIME", 
		"NC", "NONCE", "NUM", "OCTAL_ESC", "OPAQUE", "PATH", "PATH_ELEMENT", "POST", 
		"Q", "QOP", "QUERY_ELEMENT", "Q_VAL", "REALM", "RESPONSE", "SEMI_COLUMN", 
		"STRING", "TERMINAL", "UA_ELEMENT", "UA_INFO", "UNICODE_ESC", "URI", "USERNAME", 
		"USER_AGENT", "VERSION", "VERS_NUM", "WS"
	};
	public static final int EOF=-1;
	public static final int ACCEPT=4;
	public static final int ALGORITHM=5;
	public static final int ALPHA_CHAR=6;
	public static final int ALPHA_NUM_CHAR=7;
	public static final int AUTHORIZATION=8;
	public static final int BASIC=9;
	public static final int BOUNDARY=10;
	public static final int CHARSET=11;
	public static final int CNONCE=12;
	public static final int COLUMN=13;
	public static final int COMMA=14;
	public static final int COMMENT=15;
	public static final int CONTENT_TYPE=16;
	public static final int COOKIE=17;
	public static final int DIGEST=18;
	public static final int DNS=19;
	public static final int DNS_ELEMENT=20;
	public static final int EQUALS=21;
	public static final int ERROR_TOKEN=22;
	public static final int ESC_SEQ=23;
	public static final int GET=24;
	public static final int HEX_DIGIT=25;
	public static final int HOST=26;
	public static final int INT_NUM=27;
	public static final int IPV4=28;
	public static final int MIME=29;
	public static final int MIME_SUBTYPE=30;
	public static final int MIME_TYPE=31;
	public static final int MULTIPART_MIME=32;
	public static final int NC=33;
	public static final int NONCE=34;
	public static final int NUM=35;
	public static final int OCTAL_ESC=36;
	public static final int OPAQUE=37;
	public static final int PATH=38;
	public static final int PATH_ELEMENT=39;
	public static final int POST=40;
	public static final int Q=41;
	public static final int QOP=42;
	public static final int QUERY_ELEMENT=43;
	public static final int Q_VAL=44;
	public static final int REALM=45;
	public static final int RESPONSE=46;
	public static final int SEMI_COLUMN=47;
	public static final int STRING=48;
	public static final int TERMINAL=49;
	public static final int UA_ELEMENT=50;
	public static final int UA_INFO=51;
	public static final int UNICODE_ESC=52;
	public static final int URI=53;
	public static final int USERNAME=54;
	public static final int USER_AGENT=55;
	public static final int VERSION=56;
	public static final int VERS_NUM=57;
	public static final int WS=58;

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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:37:1: request : requestLine ( header )* ( body )? ;
	public final void request() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:38:2: ( requestLine ( header )* ( body )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:38:4: requestLine ( header )* ( body )?
			{
			pushFollow(FOLLOW_requestLine_in_request59);
			requestLine();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:39:3: ( header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ACCEPT||LA1_0==AUTHORIZATION||(LA1_0 >= CONTENT_TYPE && LA1_0 <= COOKIE)||LA1_0==HOST||LA1_0==USER_AGENT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:39:4: header
					{
					pushFollow(FOLLOW_header_in_request64);
					header();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:40:3: ( body )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==STRING) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:40:4: body
					{
					pushFollow(FOLLOW_body_in_request71);
					body();
					state._fsp--;

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
	}
	// $ANTLR end "request"



	// $ANTLR start "requestLine"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:43:1: requestLine : method PATH VERSION TERMINAL ;
	public final void requestLine() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:44:2: ( method PATH VERSION TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:44:4: method PATH VERSION TERMINAL
			{
			pushFollow(FOLLOW_method_in_requestLine85);
			method();
			state._fsp--;

			match(input,PATH,FOLLOW_PATH_in_requestLine89); 
			match(input,VERSION,FOLLOW_VERSION_in_requestLine93); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_requestLine97); 
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
	// $ANTLR end "requestLine"



	// $ANTLR start "method"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:50:1: method : ( GET | POST );
	public final void method() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:51:2: ( GET | POST )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
			{
			if ( input.LA(1)==GET||input.LA(1)==POST ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "method"



	// $ANTLR start "header"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:55:1: header : ( hostRule | userAgentRule | contentTypeRule | acceptRule | cookieRule | authorizationRule );
	public final void header() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:56:2: ( hostRule | userAgentRule | contentTypeRule | acceptRule | cookieRule | authorizationRule )
			int alt3=6;
			switch ( input.LA(1) ) {
			case HOST:
				{
				alt3=1;
				}
				break;
			case USER_AGENT:
				{
				alt3=2;
				}
				break;
			case CONTENT_TYPE:
				{
				alt3=3;
				}
				break;
			case ACCEPT:
				{
				alt3=4;
				}
				break;
			case COOKIE:
				{
				alt3=5;
				}
				break;
			case AUTHORIZATION:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:56:4: hostRule
					{
					pushFollow(FOLLOW_hostRule_in_header125);
					hostRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:4: userAgentRule
					{
					pushFollow(FOLLOW_userAgentRule_in_header130);
					userAgentRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:4: contentTypeRule
					{
					pushFollow(FOLLOW_contentTypeRule_in_header135);
					contentTypeRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:59:4: acceptRule
					{
					pushFollow(FOLLOW_acceptRule_in_header140);
					acceptRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:60:4: cookieRule
					{
					pushFollow(FOLLOW_cookieRule_in_header145);
					cookieRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:61:4: authorizationRule
					{
					pushFollow(FOLLOW_authorizationRule_in_header150);
					authorizationRule();
					state._fsp--;

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
	}
	// $ANTLR end "header"



	// $ANTLR start "hostRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:65:1: hostRule : HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL ;
	public final void hostRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:66:2: ( HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:66:4: HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL
			{
			match(input,HOST,FOLLOW_HOST_in_hostRule164); 
			match(input,COLUMN,FOLLOW_COLUMN_in_hostRule166); 
			if ( input.LA(1)==DNS||input.LA(1)==IPV4 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:68:3: ( COLUMN INT_NUM )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==COLUMN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:68:4: COLUMN INT_NUM
					{
					match(input,COLUMN,FOLLOW_COLUMN_in_hostRule182); 
					match(input,INT_NUM,FOLLOW_INT_NUM_in_hostRule184); 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_hostRule190); 
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
	// $ANTLR end "hostRule"



	// $ANTLR start "userAgentRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:72:1: userAgentRule : USER_AGENT COLUMN productOrPlatformRule ( productOrPlatformRule ( extensionRule )* )? TERMINAL ;
	public final void userAgentRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:73:2: ( USER_AGENT COLUMN productOrPlatformRule ( productOrPlatformRule ( extensionRule )* )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:73:4: USER_AGENT COLUMN productOrPlatformRule ( productOrPlatformRule ( extensionRule )* )? TERMINAL
			{
			match(input,USER_AGENT,FOLLOW_USER_AGENT_in_userAgentRule202); 
			match(input,COLUMN,FOLLOW_COLUMN_in_userAgentRule204); 
			pushFollow(FOLLOW_productOrPlatformRule_in_userAgentRule208);
			productOrPlatformRule();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:75:3: ( productOrPlatformRule ( extensionRule )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==UA_ELEMENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:75:4: productOrPlatformRule ( extensionRule )*
					{
					pushFollow(FOLLOW_productOrPlatformRule_in_userAgentRule213);
					productOrPlatformRule();
					state._fsp--;

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:3: ( extensionRule )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==UA_ELEMENT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:3: extensionRule
							{
							pushFollow(FOLLOW_extensionRule_in_userAgentRule217);
							extensionRule();
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_userAgentRule224); 
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
	// $ANTLR end "userAgentRule"



	// $ANTLR start "productOrPlatformRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:1: productOrPlatformRule : UA_ELEMENT ( UA_INFO )? ;
	public final void productOrPlatformRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:2: ( UA_ELEMENT ( UA_INFO )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:4: UA_ELEMENT ( UA_INFO )?
			{
			match(input,UA_ELEMENT,FOLLOW_UA_ELEMENT_in_productOrPlatformRule236); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:15: ( UA_INFO )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==UA_INFO) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:81:15: UA_INFO
					{
					match(input,UA_INFO,FOLLOW_UA_INFO_in_productOrPlatformRule238); 
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
	}
	// $ANTLR end "productOrPlatformRule"



	// $ANTLR start "extensionRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:1: extensionRule : UA_ELEMENT ;
	public final void extensionRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:85:2: ( UA_ELEMENT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:85:4: UA_ELEMENT
			{
			match(input,UA_ELEMENT,FOLLOW_UA_ELEMENT_in_extensionRule251); 
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
	// $ANTLR end "extensionRule"



	// $ANTLR start "acceptRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:88:1: acceptRule : ACCEPT COLUMN mimeList TERMINAL ;
	public final void acceptRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:89:2: ( ACCEPT COLUMN mimeList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:89:4: ACCEPT COLUMN mimeList TERMINAL
			{
			match(input,ACCEPT,FOLLOW_ACCEPT_in_acceptRule263); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptRule265); 
			pushFollow(FOLLOW_mimeList_in_acceptRule269);
			mimeList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptRule273); 
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
	// $ANTLR end "acceptRule"



	// $ANTLR start "mimeList"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:94:1: mimeList : mimeElement ( COMMA mimeElement )* ;
	public final void mimeList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:2: ( mimeElement ( COMMA mimeElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:4: mimeElement ( COMMA mimeElement )*
			{
			pushFollow(FOLLOW_mimeElement_in_mimeList285);
			mimeElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:96:3: ( COMMA mimeElement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:96:4: COMMA mimeElement
					{
					match(input,COMMA,FOLLOW_COMMA_in_mimeList290); 
					pushFollow(FOLLOW_mimeElement_in_mimeList292);
					mimeElement();
					state._fsp--;

					}
					break;

				default :
					break loop8;
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
	}
	// $ANTLR end "mimeList"



	// $ANTLR start "mimeElement"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:1: mimeElement : MIME ( qValueRule )? ;
	public final void mimeElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:2: ( MIME ( qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:4: MIME ( qValueRule )?
			{
			match(input,MIME,FOLLOW_MIME_in_mimeElement306); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:9: ( qValueRule )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==SEMI_COLUMN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:10: qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_mimeElement309);
					qValueRule();
					state._fsp--;

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
	}
	// $ANTLR end "mimeElement"



	// $ANTLR start "contentTypeRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:103:1: contentTypeRule : CONTENT_TYPE COLUMN ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule ) TERMINAL ;
	public final void contentTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:104:2: ( CONTENT_TYPE COLUMN ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:104:4: CONTENT_TYPE COLUMN ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule ) TERMINAL
			{
			match(input,CONTENT_TYPE,FOLLOW_CONTENT_TYPE_in_contentTypeRule323); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentTypeRule325); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:3: ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==MIME) ) {
				alt11=1;
			}
			else if ( (LA11_0==MULTIPART_MIME) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:4: MIME ( charsetRule )?
					{
					match(input,MIME,FOLLOW_MIME_in_contentTypeRule330); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:9: ( charsetRule )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==SEMI_COLUMN) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:9: charsetRule
							{
							pushFollow(FOLLOW_charsetRule_in_contentTypeRule332);
							charsetRule();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:106:4: MULTIPART_MIME boundaryRule
					{
					match(input,MULTIPART_MIME,FOLLOW_MULTIPART_MIME_in_contentTypeRule338); 
					pushFollow(FOLLOW_boundaryRule_in_contentTypeRule340);
					boundaryRule();
					state._fsp--;

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentTypeRule345); 
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
	// $ANTLR end "contentTypeRule"



	// $ANTLR start "cookieRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:110:1: cookieRule : COOKIE COLUMN cookieList TERMINAL ;
	public final void cookieRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:2: ( COOKIE COLUMN cookieList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:4: COOKIE COLUMN cookieList TERMINAL
			{
			match(input,COOKIE,FOLLOW_COOKIE_in_cookieRule358); 
			match(input,COLUMN,FOLLOW_COLUMN_in_cookieRule360); 
			pushFollow(FOLLOW_cookieList_in_cookieRule364);
			cookieList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_cookieRule368); 
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
	// $ANTLR end "cookieRule"



	// $ANTLR start "cookieList"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:1: cookieList : cookieElement ( SEMI_COLUMN cookieElement )* ;
	public final void cookieList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:2: ( cookieElement ( SEMI_COLUMN cookieElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:4: cookieElement ( SEMI_COLUMN cookieElement )*
			{
			pushFollow(FOLLOW_cookieElement_in_cookieList380);
			cookieElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:118:3: ( SEMI_COLUMN cookieElement )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==SEMI_COLUMN) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:118:4: SEMI_COLUMN cookieElement
					{
					match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_cookieList385); 
					pushFollow(FOLLOW_cookieElement_in_cookieList387);
					cookieElement();
					state._fsp--;

					}
					break;

				default :
					break loop12;
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
	}
	// $ANTLR end "cookieList"



	// $ANTLR start "cookieElement"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:121:1: cookieElement : STRING EQUALS STRING ;
	public final void cookieElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:2: ( STRING EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:4: STRING EQUALS STRING
			{
			match(input,STRING,FOLLOW_STRING_in_cookieElement402); 
			match(input,EQUALS,FOLLOW_EQUALS_in_cookieElement404); 
			match(input,STRING,FOLLOW_STRING_in_cookieElement406); 
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
	// $ANTLR end "cookieElement"



	// $ANTLR start "qValueRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:125:1: qValueRule : SEMI_COLUMN Q EQUALS Q_VAL ;
	public final void qValueRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:126:2: ( SEMI_COLUMN Q EQUALS Q_VAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:126:4: SEMI_COLUMN Q EQUALS Q_VAL
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_qValueRule418); 
			match(input,Q,FOLLOW_Q_in_qValueRule420); 
			match(input,EQUALS,FOLLOW_EQUALS_in_qValueRule422); 
			match(input,Q_VAL,FOLLOW_Q_VAL_in_qValueRule424); 
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
	// $ANTLR end "qValueRule"



	// $ANTLR start "charsetRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:129:1: charsetRule : SEMI_COLUMN CHARSET EQUALS STRING ;
	public final void charsetRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:130:2: ( SEMI_COLUMN CHARSET EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:130:4: SEMI_COLUMN CHARSET EQUALS STRING
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_charsetRule436); 
			match(input,CHARSET,FOLLOW_CHARSET_in_charsetRule438); 
			match(input,EQUALS,FOLLOW_EQUALS_in_charsetRule440); 
			match(input,STRING,FOLLOW_STRING_in_charsetRule442); 
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
	// $ANTLR end "charsetRule"



	// $ANTLR start "boundaryRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:1: boundaryRule : SEMI_COLUMN BOUNDARY EQUALS STRING ;
	public final void boundaryRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:134:2: ( SEMI_COLUMN BOUNDARY EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:134:4: SEMI_COLUMN BOUNDARY EQUALS STRING
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_boundaryRule454); 
			match(input,BOUNDARY,FOLLOW_BOUNDARY_in_boundaryRule456); 
			match(input,EQUALS,FOLLOW_EQUALS_in_boundaryRule458); 
			match(input,STRING,FOLLOW_STRING_in_boundaryRule460); 
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
	// $ANTLR end "boundaryRule"



	// $ANTLR start "authorizationRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:137:1: authorizationRule : AUTHORIZATION COLUMN ( basicAuthRule | digestAuthRule ) TERMINAL ;
	public final void authorizationRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:2: ( AUTHORIZATION COLUMN ( basicAuthRule | digestAuthRule ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:4: AUTHORIZATION COLUMN ( basicAuthRule | digestAuthRule ) TERMINAL
			{
			match(input,AUTHORIZATION,FOLLOW_AUTHORIZATION_in_authorizationRule472); 
			match(input,COLUMN,FOLLOW_COLUMN_in_authorizationRule474); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:139:3: ( basicAuthRule | digestAuthRule )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BASIC) ) {
				alt13=1;
			}
			else if ( (LA13_0==DIGEST) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:139:4: basicAuthRule
					{
					pushFollow(FOLLOW_basicAuthRule_in_authorizationRule479);
					basicAuthRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:140:4: digestAuthRule
					{
					pushFollow(FOLLOW_digestAuthRule_in_authorizationRule484);
					digestAuthRule();
					state._fsp--;

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_authorizationRule489); 
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
	// $ANTLR end "authorizationRule"



	// $ANTLR start "basicAuthRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:1: basicAuthRule : BASIC STRING ;
	public final void basicAuthRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:2: ( BASIC STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:4: BASIC STRING
			{
			match(input,BASIC,FOLLOW_BASIC_in_basicAuthRule501); 
			match(input,STRING,FOLLOW_STRING_in_basicAuthRule503); 
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
	// $ANTLR end "basicAuthRule"



	// $ANTLR start "digestAuthRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:148:1: digestAuthRule : DIGEST authRule ( COMMA authRule )* ;
	public final void digestAuthRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:2: ( DIGEST authRule ( COMMA authRule )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:4: DIGEST authRule ( COMMA authRule )*
			{
			match(input,DIGEST,FOLLOW_DIGEST_in_digestAuthRule515); 
			pushFollow(FOLLOW_authRule_in_digestAuthRule519);
			authRule();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:151:3: ( COMMA authRule )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:151:4: COMMA authRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_digestAuthRule524); 
					pushFollow(FOLLOW_authRule_in_digestAuthRule526);
					authRule();
					state._fsp--;

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
	}
	// $ANTLR end "digestAuthRule"



	// $ANTLR start "authRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:154:1: authRule : ( USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE ) EQUALS STRING ;
	public final void authRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:155:2: ( ( USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE ) EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:155:4: ( USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE ) EQUALS STRING
			{
			if ( input.LA(1)==ALGORITHM||input.LA(1)==CNONCE||(input.LA(1) >= NC && input.LA(1) <= NONCE)||input.LA(1)==OPAQUE||input.LA(1)==QOP||(input.LA(1) >= REALM && input.LA(1) <= RESPONSE)||(input.LA(1) >= URI && input.LA(1) <= USERNAME) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,EQUALS,FOLLOW_EQUALS_in_authRule593); 
			match(input,STRING,FOLLOW_STRING_in_authRule595); 
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
	// $ANTLR end "authRule"



	// $ANTLR start "body"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:168:1: body : STRING TERMINAL ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:169:2: ( STRING TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:169:4: STRING TERMINAL
			{
			match(input,STRING,FOLLOW_STRING_in_body606); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_body610); 
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
	// $ANTLR end "body"

	// Delegated rules



	public static final BitSet FOLLOW_requestLine_in_request59 = new BitSet(new long[]{0x0081000004030112L});
	public static final BitSet FOLLOW_header_in_request64 = new BitSet(new long[]{0x0081000004030112L});
	public static final BitSet FOLLOW_body_in_request71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_requestLine85 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PATH_in_requestLine89 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_VERSION_in_requestLine93 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_requestLine97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hostRule_in_header125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userAgentRule_in_header130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentTypeRule_in_header135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptRule_in_header140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieRule_in_header145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_authorizationRule_in_header150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOST_in_hostRule164 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule166 = new BitSet(new long[]{0x0000000010080000L});
	public static final BitSet FOLLOW_set_in_hostRule171 = new BitSet(new long[]{0x0002000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule182 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_INT_NUM_in_hostRule184 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_hostRule190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USER_AGENT_in_userAgentRule202 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_userAgentRule204 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_productOrPlatformRule_in_userAgentRule208 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_productOrPlatformRule_in_userAgentRule213 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_extensionRule_in_userAgentRule217 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_userAgentRule224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UA_ELEMENT_in_productOrPlatformRule236 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_UA_INFO_in_productOrPlatformRule238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UA_ELEMENT_in_extensionRule251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_in_acceptRule263 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptRule265 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_mimeList_in_acceptRule269 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptRule273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList285 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_mimeList290 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList292 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_MIME_in_mimeElement306 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_qValueRule_in_mimeElement309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_TYPE_in_contentTypeRule323 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_contentTypeRule325 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_MIME_in_contentTypeRule330 = new BitSet(new long[]{0x0002800000000000L});
	public static final BitSet FOLLOW_charsetRule_in_contentTypeRule332 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_MULTIPART_MIME_in_contentTypeRule338 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_boundaryRule_in_contentTypeRule340 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentTypeRule345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COOKIE_in_cookieRule358 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_cookieRule360 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_cookieList_in_cookieRule364 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_cookieRule368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList380 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_cookieList385 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList387 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_STRING_in_cookieElement402 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EQUALS_in_cookieElement404 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_cookieElement406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_qValueRule418 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_Q_in_qValueRule420 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EQUALS_in_qValueRule422 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_Q_VAL_in_qValueRule424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_charsetRule436 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CHARSET_in_charsetRule438 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EQUALS_in_charsetRule440 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_charsetRule442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_boundaryRule454 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BOUNDARY_in_boundaryRule456 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EQUALS_in_boundaryRule458 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_boundaryRule460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTHORIZATION_in_authorizationRule472 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLUMN_in_authorizationRule474 = new BitSet(new long[]{0x0000000000040200L});
	public static final BitSet FOLLOW_basicAuthRule_in_authorizationRule479 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_digestAuthRule_in_authorizationRule484 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_authorizationRule489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_in_basicAuthRule501 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_basicAuthRule503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGEST_in_digestAuthRule515 = new BitSet(new long[]{0x0060642600001020L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule519 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_digestAuthRule524 = new BitSet(new long[]{0x0060642600001020L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule526 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_set_in_authRule540 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EQUALS_in_authRule593 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_STRING_in_authRule595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_body606 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_body610 = new BitSet(new long[]{0x0000000000000002L});
}
