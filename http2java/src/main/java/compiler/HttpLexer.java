// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-13 11:54:39

package compiler; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpLexer extends Lexer {
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:8: ( 'GET' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:176:10: 'GET'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:177:9: ( 'POST' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:177:11: 'POST'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:178:9: ( 'Host' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:178:11: 'Host'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:179:13: ( 'User-Agent' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:179:15: 'User-Agent'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:180:15: ( 'Content-Type' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:180:17: 'Content-Type'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:181:10: ( 'Accept' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:181:12: 'Accept'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:182:10: ( 'Cookie' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:182:12: 'Cookie'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:183:15: ( 'Authorization' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:183:17: 'Authorization'
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

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			int _type = Q;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:184:6: ( 'q' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:184:8: 'q'
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

	// $ANTLR start "CHARSET"
	public final void mCHARSET() throws RecognitionException {
		try {
			int _type = CHARSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:185:11: ( 'charset' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:185:13: 'charset'
			{
			match("charset"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARSET"

	// $ANTLR start "BOUNDARY"
	public final void mBOUNDARY() throws RecognitionException {
		try {
			int _type = BOUNDARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:186:12: ( 'boundary' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:186:14: 'boundary'
			{
			match("boundary"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOUNDARY"

	// $ANTLR start "BASIC"
	public final void mBASIC() throws RecognitionException {
		try {
			int _type = BASIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:9: ( 'Basic' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:187:11: 'Basic'
			{
			match("Basic"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASIC"

	// $ANTLR start "DIGEST"
	public final void mDIGEST() throws RecognitionException {
		try {
			int _type = DIGEST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:188:10: ( 'Digest' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:188:12: 'Digest'
			{
			match("Digest"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGEST"

	// $ANTLR start "USERNAME"
	public final void mUSERNAME() throws RecognitionException {
		try {
			int _type = USERNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:189:12: ( 'username' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:189:14: 'username'
			{
			match("username"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USERNAME"

	// $ANTLR start "REALM"
	public final void mREALM() throws RecognitionException {
		try {
			int _type = REALM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:190:9: ( 'realm' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:190:11: 'realm'
			{
			match("realm"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REALM"

	// $ANTLR start "URI"
	public final void mURI() throws RecognitionException {
		try {
			int _type = URI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:8: ( 'uri' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:191:10: 'uri'
			{
			match("uri"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "URI"

	// $ANTLR start "ALGORITHM"
	public final void mALGORITHM() throws RecognitionException {
		try {
			int _type = ALGORITHM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:12: ( 'algorithm' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:192:14: 'algorithm'
			{
			match("algorithm"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALGORITHM"

	// $ANTLR start "NONCE"
	public final void mNONCE() throws RecognitionException {
		try {
			int _type = NONCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:193:9: ( 'nonce' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:193:11: 'nonce'
			{
			match("nonce"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NONCE"

	// $ANTLR start "NC"
	public final void mNC() throws RecognitionException {
		try {
			int _type = NC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:194:7: ( 'nc' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:194:9: 'nc'
			{
			match("nc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NC"

	// $ANTLR start "CNONCE"
	public final void mCNONCE() throws RecognitionException {
		try {
			int _type = CNONCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:10: ( 'cnonce' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:195:12: 'cnonce'
			{
			match("cnonce"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CNONCE"

	// $ANTLR start "QOP"
	public final void mQOP() throws RecognitionException {
		try {
			int _type = QOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:196:8: ( 'qop' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:196:10: 'qop'
			{
			match("qop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QOP"

	// $ANTLR start "RESPONSE"
	public final void mRESPONSE() throws RecognitionException {
		try {
			int _type = RESPONSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:197:12: ( 'response' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:197:14: 'response'
			{
			match("response"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESPONSE"

	// $ANTLR start "OPAQUE"
	public final void mOPAQUE() throws RecognitionException {
		try {
			int _type = OPAQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:198:10: ( 'opaque' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:198:12: 'opaque'
			{
			match("opaque"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPAQUE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:10: ( '=' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:199:12: '='
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:9: ( ',' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:200:11: ','
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:201:10: ( ':' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:201:12: ':'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:202:14: ( ';' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:202:16: ';'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:203:12: ( '|' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:203:14: '|'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:206:2: ( NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:206:4: NUM
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:2: ( 'HTTP/' ( '1.0' | '1.1' | '2' | '3' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:4: 'HTTP/' ( '1.0' | '1.1' | '2' | '3' )
			{
			match("HTTP/"); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:12: ( '1.0' | '1.1' | '2' | '3' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:210:13: '1.0'
					{
					match("1.0"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:211:6: '1.1'
					{
					match("1.1"); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:212:6: '2'
					{
					match('2'); 
					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:213:6: '3'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:2: ( ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? ) ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:4: ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? ) ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )?
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:4: ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:5: '/'
					{
					match('/'); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:11: ( '/' PATH_ELEMENT )+ ( '/' )?
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:11: ( '/' PATH_ELEMENT )+
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:12: '/' PATH_ELEMENT
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

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:31: ( '/' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='/') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:31: '/'
							{
							match('/'); 
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:37: ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='?') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:38: '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )*
					{
					match('?'); 
					mQUERY_ELEMENT(); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:56: ( '&' QUERY_ELEMENT )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='&') ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:217:57: '&' QUERY_ELEMENT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:2: ( DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:4: DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			{
			mDNS_ELEMENT(); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:16: ( '.' DNS_ELEMENT )*
			loop7:
			while (true) {
				int alt7=2;
				alt7 = dfa7.predict(input);
				switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:17: '.' DNS_ELEMENT
					{
					match('.'); 
					mDNS_ELEMENT(); 

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:35: ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:36: '.' ALPHA_CHAR ( ALPHA_CHAR )+
			{
			match('.'); 
			mALPHA_CHAR(); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:221:51: ( ALPHA_CHAR )+
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:225:2: ( NUM '.' NUM '.' NUM '.' NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:225:4: NUM '.' NUM '.' NUM '.' NUM
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:229:2: ( MIME_TYPE '/' MIME_SUBTYPE | '*/*' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:229:4: MIME_TYPE '/' MIME_SUBTYPE
					{
					mMIME_TYPE(); 

					match('/'); 
					mMIME_SUBTYPE(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:230:4: '*/*'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:234:2: ( 'multipart/' MIME_SUBTYPE )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:234:4: 'multipart/' MIME_SUBTYPE
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:238:2: ( '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) | '1.0' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:238:4: '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
					{
					match('0'); 
					match('.'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:238:12: ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:238:13: ( '0' .. '9' )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:239:6: ( '0' .. '9' ) ( '0' .. '9' )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:240:6: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:241:4: '1.0'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:2: ( ( ALPHA_NUM_CHAR | ',' )+ '/' VERS_NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:4: ( ALPHA_NUM_CHAR | ',' )+ '/' VERS_NUM
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:4: ( ALPHA_NUM_CHAR | ',' )+
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:249:2: ( '(' (~ ( '(' | ')' ) )* ')' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:249:4: '(' (~ ( '(' | ')' ) )* ')'
			{
			match('('); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:249:8: (~ ( '(' | ')' ) )*
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:7: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:12: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:23: ~ ( '\\\\' | '\\'' )
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
					break loop14;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:9: (~ ( '\\n' | '\\r' ) )*
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

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:23: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:23: '\\r'
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:4: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:9: ( options {greedy=false; } : . )*
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:37: .
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:262:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:262:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:2: ( ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:4: ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )*
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:4: ( ALPHA_NUM_CHAR )+
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

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:20: ( '.' ( ALPHA_NUM_CHAR )+ )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0=='.') ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:21: '.' ( ALPHA_NUM_CHAR )+
					{
					match('.'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:25: ( ALPHA_NUM_CHAR )+
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:2: ( ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:4: ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:27: ( ALPHA_NUM_CHAR | '-' )+
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:282:2: ( ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:282:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:282:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:282:5: ALPHA_NUM_CHAR
					{
					mALPHA_NUM_CHAR(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:283:4: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:283:10: '~'
					{
					match('~'); 
					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:283:16: '-'
					{
					match('-'); 
					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:283:22: '_'
					{
					match('_'); 
					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:284:4: '%' HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:2: ( PATH_ELEMENT '=' PATH_ELEMENT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:4: PATH_ELEMENT '=' PATH_ELEMENT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:2: ( 'application' | 'audio' | 'chemical' | 'font' | 'image' | 'message' | 'model' | 'text' | 'video' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:294:4: 'application'
					{
					match("application"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:295:4: 'audio'
					{
					match("audio"); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:296:4: 'chemical'
					{
					match("chemical"); 

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:297:4: 'font'
					{
					match("font"); 

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:298:4: 'image'
					{
					match("image"); 

					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:299:4: 'message'
					{
					match("message"); 

					}
					break;
				case 7 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:300:4: 'model'
					{
					match("model"); 

					}
					break;
				case 8 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:301:4: 'text'
					{
					match("text"); 

					}
					break;
				case 9 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:302:4: 'video'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:2: ( ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )? | '*' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:4: ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )?
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:4: ( ALPHA_NUM_CHAR | '-' )+
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

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:28: ( '.' ( ALPHA_NUM_CHAR | '-' )+ )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0=='.') ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:29: '.' ( ALPHA_NUM_CHAR | '-' )+
							{
							match('.'); 
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:33: ( ALPHA_NUM_CHAR | '-' )+
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

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:59: ( '+' ( ALPHA_CHAR )+ )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0=='+') ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:60: '+' ( ALPHA_CHAR )+
							{
							match('+'); 
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:307:64: ( ALPHA_CHAR )+
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:308:4: '*'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:313:2: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:313:4: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:314:4: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:314:14: ( '0' .. '9' )*
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:319:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:325:2: ( ( '0' .. '9' ) | ALPHA_CHAR )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:331:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:331:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:332:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:7: OCTAL_ESC
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:338:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:339:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:340:7: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:345:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:345:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:350:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:2: ( . )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:353:4: .
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
		// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:8: ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | AUTHORIZATION | Q | CHARSET | BOUNDARY | BASIC | DIGEST | USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | INT_NUM | VERSION | PATH | DNS | IPV4 | MIME | MULTIPART_MIME | Q_VAL | UA_ELEMENT | UA_INFO | STRING | COMMENT | WS | ERROR_TOKEN )
		int alt35=42;
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
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:62: AUTHORIZATION
				{
				mAUTHORIZATION(); 

				}
				break;
			case 9 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:76: Q
				{
				mQ(); 

				}
				break;
			case 10 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:78: CHARSET
				{
				mCHARSET(); 

				}
				break;
			case 11 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:86: BOUNDARY
				{
				mBOUNDARY(); 

				}
				break;
			case 12 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:95: BASIC
				{
				mBASIC(); 

				}
				break;
			case 13 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:101: DIGEST
				{
				mDIGEST(); 

				}
				break;
			case 14 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:108: USERNAME
				{
				mUSERNAME(); 

				}
				break;
			case 15 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:117: REALM
				{
				mREALM(); 

				}
				break;
			case 16 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:123: URI
				{
				mURI(); 

				}
				break;
			case 17 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:127: ALGORITHM
				{
				mALGORITHM(); 

				}
				break;
			case 18 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:137: NONCE
				{
				mNONCE(); 

				}
				break;
			case 19 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:143: NC
				{
				mNC(); 

				}
				break;
			case 20 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:146: CNONCE
				{
				mCNONCE(); 

				}
				break;
			case 21 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:153: QOP
				{
				mQOP(); 

				}
				break;
			case 22 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:157: RESPONSE
				{
				mRESPONSE(); 

				}
				break;
			case 23 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:166: OPAQUE
				{
				mOPAQUE(); 

				}
				break;
			case 24 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:173: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 25 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:180: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 26 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:186: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 27 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:193: SEMI_COLUMN
				{
				mSEMI_COLUMN(); 

				}
				break;
			case 28 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:205: TERMINAL
				{
				mTERMINAL(); 

				}
				break;
			case 29 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:214: INT_NUM
				{
				mINT_NUM(); 

				}
				break;
			case 30 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:222: VERSION
				{
				mVERSION(); 

				}
				break;
			case 31 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:230: PATH
				{
				mPATH(); 

				}
				break;
			case 32 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:235: DNS
				{
				mDNS(); 

				}
				break;
			case 33 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:239: IPV4
				{
				mIPV4(); 

				}
				break;
			case 34 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:244: MIME
				{
				mMIME(); 

				}
				break;
			case 35 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:249: MULTIPART_MIME
				{
				mMULTIPART_MIME(); 

				}
				break;
			case 36 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:264: Q_VAL
				{
				mQ_VAL(); 

				}
				break;
			case 37 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:270: UA_ELEMENT
				{
				mUA_ELEMENT(); 

				}
				break;
			case 38 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:281: UA_INFO
				{
				mUA_INFO(); 

				}
				break;
			case 39 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:289: STRING
				{
				mSTRING(); 

				}
				break;
			case 40 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:296: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 41 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:304: WS
				{
				mWS(); 

				}
				break;
			case 42 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:307: ERROR_TOKEN
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
			return "()* loopback of 221:16: ( '.' DNS_ELEMENT )*";
		}
	}

	static final String DFA35_eotS =
		"\1\uffff\6\45\1\62\11\45\1\uffff\1\102\3\uffff\2\107\1\113\7\45\1\107"+
		"\3\45\33\uffff\1\160\11\uffff\1\107\16\uffff\1\175\10\uffff\1\u0086\7"+
		"\uffff\1\u008e\10\uffff\3\u0096\11\uffff\1\u00a1\1\u00a2\27\uffff\1\u0096"+
		"\25\uffff\1\u00cb\2\uffff\1\u00ce\4\uffff\1\u00d2\1\uffff\1\u0096\7\uffff"+
		"\1\50\2\u00d9\2\uffff\1\u00dc\1\u00dd\3\uffff\1\u00e1\2\uffff\1\u00e3"+
		"\6\uffff\1\u00e8\1\uffff\1\123\11\uffff\1\u00f3\16\uffff\2\u00d9\5\uffff"+
		"\1\u0100\1\u0101\1\u0102\3\uffff\1\123\7\uffff\1\u010a\3\uffff\1\u010f"+
		"\4\uffff\2\124\5\uffff\1\124\1\u0115\1\uffff\1\u0119\3\uffff\1\u011c\1"+
		"\u0115\1\uffff";
	static final String DFA35_eofS =
		"\u011d\uffff";
	static final String DFA35_minS =
		"\1\0\20\54\1\uffff\1\54\3\uffff\2\54\1\52\6\54\1\57\1\54\1\55\2\0\2\uffff"+
		"\2\54\2\uffff\10\54\1\uffff\16\54\5\uffff\1\60\1\uffff\1\60\1\54\2\uffff"+
		"\7\54\5\uffff\30\54\1\uffff\1\54\3\56\1\55\7\54\1\uffff\10\54\1\uffff"+
		"\7\54\1\uffff\7\54\1\uffff\1\56\2\55\7\54\2\uffff\1\60\1\55\22\54\1\56"+
		"\1\55\1\52\5\54\3\56\1\55\10\54\1\uffff\2\54\1\uffff\3\54\1\uffff\1\54"+
		"\1\55\1\56\2\54\1\60\1\uffff\1\55\1\54\2\uffff\3\54\1\uffff\1\54\1\uffff"+
		"\4\54\1\uffff\3\55\2\54\2\56\2\55\1\54\1\uffff\6\54\1\55\1\56\1\54\2\55"+
		"\1\54\3\uffff\2\54\1\55\1\54\2\55\1\54\1\uffff\1\54\2\55\1\52\1\uffff"+
		"\1\55\2\54\1\55\1\56\1\uffff\1\55\1\54\1\55\1\uffff\1\54\1\56\1\uffff";
	static final String DFA35_maxS =
		"\1\uffff\20\172\1\uffff\1\172\3\uffff\2\172\1\57\6\172\1\57\2\172\2\uffff"+
		"\2\uffff\2\172\2\uffff\10\172\1\uffff\16\172\5\uffff\1\71\1\uffff\1\71"+
		"\1\172\2\uffff\7\172\5\uffff\30\172\1\uffff\1\172\1\56\1\71\1\56\10\172"+
		"\1\uffff\10\172\1\uffff\7\172\1\uffff\7\172\1\uffff\1\71\11\172\2\uffff"+
		"\24\172\1\71\7\172\1\56\13\172\1\uffff\2\172\1\uffff\3\172\1\uffff\6\172"+
		"\1\uffff\2\172\2\uffff\3\172\1\uffff\1\172\1\uffff\4\172\1\uffff\12\172"+
		"\1\uffff\14\172\3\uffff\7\172\1\uffff\4\172\1\uffff\5\172\1\uffff\3\172"+
		"\1\uffff\2\172\1\uffff";
	static final String DFA35_acceptS =
		"\21\uffff\1\30\1\uffff\1\32\1\33\1\34\16\uffff\1\51\1\52\2\uffff\1\45"+
		"\1\40\10\uffff\1\11\16\uffff\1\30\1\31\1\32\1\33\1\34\1\uffff\1\35\2\uffff"+
		"\1\50\1\37\7\uffff\1\42\1\41\1\46\1\47\1\51\30\uffff\1\23\14\uffff\1\1"+
		"\10\uffff\1\25\7\uffff\1\20\7\uffff\1\44\12\uffff\1\2\1\3\50\uffff\1\14"+
		"\2\uffff\1\17\3\uffff\1\22\6\uffff\1\36\2\uffff\1\7\1\6\3\uffff\1\24\1"+
		"\uffff\1\15\4\uffff\1\27\12\uffff\1\12\14\uffff\1\13\1\16\1\26\7\uffff"+
		"\1\21\4\uffff\1\4\5\uffff\1\43\3\uffff\1\5\2\uffff\1\10";
	static final String DFA35_specialS =
		"\1\2\41\uffff\1\0\1\1\u00f9\uffff}>";
	static final String[] DFA35_transitionS = {
			"\11\45\2\44\2\45\1\44\22\45\1\44\6\45\1\43\1\42\1\45\1\37\1\45\1\22\1"+
			"\41\1\45\1\30\1\26\1\27\10\40\1\23\1\24\1\45\1\21\3\45\1\6\1\12\1\5\1"+
			"\13\2\36\1\1\1\3\7\36\1\2\4\36\1\4\5\36\6\45\1\16\1\11\1\10\2\36\1\31"+
			"\2\36\1\32\3\36\1\33\1\17\1\20\1\36\1\7\1\15\1\36\1\34\1\14\1\35\4\36"+
			"\1\45\1\25\uff83\45",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\4\47\1\46\25\47\6\uffff\32\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\16\47\1\52\13\47\6\uffff\32\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\23\47\1\54\6\47\6\uffff\16\47"+
			"\1\53\13\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\55\7\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\56\13\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\57\21\47"+
			"\1\60\5\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\61\13\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\7\47\1\63\5\47\1"+
			"\64\14\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\65\13\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\1\66\31\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\67\21\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\71\1\70"+
			"\7\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\72\25\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\13\47\1\73\3\47"+
			"\1\74\4\47\1\75\5\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\77\13\47"+
			"\1\76\13\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\17\47\1\100\12\47",
			"",
			"\1\50\2\uffff\13\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"",
			"\1\50\1\51\1\106\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\1\51\1\110\1\50\12\111\7\uffff\32\47\6\uffff\32\47",
			"\1\112\4\uffff\1\112",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\114\13\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\14\47\1\115\15\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\116\11\47"+
			"\1\117\5\47\1\120\5\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\121\25\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\122\21\47",
			"\1\50\1\51\1\uffff\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\123",
			"\1\50\1\51\1\124\1\50\12\111\7\uffff\32\47\6\uffff\32\47",
			"\1\51\2\uffff\12\51\7\uffff\32\51\6\uffff\32\51",
			"\50\125\1\uffff\uffd7\125",
			"\0\126",
			"",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\23\47\1\130\6\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\22\47\1\131\7\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\132\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\23\47\1\133\6\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\134\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\135\1\136\13\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\137\27\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\140\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\17\47\1\141\12\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\142\3\47\1\143\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\144\13\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\24\47\1\145\5\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\146\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\6\47\1\147\23\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\150\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\151\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\152\21\47\1\153\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\6\47\1\154\23\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\17\47\1\155\12\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\3\47\1\156\26\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\157\14\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\161\31\47",
			"",
			"",
			"",
			"",
			"",
			"\1\162\11\163",
			"",
			"\1\164\11\124",
			"\1\50\1\51\1\165\1\50\12\111\7\uffff\32\47\6\uffff\32\47",
			"",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\166\14\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\167\31\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\170\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\3\47\1\171\26\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\13\47\1\172\16\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\27\47\1\173\2\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\3\47\1\174\26\47",
			"",
			"",
			"",
			"",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\23\47\1\176\6\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\177\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\17\47\1\u0080\12\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u0081\10\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u0082\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\12\47\1\u0083\17\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u0084\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\7\47\1\u0085\22\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u0087\10\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\14\47\1\u0088\15\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u0089\14\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u008a\14\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u008b\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u008c\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u008d\10\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\13\47\1\u008f\16\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\17\47\1\u0090\12\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u0091\13\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\13\47\1\u0092\16\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u0093\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\u0094\27\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\20\47\1\u0095\11\47",
			"\1\124",
			"\1\124\1\uffff\12\u0097",
			"\1\124",
			"\1\51\2\uffff\1\u0098\11\u0099\7\uffff\32\51\6\uffff\32\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u009a\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\6\47\1\u009b\23\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\u009c\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u009d\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u009e\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u009f\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00a0\25\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\u00a3\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\1\u00a4\1\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00a5\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u00a6\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\17\47\1\u00a7\12\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u00a8\13\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\u00a9\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u00aa\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\u00ab\27\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\3\47\1\u00ac\26\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\u00ad\27\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\u00ae\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u00af\14\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\14\47\1\u00b0\15\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u00b1\13\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u00b2\10\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u00b3\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u00b4\13\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00b5\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\24\47\1\u00b6\5\47",
			"",
			"\1\124\1\uffff\12\u00b7",
			"\1\51\1\124\1\uffff\12\51\7\uffff\32\51\6\uffff\32\51",
			"\1\51\1\124\1\uffff\12\u00b8\7\uffff\32\51\6\uffff\32\51",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00ba\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00bb\31\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\13\47\1\u00bc\16\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u00bd\21\47",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u00be\13\47",
			"",
			"",
			"\1\50\1\u00bf\1\u00c0\1\u00c1\6\50\7\uffff\32\50\6\uffff\32\50",
			"\2\51\1\uffff\12\51\7\uffff\1\u00c2\31\51\6\uffff\32\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u00c3\14\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00c4\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u00c5\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u00c6\10\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00c7\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\u00c8\27\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00c9\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00ca\31\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u00cc\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00cd\31\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u00cf\14\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u00d0\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\2\47\1\u00d1\27\47",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00d3\25\47",
			"\1\124\1\uffff\12\124",
			"\1\51\1\u00d4\1\uffff\12\u00b8\7\uffff\32\51\6\uffff\32\51",
			"\1\123\2\uffff\1\123\2\uffff\12\u00d5\7\uffff\32\u00d5\6\uffff\32\u00d5",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\6\47\1\u00d6\23\47",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\17\47\1\u00d7\12\47",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\u00d8",
			"\1\50\1\uffff\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\50\1\uffff\12\50\7\uffff\32\50\6\uffff\32\50",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\6\51\1\u00da\23\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u00db\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u00de\21\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u00df\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00e0\31\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u00e2\10\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\14\47\1\u00e4\15\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\22\47\1\u00e5\7\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u00e6\6\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00e7\31\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\51\2\uffff\1\u00e9\11\u00ea\7\uffff\32\51\6\uffff\32\51",
			"\1\u00eb\1\uffff\12\u00d5\7\uffff\32\u00d5\6\uffff\32\u00d5",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00ec\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00ed\31\47",
			"\1\u00ee\1\u00ef\10\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\4\51\1\u00f0\25\51",
			"\1\50\1\u00f1\1\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\31\47\1\u00f2",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\13\47\1\u00f4\16\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\30\47\1\u00f5\1\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00f6\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\4\47\1\u00f7\25\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\7\47\1\u00f8\22\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u00f9\6\47",
			"",
			"\1\51\1\124\1\uffff\12\51\7\uffff\32\51\6\uffff\32\51",
			"\1\51\1\124\1\uffff\12\u00fa\7\uffff\32\51\6\uffff\32\51",
			"\1\123\2\uffff\12\u00fb\7\uffff\32\u00fb\6\uffff\32\u00fb",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\21\47\1\u00fc\10\47",
			"\1\50\1\uffff\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\50\1\uffff\12\50\7\uffff\32\50\6\uffff\32\50",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\15\51\1\u00fd\14\51",
			"\2\51\1\uffff\12\51\7\uffff\23\51\1\u00fe\6\51\6\uffff\32\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\1\u00ff\31\47",
			"",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\14\47\1\u0103\15\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u0104\21\47",
			"\1\51\1\u0105\1\uffff\12\u00fa\7\uffff\32\51\6\uffff\32\51",
			"\1\u00eb\1\uffff\12\u00fb\7\uffff\32\u00fb\6\uffff\32\u00fb",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u0106\6\47",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\23\51\1\u0107\6\51",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\30\51\1\u0108\1\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\23\47\1\u0109\6\47",
			"",
			"",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u010b\13\47",
			"\1\51\2\uffff\1\u010c\11\u010d\7\uffff\32\51\6\uffff\32\51",
			"\1\50\2\51\1\u010e\12\47\7\uffff\32\47\6\uffff\32\47",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\32\51",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\17\51\1\u0110\12\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\10\47\1\u0111\21\47",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u0112\14\47",
			"\1\51\2\uffff\12\51\7\uffff\32\51\6\uffff\32\51",
			"\1\51\2\uffff\12\u0113\7\uffff\32\51\6\uffff\32\51",
			"\1\u0115\2\uffff\1\u0115\2\uffff\12\u0114\7\uffff\32\u0114\6\uffff\32"+
			"\u0114",
			"",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\4\51\1\u0116\25\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\16\47\1\u0117\13\47",
			"\1\50\2\51\1\u00b9\12\47\7\uffff\32\47\6\uffff\32\47",
			"\2\51\1\uffff\12\u0113\7\uffff\32\51\6\uffff\32\51",
			"\1\u0118\1\uffff\12\u0114\7\uffff\32\u0114\6\uffff\32\u0114",
			"",
			"\2\51\1\uffff\12\51\7\uffff\32\51\6\uffff\32\51",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\15\47\1\u011a\14\47",
			"\1\u0115\2\uffff\12\u011b\7\uffff\32\u011b\6\uffff\32\u011b",
			"",
			"\1\50\2\51\1\50\12\47\7\uffff\32\47\6\uffff\32\47",
			"\1\u0118\1\uffff\12\u011b\7\uffff\32\u011b\6\uffff\32\u011b",
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
			return "1:1: Tokens : ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | AUTHORIZATION | Q | CHARSET | BOUNDARY | BASIC | DIGEST | USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | INT_NUM | VERSION | PATH | DNS | IPV4 | MIME | MULTIPART_MIME | Q_VAL | UA_ELEMENT | UA_INFO | STRING | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA35_34 = input.LA(1);
						s = -1;
						if ( ((LA35_34 >= '\u0000' && LA35_34 <= '\'')||(LA35_34 >= ')' && LA35_34 <= '\uFFFF')) ) {s = 85;}
						else s = 37;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA35_35 = input.LA(1);
						s = -1;
						if ( ((LA35_35 >= '\u0000' && LA35_35 <= '\uFFFF')) ) {s = 86;}
						else s = 37;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA35_0 = input.LA(1);
						s = -1;
						if ( (LA35_0=='G') ) {s = 1;}
						else if ( (LA35_0=='P') ) {s = 2;}
						else if ( (LA35_0=='H') ) {s = 3;}
						else if ( (LA35_0=='U') ) {s = 4;}
						else if ( (LA35_0=='C') ) {s = 5;}
						else if ( (LA35_0=='A') ) {s = 6;}
						else if ( (LA35_0=='q') ) {s = 7;}
						else if ( (LA35_0=='c') ) {s = 8;}
						else if ( (LA35_0=='b') ) {s = 9;}
						else if ( (LA35_0=='B') ) {s = 10;}
						else if ( (LA35_0=='D') ) {s = 11;}
						else if ( (LA35_0=='u') ) {s = 12;}
						else if ( (LA35_0=='r') ) {s = 13;}
						else if ( (LA35_0=='a') ) {s = 14;}
						else if ( (LA35_0=='n') ) {s = 15;}
						else if ( (LA35_0=='o') ) {s = 16;}
						else if ( (LA35_0=='=') ) {s = 17;}
						else if ( (LA35_0==',') ) {s = 18;}
						else if ( (LA35_0==':') ) {s = 19;}
						else if ( (LA35_0==';') ) {s = 20;}
						else if ( (LA35_0=='|') ) {s = 21;}
						else if ( (LA35_0=='0') ) {s = 22;}
						else if ( (LA35_0=='1') ) {s = 23;}
						else if ( (LA35_0=='/') ) {s = 24;}
						else if ( (LA35_0=='f') ) {s = 25;}
						else if ( (LA35_0=='i') ) {s = 26;}
						else if ( (LA35_0=='m') ) {s = 27;}
						else if ( (LA35_0=='t') ) {s = 28;}
						else if ( (LA35_0=='v') ) {s = 29;}
						else if ( ((LA35_0 >= 'E' && LA35_0 <= 'F')||(LA35_0 >= 'I' && LA35_0 <= 'O')||(LA35_0 >= 'Q' && LA35_0 <= 'T')||(LA35_0 >= 'V' && LA35_0 <= 'Z')||(LA35_0 >= 'd' && LA35_0 <= 'e')||(LA35_0 >= 'g' && LA35_0 <= 'h')||(LA35_0 >= 'j' && LA35_0 <= 'l')||LA35_0=='p'||LA35_0=='s'||(LA35_0 >= 'w' && LA35_0 <= 'z')) ) {s = 30;}
						else if ( (LA35_0=='*') ) {s = 31;}
						else if ( ((LA35_0 >= '2' && LA35_0 <= '9')) ) {s = 32;}
						else if ( (LA35_0=='-') ) {s = 33;}
						else if ( (LA35_0=='(') ) {s = 34;}
						else if ( (LA35_0=='\'') ) {s = 35;}
						else if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||LA35_0=='\r'||LA35_0==' ') ) {s = 36;}
						else if ( ((LA35_0 >= '\u0000' && LA35_0 <= '\b')||(LA35_0 >= '\u000B' && LA35_0 <= '\f')||(LA35_0 >= '\u000E' && LA35_0 <= '\u001F')||(LA35_0 >= '!' && LA35_0 <= '&')||LA35_0==')'||LA35_0=='+'||LA35_0=='.'||LA35_0=='<'||(LA35_0 >= '>' && LA35_0 <= '@')||(LA35_0 >= '[' && LA35_0 <= '`')||LA35_0=='{'||(LA35_0 >= '}' && LA35_0 <= '\uFFFF')) ) {s = 37;}
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
