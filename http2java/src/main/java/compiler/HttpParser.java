// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-12 17:38:20

package compiler; 		
import utils.Variable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "ALPHA_CHAR", "ALPHA_NUM_CHAR", 
		"COLUMN", "COMMA", "COMMENT", "CONTENT_TYPE", "COOKIE", "DNS", "DNS_ELEMENT", 
		"EQUALS", "ERROR_TOKEN", "ESC_SEQ", "GET", "HEX_DIGIT", "HOST", "INT_NUM", 
		"IPV4", "MIME", "MIME_SUBTYPE", "MIME_TYPE", "NUM", "OCTAL_ESC", "PATH", 
		"PATH_ELEMENT", "POST", "Q", "QUERY_ELEMENT", "Q_VAL", "SEMI_COLUMN", 
		"STRING", "TERMINAL", "UA_ELEMENT", "UA_INFO", "UNICODE_ESC", "USER_AGENT", 
		"VERSION", "VERS_NUM", "WS"
	};
	public static final int EOF=-1;
	public static final int ACCEPT=4;
	public static final int ALPHA_CHAR=5;
	public static final int ALPHA_NUM_CHAR=6;
	public static final int COLUMN=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int CONTENT_TYPE=10;
	public static final int COOKIE=11;
	public static final int DNS=12;
	public static final int DNS_ELEMENT=13;
	public static final int EQUALS=14;
	public static final int ERROR_TOKEN=15;
	public static final int ESC_SEQ=16;
	public static final int GET=17;
	public static final int HEX_DIGIT=18;
	public static final int HOST=19;
	public static final int INT_NUM=20;
	public static final int IPV4=21;
	public static final int MIME=22;
	public static final int MIME_SUBTYPE=23;
	public static final int MIME_TYPE=24;
	public static final int NUM=25;
	public static final int OCTAL_ESC=26;
	public static final int PATH=27;
	public static final int PATH_ELEMENT=28;
	public static final int POST=29;
	public static final int Q=30;
	public static final int QUERY_ELEMENT=31;
	public static final int Q_VAL=32;
	public static final int SEMI_COLUMN=33;
	public static final int STRING=34;
	public static final int TERMINAL=35;
	public static final int UA_ELEMENT=36;
	public static final int UA_INFO=37;
	public static final int UNICODE_ESC=38;
	public static final int USER_AGENT=39;
	public static final int VERSION=40;
	public static final int VERS_NUM=41;
	public static final int WS=42;

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
				if ( (LA1_0==ACCEPT||(LA1_0 >= CONTENT_TYPE && LA1_0 <= COOKIE)||LA1_0==HOST||LA1_0==USER_AGENT) ) {
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:55:1: header : ( hostRule | userAgentRule | contentTypeRule | acceptRule | cookieRule );
	public final void header() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:56:2: ( hostRule | userAgentRule | contentTypeRule | acceptRule | cookieRule )
			int alt3=5;
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:64:1: hostRule : HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL ;
	public final void hostRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:65:2: ( HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:65:4: HOST COLUMN ( DNS | IPV4 ) ( COLUMN INT_NUM )? TERMINAL
			{
			match(input,HOST,FOLLOW_HOST_in_hostRule159); 
			match(input,COLUMN,FOLLOW_COLUMN_in_hostRule161); 
			if ( input.LA(1)==DNS||input.LA(1)==IPV4 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:67:3: ( COLUMN INT_NUM )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==COLUMN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:67:4: COLUMN INT_NUM
					{
					match(input,COLUMN,FOLLOW_COLUMN_in_hostRule177); 
					match(input,INT_NUM,FOLLOW_INT_NUM_in_hostRule179); 
					}
					break;

			}

			match(input,TERMINAL,FOLLOW_TERMINAL_in_hostRule185); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:71:1: userAgentRule : USER_AGENT COLUMN productOrPlatformRule ( productOrPlatformRule ( extensionRule )* )? TERMINAL ;
	public final void userAgentRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:72:2: ( USER_AGENT COLUMN productOrPlatformRule ( productOrPlatformRule ( extensionRule )* )? TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:72:4: USER_AGENT COLUMN productOrPlatformRule ( productOrPlatformRule ( extensionRule )* )? TERMINAL
			{
			match(input,USER_AGENT,FOLLOW_USER_AGENT_in_userAgentRule197); 
			match(input,COLUMN,FOLLOW_COLUMN_in_userAgentRule199); 
			pushFollow(FOLLOW_productOrPlatformRule_in_userAgentRule203);
			productOrPlatformRule();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:74:3: ( productOrPlatformRule ( extensionRule )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==UA_ELEMENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:74:4: productOrPlatformRule ( extensionRule )*
					{
					pushFollow(FOLLOW_productOrPlatformRule_in_userAgentRule208);
					productOrPlatformRule();
					state._fsp--;

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:75:3: ( extensionRule )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==UA_ELEMENT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:75:3: extensionRule
							{
							pushFollow(FOLLOW_extensionRule_in_userAgentRule212);
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

			match(input,TERMINAL,FOLLOW_TERMINAL_in_userAgentRule219); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:79:1: productOrPlatformRule : UA_ELEMENT ( UA_INFO )? ;
	public final void productOrPlatformRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:2: ( UA_ELEMENT ( UA_INFO )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:4: UA_ELEMENT ( UA_INFO )?
			{
			match(input,UA_ELEMENT,FOLLOW_UA_ELEMENT_in_productOrPlatformRule231); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:15: ( UA_INFO )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==UA_INFO) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:80:15: UA_INFO
					{
					match(input,UA_INFO,FOLLOW_UA_INFO_in_productOrPlatformRule233); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:83:1: extensionRule : UA_ELEMENT ;
	public final void extensionRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:2: ( UA_ELEMENT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:84:4: UA_ELEMENT
			{
			match(input,UA_ELEMENT,FOLLOW_UA_ELEMENT_in_extensionRule246); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:87:1: acceptRule : ACCEPT COLUMN mimeList TERMINAL ;
	public final void acceptRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:88:2: ( ACCEPT COLUMN mimeList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:88:4: ACCEPT COLUMN mimeList TERMINAL
			{
			match(input,ACCEPT,FOLLOW_ACCEPT_in_acceptRule258); 
			match(input,COLUMN,FOLLOW_COLUMN_in_acceptRule260); 
			pushFollow(FOLLOW_mimeList_in_acceptRule264);
			mimeList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_acceptRule268); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:93:1: mimeList : mimeElement ( COMMA mimeElement )* ;
	public final void mimeList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:94:2: ( mimeElement ( COMMA mimeElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:94:4: mimeElement ( COMMA mimeElement )*
			{
			pushFollow(FOLLOW_mimeElement_in_mimeList280);
			mimeElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:3: ( COMMA mimeElement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:95:4: COMMA mimeElement
					{
					match(input,COMMA,FOLLOW_COMMA_in_mimeList285); 
					pushFollow(FOLLOW_mimeElement_in_mimeList287);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:98:1: mimeElement : MIME ( qValueRule )? ;
	public final void mimeElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:2: ( MIME ( qValueRule )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:4: MIME ( qValueRule )?
			{
			match(input,MIME,FOLLOW_MIME_in_mimeElement301); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:9: ( qValueRule )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==SEMI_COLUMN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:99:10: qValueRule
					{
					pushFollow(FOLLOW_qValueRule_in_mimeElement304);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:102:1: contentTypeRule : CONTENT_TYPE COLUMN TERMINAL ;
	public final void contentTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:103:2: ( CONTENT_TYPE COLUMN TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:103:4: CONTENT_TYPE COLUMN TERMINAL
			{
			match(input,CONTENT_TYPE,FOLLOW_CONTENT_TYPE_in_contentTypeRule318); 
			match(input,COLUMN,FOLLOW_COLUMN_in_contentTypeRule320); 
			match(input,TERMINAL,FOLLOW_TERMINAL_in_contentTypeRule324); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:107:1: cookieRule : COOKIE COLUMN cookieList TERMINAL ;
	public final void cookieRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:108:2: ( COOKIE COLUMN cookieList TERMINAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:108:4: COOKIE COLUMN cookieList TERMINAL
			{
			match(input,COOKIE,FOLLOW_COOKIE_in_cookieRule337); 
			match(input,COLUMN,FOLLOW_COLUMN_in_cookieRule339); 
			pushFollow(FOLLOW_cookieList_in_cookieRule343);
			cookieList();
			state._fsp--;

			match(input,TERMINAL,FOLLOW_TERMINAL_in_cookieRule347); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:113:1: cookieList : cookieElement ( SEMI_COLUMN cookieElement )* ;
	public final void cookieList() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:114:2: ( cookieElement ( SEMI_COLUMN cookieElement )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:114:4: cookieElement ( SEMI_COLUMN cookieElement )*
			{
			pushFollow(FOLLOW_cookieElement_in_cookieList359);
			cookieElement();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:3: ( SEMI_COLUMN cookieElement )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==SEMI_COLUMN) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:115:4: SEMI_COLUMN cookieElement
					{
					match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_cookieList364); 
					pushFollow(FOLLOW_cookieElement_in_cookieList366);
					cookieElement();
					state._fsp--;

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
	}
	// $ANTLR end "cookieList"



	// $ANTLR start "cookieElement"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:118:1: cookieElement : STRING EQUALS STRING ;
	public final void cookieElement() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:119:2: ( STRING EQUALS STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:119:4: STRING EQUALS STRING
			{
			match(input,STRING,FOLLOW_STRING_in_cookieElement381); 
			match(input,EQUALS,FOLLOW_EQUALS_in_cookieElement383); 
			match(input,STRING,FOLLOW_STRING_in_cookieElement385); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:122:1: qValueRule : SEMI_COLUMN Q EQUALS Q_VAL ;
	public final void qValueRule() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:2: ( SEMI_COLUMN Q EQUALS Q_VAL )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:123:4: SEMI_COLUMN Q EQUALS Q_VAL
			{
			match(input,SEMI_COLUMN,FOLLOW_SEMI_COLUMN_in_qValueRule397); 
			match(input,Q,FOLLOW_Q_in_qValueRule399); 
			match(input,EQUALS,FOLLOW_EQUALS_in_qValueRule401); 
			match(input,Q_VAL,FOLLOW_Q_VAL_in_qValueRule403); 
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



	// $ANTLR start "body"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:126:1: body : STRING ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:127:2: ( STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:127:4: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_body414); 
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



	public static final BitSet FOLLOW_requestLine_in_request59 = new BitSet(new long[]{0x0000008400080C12L});
	public static final BitSet FOLLOW_header_in_request64 = new BitSet(new long[]{0x0000008400080C12L});
	public static final BitSet FOLLOW_body_in_request71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_requestLine85 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_PATH_in_requestLine89 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VERSION_in_requestLine93 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TERMINAL_in_requestLine97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hostRule_in_header125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userAgentRule_in_header130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contentTypeRule_in_header135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptRule_in_header140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieRule_in_header145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOST_in_hostRule159 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule161 = new BitSet(new long[]{0x0000000000201000L});
	public static final BitSet FOLLOW_set_in_hostRule166 = new BitSet(new long[]{0x0000000800000080L});
	public static final BitSet FOLLOW_COLUMN_in_hostRule177 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INT_NUM_in_hostRule179 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TERMINAL_in_hostRule185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USER_AGENT_in_userAgentRule197 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLUMN_in_userAgentRule199 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_productOrPlatformRule_in_userAgentRule203 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_productOrPlatformRule_in_userAgentRule208 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_extensionRule_in_userAgentRule212 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_TERMINAL_in_userAgentRule219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UA_ELEMENT_in_productOrPlatformRule231 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_UA_INFO_in_productOrPlatformRule233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UA_ELEMENT_in_extensionRule246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_in_acceptRule258 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLUMN_in_acceptRule260 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_mimeList_in_acceptRule264 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TERMINAL_in_acceptRule268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList280 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_mimeList285 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_mimeElement_in_mimeList287 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_MIME_in_mimeElement301 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_qValueRule_in_mimeElement304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_TYPE_in_contentTypeRule318 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLUMN_in_contentTypeRule320 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TERMINAL_in_contentTypeRule324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COOKIE_in_cookieRule337 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLUMN_in_cookieRule339 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_cookieList_in_cookieRule343 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TERMINAL_in_cookieRule347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList359 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_cookieList364 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_cookieElement_in_cookieList366 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_STRING_in_cookieElement381 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EQUALS_in_cookieElement383 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_STRING_in_cookieElement385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLUMN_in_qValueRule397 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Q_in_qValueRule399 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EQUALS_in_qValueRule401 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Q_VAL_in_qValueRule403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_body414 = new BitSet(new long[]{0x0000000000000002L});
}
