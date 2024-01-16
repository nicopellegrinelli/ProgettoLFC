// $ANTLR 3.5.1 C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-16 18:50:21

	package compiler; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HttpLexer() {} 
	public HttpLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HttpLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g"; }

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:252:9: ( 'GET' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:252:11: 'GET'
			{
			match("GET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "POST"
	public final void mPOST() throws RecognitionException {
		try {
			int _type = POST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:10: ( 'POST' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:12: 'POST'
			{
			match("POST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POST"

	// $ANTLR start "HOST"
	public final void mHOST() throws RecognitionException {
		try {
			int _type = HOST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:254:10: ( 'Host' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:254:12: 'Host'
			{
			match("Host"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOST"

	// $ANTLR start "USER_AGENT"
	public final void mUSER_AGENT() throws RecognitionException {
		try {
			int _type = USER_AGENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:255:14: ( 'User-Agent' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:255:16: 'User-Agent'
			{
			match("User-Agent"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USER_AGENT"

	// $ANTLR start "CONTENT_TYPE"
	public final void mCONTENT_TYPE() throws RecognitionException {
		try {
			int _type = CONTENT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:256:15: ( 'Content-Type' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:256:17: 'Content-Type'
			{
			match("Content-Type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTENT_TYPE"

	// $ANTLR start "ACCEPT"
	public final void mACCEPT() throws RecognitionException {
		try {
			int _type = ACCEPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:11: ( 'Accept' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:13: 'Accept'
			{
			match("Accept"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACCEPT"

	// $ANTLR start "COOKIE"
	public final void mCOOKIE() throws RecognitionException {
		try {
			int _type = COOKIE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:11: ( 'Cookie' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:13: 'Cookie'
			{
			match("Cookie"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COOKIE"

	// $ANTLR start "AUTHORIZATION"
	public final void mAUTHORIZATION() throws RecognitionException {
		try {
			int _type = AUTHORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:259:16: ( 'Authorization' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:259:18: 'Authorization'
			{
			match("Authorization"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTHORIZATION"

	// $ANTLR start "ACCEPT_LANGUAGE"
	public final void mACCEPT_LANGUAGE() throws RecognitionException {
		try {
			int _type = ACCEPT_LANGUAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:260:17: ( 'Accept-Language' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:260:19: 'Accept-Language'
			{
			match("Accept-Language"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACCEPT_LANGUAGE"

	// $ANTLR start "ACCEPT_ENCODING"
	public final void mACCEPT_ENCODING() throws RecognitionException {
		try {
			int _type = ACCEPT_ENCODING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:261:17: ( 'Accept-Encoding' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:261:19: 'Accept-Encoding'
			{
			match("Accept-Encoding"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACCEPT_ENCODING"

	// $ANTLR start "CACHE_CONTROL"
	public final void mCACHE_CONTROL() throws RecognitionException {
		try {
			int _type = CACHE_CONTROL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:262:16: ( 'Cache-Control' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:262:18: 'Cache-Control'
			{
			match("Cache-Control"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CACHE_CONTROL"

	// $ANTLR start "MAX_FORWARDS"
	public final void mMAX_FORWARDS() throws RecognitionException {
		try {
			int _type = MAX_FORWARDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:263:15: ( 'Max-Forwards' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:263:17: 'Max-Forwards'
			{
			match("Max-Forwards"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX_FORWARDS"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			int _type = Q;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:264:8: ( 'q' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:264:10: 'q'
			{
			match('q'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:265:11: ( '=' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:265:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:266:11: ( ',' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:266:13: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLUMN"
	public final void mCOLUMN() throws RecognitionException {
		try {
			int _type = COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:267:11: ( ':' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:267:13: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLUMN"

	// $ANTLR start "SEMI_COLUMN"
	public final void mSEMI_COLUMN() throws RecognitionException {
		try {
			int _type = SEMI_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:268:15: ( ';' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:268:17: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI_COLUMN"

	// $ANTLR start "TERMINAL"
	public final void mTERMINAL() throws RecognitionException {
		try {
			int _type = TERMINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:269:13: ( '|' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:269:15: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERMINAL"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:270:10: ( '*' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:270:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:273:2: ( ALPHA_CHAR ( ALPHA_CHAR )+ )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:273:4: ALPHA_CHAR ( ALPHA_CHAR )+
			{
			mALPHA_CHAR(); 

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:273:15: ( ALPHA_CHAR )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT_NUM"
	public final void mINT_NUM() throws RecognitionException {
		try {
			int _type = INT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:2: ( NUM )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:4: NUM
			{
			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_NUM"

	// $ANTLR start "HTTP_VERSION"
	public final void mHTTP_VERSION() throws RecognitionException {
		try {
			int _type = HTTP_VERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:281:2: ( 'HTTP/' ( '1.1' | '2' ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:281:4: 'HTTP/' ( '1.1' | '2' )
			{
			match("HTTP/"); 

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:281:12: ( '1.1' | '2' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='1') ) {
				alt2=1;
			}
			else if ( (LA2_0=='2') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:281:13: '1.1'
					{
					match("1.1"); 

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:282:6: '2'
					{
					match('2'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HTTP_VERSION"

	// $ANTLR start "PATH"
	public final void mPATH() throws RecognitionException {
		try {
			int _type = PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:2: ( '/' | ( ( '/' PATH_ELEMENT )+ ( '/' )? ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='/') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='%'||(LA5_1 >= '-' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '9')||(LA5_1 >= 'A' && LA5_1 <= 'Z')||LA5_1=='_'||(LA5_1 >= 'a' && LA5_1 <= 'z')||LA5_1=='~') ) {
					alt5=2;
				}

				else {
					alt5=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:4: '/'
					{
					match('/'); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:10: ( ( '/' PATH_ELEMENT )+ ( '/' )? )
					{
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:10: ( ( '/' PATH_ELEMENT )+ ( '/' )? )
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:11: ( '/' PATH_ELEMENT )+ ( '/' )?
					{
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:11: ( '/' PATH_ELEMENT )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0=='/') ) {
							int LA3_1 = input.LA(2);
							if ( (LA3_1=='%'||(LA3_1 >= '-' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '9')||(LA3_1 >= 'A' && LA3_1 <= 'Z')||LA3_1=='_'||(LA3_1 >= 'a' && LA3_1 <= 'z')||LA3_1=='~') ) {
								alt3=1;
							}

						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:12: '/' PATH_ELEMENT
							{
							match('/'); 
							mPATH_ELEMENT(); 

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:31: ( '/' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='/') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:286:31: '/'
							{
							match('/'); 
							}
							break;

					}

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PATH"

	// $ANTLR start "QUERY"
	public final void mQUERY() throws RecognitionException {
		try {
			int _type = QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:290:2: ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:290:4: '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )*
			{
			match('?'); 
			mQUERY_ELEMENT(); 

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:290:22: ( '&' QUERY_ELEMENT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='&') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:290:23: '&' QUERY_ELEMENT
					{
					match('&'); 
					mQUERY_ELEMENT(); 

					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY"

	// $ANTLR start "DNS"
	public final void mDNS() throws RecognitionException {
		try {
			int _type = DNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:2: ( DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:4: DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			{
			mDNS_ELEMENT(); 

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:16: ( '.' DNS_ELEMENT )*
			loop7:
			while (true) {
				int alt7=2;
				alt7 = dfa7.predict(input);
				switch (alt7) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:17: '.' DNS_ELEMENT
					{
					match('.'); 
					mDNS_ELEMENT(); 

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:35: ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:36: '.' ALPHA_CHAR ( ALPHA_CHAR )+
			{
			match('.'); 
			mALPHA_CHAR(); 

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:51: ( ALPHA_CHAR )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DNS"

	// $ANTLR start "IPV4"
	public final void mIPV4() throws RecognitionException {
		try {
			int _type = IPV4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:298:2: ( NUM '.' NUM '.' NUM '.' NUM )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:298:4: NUM '.' NUM '.' NUM '.' NUM
			{
			mNUM(); 

			match('.'); 
			mNUM(); 

			match('.'); 
			mNUM(); 

			match('.'); 
			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IPV4"

	// $ANTLR start "MIME"
	public final void mMIME() throws RecognitionException {
		try {
			int _type = MIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:302:2: ( MIME_TYPE '/' MIME_SUBTYPE | '*/*' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='a'||LA9_0=='c'||LA9_0=='f'||LA9_0=='i'||LA9_0=='m'||LA9_0=='t'||LA9_0=='v') ) {
				alt9=1;
			}
			else if ( (LA9_0=='*') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:302:4: MIME_TYPE '/' MIME_SUBTYPE
					{
					mMIME_TYPE(); 

					match('/'); 
					mMIME_SUBTYPE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:303:4: '*/*'
					{
					match("*/*"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIME"

	// $ANTLR start "MULTIPART_MIME"
	public final void mMULTIPART_MIME() throws RecognitionException {
		try {
			int _type = MULTIPART_MIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:2: ( 'multipart/' MIME_SUBTYPE )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:4: 'multipart/' MIME_SUBTYPE
			{
			match("multipart/"); 

			mMIME_SUBTYPE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPART_MIME"

	// $ANTLR start "Q_VAL"
	public final void mQ_VAL() throws RecognitionException {
		try {
			int _type = Q_VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:311:2: ( '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) | '1.0' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='0') ) {
				alt11=1;
			}
			else if ( (LA11_0=='1') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:311:4: '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
					{
					match('0'); 
					match('.'); 
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:311:12: ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
					int alt10=3;
					int LA10_0 = input.LA(1);
					if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
						int LA10_1 = input.LA(2);
						if ( ((LA10_1 >= '0' && LA10_1 <= '9')) ) {
							int LA10_2 = input.LA(3);
							if ( ((LA10_2 >= '0' && LA10_2 <= '9')) ) {
								alt10=3;
							}

							else {
								alt10=2;
							}

						}

						else {
							alt10=1;
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:311:13: ( '0' .. '9' )
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:312:6: ( '0' .. '9' ) ( '0' .. '9' )
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 3 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:313:6: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:314:4: '1.0'
					{
					match("1.0"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q_VAL"

	// $ANTLR start "PRODUCT"
	public final void mPRODUCT() throws RecognitionException {
		try {
			int _type = PRODUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:318:2: ( ( ALPHA_NUM_CHAR )+ '/' VERS_NUM )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:318:4: ( ALPHA_NUM_CHAR )+ '/' VERS_NUM
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:318:4: ( ALPHA_NUM_CHAR )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match('/'); 
			mVERS_NUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRODUCT"

	// $ANTLR start "PRODUCT_INFO"
	public final void mPRODUCT_INFO() throws RecognitionException {
		try {
			int _type = PRODUCT_INFO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:322:2: ( '(' (~ ( '(' | ')' ) )* ')' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:322:4: '(' (~ ( '(' | ')' ) )* ')'
			{
			match('('); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:322:8: (~ ( '(' | ')' ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\'')||(LA13_0 >= '*' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\'')||(input.LA(1) >= '*' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRODUCT_INFO"

	// $ANTLR start "LANGUAGE_ELEMENT"
	public final void mLANGUAGE_ELEMENT() throws RecognitionException {
		try {
			int _type = LANGUAGE_ELEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:2: ( ALPHA_CHAR ALPHA_CHAR ( ALPHA_CHAR )? ( '-' ( ALPHA_CHAR )+ ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:4: ALPHA_CHAR ALPHA_CHAR ( ALPHA_CHAR )? ( '-' ( ALPHA_CHAR )+ )
			{
			mALPHA_CHAR(); 

			mALPHA_CHAR(); 

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:26: ( ALPHA_CHAR )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= 'A' && LA14_0 <= 'Z')||(LA14_0 >= 'a' && LA14_0 <= 'z')) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:38: ( '-' ( ALPHA_CHAR )+ )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:39: '-' ( ALPHA_CHAR )+
			{
			match('-'); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:43: ( ALPHA_CHAR )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= 'A' && LA15_0 <= 'Z')||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LANGUAGE_ELEMENT"

	// $ANTLR start "BODY_STRING"
	public final void mBODY_STRING() throws RecognitionException {
		try {
			int _type = BODY_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:330:5: ( '°' ( ESC_SEQ |~ ( '\\\\' | '°' ) )* '°' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:330:7: '°' ( ESC_SEQ |~ ( '\\\\' | '°' ) )* '°'
			{
			match('\u00B0'); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:330:11: ( ESC_SEQ |~ ( '\\\\' | '°' ) )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\\') ) {
					alt16=1;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\u00AF')||(LA16_0 >= '\u00B1' && LA16_0 <= '\uFFFF')) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:330:12: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:330:22: ~ ( '\\\\' | '°' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u00AF')||(input.LA(1) >= '\u00B1' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match('\u00B0'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BODY_STRING"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:334:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:334:7: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:334:12: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\\') ) {
					alt17=1;
				}
				else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:334:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:334:23: ~ ( '\\\\' | '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='/') ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1=='/') ) {
					alt21=1;
				}
				else if ( (LA21_1=='*') ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:9: (~ ( '\\n' | '\\r' ) )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\t')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '\uFFFF')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop18;
						}
					}

					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:23: ( '\\r' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='\r') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:23: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:339:4: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:339:9: ( options {greedy=false; } : . )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0=='*') ) {
							int LA20_1 = input.LA(2);
							if ( (LA20_1=='/') ) {
								alt20=2;
							}
							else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '.')||(LA20_1 >= '0' && LA20_1 <= '\uFFFF')) ) {
								alt20=1;
							}

						}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= ')')||(LA20_0 >= '+' && LA20_0 <= '\uFFFF')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:339:37: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop20;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:343:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:343:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VERS_NUM"
	public final void mVERS_NUM() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:2: ( ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )* )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:4: ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )*
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:4: ( ALPHA_NUM_CHAR )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '0' && LA22_0 <= '9')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:20: ( '.' ( ALPHA_NUM_CHAR )+ )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='.') ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:21: '.' ( ALPHA_NUM_CHAR )+
					{
					match('.'); 
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:25: ( ALPHA_NUM_CHAR )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERS_NUM"

	// $ANTLR start "DNS_ELEMENT"
	public final void mDNS_ELEMENT() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:358:2: ( ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+ )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:358:4: ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:358:27: ( ALPHA_NUM_CHAR | '-' )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0=='-'||(LA25_0 >= '0' && LA25_0 <= '9')||(LA25_0 >= 'A' && LA25_0 <= 'Z')||(LA25_0 >= 'a' && LA25_0 <= 'z')) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DNS_ELEMENT"

	// $ANTLR start "PATH_ELEMENT"
	public final void mPATH_ELEMENT() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:363:2: ( ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+ )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:363:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			{
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:363:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=7;
				switch ( input.LA(1) ) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt26=1;
					}
					break;
				case '.':
					{
					alt26=2;
					}
					break;
				case '~':
					{
					alt26=3;
					}
					break;
				case '-':
					{
					alt26=4;
					}
					break;
				case '_':
					{
					alt26=5;
					}
					break;
				case '%':
					{
					alt26=6;
					}
					break;
				}
				switch (alt26) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:363:5: ALPHA_NUM_CHAR
					{
					mALPHA_NUM_CHAR(); 

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:364:4: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:364:10: '~'
					{
					match('~'); 
					}
					break;
				case 4 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:364:16: '-'
					{
					match('-'); 
					}
					break;
				case 5 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:364:22: '_'
					{
					match('_'); 
					}
					break;
				case 6 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:365:4: '%' HEX_DIGIT HEX_DIGIT
					{
					match('%'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PATH_ELEMENT"

	// $ANTLR start "QUERY_ELEMENT"
	public final void mQUERY_ELEMENT() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:371:2: ( PATH_ELEMENT '=' PATH_ELEMENT )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:371:4: PATH_ELEMENT '=' PATH_ELEMENT
			{
			mPATH_ELEMENT(); 

			match('='); 
			mPATH_ELEMENT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY_ELEMENT"

	// $ANTLR start "MIME_TYPE"
	public final void mMIME_TYPE() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:376:2: ( 'application' | 'audio' | 'chemical' | 'font' | 'image' | 'message' | 'model' | 'text' | 'video' )
			int alt27=9;
			switch ( input.LA(1) ) {
			case 'a':
				{
				int LA27_1 = input.LA(2);
				if ( (LA27_1=='p') ) {
					alt27=1;
				}
				else if ( (LA27_1=='u') ) {
					alt27=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				alt27=3;
				}
				break;
			case 'f':
				{
				alt27=4;
				}
				break;
			case 'i':
				{
				alt27=5;
				}
				break;
			case 'm':
				{
				int LA27_5 = input.LA(2);
				if ( (LA27_5=='e') ) {
					alt27=6;
				}
				else if ( (LA27_5=='o') ) {
					alt27=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				alt27=8;
				}
				break;
			case 'v':
				{
				alt27=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:376:4: 'application'
					{
					match("application"); 

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:377:4: 'audio'
					{
					match("audio"); 

					}
					break;
				case 3 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:378:4: 'chemical'
					{
					match("chemical"); 

					}
					break;
				case 4 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:379:4: 'font'
					{
					match("font"); 

					}
					break;
				case 5 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:380:4: 'image'
					{
					match("image"); 

					}
					break;
				case 6 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:381:4: 'message'
					{
					match("message"); 

					}
					break;
				case 7 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:382:4: 'model'
					{
					match("model"); 

					}
					break;
				case 8 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:383:4: 'text'
					{
					match("text"); 

					}
					break;
				case 9 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:384:4: 'video'
					{
					match("video"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIME_TYPE"

	// $ANTLR start "MIME_SUBTYPE"
	public final void mMIME_SUBTYPE() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:2: ( ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )? | '*' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='-'||(LA33_0 >= '0' && LA33_0 <= '9')||(LA33_0 >= 'A' && LA33_0 <= 'Z')||(LA33_0 >= 'a' && LA33_0 <= 'z')) ) {
				alt33=1;
			}
			else if ( (LA33_0=='*') ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:4: ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )?
					{
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:4: ( ALPHA_NUM_CHAR | '-' )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0=='-'||(LA28_0 >= '0' && LA28_0 <= '9')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||(LA28_0 >= 'a' && LA28_0 <= 'z')) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
							{
							if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:28: ( '.' ( ALPHA_NUM_CHAR | '-' )+ )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0=='.') ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:29: '.' ( ALPHA_NUM_CHAR | '-' )+
							{
							match('.'); 
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:33: ( ALPHA_NUM_CHAR | '-' )+
							int cnt29=0;
							loop29:
							while (true) {
								int alt29=2;
								int LA29_0 = input.LA(1);
								if ( (LA29_0=='-'||(LA29_0 >= '0' && LA29_0 <= '9')||(LA29_0 >= 'A' && LA29_0 <= 'Z')||(LA29_0 >= 'a' && LA29_0 <= 'z')) ) {
									alt29=1;
								}

								switch (alt29) {
								case 1 :
									// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
									{
									if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt29 >= 1 ) break loop29;
									EarlyExitException eee = new EarlyExitException(29, input);
									throw eee;
								}
								cnt29++;
							}

							}
							break;

						default :
							break loop30;
						}
					}

					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:59: ( '+' ( ALPHA_CHAR )+ )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0=='+') ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:60: '+' ( ALPHA_CHAR )+
							{
							match('+'); 
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:389:64: ( ALPHA_CHAR )+
							int cnt31=0;
							loop31:
							while (true) {
								int alt31=2;
								int LA31_0 = input.LA(1);
								if ( ((LA31_0 >= 'A' && LA31_0 <= 'Z')||(LA31_0 >= 'a' && LA31_0 <= 'z')) ) {
									alt31=1;
								}

								switch (alt31) {
								case 1 :
									// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
									{
									if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt31 >= 1 ) break loop31;
									EarlyExitException eee = new EarlyExitException(31, input);
									throw eee;
								}
								cnt31++;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:390:4: '*'
					{
					match('*'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIME_SUBTYPE"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:395:2: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='0') ) {
				alt35=1;
			}
			else if ( ((LA35_0 >= '1' && LA35_0 <= '9')) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:395:4: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:396:4: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:396:14: ( '0' .. '9' )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop34;
						}
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "ALPHA_CHAR"
	public final void mALPHA_CHAR() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:401:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHA_CHAR"

	// $ANTLR start "ALPHA_NUM_CHAR"
	public final void mALPHA_NUM_CHAR() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:407:2: ( ( '0' .. '9' ) | ALPHA_CHAR )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHA_NUM_CHAR"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:413:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt36=3;
			int LA36_0 = input.LA(1);
			if ( (LA36_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt36=1;
					}
					break;
				case 'u':
					{
					alt36=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt36=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:413:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:414:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:415:7: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:420:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0=='\\') ) {
				int LA37_1 = input.LA(2);
				if ( ((LA37_1 >= '0' && LA37_1 <= '3')) ) {
					int LA37_2 = input.LA(3);
					if ( ((LA37_2 >= '0' && LA37_2 <= '7')) ) {
						int LA37_4 = input.LA(4);
						if ( ((LA37_4 >= '0' && LA37_4 <= '7')) ) {
							alt37=1;
						}

						else {
							alt37=2;
						}

					}

					else {
						alt37=3;
					}

				}
				else if ( ((LA37_1 >= '4' && LA37_1 <= '7')) ) {
					int LA37_3 = input.LA(3);
					if ( ((LA37_3 >= '0' && LA37_3 <= '7')) ) {
						alt37=2;
					}

					else {
						alt37=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:420:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:421:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:422:7: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:427:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:427:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:432:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:435:2: ( . )
			// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:435:4: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TOKEN"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:8: ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | AUTHORIZATION | ACCEPT_LANGUAGE | ACCEPT_ENCODING | CACHE_CONTROL | MAX_FORWARDS | Q | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | STAR | ID | INT_NUM | HTTP_VERSION | PATH | QUERY | DNS | IPV4 | MIME | MULTIPART_MIME | Q_VAL | PRODUCT | PRODUCT_INFO | LANGUAGE_ELEMENT | BODY_STRING | STRING | COMMENT | WS | ERROR_TOKEN )
		int alt38=37;
		alt38 = dfa38.predict(input);
		switch (alt38) {
			case 1 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:10: GET
				{
				mGET(); 

				}
				break;
			case 2 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:14: POST
				{
				mPOST(); 

				}
				break;
			case 3 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:19: HOST
				{
				mHOST(); 

				}
				break;
			case 4 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:24: USER_AGENT
				{
				mUSER_AGENT(); 

				}
				break;
			case 5 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:35: CONTENT_TYPE
				{
				mCONTENT_TYPE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:48: ACCEPT
				{
				mACCEPT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:55: COOKIE
				{
				mCOOKIE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:62: AUTHORIZATION
				{
				mAUTHORIZATION(); 

				}
				break;
			case 9 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:76: ACCEPT_LANGUAGE
				{
				mACCEPT_LANGUAGE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:92: ACCEPT_ENCODING
				{
				mACCEPT_ENCODING(); 

				}
				break;
			case 11 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:108: CACHE_CONTROL
				{
				mCACHE_CONTROL(); 

				}
				break;
			case 12 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:122: MAX_FORWARDS
				{
				mMAX_FORWARDS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:135: Q
				{
				mQ(); 

				}
				break;
			case 14 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:137: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 15 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:144: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 16 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:150: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 17 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:157: SEMI_COLUMN
				{
				mSEMI_COLUMN(); 

				}
				break;
			case 18 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:169: TERMINAL
				{
				mTERMINAL(); 

				}
				break;
			case 19 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:178: STAR
				{
				mSTAR(); 

				}
				break;
			case 20 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:183: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:186: INT_NUM
				{
				mINT_NUM(); 

				}
				break;
			case 22 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:194: HTTP_VERSION
				{
				mHTTP_VERSION(); 

				}
				break;
			case 23 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:207: PATH
				{
				mPATH(); 

				}
				break;
			case 24 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:212: QUERY
				{
				mQUERY(); 

				}
				break;
			case 25 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:218: DNS
				{
				mDNS(); 

				}
				break;
			case 26 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:222: IPV4
				{
				mIPV4(); 

				}
				break;
			case 27 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:227: MIME
				{
				mMIME(); 

				}
				break;
			case 28 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:232: MULTIPART_MIME
				{
				mMULTIPART_MIME(); 

				}
				break;
			case 29 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:247: Q_VAL
				{
				mQ_VAL(); 

				}
				break;
			case 30 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:253: PRODUCT
				{
				mPRODUCT(); 

				}
				break;
			case 31 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:261: PRODUCT_INFO
				{
				mPRODUCT_INFO(); 

				}
				break;
			case 32 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:274: LANGUAGE_ELEMENT
				{
				mLANGUAGE_ELEMENT(); 

				}
				break;
			case 33 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:291: BODY_STRING
				{
				mBODY_STRING(); 

				}
				break;
			case 34 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:303: STRING
				{
				mSTRING(); 

				}
				break;
			case 35 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:310: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 36 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:318: WS
				{
				mWS(); 

				}
				break;
			case 37 :
				// C:\\Users\\Pelle\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:321: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA38 dfa38 = new DFA38(this);
	static final String DFA7_eotS =
		"\4\uffff\1\5\1\uffff";
	static final String DFA7_eofS =
		"\6\uffff";
	static final String DFA7_minS =
		"\1\56\2\55\1\uffff\1\55\1\uffff";
	static final String DFA7_maxS =
		"\1\56\2\172\1\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\1\1\uffff\1\2";
	static final String DFA7_specialS =
		"\6\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\1",
			"\1\3\2\uffff\12\3\7\uffff\32\2\6\uffff\32\2",
			"\1\3\2\uffff\12\3\7\uffff\32\4\6\uffff\32\4",
			"",
			"\2\3\1\uffff\12\3\7\uffff\32\4\6\uffff\32\4",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 294:16: ( '.' DNS_ELEMENT )*";
		}
	}

	static final String DFA38_eotS =
		"\1\uffff\7\41\1\60\5\uffff\1\67\1\41\2\73\1\77\11\41\1\73\3\41\2\uffff"+
		"\2\117\3\uffff\11\117\10\uffff\2\117\3\uffff\1\73\3\uffff\10\117\5\uffff"+
		"\1\152\1\uffff\1\117\1\uffff\14\117\3\171\1\uffff\10\117\1\uffff\1\117"+
		"\1\u0085\1\u0086\1\u0087\7\117\1\uffff\2\117\1\uffff\1\171\2\uffff\10"+
		"\117\5\uffff\5\117\1\u0085\2\117\1\171\1\uffff\1\117\1\uffff\5\117\1\45"+
		"\1\u00ab\1\uffff\1\117\1\u00ae\1\uffff\1\u00b1\1\117\1\u0085\1\117\1\uffff"+
		"\1\117\1\66\2\117\3\uffff\1\117\4\uffff\1\117\1\u0085\1\117\2\uffff\1"+
		"\117\1\uffff\2\117\1\u00ab\5\uffff\1\117\1\u0085\1\117\1\uffff\1\117\1"+
		"\66\1\117\5\uffff\1\117\1\u0085\1\117\1\uffff\1\117\1\u00dd\4\uffff\1"+
		"\117\1\u0085\1\117\2\111\6\uffff\1\117\1\u0085\1\117\1\111\1\u00e7\1\uffff"+
		"\1\u00ef\3\uffff\1\117\1\u00f4\2\uffff\1\u00f6\2\uffff\1\u00f9\1\uffff"+
		"\1\u00e7\4\uffff\1\u00fc\1\u00fd\2\uffff";
	static final String DFA38_eofS =
		"\u00fe\uffff";
	static final String DFA38_minS =
		"\1\0\10\55\5\uffff\1\57\3\55\1\52\1\45\11\55\3\0\2\uffff\3\55\2\uffff"+
		"\11\55\10\uffff\2\55\1\60\1\uffff\1\60\1\55\3\uffff\10\55\5\uffff\1\55"+
		"\1\uffff\16\55\3\56\11\55\1\uffff\16\55\1\uffff\1\56\12\55\3\uffff\1\60"+
		"\11\55\1\56\2\55\1\52\5\55\2\56\12\55\1\56\2\55\1\60\1\uffff\2\55\1\uffff"+
		"\2\55\1\uffff\11\55\1\56\12\55\1\56\25\55\1\52\1\uffff\10\55\1\56\1\uffff"+
		"\7\55\1\uffff\4\55\1\uffff\1\56\1\uffff\2\55\1\uffff\2\55\2\uffff";
	static final String DFA38_maxS =
		"\1\uffff\10\172\5\uffff\1\57\3\172\1\57\1\176\11\172\3\uffff\2\uffff\3"+
		"\172\2\uffff\11\172\10\uffff\2\172\1\71\1\uffff\1\71\1\172\3\uffff\10"+
		"\172\5\uffff\1\172\1\uffff\16\172\1\56\1\71\1\56\11\172\1\uffff\16\172"+
		"\1\uffff\1\71\12\172\3\uffff\12\172\1\71\10\172\1\56\17\172\1\uffff\2"+
		"\172\1\uffff\2\172\1\uffff\53\172\1\uffff\11\172\1\uffff\7\172\1\uffff"+
		"\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\2\uffff";
	static final String DFA38_acceptS =
		"\11\uffff\1\16\1\17\1\20\1\21\1\22\22\uffff\1\44\1\45\3\uffff\1\36\1\31"+
		"\11\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\33\1\23\3\uffff\1\25\2\uffff"+
		"\1\43\1\27\1\30\10\uffff\1\32\1\37\1\41\1\42\1\44\1\uffff\1\24\32\uffff"+
		"\1\1\16\uffff\1\35\13\uffff\1\40\1\2\1\3\43\uffff\1\26\2\uffff\1\7\2\uffff"+
		"\1\6\53\uffff\1\4\11\uffff\1\34\7\uffff\1\5\4\uffff\1\14\1\uffff\1\13"+
		"\2\uffff\1\10\2\uffff\1\11\1\12";
	static final String DFA38_specialS =
		"\1\0\34\uffff\1\1\1\2\1\3\u00de\uffff}>";
	static final String[] DFA38_transitionS = {
			"\11\41\2\40\2\41\1\40\22\41\1\40\6\41\1\37\1\35\1\41\1\16\1\41\1\12\1"+
			"\24\1\41\1\22\1\20\1\21\10\34\1\13\1\14\1\41\1\11\1\41\1\23\1\41\1\6"+
			"\1\33\1\5\3\33\1\1\1\3\4\33\1\7\2\33\1\2\4\33\1\4\5\33\6\41\1\17\1\33"+
			"\1\25\2\33\1\26\2\33\1\27\3\33\1\30\3\33\1\10\2\33\1\31\1\33\1\32\4\33"+
			"\1\41\1\15\63\41\1\36\uff4f\41",
			"\1\46\1\uffff\1\45\12\44\7\uffff\4\43\1\42\25\43\6\uffff\32\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\16\43\1\47\13\43\6\uffff\32\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\23\43\1\51\6\43\6\uffff\16\43\1\50"+
			"\13\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\22\43\1\52\7\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\1\54\15\43\1\53\13\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\2\43\1\55\21\43\1\56"+
			"\5\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\1\57\31\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\32\43",
			"",
			"",
			"",
			"",
			"",
			"\1\66",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\17\43\1\70\4\43\1\71"+
			"\5\43",
			"\1\46\1\72\1\45\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\46\1\74\1\45\12\75\7\uffff\32\44\6\uffff\32\44",
			"\1\76\4\uffff\1\76",
			"\1\100\7\uffff\2\100\1\uffff\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff"+
			"\32\100\3\uffff\1\100",
			"\1\46\2\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\7\43\1\101\22\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\16\43\1\102\13\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\14\43\1\103\15\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\4\43\1\104\11\43\1\105"+
			"\5\43\1\106\5\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\4\43\1\107\25\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\10\43\1\110\21\43",
			"\1\46\1\uffff\1\45\12\44\7\uffff\32\43\6\uffff\32\43",
			"\1\46\1\111\1\45\12\75\7\uffff\32\44\6\uffff\32\44",
			"\50\112\1\uffff\uffd7\112",
			"\0\113",
			"\0\114",
			"",
			"",
			"\1\121\1\46\1\45\12\44\7\uffff\23\120\1\116\6\120\6\uffff\32\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\32\120",
			"\2\46\1\45\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"",
			"\1\121\1\46\1\45\12\44\7\uffff\22\120\1\122\7\120\6\uffff\32\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\22\120\1\123\7\120",
			"\1\121\1\46\1\45\12\44\7\uffff\23\120\1\124\6\120\6\uffff\32\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\4\120\1\125\25\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\15\120\1\126\1\127\13"+
			"\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\2\120\1\130\27\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\2\120\1\131\27\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\23\120\1\132\6\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\27\120\1\133\2\120",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\17\120\1\134\12\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\3\120\1\135\26\120",
			"\1\136\11\137",
			"",
			"\1\140\11\111",
			"\1\46\1\141\1\45\12\75\7\uffff\32\44\6\uffff\32\44",
			"",
			"",
			"",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\4\120\1\142\25\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\15\120\1\143\14\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\1\144\31\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\22\120\1\145\7\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\3\120\1\146\26\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\13\120\1\147\16\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\27\120\1\150\2\120",
			"\1\121\1\46\1\45\12\44\7\uffff\32\120\6\uffff\3\120\1\151\26\120",
			"",
			"",
			"",
			"",
			"",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\32\154",
			"\1\121\1\46\1\45\12\44\7\uffff\23\153\1\155\6\153\6\uffff\32\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\156\6\153",
			"\1\121\1\46\1\45\12\44\7\uffff\17\153\1\157\12\153\6\uffff\32\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\21\153\1\160\10\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\161\6\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\12\153\1\162\17\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\7\153\1\163\22\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\164\25\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\7\153\1\165\22\153",
			"\1\166\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\13\153\1\167\16\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\170\21\153",
			"\1\111",
			"\1\111\1\uffff\12\172",
			"\1\111",
			"\1\46\2\uffff\1\173\11\174\7\uffff\32\46\6\uffff\32\46",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\14\153\1\175\15\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\176\6\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\6\153\1\177\23\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\22\153\1\u0080\7\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u0081\25\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u0082\6\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u0083\6\153",
			"\1\121\1\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u0084\25\153",
			"",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\32\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\u0088\12\44\7\uffff\32\153\6\uffff\32\153",
			"\1\u0089\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u008a\25\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u008b\21\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u008c\25\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\17\153\1\u008d\12\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\16\153\1\u008e\13\153",
			"\2\46\1\uffff\12\46\7\uffff\5\154\1\u008f\24\154\6\uffff\32\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u0090\21\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\16\153\1\u0091\13\153",
			"",
			"\1\111\1\uffff\12\u0092",
			"\1\46\1\111\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\1\46\1\111\1\uffff\12\u0093\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u0094\21\153",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u0096\25\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\1\u0097\31\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\13\153\1\u0098\16\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u0099\21\153",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\16\153\1\u009a\13\153",
			"",
			"",
			"",
			"\1\45\1\u009b\1\u009c\7\45\7\uffff\32\45\6\uffff\32\45",
			"\2\46\1\uffff\12\46\7\uffff\1\u009d\31\46\6\uffff\32\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\15\153\1\u009e\14\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u009f\25\153",
			"\1\u00a0\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u00a1\6\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\21\153\1\u00a2\10\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\16\154\1\u00a3\13\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\2\153\1\u00a4\27\153",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\1\111\1\uffff\12\111",
			"\1\46\1\u00a5\1\uffff\12\u0093\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\2\153\1\u00a6\27\153",
			"\1\66\2\uffff\1\66\2\uffff\12\u00a7\7\uffff\32\u00a7\6\uffff\32\u00a7",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\6\153\1\u00a8\23\153",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\17\153\1\u00a9\12\153",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\1\u00aa",
			"\1\45\1\uffff\12\45\7\uffff\32\45\6\uffff\32\45",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\6\46\1\u00ac\23\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u00ad\6\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\uffff\12\46\7\uffff\2\46\1\u00af\27\46\6\uffff\32\46",
			"\1\u00b0\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u00b2\21\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\21\154\1\u00b3\10\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\1\u00b4\31\153",
			"\1\46\2\uffff\1\u00b5\11\u00b6\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\1\u00b7\31\153",
			"\1\u00b8\1\uffff\12\u00a7\7\uffff\32\u00a7\6\uffff\32\u00a7",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\4\153\1\u00b9\25\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\1\u00ba\31\153",
			"\1\45\1\u00bb\10\45\7\uffff\32\45\6\uffff\32\45",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\4\46\1\u00bc\25\46",
			"\1\u00bd\1\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\16\46\1\u00be\13\46",
			"\2\46\1\uffff\12\46\7\uffff\4\46\1\u00c0\6\46\1\u00bf\16\46\6\uffff"+
			"\32\46",
			"",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\31\153\1\u00c1",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\26\154\1\u00c2\3\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u00c3\6\153",
			"\1\46\1\111\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\1\46\1\111\1\uffff\12\u00c4\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\13\153\1\u00c5\16\153",
			"\1\66\2\uffff\12\u00c6\7\uffff\32\u00c6\6\uffff\32\u00c6",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\21\153\1\u00c7\10\153",
			"\1\45\1\uffff\12\45\7\uffff\32\45\6\uffff\32\45",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\15\46\1\u00c8\14\46",
			"\2\46\1\uffff\12\46\7\uffff\23\46\1\u00c9\6\46\6\uffff\32\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\15\46\1\u00ca\14\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\1\u00cb\31\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\15\46\1\u00cc\14\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\1\u00cd\31\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\1\u00ce\31\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u00cf\21\153",
			"\1\46\1\u00d0\1\uffff\12\u00c4\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\1\u00b8\1\uffff\12\u00c6\7\uffff\32\u00c6\6\uffff\32\u00c6",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u00d1\6\153",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\23\46\1\u00d2\6\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\30\46\1\u00d3\1\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\23\46\1\u00d4\6\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\15\46\1\u00d5\14\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\2\46\1\u00d6\27\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\23\153\1\u00d7\6\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\21\154\1\u00d8\10\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\16\153\1\u00d9\13\153",
			"\1\46\2\uffff\1\u00da\11\u00db\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\u00dc\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\17\46\1\u00de\12\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\21\46\1\u00df\10\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\6\46\1\u00e0\23\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\16\46\1\u00e1\13\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\10\153\1\u00e2\21\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\3\154\1\u00e3\26\154",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\15\153\1\u00e4\14\153",
			"\1\46\2\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\1\46\2\uffff\12\u00e5\7\uffff\32\46\6\uffff\32\46",
			"\1\u00e7\2\uffff\1\u00e7\2\uffff\12\u00e6\7\uffff\32\u00e6\6\uffff\32"+
			"\u00e6",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\4\46\1\u00e8\25\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\16\46\1\u00e9\13\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\24\46\1\u00ea\5\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\3\46\1\u00eb\26\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\16\153\1\u00ec\13\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\22\154\1\u00ed\7\154",
			"\2\46\1\u0095\12\44\7\uffff\32\153\6\uffff\32\153",
			"\2\46\1\uffff\12\u00e5\7\uffff\32\46\6\uffff\32\46",
			"\1\u00ee\1\uffff\12\u00e6\7\uffff\32\u00e6\6\uffff\32\u00e6",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\13\46\1\u00f0\16\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\1\u00f1\31\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\10\46\1\u00f2\21\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\15\153\1\u00f3\14\153",
			"\2\46\1\uffff\12\46\7\uffff\32\154\6\uffff\32\154",
			"\1\u00e7\2\uffff\12\u00f5\7\uffff\32\u00f5\6\uffff\32\u00f5",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\6\46\1\u00f7\23\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\15\46\1\u00f8\14\46",
			"\2\46\1\45\12\44\7\uffff\32\153\6\uffff\32\153",
			"",
			"\1\u00ee\1\uffff\12\u00f5\7\uffff\32\u00f5\6\uffff\32\u00f5",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\4\46\1\u00fa\25\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\6\46\1\u00fb\23\46",
			"",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
			"",
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | AUTHORIZATION | ACCEPT_LANGUAGE | ACCEPT_ENCODING | CACHE_CONTROL | MAX_FORWARDS | Q | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | STAR | ID | INT_NUM | HTTP_VERSION | PATH | QUERY | DNS | IPV4 | MIME | MULTIPART_MIME | Q_VAL | PRODUCT | PRODUCT_INFO | LANGUAGE_ELEMENT | BODY_STRING | STRING | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA38_0 = input.LA(1);
						s = -1;
						if ( (LA38_0=='G') ) {s = 1;}
						else if ( (LA38_0=='P') ) {s = 2;}
						else if ( (LA38_0=='H') ) {s = 3;}
						else if ( (LA38_0=='U') ) {s = 4;}
						else if ( (LA38_0=='C') ) {s = 5;}
						else if ( (LA38_0=='A') ) {s = 6;}
						else if ( (LA38_0=='M') ) {s = 7;}
						else if ( (LA38_0=='q') ) {s = 8;}
						else if ( (LA38_0=='=') ) {s = 9;}
						else if ( (LA38_0==',') ) {s = 10;}
						else if ( (LA38_0==':') ) {s = 11;}
						else if ( (LA38_0==';') ) {s = 12;}
						else if ( (LA38_0=='|') ) {s = 13;}
						else if ( (LA38_0=='*') ) {s = 14;}
						else if ( (LA38_0=='a') ) {s = 15;}
						else if ( (LA38_0=='0') ) {s = 16;}
						else if ( (LA38_0=='1') ) {s = 17;}
						else if ( (LA38_0=='/') ) {s = 18;}
						else if ( (LA38_0=='?') ) {s = 19;}
						else if ( (LA38_0=='-') ) {s = 20;}
						else if ( (LA38_0=='c') ) {s = 21;}
						else if ( (LA38_0=='f') ) {s = 22;}
						else if ( (LA38_0=='i') ) {s = 23;}
						else if ( (LA38_0=='m') ) {s = 24;}
						else if ( (LA38_0=='t') ) {s = 25;}
						else if ( (LA38_0=='v') ) {s = 26;}
						else if ( (LA38_0=='B'||(LA38_0 >= 'D' && LA38_0 <= 'F')||(LA38_0 >= 'I' && LA38_0 <= 'L')||(LA38_0 >= 'N' && LA38_0 <= 'O')||(LA38_0 >= 'Q' && LA38_0 <= 'T')||(LA38_0 >= 'V' && LA38_0 <= 'Z')||LA38_0=='b'||(LA38_0 >= 'd' && LA38_0 <= 'e')||(LA38_0 >= 'g' && LA38_0 <= 'h')||(LA38_0 >= 'j' && LA38_0 <= 'l')||(LA38_0 >= 'n' && LA38_0 <= 'p')||(LA38_0 >= 'r' && LA38_0 <= 's')||LA38_0=='u'||(LA38_0 >= 'w' && LA38_0 <= 'z')) ) {s = 27;}
						else if ( ((LA38_0 >= '2' && LA38_0 <= '9')) ) {s = 28;}
						else if ( (LA38_0=='(') ) {s = 29;}
						else if ( (LA38_0=='\u00B0') ) {s = 30;}
						else if ( (LA38_0=='\'') ) {s = 31;}
						else if ( ((LA38_0 >= '\t' && LA38_0 <= '\n')||LA38_0=='\r'||LA38_0==' ') ) {s = 32;}
						else if ( ((LA38_0 >= '\u0000' && LA38_0 <= '\b')||(LA38_0 >= '\u000B' && LA38_0 <= '\f')||(LA38_0 >= '\u000E' && LA38_0 <= '\u001F')||(LA38_0 >= '!' && LA38_0 <= '&')||LA38_0==')'||LA38_0=='+'||LA38_0=='.'||LA38_0=='<'||LA38_0=='>'||LA38_0=='@'||(LA38_0 >= '[' && LA38_0 <= '`')||LA38_0=='{'||(LA38_0 >= '}' && LA38_0 <= '\u00AF')||(LA38_0 >= '\u00B1' && LA38_0 <= '\uFFFF')) ) {s = 33;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA38_29 = input.LA(1);
						s = -1;
						if ( ((LA38_29 >= '\u0000' && LA38_29 <= '\'')||(LA38_29 >= ')' && LA38_29 <= '\uFFFF')) ) {s = 74;}
						else s = 33;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA38_30 = input.LA(1);
						s = -1;
						if ( ((LA38_30 >= '\u0000' && LA38_30 <= '\uFFFF')) ) {s = 75;}
						else s = 33;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA38_31 = input.LA(1);
						s = -1;
						if ( ((LA38_31 >= '\u0000' && LA38_31 <= '\uFFFF')) ) {s = 76;}
						else s = 33;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 38, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
