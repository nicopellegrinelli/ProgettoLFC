// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-12 17:38:20

package compiler; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g"; }

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:7: ( 'GET' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:133:9: 'GET'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:134:8: ( 'POST' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:134:10: 'POST'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:135:8: ( 'Host' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:135:10: 'Host'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:136:12: ( 'User-Agent' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:136:14: 'User-Agent'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:137:14: ( 'Content-Type' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:137:16: 'Content-Type'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:9: ( 'Accept' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:138:11: 'Accept'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:139:9: ( 'Cookie' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:139:11: 'Cookie'
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

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			int _type = Q;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:140:5: ( 'q' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:140:7: 'q'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:141:9: ( '=' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:141:11: '='
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:142:8: ( ',' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:142:10: ','
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:143:9: ( ':' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:143:11: ':'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:13: ( ';' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:144:15: ';'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:11: ( '|' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:145:13: '|'
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

	// $ANTLR start "INT_NUM"
	public final void mINT_NUM() throws RecognitionException {
		try {
			int _type = INT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:148:2: ( NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:148:4: NUM
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

	// $ANTLR start "VERSION"
	public final void mVERSION() throws RecognitionException {
		try {
			int _type = VERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:152:2: ( 'HTTP/' ( '1.0' | '1.1' | '2' | '3' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:152:4: 'HTTP/' ( '1.0' | '1.1' | '2' | '3' )
			{
			match("HTTP/"); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:152:12: ( '1.0' | '1.1' | '2' | '3' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case '1':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='.') ) {
					int LA1_4 = input.LA(3);
					if ( (LA1_4=='0') ) {
						alt1=1;
					}
					else if ( (LA1_4=='1') ) {
						alt1=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '2':
				{
				alt1=3;
				}
				break;
			case '3':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:152:13: '1.0'
					{
					match("1.0"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:153:6: '1.1'
					{
					match("1.1"); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:154:6: '2'
					{
					match('2'); 
					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:155:6: '3'
					{
					match('3'); 
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
	// $ANTLR end "VERSION"

	// $ANTLR start "PATH"
	public final void mPATH() throws RecognitionException {
		try {
			int _type = PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:2: ( ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? ) ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:4: ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? ) ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )?
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:4: ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='/') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='%'||(LA4_1 >= '-' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '9')||(LA4_1 >= 'A' && LA4_1 <= 'Z')||LA4_1=='_'||(LA4_1 >= 'a' && LA4_1 <= 'z')||LA4_1=='~') ) {
					alt4=2;
				}

				else {
					alt4=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:5: '/'
					{
					match('/'); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:11: ( '/' PATH_ELEMENT )+ ( '/' )?
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:11: ( '/' PATH_ELEMENT )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0=='/') ) {
							int LA2_1 = input.LA(2);
							if ( (LA2_1=='%'||(LA2_1 >= '-' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '9')||(LA2_1 >= 'A' && LA2_1 <= 'Z')||LA2_1=='_'||(LA2_1 >= 'a' && LA2_1 <= 'z')||LA2_1=='~') ) {
								alt2=1;
							}

						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:12: '/' PATH_ELEMENT
							{
							match('/'); 
							mPATH_ELEMENT(); 

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:31: ( '/' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='/') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:31: '/'
							{
							match('/'); 
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:37: ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='?') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:38: '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )*
					{
					match('?'); 
					mQUERY_ELEMENT(); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:56: ( '&' QUERY_ELEMENT )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='&') ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:159:57: '&' QUERY_ELEMENT
							{
							match('&'); 
							mQUERY_ELEMENT(); 

							}
							break;

						default :
							break loop5;
						}
					}

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
	// $ANTLR end "PATH"

	// $ANTLR start "DNS"
	public final void mDNS() throws RecognitionException {
		try {
			int _type = DNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:2: ( DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:4: DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			{
			mDNS_ELEMENT(); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:16: ( '.' DNS_ELEMENT )*
			loop7:
			while (true) {
				int alt7=2;
				alt7 = dfa7.predict(input);
				switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:17: '.' DNS_ELEMENT
					{
					match('.'); 
					mDNS_ELEMENT(); 

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:35: ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:36: '.' ALPHA_CHAR ( ALPHA_CHAR )+
			{
			match('.'); 
			mALPHA_CHAR(); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:163:51: ( ALPHA_CHAR )+
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:167:2: ( NUM '.' NUM '.' NUM '.' NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:167:4: NUM '.' NUM '.' NUM '.' NUM
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:171:2: ( MIME_TYPE '/' MIME_SUBTYPE | '*/*' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:171:4: MIME_TYPE '/' MIME_SUBTYPE
					{
					mMIME_TYPE(); 

					match('/'); 
					mMIME_SUBTYPE(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:172:4: '*/*'
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

	// $ANTLR start "Q_VAL"
	public final void mQ_VAL() throws RecognitionException {
		try {
			int _type = Q_VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:2: ( '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) | '1.0' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:4: '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
					{
					match('0'); 
					match('.'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:12: ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:13: ( '0' .. '9' )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:177:6: ( '0' .. '9' ) ( '0' .. '9' )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:178:6: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:179:4: '1.0'
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

	// $ANTLR start "UA_ELEMENT"
	public final void mUA_ELEMENT() throws RecognitionException {
		try {
			int _type = UA_ELEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:183:2: ( ( ALPHA_NUM_CHAR | ',' )+ '/' VERS_NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:183:4: ( ALPHA_NUM_CHAR | ',' )+ '/' VERS_NUM
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:183:4: ( ALPHA_NUM_CHAR | ',' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==','||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( input.LA(1)==','||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "UA_ELEMENT"

	// $ANTLR start "UA_INFO"
	public final void mUA_INFO() throws RecognitionException {
		try {
			int _type = UA_INFO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:2: ( '(' (~ ( '(' | ')' ) )* ')' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:4: '(' (~ ( '(' | ')' ) )* ')'
			{
			match('('); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:8: (~ ( '(' | ')' ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\'')||(LA13_0 >= '*' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
	// $ANTLR end "UA_INFO"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:7: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:11: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:12: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:22: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop14;
				}
			}

			match('\"'); 
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='/') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='/') ) {
					alt18=1;
				}
				else if ( (LA18_1=='*') ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:9: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
							break loop15;
						}
					}

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:23: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:23: '\\r'
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:196:4: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:196:9: ( options {greedy=false; } : . )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0=='*') ) {
							int LA17_1 = input.LA(2);
							if ( (LA17_1=='/') ) {
								alt17=2;
							}
							else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '.')||(LA17_1 >= '0' && LA17_1 <= '\uFFFF')) ) {
								alt17=1;
							}

						}
						else if ( ((LA17_0 >= '\u0000' && LA17_0 <= ')')||(LA17_0 >= '+' && LA17_0 <= '\uFFFF')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:196:37: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop17;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:2: ( ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:4: ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )*
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:4: ( ALPHA_NUM_CHAR )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:20: ( '.' ( ALPHA_NUM_CHAR )+ )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0=='.') ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:21: '.' ( ALPHA_NUM_CHAR )+
					{
					match('.'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:25: ( ALPHA_NUM_CHAR )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'Z')||(LA20_0 >= 'a' && LA20_0 <= 'z')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					}
					break;

				default :
					break loop21;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:215:2: ( ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:215:4: ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:215:27: ( ALPHA_NUM_CHAR | '-' )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='-'||(LA22_0 >= '0' && LA22_0 <= '9')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:2: ( ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=7;
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
					alt23=1;
					}
					break;
				case '.':
					{
					alt23=2;
					}
					break;
				case '~':
					{
					alt23=3;
					}
					break;
				case '-':
					{
					alt23=4;
					}
					break;
				case '_':
					{
					alt23=5;
					}
					break;
				case '%':
					{
					alt23=6;
					}
					break;
				}
				switch (alt23) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:220:5: ALPHA_NUM_CHAR
					{
					mALPHA_NUM_CHAR(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:4: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:10: '~'
					{
					match('~'); 
					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:16: '-'
					{
					match('-'); 
					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:22: '_'
					{
					match('_'); 
					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:222:4: '%' HEX_DIGIT HEX_DIGIT
					{
					match('%'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PATH_ELEMENT"

	// $ANTLR start "QUERY_ELEMENT"
	public final void mQUERY_ELEMENT() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:227:2: ( PATH_ELEMENT '=' PATH_ELEMENT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:227:4: PATH_ELEMENT '=' PATH_ELEMENT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:2: ( 'application' | 'audio' | 'chemical' | 'font' | 'image' | 'message' | 'model' | 'text' | 'video' )
			int alt24=9;
			switch ( input.LA(1) ) {
			case 'a':
				{
				int LA24_1 = input.LA(2);
				if ( (LA24_1=='p') ) {
					alt24=1;
				}
				else if ( (LA24_1=='u') ) {
					alt24=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				alt24=3;
				}
				break;
			case 'f':
				{
				alt24=4;
				}
				break;
			case 'i':
				{
				alt24=5;
				}
				break;
			case 'm':
				{
				int LA24_5 = input.LA(2);
				if ( (LA24_5=='e') ) {
					alt24=6;
				}
				else if ( (LA24_5=='o') ) {
					alt24=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				alt24=8;
				}
				break;
			case 'v':
				{
				alt24=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:232:4: 'application'
					{
					match("application"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:233:4: 'audio'
					{
					match("audio"); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:234:4: 'chemical'
					{
					match("chemical"); 

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:235:4: 'font'
					{
					match("font"); 

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:236:4: 'image'
					{
					match("image"); 

					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:237:4: 'message'
					{
					match("message"); 

					}
					break;
				case 7 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:238:4: 'model'
					{
					match("model"); 

					}
					break;
				case 8 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:239:4: 'text'
					{
					match("text"); 

					}
					break;
				case 9 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:240:4: 'video'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:2: ( ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )? | '*' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='-'||(LA30_0 >= '0' && LA30_0 <= '9')||(LA30_0 >= 'A' && LA30_0 <= 'Z')||(LA30_0 >= 'a' && LA30_0 <= 'z')) ) {
				alt30=1;
			}
			else if ( (LA30_0=='*') ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:4: ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )?
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:4: ( ALPHA_NUM_CHAR | '-' )+
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:28: ( '.' ( ALPHA_NUM_CHAR | '-' )+ )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0=='.') ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:29: '.' ( ALPHA_NUM_CHAR | '-' )+
							{
							match('.'); 
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:33: ( ALPHA_NUM_CHAR | '-' )+
							int cnt26=0;
							loop26:
							while (true) {
								int alt26=2;
								int LA26_0 = input.LA(1);
								if ( (LA26_0=='-'||(LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
									alt26=1;
								}

								switch (alt26) {
								case 1 :
									// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
									if ( cnt26 >= 1 ) break loop26;
									EarlyExitException eee = new EarlyExitException(26, input);
									throw eee;
								}
								cnt26++;
							}

							}
							break;

						default :
							break loop27;
						}
					}

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:59: ( '+' ( ALPHA_CHAR )+ )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0=='+') ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:60: '+' ( ALPHA_CHAR )+
							{
							match('+'); 
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:64: ( ALPHA_CHAR )+
							int cnt28=0;
							loop28:
							while (true) {
								int alt28=2;
								int LA28_0 = input.LA(1);
								if ( ((LA28_0 >= 'A' && LA28_0 <= 'Z')||(LA28_0 >= 'a' && LA28_0 <= 'z')) ) {
									alt28=1;
								}

								switch (alt28) {
								case 1 :
									// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
									if ( cnt28 >= 1 ) break loop28;
									EarlyExitException eee = new EarlyExitException(28, input);
									throw eee;
								}
								cnt28++;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:246:4: '*'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:251:2: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='0') ) {
				alt32=1;
			}
			else if ( ((LA32_0 >= '1' && LA32_0 <= '9')) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:251:4: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:252:4: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:252:14: ( '0' .. '9' )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
							break loop31;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:263:2: ( ( '0' .. '9' ) | ALPHA_CHAR )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:269:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='\\') ) {
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
					alt33=1;
					}
					break;
				case 'u':
					{
					alt33=2;
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
					alt33=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:269:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:270:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:271:7: OCTAL_ESC
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:276:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt34=3;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='\\') ) {
				int LA34_1 = input.LA(2);
				if ( ((LA34_1 >= '0' && LA34_1 <= '3')) ) {
					int LA34_2 = input.LA(3);
					if ( ((LA34_2 >= '0' && LA34_2 <= '7')) ) {
						int LA34_4 = input.LA(4);
						if ( ((LA34_4 >= '0' && LA34_4 <= '7')) ) {
							alt34=1;
						}

						else {
							alt34=2;
						}

					}

					else {
						alt34=3;
					}

				}
				else if ( ((LA34_1 >= '4' && LA34_1 <= '7')) ) {
					int LA34_3 = input.LA(3);
					if ( ((LA34_3 >= '0' && LA34_3 <= '7')) ) {
						alt34=2;
					}

					else {
						alt34=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:276:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:278:7: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:283:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:283:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:288:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:291:2: ( . )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:291:4: .
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
		// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:8: ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | Q | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | INT_NUM | VERSION | PATH | DNS | IPV4 | MIME | Q_VAL | UA_ELEMENT | UA_INFO | STRING | COMMENT | WS | ERROR_TOKEN )
		int alt35=26;
		alt35 = dfa35.predict(input);
		switch (alt35) {
			case 1 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:10: GET
				{
				mGET(); 

				}
				break;
			case 2 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:14: POST
				{
				mPOST(); 

				}
				break;
			case 3 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:19: HOST
				{
				mHOST(); 

				}
				break;
			case 4 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:24: USER_AGENT
				{
				mUSER_AGENT(); 

				}
				break;
			case 5 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:35: CONTENT_TYPE
				{
				mCONTENT_TYPE(); 

				}
				break;
			case 6 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:48: ACCEPT
				{
				mACCEPT(); 

				}
				break;
			case 7 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:55: COOKIE
				{
				mCOOKIE(); 

				}
				break;
			case 8 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:62: Q
				{
				mQ(); 

				}
				break;
			case 9 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:64: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 10 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:71: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 11 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:77: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 12 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:84: SEMI_COLUMN
				{
				mSEMI_COLUMN(); 

				}
				break;
			case 13 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:96: TERMINAL
				{
				mTERMINAL(); 

				}
				break;
			case 14 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:105: INT_NUM
				{
				mINT_NUM(); 

				}
				break;
			case 15 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:113: VERSION
				{
				mVERSION(); 

				}
				break;
			case 16 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:121: PATH
				{
				mPATH(); 

				}
				break;
			case 17 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:126: DNS
				{
				mDNS(); 

				}
				break;
			case 18 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:130: IPV4
				{
				mIPV4(); 

				}
				break;
			case 19 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:135: MIME
				{
				mMIME(); 

				}
				break;
			case 20 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:140: Q_VAL
				{
				mQ_VAL(); 

				}
				break;
			case 21 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:146: UA_ELEMENT
				{
				mUA_ELEMENT(); 

				}
				break;
			case 22 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:157: UA_INFO
				{
				mUA_INFO(); 

				}
				break;
			case 23 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:165: STRING
				{
				mSTRING(); 

				}
				break;
			case 24 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:172: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 25 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:180: WS
				{
				mWS(); 

				}
				break;
			case 26 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:183: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA35 dfa35 = new DFA35(this);
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
			return "()* loopback of 163:16: ( '.' DNS_ELEMENT )*";
		}
	}

	static final String DFA35_eotS =
		"\1\uffff\6\36\1\51\1\uffff\1\53\3\uffff\2\60\1\64\11\36\1\60\3\36\25\uffff"+
		"\1\60\20\uffff\1\130\7\uffff\3\140\13\uffff\1\155\1\156\6\uffff\1\140"+
		"\22\uffff\1\140\11\uffff\1\41\2\u008b\2\uffff\1\u008e\1\u008f\3\uffff"+
		"\1\76\15\uffff\2\u008b\5\uffff\1\76\4\uffff\1\u00a7\1\uffff\2\77\3\uffff"+
		"\1\77\1\uffff\1\u00ac\1\uffff";
	static final String DFA35_eofS =
		"\u00ad\uffff";
	static final String DFA35_minS =
		"\1\0\7\54\1\uffff\1\54\3\uffff\2\54\1\52\10\54\1\57\1\54\1\55\2\0\2\uffff"+
		"\2\54\2\uffff\6\54\6\uffff\1\60\1\uffff\1\60\1\54\2\uffff\11\54\5\uffff"+
		"\10\54\3\56\1\55\11\54\1\uffff\7\54\1\uffff\1\56\2\55\11\54\2\uffff\1"+
		"\60\1\55\3\54\1\56\1\55\3\54\1\52\4\54\3\56\1\55\3\54\1\55\2\54\1\56\1"+
		"\54\1\60\1\uffff\1\55\1\54\2\uffff\2\55\2\54\1\55\1\54\2\56\3\55\2\54"+
		"\1\56\3\55\1\54\4\55\1\54\1\uffff\2\55\1\54\1\55\1\uffff";
	static final String DFA35_maxS =
		"\1\uffff\7\172\1\uffff\1\172\3\uffff\2\172\1\57\10\172\1\57\2\172\2\uffff"+
		"\2\uffff\2\172\2\uffff\6\172\6\uffff\1\71\1\uffff\1\71\1\172\2\uffff\11"+
		"\172\5\uffff\10\172\1\56\1\71\1\56\12\172\1\uffff\7\172\1\uffff\1\71\13"+
		"\172\2\uffff\5\172\1\71\11\172\1\56\14\172\1\uffff\2\172\2\uffff\27\172"+
		"\1\uffff\4\172\1\uffff";
	static final String DFA35_acceptS =
		"\10\uffff\1\11\1\uffff\1\13\1\14\1\15\20\uffff\1\31\1\32\2\uffff\1\25"+
		"\1\21\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16\2\uffff\1\30"+
		"\1\20\11\uffff\1\23\1\22\1\26\1\27\1\31\25\uffff\1\1\7\uffff\1\24\14\uffff"+
		"\1\2\1\3\34\uffff\1\17\2\uffff\1\7\1\6\27\uffff\1\4\4\uffff\1\5";
	static final String DFA35_specialS =
		"\1\0\32\uffff\1\1\1\2\u0090\uffff}>";
	static final String[] DFA35_transitionS = {
			"\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\34\5\36\1\33\1\36\1\30\1\36\1"+
			"\11\1\32\1\36\1\17\1\15\1\16\10\31\1\12\1\13\1\36\1\10\3\36\1\6\1\27"+
			"\1\5\3\27\1\1\1\3\7\27\1\2\4\27\1\4\5\27\6\36\1\20\1\27\1\21\2\27\1\22"+
			"\2\27\1\23\3\27\1\24\3\27\1\7\2\27\1\25\1\27\1\26\4\27\1\36\1\14\uff83"+
			"\36",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\4\40\1\37\25\40\6\uffff\32\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\16\40\1\43\13\40\6\uffff\32\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\23\40\1\45\6\40\6\uffff\16\40"+
			"\1\44\13\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\22\40\1\46\7\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\16\40\1\47\13\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\2\40\1\50\27\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\41\2\uffff\13\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"",
			"",
			"\1\41\1\42\1\57\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\1\42\1\61\1\41\12\62\7\uffff\32\40\6\uffff\32\40",
			"\1\63\4\uffff\1\63",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\17\40\1\65\4\40"+
			"\1\66\5\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\7\40\1\67\22\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\16\40\1\70\13\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\14\40\1\71\15\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\72\11\40"+
			"\1\73\13\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\74\25\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\10\40\1\75\21\40",
			"\1\41\1\42\1\uffff\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\76",
			"\1\41\1\42\1\77\1\41\12\62\7\uffff\32\40\6\uffff\32\40",
			"\1\42\2\uffff\12\42\7\uffff\32\42\6\uffff\32\42",
			"\50\100\1\uffff\uffd7\100",
			"\0\101",
			"",
			"",
			"\1\41\2\42\1\41\12\40\7\uffff\23\40\1\103\6\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"\1\41\2\42\1\41\12\40\7\uffff\22\40\1\104\7\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\22\40\1\105\7\40",
			"\1\41\2\42\1\41\12\40\7\uffff\23\40\1\106\6\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\107\25\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\15\40\1\110\1\111\13\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\2\40\1\112\27\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\113\11\114",
			"",
			"\1\115\11\77",
			"\1\41\1\42\1\116\1\41\12\62\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\17\40\1\117\12\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\3\40\1\120\26\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\121\25\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\15\40\1\122\14\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\1\123\31\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\22\40\1\124\7\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\3\40\1\125\26\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\27\40\1\126\2\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\3\40\1\127\26\40",
			"",
			"",
			"",
			"",
			"",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\23\40\1\131\6\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\132\6\40",
			"\1\41\2\42\1\41\12\40\7\uffff\17\40\1\133\12\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\21\40\1\134\10\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\135\6\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\12\40\1\136\17\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\137\25\40",
			"\1\77",
			"\1\77\1\uffff\12\141",
			"\1\77",
			"\1\42\2\uffff\1\142\11\143\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\13\40\1\144\16\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\10\40\1\145\21\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\14\40\1\146\15\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\147\6\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\6\40\1\150\23\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\22\40\1\151\7\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\152\25\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\153\6\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\154\25\40",
			"",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\157\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\1\160\1\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\161\25\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\10\40\1\162\21\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\17\40\1\163\12\40",
			"",
			"\1\77\1\uffff\12\164",
			"\1\42\1\77\1\uffff\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\42\1\77\1\uffff\12\165\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\10\40\1\166\21\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\16\40\1\167\13\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\10\40\1\170\21\40",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\172\25\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\1\173\31\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\13\40\1\174\16\40",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\16\40\1\175\13\40",
			"",
			"",
			"\1\41\1\176\1\177\1\u0080\6\41\7\uffff\32\41\6\uffff\32\41",
			"\2\42\1\uffff\12\42\7\uffff\1\u0081\31\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\15\40\1\u0082\14\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\u0083\25\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\u0084\6\40",
			"\1\77\1\uffff\12\77",
			"\1\42\1\u0085\1\uffff\12\165\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\2\40\1\u0086\27\40",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\2\40\1\u0087\27\40",
			"\1\76\2\uffff\1\76\2\uffff\12\u0088\7\uffff\32\u0088\6\uffff\32\u0088",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\6\40\1\u0089\23\40",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u008a",
			"\1\41\1\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\41\1\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\6\42\1\u008c\23\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\u008d\6\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\42\2\uffff\1\u0090\11\u0091\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\1\u0092\31\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\1\u0093\31\40",
			"\1\u0094\1\uffff\12\u0088\7\uffff\32\u0088\6\uffff\32\u0088",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\4\40\1\u0095\25\40",
			"\1\u0096\1\u0097\10\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\4\42\1\u0098\25\42",
			"\1\41\1\u0099\1\42\1\41\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"\1\42\1\77\1\uffff\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\42\1\77\1\uffff\12\u009a\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\23\40\1\u009b\6\40",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\13\40\1\u009c\16\40",
			"\1\76\2\uffff\12\u009d\7\uffff\32\u009d\6\uffff\32\u009d",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\41\1\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\41\1\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\15\42\1\u009e\14\42",
			"\2\42\1\uffff\12\42\7\uffff\23\42\1\u009f\6\42\6\uffff\32\42",
			"\1\42\1\u00a0\1\uffff\12\u009a\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\10\40\1\u00a1\21\40",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0094\1\uffff\12\u009d\7\uffff\32\u009d\6\uffff\32\u009d",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\23\42\1\u00a2\6\42",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\30\42\1\u00a3\1\42",
			"\1\42\2\uffff\1\u00a4\11\u00a5\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\16\40\1\u00a6\13\40",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\32\42",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\17\42\1\u00a8\12\42",
			"\1\42\2\uffff\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\42\2\uffff\12\u00a9\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\41\12\40\7\uffff\32\40\6\uffff\15\40\1\u00aa\14\40",
			"",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\4\42\1\u00ab\25\42",
			"\2\42\1\uffff\12\u00a9\7\uffff\32\42\6\uffff\32\42",
			"\1\41\2\42\1\171\12\40\7\uffff\32\40\6\uffff\32\40",
			"\2\42\1\uffff\12\42\7\uffff\32\42\6\uffff\32\42",
			""
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | Q | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | INT_NUM | VERSION | PATH | DNS | IPV4 | MIME | Q_VAL | UA_ELEMENT | UA_INFO | STRING | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA35_0 = input.LA(1);
						s = -1;
						if ( (LA35_0=='G') ) {s = 1;}
						else if ( (LA35_0=='P') ) {s = 2;}
						else if ( (LA35_0=='H') ) {s = 3;}
						else if ( (LA35_0=='U') ) {s = 4;}
						else if ( (LA35_0=='C') ) {s = 5;}
						else if ( (LA35_0=='A') ) {s = 6;}
						else if ( (LA35_0=='q') ) {s = 7;}
						else if ( (LA35_0=='=') ) {s = 8;}
						else if ( (LA35_0==',') ) {s = 9;}
						else if ( (LA35_0==':') ) {s = 10;}
						else if ( (LA35_0==';') ) {s = 11;}
						else if ( (LA35_0=='|') ) {s = 12;}
						else if ( (LA35_0=='0') ) {s = 13;}
						else if ( (LA35_0=='1') ) {s = 14;}
						else if ( (LA35_0=='/') ) {s = 15;}
						else if ( (LA35_0=='a') ) {s = 16;}
						else if ( (LA35_0=='c') ) {s = 17;}
						else if ( (LA35_0=='f') ) {s = 18;}
						else if ( (LA35_0=='i') ) {s = 19;}
						else if ( (LA35_0=='m') ) {s = 20;}
						else if ( (LA35_0=='t') ) {s = 21;}
						else if ( (LA35_0=='v') ) {s = 22;}
						else if ( (LA35_0=='B'||(LA35_0 >= 'D' && LA35_0 <= 'F')||(LA35_0 >= 'I' && LA35_0 <= 'O')||(LA35_0 >= 'Q' && LA35_0 <= 'T')||(LA35_0 >= 'V' && LA35_0 <= 'Z')||LA35_0=='b'||(LA35_0 >= 'd' && LA35_0 <= 'e')||(LA35_0 >= 'g' && LA35_0 <= 'h')||(LA35_0 >= 'j' && LA35_0 <= 'l')||(LA35_0 >= 'n' && LA35_0 <= 'p')||(LA35_0 >= 'r' && LA35_0 <= 's')||LA35_0=='u'||(LA35_0 >= 'w' && LA35_0 <= 'z')) ) {s = 23;}
						else if ( (LA35_0=='*') ) {s = 24;}
						else if ( ((LA35_0 >= '2' && LA35_0 <= '9')) ) {s = 25;}
						else if ( (LA35_0=='-') ) {s = 26;}
						else if ( (LA35_0=='(') ) {s = 27;}
						else if ( (LA35_0=='\"') ) {s = 28;}
						else if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||LA35_0=='\r'||LA35_0==' ') ) {s = 29;}
						else if ( ((LA35_0 >= '\u0000' && LA35_0 <= '\b')||(LA35_0 >= '\u000B' && LA35_0 <= '\f')||(LA35_0 >= '\u000E' && LA35_0 <= '\u001F')||LA35_0=='!'||(LA35_0 >= '#' && LA35_0 <= '\'')||LA35_0==')'||LA35_0=='+'||LA35_0=='.'||LA35_0=='<'||(LA35_0 >= '>' && LA35_0 <= '@')||(LA35_0 >= '[' && LA35_0 <= '`')||LA35_0=='{'||(LA35_0 >= '}' && LA35_0 <= '\uFFFF')) ) {s = 30;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA35_27 = input.LA(1);
						s = -1;
						if ( ((LA35_27 >= '\u0000' && LA35_27 <= '\'')||(LA35_27 >= ')' && LA35_27 <= '\uFFFF')) ) {s = 64;}
						else s = 30;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA35_28 = input.LA(1);
						s = -1;
						if ( ((LA35_28 >= '\u0000' && LA35_28 <= '\uFFFF')) ) {s = 65;}
						else s = 30;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 35, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
