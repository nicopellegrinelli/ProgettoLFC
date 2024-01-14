// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-13 15:42:19

package compiler; 		
import utils.Variable;


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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:43:1: requestLine : method pathRule HTTP_VERSION TERMINAL ;
	public final void requestLine() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:44:2: ( method pathRule HTTP_VERSION TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:44:4: method pathRule HTTP_VERSION TERMINAL
			{
			pushFollow(FOLLOW_method_in_requestLine85);
			method();
			state._fsp--;

			pushFollow(FOLLOW_pathRule_in_requestLine89);
			pathRule();
			state._fsp--;

			match(input,HTTP_VERSION,FOLLOW_HTTP_VERSION_in_requestLine93); 
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



	// $ANTLR start "pathRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:50:1: pathRule : ( PATH | STRING );
	public final void pathRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:51:2: ( PATH | STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
			{
			if ( input.LA(1)==PATH||input.LA(1)==STRING ) {
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
	// $ANTLR end "pathRule"



	// $ANTLR start "method"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:55:1: method : ( GET | POST );
	public final void method() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:56:2: ( GET | POST )
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:60:1: header : ( hostRule | userAgentRule | contentTypeRule | acceptRule | cookieRule | authorizationRule | contentLengthRule | connectionRule | acceptLanguageRule | acceptEncodingRule | chacheControlRule | genericHeaderRule );
	public final void header() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:61:2: ( hostRule | userAgentRule | contentTypeRule | acceptRule | cookieRule | authorizationRule | contentLengthRule | connectionRule | acceptLanguageRule | acceptEncodingRule | chacheControlRule | genericHeaderRule )
			int alt3=12;
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
			case CONTENT_LENGTH:
				{
				alt3=7;
				}
				break;
			case CONNECTION:
				{
				alt3=8;
				}
				break;
			case ACCEPT_LANGUAGE:
				{
				alt3=9;
				}
				break;
			case ACCEPT_ENCODING:
				{
				alt3=10;
				}
				break;
			case CACHE_CONTROL:
				{
				alt3=11;
				}
				break;
			case STRING:
				{
				alt3=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:61:4: hostRule
					{
					pushFollow(FOLLOW_hostRule_in_header141);
					hostRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:62:4: userAgentRule
					{
					pushFollow(FOLLOW_userAgentRule_in_header146);
					userAgentRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:63:4: contentTypeRule
					{
					pushFollow(FOLLOW_contentTypeRule_in_header151);
					contentTypeRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:64:4: acceptRule
					{
					pushFollow(FOLLOW_acceptRule_in_header156);
					acceptRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:65:4: cookieRule
					{
					pushFollow(FOLLOW_cookieRule_in_header161);
					cookieRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:66:4: authorizationRule
					{
					pushFollow(FOLLOW_authorizationRule_in_header166);
					authorizationRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:67:4: contentLengthRule
					{
					pushFollow(FOLLOW_contentLengthRule_in_header171);
					contentLengthRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:68:4: connectionRule
					{
					pushFollow(FOLLOW_connectionRule_in_header176);
					connectionRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:69:4: acceptLanguageRule
					{
					pushFollow(FOLLOW_acceptLanguageRule_in_header181);
					acceptLanguageRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:70:4: acceptEncodingRule
					{
					pushFollow(FOLLOW_acceptEncodingRule_in_header186);
					acceptEncodingRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:71:4: chacheControlRule
					{
					pushFollow(FOLLOW_chacheControlRule_in_header191);
					chacheControlRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:72:4: genericHeaderRule
					{
					pushFollow(FOLLOW_genericHeaderRule_in_header196);
					genericHeaderRule();
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:76:1: hostRule : HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL ;
	public final void hostRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:77:2: ( HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:77:4: HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL
			{
			match(input,HOST,FOLLOW_HOST_in_hostRule210); 
			match(input,COLUMN,FOLLOW_COLUMN_in_hostRule212); 
			if ( input.LA(1)==DNS||input.LA(1)==IPV4 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:79:3: ( COLUMN INT_NUM )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==COLUMN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:79:4: COLUMN INT_NUM
					{
					match(input,COLUMN,FOLLOW_COLUMN_in_hostRule228); 
					match(input,INT_NUM,FOLLOW_INT_NUM_in_hostRule230); 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_hostRule236); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:83:1: userAgentRule : USER_AGENT COLUMN productRule ( productRule ( extensionRule )* )? TERMINAL ;
	public final void userAgentRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:2: ( USER_AGENT COLUMN productRule ( productRule ( extensionRule )* )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:4: USER_AGENT COLUMN productRule ( productRule ( extensionRule )* )? TERMINAL
			{
			match(input,USER_AGENT,FOLLOW_USER_AGENT_in_userAgentRule248); 
			match(input,COLUMN,FOLLOW_COLUMN_in_userAgentRule250); 
			pushFollow(FOLLOW_productRule_in_userAgentRule254);
			productRule();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:86:3: ( productRule ( extensionRule )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PRODUCT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:86:4: productRule ( extensionRule )*
					{
					pushFollow(FOLLOW_productRule_in_userAgentRule259);
					productRule();
					state._fsp--;

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:87:3: ( extensionRule )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==PRODUCT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:87:3: extensionRule
							{
							pushFollow(FOLLOW_extensionRule_in_userAgentRule263);
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

			match(input,TERMINAL,FOLLOW_TERMINAL_in_userAgentRule270); 
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



	// $ANTLR start "productRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:91:1: productRule : PRODUCT ( PRODUCT_INFO )? ;
	public final void productRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:92:2: ( PRODUCT ( PRODUCT_INFO )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:92:4: PRODUCT ( PRODUCT_INFO )?
			{
			match(input,PRODUCT,FOLLOW_PRODUCT_in_productRule282); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:92:12: ( PRODUCT_INFO )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PRODUCT_INFO) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:92:12: PRODUCT_INFO
					{
					match(input,PRODUCT_INFO,FOLLOW_PRODUCT_INFO_in_productRule284); 
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
	// $ANTLR end "productRule"



	// $ANTLR start "extensionRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:1: extensionRule : PRODUCT ;
	public final void extensionRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:96:2: ( PRODUCT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:96:4: PRODUCT
			{
			match(input,PRODUCT,FOLLOW_PRODUCT_in_extensionRule297); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:1: acceptRule : ACCEPT COLUMN mimeList TERMINAL ;
	public final void acceptRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:2: ( ACCEPT COLUMN mimeList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:100:4: ACCEPT COLUMN mimeList TERMINAL
			{
			match(input,ACCEPT,FOLLOW_ACCEPT_in_acceptRule309); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptRule311); 
			pushFollow(FOLLOW_mimeList_in_acceptRule315);
			mimeList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptRule319); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:105:1: mimeList : mimeElement ( COMMA mimeElement )* ;
	public final void mimeList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:106:2: ( mimeElement ( COMMA mimeElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:106:4: mimeElement ( COMMA mimeElement )*
			{
			pushFollow(FOLLOW_mimeElement_in_mimeList331);
			mimeElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:107:3: ( COMMA mimeElement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:107:4: COMMA mimeElement
					{
					match(input,COMMA,FOLLOW_COMMA_in_mimeList336); 
					pushFollow(FOLLOW_mimeElement_in_mimeList338);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:110:1: mimeElement : MIME ( qValueRule )? ;
	public final void mimeElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:2: ( MIME ( qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:4: MIME ( qValueRule )?
			{
			match(input,MIME,FOLLOW_MIME_in_mimeElement352); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:9: ( qValueRule )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==SEMI_COLUMN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:111:9: qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_mimeElement354);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:114:1: contentTypeRule : CONTENT_TYPE COLUMN ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule ) TERMINAL ;
	public final void contentTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:2: ( CONTENT_TYPE COLUMN ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:4: CONTENT_TYPE COLUMN ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule ) TERMINAL
			{
			match(input,CONTENT_TYPE,FOLLOW_CONTENT_TYPE_in_contentTypeRule367); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentTypeRule369); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:3: ( MIME ( charsetRule )? | MULTIPART_MIME boundaryRule )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:4: MIME ( charsetRule )?
					{
					match(input,MIME,FOLLOW_MIME_in_contentTypeRule374); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:9: ( charsetRule )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==SEMI_COLUMN) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:116:9: charsetRule
							{
							pushFollow(FOLLOW_charsetRule_in_contentTypeRule376);
							charsetRule();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:117:4: MULTIPART_MIME boundaryRule
					{
					match(input,MULTIPART_MIME,FOLLOW_MULTIPART_MIME_in_contentTypeRule382); 
					pushFollow(FOLLOW_boundaryRule_in_contentTypeRule384);
					boundaryRule();
					state._fsp--;

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentTypeRule389); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:121:1: cookieRule : COOKIE COLUMN cookieList TERMINAL ;
	public final void cookieRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:2: ( COOKIE COLUMN cookieList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:4: COOKIE COLUMN cookieList TERMINAL
			{
			match(input,COOKIE,FOLLOW_COOKIE_in_cookieRule402); 
			match(input,COLUMN,FOLLOW_COLUMN_in_cookieRule404); 
			pushFollow(FOLLOW_cookieList_in_cookieRule408);
			cookieList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_cookieRule412); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:127:1: cookieList : cookieElement ( SEMI_COLUMN cookieElement )* ;
	public final void cookieList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:2: ( cookieElement ( SEMI_COLUMN cookieElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:128:4: cookieElement ( SEMI_COLUMN cookieElement )*
			{
			pushFollow(FOLLOW_cookieElement_in_cookieList424);
			cookieElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:129:3: ( SEMI_COLUMN cookieElement )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==SEMI_COLUMN) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:129:4: SEMI_COLUMN cookieElement
					{
					match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_cookieList429); 
					pushFollow(FOLLOW_cookieElement_in_cookieList431);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:132:1: cookieElement : STRING EQUALS STRING ;
	public final void cookieElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:2: ( STRING EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:4: STRING EQUALS STRING
			{
			match(input,STRING,FOLLOW_STRING_in_cookieElement446); 
			match(input,EQUALS,FOLLOW_EQUALS_in_cookieElement448); 
			match(input,STRING,FOLLOW_STRING_in_cookieElement450); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:136:1: qValueRule : SEMI_COLUMN Q EQUALS Q_VAL ;
	public final void qValueRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:137:2: ( SEMI_COLUMN Q EQUALS Q_VAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:137:4: SEMI_COLUMN Q EQUALS Q_VAL
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_qValueRule462); 
			match(input,Q,FOLLOW_Q_in_qValueRule464); 
			match(input,EQUALS,FOLLOW_EQUALS_in_qValueRule466); 
			match(input,Q_VAL,FOLLOW_Q_VAL_in_qValueRule468); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:140:1: charsetRule : SEMI_COLUMN CHARSET EQUALS STRING ;
	public final void charsetRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:141:2: ( SEMI_COLUMN CHARSET EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:141:4: SEMI_COLUMN CHARSET EQUALS STRING
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_charsetRule480); 
			match(input,CHARSET,FOLLOW_CHARSET_in_charsetRule482); 
			match(input,EQUALS,FOLLOW_EQUALS_in_charsetRule484); 
			match(input,STRING,FOLLOW_STRING_in_charsetRule486); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:1: boundaryRule : SEMI_COLUMN BOUNDARY EQUALS STRING ;
	public final void boundaryRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:2: ( SEMI_COLUMN BOUNDARY EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:4: SEMI_COLUMN BOUNDARY EQUALS STRING
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_boundaryRule498); 
			match(input,BOUNDARY,FOLLOW_BOUNDARY_in_boundaryRule500); 
			match(input,EQUALS,FOLLOW_EQUALS_in_boundaryRule502); 
			match(input,STRING,FOLLOW_STRING_in_boundaryRule504); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:148:1: authorizationRule : AUTHORIZATION COLUMN ( basicAuthRule | digestAuthRule ) TERMINAL ;
	public final void authorizationRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:2: ( AUTHORIZATION COLUMN ( basicAuthRule | digestAuthRule ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:149:4: AUTHORIZATION COLUMN ( basicAuthRule | digestAuthRule ) TERMINAL
			{
			match(input,AUTHORIZATION,FOLLOW_AUTHORIZATION_in_authorizationRule516); 
			match(input,COLUMN,FOLLOW_COLUMN_in_authorizationRule518); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:150:3: ( basicAuthRule | digestAuthRule )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:150:4: basicAuthRule
					{
					pushFollow(FOLLOW_basicAuthRule_in_authorizationRule523);
					basicAuthRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:151:4: digestAuthRule
					{
					pushFollow(FOLLOW_digestAuthRule_in_authorizationRule528);
					digestAuthRule();
					state._fsp--;

					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_authorizationRule533); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:155:1: basicAuthRule : BASIC STRING ;
	public final void basicAuthRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:156:2: ( BASIC STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:156:4: BASIC STRING
			{
			match(input,BASIC,FOLLOW_BASIC_in_basicAuthRule545); 
			match(input,STRING,FOLLOW_STRING_in_basicAuthRule547); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:1: digestAuthRule : DIGEST authRule ( COMMA authRule )* ;
	public final void digestAuthRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:160:2: ( DIGEST authRule ( COMMA authRule )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:160:4: DIGEST authRule ( COMMA authRule )*
			{
			match(input,DIGEST,FOLLOW_DIGEST_in_digestAuthRule559); 
			pushFollow(FOLLOW_authRule_in_digestAuthRule563);
			authRule();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:162:3: ( COMMA authRule )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:162:4: COMMA authRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_digestAuthRule568); 
					pushFollow(FOLLOW_authRule_in_digestAuthRule570);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:165:1: authRule : ( USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE ) EQUALS STRING ;
	public final void authRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:166:2: ( ( USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE ) EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:166:4: ( USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE ) EQUALS STRING
			{
			if ( input.LA(1)==ALGORITHM||input.LA(1)==CNONCE||(input.LA(1) >= NC && input.LA(1) <= NONCE)||input.LA(1)==OPAQUE||input.LA(1)==QOP||(input.LA(1) >= REALM && input.LA(1) <= RESPONSE)||(input.LA(1) >= URI && input.LA(1) <= USERNAME) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,EQUALS,FOLLOW_EQUALS_in_authRule637); 
			match(input,STRING,FOLLOW_STRING_in_authRule639); 
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



	// $ANTLR start "contentLengthRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:179:1: contentLengthRule : CONTENT_LENGTH COLUMN INT_NUM TERMINAL ;
	public final void contentLengthRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:180:2: ( CONTENT_LENGTH COLUMN INT_NUM TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:180:4: CONTENT_LENGTH COLUMN INT_NUM TERMINAL
			{
			match(input,CONTENT_LENGTH,FOLLOW_CONTENT_LENGTH_in_contentLengthRule650); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentLengthRule652); 
			match(input,INT_NUM,FOLLOW_INT_NUM_in_contentLengthRule656); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentLengthRule660); 
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
	// $ANTLR end "contentLengthRule"



	// $ANTLR start "connectionRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:185:1: connectionRule : CONNECTION COLUMN ( KEEP_ALIVE | CLOSE ) TERMINAL ;
	public final void connectionRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:186:2: ( CONNECTION COLUMN ( KEEP_ALIVE | CLOSE ) TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:186:4: CONNECTION COLUMN ( KEEP_ALIVE | CLOSE ) TERMINAL
			{
			match(input,CONNECTION,FOLLOW_CONNECTION_in_connectionRule672); 
			match(input,COLUMN,FOLLOW_COLUMN_in_connectionRule674); 
			if ( input.LA(1)==CLOSE||input.LA(1)==KEEP_ALIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,TERMINAL,FOLLOW_TERMINAL_in_connectionRule688); 
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
	// $ANTLR end "connectionRule"



	// $ANTLR start "acceptLanguageRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:1: acceptLanguageRule : ACCEPT_LANGUAGE COLUMN languageList TERMINAL ;
	public final void acceptLanguageRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:2: ( ACCEPT_LANGUAGE COLUMN languageList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:4: ACCEPT_LANGUAGE COLUMN languageList TERMINAL
			{
			match(input,ACCEPT_LANGUAGE,FOLLOW_ACCEPT_LANGUAGE_in_acceptLanguageRule700); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptLanguageRule702); 
			pushFollow(FOLLOW_languageList_in_acceptLanguageRule706);
			languageList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptLanguageRule710); 
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
	// $ANTLR end "acceptLanguageRule"



	// $ANTLR start "languageList"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:197:1: languageList : languageElement ( COMMA languageElement )* ;
	public final void languageList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:198:2: ( languageElement ( COMMA languageElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:198:4: languageElement ( COMMA languageElement )*
			{
			pushFollow(FOLLOW_languageElement_in_languageList722);
			languageElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:3: ( COMMA languageElement )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:4: COMMA languageElement
					{
					match(input,COMMA,FOLLOW_COMMA_in_languageList727); 
					pushFollow(FOLLOW_languageElement_in_languageList729);
					languageElement();
					state._fsp--;

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
	}
	// $ANTLR end "languageList"



	// $ANTLR start "languageElement"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:202:1: languageElement : ( LANGUAGE_ELEMENT | STAR ) ( qValueRule )? ;
	public final void languageElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:203:2: ( ( LANGUAGE_ELEMENT | STAR ) ( qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:203:4: ( LANGUAGE_ELEMENT | STAR ) ( qValueRule )?
			{
			if ( input.LA(1)==LANGUAGE_ELEMENT||input.LA(1)==STAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:204:3: ( qValueRule )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==SEMI_COLUMN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:204:3: qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_languageElement752);
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
	// $ANTLR end "languageElement"



	// $ANTLR start "acceptEncodingRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:207:1: acceptEncodingRule : ACCEPT_ENCODING COLUMN encodingList TERMINAL ;
	public final void acceptEncodingRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:208:2: ( ACCEPT_ENCODING COLUMN encodingList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:208:4: ACCEPT_ENCODING COLUMN encodingList TERMINAL
			{
			match(input,ACCEPT_ENCODING,FOLLOW_ACCEPT_ENCODING_in_acceptEncodingRule765); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptEncodingRule767); 
			pushFollow(FOLLOW_encodingList_in_acceptEncodingRule771);
			encodingList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptEncodingRule775); 
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
	// $ANTLR end "acceptEncodingRule"



	// $ANTLR start "encodingList"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:213:1: encodingList : encodingElement ( COMMA encodingElement )* ;
	public final void encodingList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:214:2: ( encodingElement ( COMMA encodingElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:214:4: encodingElement ( COMMA encodingElement )*
			{
			pushFollow(FOLLOW_encodingElement_in_encodingList787);
			encodingElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:215:3: ( COMMA encodingElement )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:215:4: COMMA encodingElement
					{
					match(input,COMMA,FOLLOW_COMMA_in_encodingList792); 
					pushFollow(FOLLOW_encodingElement_in_encodingList794);
					encodingElement();
					state._fsp--;

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
	}
	// $ANTLR end "encodingList"



	// $ANTLR start "encodingElement"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:218:1: encodingElement : ( ENCODING_ELEMENT | STAR ) ( qValueRule )? ;
	public final void encodingElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:219:2: ( ( ENCODING_ELEMENT | STAR ) ( qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:219:4: ( ENCODING_ELEMENT | STAR ) ( qValueRule )?
			{
			if ( input.LA(1)==ENCODING_ELEMENT||input.LA(1)==STAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:3: ( qValueRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==SEMI_COLUMN) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:3: qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_encodingElement817);
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
	// $ANTLR end "encodingElement"



	// $ANTLR start "chacheControlRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:223:1: chacheControlRule : CACHE_CONTROL COLUMN STRING ( COMMA STRING )* TERMINAL ;
	public final void chacheControlRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:224:2: ( CACHE_CONTROL COLUMN STRING ( COMMA STRING )* TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:224:4: CACHE_CONTROL COLUMN STRING ( COMMA STRING )* TERMINAL
			{
			match(input,CACHE_CONTROL,FOLLOW_CACHE_CONTROL_in_chacheControlRule830); 
			match(input,COLUMN,FOLLOW_COLUMN_in_chacheControlRule832); 
			match(input,STRING,FOLLOW_STRING_in_chacheControlRule836); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:225:10: ( COMMA STRING )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:225:11: COMMA STRING
					{
					match(input,COMMA,FOLLOW_COMMA_in_chacheControlRule839); 
					match(input,STRING,FOLLOW_STRING_in_chacheControlRule841); 
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_chacheControlRule847); 
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
	// $ANTLR end "chacheControlRule"



	// $ANTLR start "genericHeaderRule"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:229:1: genericHeaderRule : STRING COLUMN STRING TERMINAL ;
	public final void genericHeaderRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:230:2: ( STRING COLUMN STRING TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:230:4: STRING COLUMN STRING TERMINAL
			{
			match(input,STRING,FOLLOW_STRING_in_genericHeaderRule859); 
			match(input,COLUMN,FOLLOW_COLUMN_in_genericHeaderRule861); 
			match(input,STRING,FOLLOW_STRING_in_genericHeaderRule863); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_genericHeaderRule867); 
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
	// $ANTLR end "genericHeaderRule"



	// $ANTLR start "body"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:234:1: body : STRING TERMINAL ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:235:2: ( STRING TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:235:4: STRING TERMINAL
			{
			match(input,STRING,FOLLOW_STRING_in_body878); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_body882); 
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



	public static final BitSet FOLLOW_requestLine_in_request59 = new BitSet(new long[]{0x2000000200F02472L,0x0000000000000004L});
	public static final BitSet FOLLOW_header_in_request64 = new BitSet(new long[]{0x2000000200F02472L,0x0000000000000004L});
	public static final BitSet FOLLOW_body_in_request71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_requestLine85 = new BitSet(new long[]{0x2001000000000000L});
	public static final BitSet FOLLOW_pathRule_in_requestLine89 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_HTTP_VERSION_in_requestLine93 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_requestLine97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hostRule_in_header141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userAgentRule_in_header146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentTypeRule_in_header151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptRule_in_header156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieRule_in_header161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_authorizationRule_in_header166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentLengthRule_in_header171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connectionRule_in_header176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptLanguageRule_in_header181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptEncodingRule_in_header186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_chacheControlRule_in_header191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericHeaderRule_in_header196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOST_in_hostRule210 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule212 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_set_in_hostRule217 = new BitSet(new long[]{0x4000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule228 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INT_NUM_in_hostRule230 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_hostRule236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USER_AGENT_in_userAgentRule248 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_userAgentRule250 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_productRule_in_userAgentRule254 = new BitSet(new long[]{0x4008000000000000L});
	public static final BitSet FOLLOW_productRule_in_userAgentRule259 = new BitSet(new long[]{0x4008000000000000L});
	public static final BitSet FOLLOW_extensionRule_in_userAgentRule263 = new BitSet(new long[]{0x4008000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_userAgentRule270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_productRule282 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_PRODUCT_INFO_in_productRule284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_extensionRule297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_in_acceptRule309 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptRule311 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_mimeList_in_acceptRule315 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptRule319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList331 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_mimeList336 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList338 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_MIME_in_mimeElement352 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_qValueRule_in_mimeElement354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_TYPE_in_contentTypeRule367 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_contentTypeRule369 = new BitSet(new long[]{0x0000048000000000L});
	public static final BitSet FOLLOW_MIME_in_contentTypeRule374 = new BitSet(new long[]{0x4800000000000000L});
	public static final BitSet FOLLOW_charsetRule_in_contentTypeRule376 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_MULTIPART_MIME_in_contentTypeRule382 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_boundaryRule_in_contentTypeRule384 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentTypeRule389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COOKIE_in_cookieRule402 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_cookieRule404 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_cookieList_in_cookieRule408 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_cookieRule412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList424 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_cookieList429 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList431 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_STRING_in_cookieElement446 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_cookieElement448 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_cookieElement450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_qValueRule462 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Q_in_qValueRule464 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_qValueRule466 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_Q_VAL_in_qValueRule468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_charsetRule480 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CHARSET_in_charsetRule482 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_charsetRule484 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_charsetRule486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_boundaryRule498 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BOUNDARY_in_boundaryRule500 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_boundaryRule502 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_boundaryRule504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTHORIZATION_in_authorizationRule516 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_authorizationRule518 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_basicAuthRule_in_authorizationRule523 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_digestAuthRule_in_authorizationRule528 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_authorizationRule533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_in_basicAuthRule545 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_basicAuthRule547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGEST_in_digestAuthRule559 = new BitSet(new long[]{0x0640980000010080L,0x0000000000000003L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule563 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_digestAuthRule568 = new BitSet(new long[]{0x0640980000010080L,0x0000000000000003L});
	public static final BitSet FOLLOW_authRule_in_digestAuthRule570 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_set_in_authRule584 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQUALS_in_authRule637 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_authRule639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_LENGTH_in_contentLengthRule650 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_contentLengthRule652 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INT_NUM_in_contentLengthRule656 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentLengthRule660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONNECTION_in_connectionRule672 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_connectionRule674 = new BitSet(new long[]{0x0000002000008000L});
	public static final BitSet FOLLOW_set_in_connectionRule678 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_connectionRule688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_LANGUAGE_in_acceptLanguageRule700 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptLanguageRule702 = new BitSet(new long[]{0x1000004000000000L});
	public static final BitSet FOLLOW_languageList_in_acceptLanguageRule706 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptLanguageRule710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_languageElement_in_languageList722 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_languageList727 = new BitSet(new long[]{0x1000004000000000L});
	public static final BitSet FOLLOW_languageElement_in_languageList729 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_set_in_languageElement744 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_qValueRule_in_languageElement752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_ENCODING_in_acceptEncodingRule765 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_acceptEncodingRule767 = new BitSet(new long[]{0x1000000008000000L});
	public static final BitSet FOLLOW_encodingList_in_acceptEncodingRule771 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptEncodingRule775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_encodingElement_in_encodingList787 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_encodingList792 = new BitSet(new long[]{0x1000000008000000L});
	public static final BitSet FOLLOW_encodingElement_in_encodingList794 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_set_in_encodingElement809 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_qValueRule_in_encodingElement817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CACHE_CONTROL_in_chacheControlRule830 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_chacheControlRule832 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_chacheControlRule836 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_chacheControlRule839 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_chacheControlRule841 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_TERMINAL_in_chacheControlRule847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_genericHeaderRule859 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLUMN_in_genericHeaderRule861 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_genericHeaderRule863 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_genericHeaderRule867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_body878 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_TERMINAL_in_body882 = new BitSet(new long[]{0x0000000000000002L});
}
