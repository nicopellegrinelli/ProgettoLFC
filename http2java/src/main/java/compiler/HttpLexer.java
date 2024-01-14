// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-13 15:42:19

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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:242:8: ( 'GET' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:242:10: 'GET'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:243:9: ( 'POST' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:243:11: 'POST'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:244:9: ( 'Host' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:244:11: 'Host'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:13: ( 'User-Agent' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:245:15: 'User-Agent'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:246:15: ( 'Content-Type' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:246:17: 'Content-Type'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:247:10: ( 'Accept' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:247:12: 'Accept'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:248:10: ( 'Cookie' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:248:12: 'Cookie'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:249:15: ( 'Authorization' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:249:17: 'Authorization'
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

	// $ANTLR start "CONTENT_LENGTH"
	public final void mCONTENT_LENGTH() throws RecognitionException {
		try {
			int _type = CONTENT_LENGTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:250:16: ( 'Content-Length' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:250:18: 'Content-Length'
			{
			match("Content-Length"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTENT_LENGTH"

	// $ANTLR start "CONNECTION"
	public final void mCONNECTION() throws RecognitionException {
		try {
			int _type = CONNECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:251:13: ( 'Connection' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:251:15: 'Connection'
			{
			match("Connection"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONNECTION"

	// $ANTLR start "ACCEPT_LANGUAGE"
	public final void mACCEPT_LANGUAGE() throws RecognitionException {
		try {
			int _type = ACCEPT_LANGUAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:252:17: ( 'Accept-Language' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:252:19: 'Accept-Language'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:17: ( 'Accept-Encoding' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:253:19: 'Accept-Encoding'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:254:15: ( 'Cache-Control' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:254:17: 'Cache-Control'
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

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			int _type = Q;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:255:6: ( 'q' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:255:8: 'q'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:256:11: ( 'charset' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:256:13: 'charset'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:12: ( 'boundary' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:257:14: 'boundary'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:9: ( 'Basic' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:258:11: 'Basic'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:259:10: ( 'Digest' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:259:12: 'Digest'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:260:12: ( 'username' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:260:14: 'username'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:261:9: ( 'realm' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:261:11: 'realm'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:262:8: ( 'uri' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:262:10: 'uri'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:263:12: ( 'algorithm' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:263:14: 'algorithm'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:264:9: ( 'nonce' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:264:11: 'nonce'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:265:7: ( 'nc' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:265:9: 'nc'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:266:10: ( 'cnonce' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:266:12: 'cnonce'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:267:8: ( 'qop' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:267:10: 'qop'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:268:12: ( 'response' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:268:14: 'response'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:269:10: ( 'opaque' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:269:12: 'opaque'
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

	// $ANTLR start "KEEP_ALIVE"
	public final void mKEEP_ALIVE() throws RecognitionException {
		try {
			int _type = KEEP_ALIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:270:13: ( 'keep-alive' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:270:15: 'keep-alive'
			{
			match("keep-alive"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEEP_ALIVE"

	// $ANTLR start "CLOSE"
	public final void mCLOSE() throws RecognitionException {
		try {
			int _type = CLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:271:9: ( 'close' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:271:11: 'close'
			{
			match("close"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:10: ( '=' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:272:12: '='
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:273:9: ( ',' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:273:11: ','
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:274:10: ( ':' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:274:12: ':'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:275:14: ( ';' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:275:16: ';'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:276:12: ( '|' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:276:14: '|'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:9: ( '*' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:277:11: '*'
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

	// $ANTLR start "INT_NUM"
	public final void mINT_NUM() throws RecognitionException {
		try {
			int _type = INT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:280:2: ( NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:280:4: NUM
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:284:2: ( 'HTTP/' ( '1.1' | '2' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:284:4: 'HTTP/' ( '1.1' | '2' )
			{
			match("HTTP/"); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:284:12: ( '1.1' | '2' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='1') ) {
				alt1=1;
			}
			else if ( (LA1_0=='2') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:284:13: '1.1'
					{
					match("1.1"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:285:6: '2'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:2: ( ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? ) ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:4: ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? ) ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )?
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:4: ( '/' | ( '/' PATH_ELEMENT )+ ( '/' )? )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:5: '/'
					{
					match('/'); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:11: ( '/' PATH_ELEMENT )+ ( '/' )?
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:11: ( '/' PATH_ELEMENT )+
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:12: '/' PATH_ELEMENT
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

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:31: ( '/' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='/') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:31: '/'
							{
							match('/'); 
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:37: ( '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='?') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:38: '?' QUERY_ELEMENT ( '&' QUERY_ELEMENT )*
					{
					match('?'); 
					mQUERY_ELEMENT(); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:56: ( '&' QUERY_ELEMENT )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='&') ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:289:57: '&' QUERY_ELEMENT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:2: ( DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:4: DNS_ELEMENT ( '.' DNS_ELEMENT )* ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			{
			mDNS_ELEMENT(); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:16: ( '.' DNS_ELEMENT )*
			loop7:
			while (true) {
				int alt7=2;
				alt7 = dfa7.predict(input);
				switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:17: '.' DNS_ELEMENT
					{
					match('.'); 
					mDNS_ELEMENT(); 

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:35: ( '.' ALPHA_CHAR ( ALPHA_CHAR )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:36: '.' ALPHA_CHAR ( ALPHA_CHAR )+
			{
			match('.'); 
			mALPHA_CHAR(); 

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:293:51: ( ALPHA_CHAR )+
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:297:2: ( NUM '.' NUM '.' NUM '.' NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:297:4: NUM '.' NUM '.' NUM '.' NUM
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:301:2: ( MIME_TYPE '/' MIME_SUBTYPE | '*/*' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:301:4: MIME_TYPE '/' MIME_SUBTYPE
					{
					mMIME_TYPE(); 

					match('/'); 
					mMIME_SUBTYPE(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:302:4: '*/*'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:306:2: ( 'multipart/' MIME_SUBTYPE )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:306:4: 'multipart/' MIME_SUBTYPE
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:310:2: ( '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) | '1.0' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:310:4: '0' '.' ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
					{
					match('0'); 
					match('.'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:310:12: ( ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) | ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:310:13: ( '0' .. '9' )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:311:6: ( '0' .. '9' ) ( '0' .. '9' )
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
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:312:6: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:313:4: '1.0'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:317:2: ( ( ALPHA_NUM_CHAR )+ '/' VERS_NUM )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:317:4: ( ALPHA_NUM_CHAR )+ '/' VERS_NUM
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:317:4: ( ALPHA_NUM_CHAR )+
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:321:2: ( '(' (~ ( '(' | ')' ) )* ')' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:321:4: '(' (~ ( '(' | ')' ) )* ')'
			{
			match('('); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:321:8: (~ ( '(' | ')' ) )*
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
	// $ANTLR end "PRODUCT_INFO"

	// $ANTLR start "ENCODING_ELEMENT"
	public final void mENCODING_ELEMENT() throws RecognitionException {
		try {
			int _type = ENCODING_ELEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:325:2: ( 'gzip' | 'compress' | 'deflate' | 'br' | 'identity' )
			int alt14=5;
			switch ( input.LA(1) ) {
			case 'g':
				{
				alt14=1;
				}
				break;
			case 'c':
				{
				alt14=2;
				}
				break;
			case 'd':
				{
				alt14=3;
				}
				break;
			case 'b':
				{
				alt14=4;
				}
				break;
			case 'i':
				{
				alt14=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:325:4: 'gzip'
					{
					match("gzip"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:326:4: 'compress'
					{
					match("compress"); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:327:4: 'deflate'
					{
					match("deflate"); 

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:328:4: 'br'
					{
					match("br"); 

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:329:4: 'identity'
					{
					match("identity"); 

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
	// $ANTLR end "ENCODING_ELEMENT"

	// $ANTLR start "LANGUAGE_ELEMENT"
	public final void mLANGUAGE_ELEMENT() throws RecognitionException {
		try {
			int _type = LANGUAGE_ELEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:2: ( ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )? ( '-' ( ALPHA_CHAR )+ )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:4: ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )? ( '-' ( ALPHA_CHAR )+ )?
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:24: ( 'a' .. 'z' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:36: ( '-' ( ALPHA_CHAR )+ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='-') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:37: '-' ( ALPHA_CHAR )+
					{
					match('-'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:333:41: ( ALPHA_CHAR )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= 'A' && LA16_0 <= 'Z')||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
							alt16=1;
						}

						switch (alt16) {
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
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
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
	// $ANTLR end "LANGUAGE_ELEMENT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:337:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:337:7: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:337:12: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='\\') ) {
					alt18=1;
				}
				else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:337:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:337:23: ~ ( '\\\\' | '\\'' )
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
					break loop18;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:341:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='/') ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1=='/') ) {
					alt22=1;
				}
				else if ( (LA22_1=='*') ) {
					alt22=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:341:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:341:9: (~ ( '\\n' | '\\r' ) )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
							alt19=1;
						}

						switch (alt19) {
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
							break loop19;
						}
					}

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:341:23: ( '\\r' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='\r') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:341:23: '\\r'
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:342:4: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:342:9: ( options {greedy=false; } : . )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0=='*') ) {
							int LA21_1 = input.LA(2);
							if ( (LA21_1=='/') ) {
								alt21=2;
							}
							else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '.')||(LA21_1 >= '0' && LA21_1 <= '\uFFFF')) ) {
								alt21=1;
							}

						}
						else if ( ((LA21_0 >= '\u0000' && LA21_0 <= ')')||(LA21_0 >= '+' && LA21_0 <= '\uFFFF')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:342:37: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop21;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:346:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:346:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:356:2: ( ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )* )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:356:4: ( ALPHA_NUM_CHAR )+ ( '.' ( ALPHA_NUM_CHAR )+ )*
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:356:4: ( ALPHA_NUM_CHAR )+
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
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:356:20: ( '.' ( ALPHA_NUM_CHAR )+ )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0=='.') ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:356:21: '.' ( ALPHA_NUM_CHAR )+
					{
					match('.'); 
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:356:25: ( ALPHA_NUM_CHAR )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '0' && LA24_0 <= '9')||(LA24_0 >= 'A' && LA24_0 <= 'Z')||(LA24_0 >= 'a' && LA24_0 <= 'z')) ) {
							alt24=1;
						}

						switch (alt24) {
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
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					}
					break;

				default :
					break loop25;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:361:2: ( ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:361:4: ( ALPHA_NUM_CHAR | '-' ) ( ALPHA_NUM_CHAR | '-' )+
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:361:27: ( ALPHA_NUM_CHAR | '-' )+
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DNS_ELEMENT"

	// $ANTLR start "PATH_ELEMENT"
	public final void mPATH_ELEMENT() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:366:2: ( ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+ )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:366:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			{
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:366:4: ( ALPHA_NUM_CHAR | '.' | '~' | '-' | '_' | '%' HEX_DIGIT HEX_DIGIT )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=7;
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
					alt27=1;
					}
					break;
				case '.':
					{
					alt27=2;
					}
					break;
				case '~':
					{
					alt27=3;
					}
					break;
				case '-':
					{
					alt27=4;
					}
					break;
				case '_':
					{
					alt27=5;
					}
					break;
				case '%':
					{
					alt27=6;
					}
					break;
				}
				switch (alt27) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:366:5: ALPHA_NUM_CHAR
					{
					mALPHA_NUM_CHAR(); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:367:4: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:367:10: '~'
					{
					match('~'); 
					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:367:16: '-'
					{
					match('-'); 
					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:367:22: '_'
					{
					match('_'); 
					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:368:4: '%' HEX_DIGIT HEX_DIGIT
					{
					match('%'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:374:2: ( PATH_ELEMENT '=' PATH_ELEMENT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:374:4: PATH_ELEMENT '=' PATH_ELEMENT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:379:2: ( 'application' | 'audio' | 'chemical' | 'font' | 'image' | 'message' | 'model' | 'text' | 'video' )
			int alt28=9;
			switch ( input.LA(1) ) {
			case 'a':
				{
				int LA28_1 = input.LA(2);
				if ( (LA28_1=='p') ) {
					alt28=1;
				}
				else if ( (LA28_1=='u') ) {
					alt28=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				alt28=3;
				}
				break;
			case 'f':
				{
				alt28=4;
				}
				break;
			case 'i':
				{
				alt28=5;
				}
				break;
			case 'm':
				{
				int LA28_5 = input.LA(2);
				if ( (LA28_5=='e') ) {
					alt28=6;
				}
				else if ( (LA28_5=='o') ) {
					alt28=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				alt28=8;
				}
				break;
			case 'v':
				{
				alt28=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:379:4: 'application'
					{
					match("application"); 

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:380:4: 'audio'
					{
					match("audio"); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:381:4: 'chemical'
					{
					match("chemical"); 

					}
					break;
				case 4 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:382:4: 'font'
					{
					match("font"); 

					}
					break;
				case 5 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:383:4: 'image'
					{
					match("image"); 

					}
					break;
				case 6 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:384:4: 'message'
					{
					match("message"); 

					}
					break;
				case 7 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:385:4: 'model'
					{
					match("model"); 

					}
					break;
				case 8 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:386:4: 'text'
					{
					match("text"); 

					}
					break;
				case 9 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:387:4: 'video'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:2: ( ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )? | '*' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='-'||(LA34_0 >= '0' && LA34_0 <= '9')||(LA34_0 >= 'A' && LA34_0 <= 'Z')||(LA34_0 >= 'a' && LA34_0 <= 'z')) ) {
				alt34=1;
			}
			else if ( (LA34_0=='*') ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:4: ( ALPHA_NUM_CHAR | '-' )+ ( '.' ( ALPHA_NUM_CHAR | '-' )+ )* ( '+' ( ALPHA_CHAR )+ )?
					{
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:4: ( ALPHA_NUM_CHAR | '-' )+
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
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:28: ( '.' ( ALPHA_NUM_CHAR | '-' )+ )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0=='.') ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:29: '.' ( ALPHA_NUM_CHAR | '-' )+
							{
							match('.'); 
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:33: ( ALPHA_NUM_CHAR | '-' )+
							int cnt30=0;
							loop30:
							while (true) {
								int alt30=2;
								int LA30_0 = input.LA(1);
								if ( (LA30_0=='-'||(LA30_0 >= '0' && LA30_0 <= '9')||(LA30_0 >= 'A' && LA30_0 <= 'Z')||(LA30_0 >= 'a' && LA30_0 <= 'z')) ) {
									alt30=1;
								}

								switch (alt30) {
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
									if ( cnt30 >= 1 ) break loop30;
									EarlyExitException eee = new EarlyExitException(30, input);
									throw eee;
								}
								cnt30++;
							}

							}
							break;

						default :
							break loop31;
						}
					}

					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:59: ( '+' ( ALPHA_CHAR )+ )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0=='+') ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:60: '+' ( ALPHA_CHAR )+
							{
							match('+'); 
							// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:392:64: ( ALPHA_CHAR )+
							int cnt32=0;
							loop32:
							while (true) {
								int alt32=2;
								int LA32_0 = input.LA(1);
								if ( ((LA32_0 >= 'A' && LA32_0 <= 'Z')||(LA32_0 >= 'a' && LA32_0 <= 'z')) ) {
									alt32=1;
								}

								switch (alt32) {
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
									if ( cnt32 >= 1 ) break loop32;
									EarlyExitException eee = new EarlyExitException(32, input);
									throw eee;
								}
								cnt32++;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:393:4: '*'
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:398:2: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0=='0') ) {
				alt36=1;
			}
			else if ( ((LA36_0 >= '1' && LA36_0 <= '9')) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:398:4: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:399:4: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:399:14: ( '0' .. '9' )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
							alt35=1;
						}

						switch (alt35) {
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
							break loop35;
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:404:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:410:2: ( ( '0' .. '9' ) | ALPHA_CHAR )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:416:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0=='\\') ) {
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
					alt37=1;
					}
					break;
				case 'u':
					{
					alt37=2;
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
					alt37=3;
					}
					break;
				default:
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:416:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:417:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:418:7: OCTAL_ESC
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:423:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0=='\\') ) {
				int LA38_1 = input.LA(2);
				if ( ((LA38_1 >= '0' && LA38_1 <= '3')) ) {
					int LA38_2 = input.LA(3);
					if ( ((LA38_2 >= '0' && LA38_2 <= '7')) ) {
						int LA38_4 = input.LA(4);
						if ( ((LA38_4 >= '0' && LA38_4 <= '7')) ) {
							alt38=1;
						}

						else {
							alt38=2;
						}

					}

					else {
						alt38=3;
					}

				}
				else if ( ((LA38_1 >= '4' && LA38_1 <= '7')) ) {
					int LA38_3 = input.LA(3);
					if ( ((LA38_3 >= '0' && LA38_3 <= '7')) ) {
						alt38=2;
					}

					else {
						alt38=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:423:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:424:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:425:7: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:430:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:430:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:435:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:438:2: ( . )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:438:4: .
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
		// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:8: ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | AUTHORIZATION | CONTENT_LENGTH | CONNECTION | ACCEPT_LANGUAGE | ACCEPT_ENCODING | CACHE_CONTROL | Q | CHARSET | BOUNDARY | BASIC | DIGEST | USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE | KEEP_ALIVE | CLOSE | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | STAR | INT_NUM | HTTP_VERSION | PATH | DNS | IPV4 | MIME | MULTIPART_MIME | Q_VAL | PRODUCT | PRODUCT_INFO | ENCODING_ELEMENT | LANGUAGE_ELEMENT | STRING | COMMENT | WS | ERROR_TOKEN )
		int alt39=52;
		alt39 = dfa39.predict(input);
		switch (alt39) {
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
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:76: CONTENT_LENGTH
				{
				mCONTENT_LENGTH(); 

				}
				break;
			case 10 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:91: CONNECTION
				{
				mCONNECTION(); 

				}
				break;
			case 11 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:102: ACCEPT_LANGUAGE
				{
				mACCEPT_LANGUAGE(); 

				}
				break;
			case 12 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:118: ACCEPT_ENCODING
				{
				mACCEPT_ENCODING(); 

				}
				break;
			case 13 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:134: CACHE_CONTROL
				{
				mCACHE_CONTROL(); 

				}
				break;
			case 14 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:148: Q
				{
				mQ(); 

				}
				break;
			case 15 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:150: CHARSET
				{
				mCHARSET(); 

				}
				break;
			case 16 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:158: BOUNDARY
				{
				mBOUNDARY(); 

				}
				break;
			case 17 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:167: BASIC
				{
				mBASIC(); 

				}
				break;
			case 18 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:173: DIGEST
				{
				mDIGEST(); 

				}
				break;
			case 19 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:180: USERNAME
				{
				mUSERNAME(); 

				}
				break;
			case 20 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:189: REALM
				{
				mREALM(); 

				}
				break;
			case 21 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:195: URI
				{
				mURI(); 

				}
				break;
			case 22 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:199: ALGORITHM
				{
				mALGORITHM(); 

				}
				break;
			case 23 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:209: NONCE
				{
				mNONCE(); 

				}
				break;
			case 24 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:215: NC
				{
				mNC(); 

				}
				break;
			case 25 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:218: CNONCE
				{
				mCNONCE(); 

				}
				break;
			case 26 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:225: QOP
				{
				mQOP(); 

				}
				break;
			case 27 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:229: RESPONSE
				{
				mRESPONSE(); 

				}
				break;
			case 28 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:238: OPAQUE
				{
				mOPAQUE(); 

				}
				break;
			case 29 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:245: KEEP_ALIVE
				{
				mKEEP_ALIVE(); 

				}
				break;
			case 30 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:256: CLOSE
				{
				mCLOSE(); 

				}
				break;
			case 31 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:262: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 32 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:269: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 33 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:275: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 34 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:282: SEMI_COLUMN
				{
				mSEMI_COLUMN(); 

				}
				break;
			case 35 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:294: TERMINAL
				{
				mTERMINAL(); 

				}
				break;
			case 36 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:303: STAR
				{
				mSTAR(); 

				}
				break;
			case 37 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:308: INT_NUM
				{
				mINT_NUM(); 

				}
				break;
			case 38 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:316: HTTP_VERSION
				{
				mHTTP_VERSION(); 

				}
				break;
			case 39 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:329: PATH
				{
				mPATH(); 

				}
				break;
			case 40 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:334: DNS
				{
				mDNS(); 

				}
				break;
			case 41 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:338: IPV4
				{
				mIPV4(); 

				}
				break;
			case 42 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:343: MIME
				{
				mMIME(); 

				}
				break;
			case 43 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:348: MULTIPART_MIME
				{
				mMULTIPART_MIME(); 

				}
				break;
			case 44 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:363: Q_VAL
				{
				mQ_VAL(); 

				}
				break;
			case 45 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:369: PRODUCT
				{
				mPRODUCT(); 

				}
				break;
			case 46 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:377: PRODUCT_INFO
				{
				mPRODUCT_INFO(); 

				}
				break;
			case 47 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:390: ENCODING_ELEMENT
				{
				mENCODING_ELEMENT(); 

				}
				break;
			case 48 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:407: LANGUAGE_ELEMENT
				{
				mLANGUAGE_ELEMENT(); 

				}
				break;
			case 49 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:424: STRING
				{
				mSTRING(); 

				}
				break;
			case 50 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:431: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 51 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:439: WS
				{
				mWS(); 

				}
				break;
			case 52 :
				// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:1:442: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA39 dfa39 = new DFA39(this);
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
			return "()* loopback of 293:16: ( '.' DNS_ELEMENT )*";
		}
	}

	static final String DFA39_eotS =
		"\1\uffff\6\51\1\70\12\51\5\uffff\1\121\2\123\1\127\6\51\1\123\6\51\16"+
		"\uffff\2\163\1\uffff\5\163\1\172\2\uffff\7\163\1\u0085\2\163\12\uffff"+
		"\1\123\2\uffff\11\163\2\uffff\1\163\2\uffff\1\u0096\11\uffff\1\u00a1\1"+
		"\163\2\uffff\6\163\3\uffff\1\163\1\u00ac\6\163\1\uffff\2\163\3\u00b5\1"+
		"\uffff\12\163\1\uffff\1\u00c3\1\u00c4\11\uffff\1\163\23\uffff\1\u00b5"+
		"\12\uffff\1\172\16\uffff\1\u00f4\2\uffff\1\u00f7\2\uffff\1\u00fa\4\uffff"+
		"\1\u00fe\2\uffff\1\u00b5\11\uffff\1\54\1\u0108\3\uffff\1\u010c\1\uffff"+
		"\1\u010f\3\uffff\1\u0113\4\uffff\1\u0116\6\uffff\1\u011b\2\uffff\1\120"+
		"\16\uffff\1\u012c\21\uffff\1\172\1\u0108\11\uffff\1\172\1\u0141\1\u0142"+
		"\1\u0143\4\uffff\1\120\1\172\14\uffff\1\u0151\4\uffff\1\u0157\2\uffff"+
		"\1\u015a\6\uffff\1\u0160\2\141\13\uffff\1\141\1\u0163\1\uffff\1\u016b"+
		"\10\uffff\1\u0173\2\uffff\1\u0176\1\u0163\1\u0177\5\uffff\1\u017a\1\u017b"+
		"\2\uffff";
	static final String DFA39_eofS =
		"\u017c\uffff";
	static final String DFA39_minS =
		"\1\0\21\55\5\uffff\1\57\2\55\1\52\10\55\1\0\3\55\1\0\2\uffff\2\55\2\uffff"+
		"\12\55\1\uffff\22\55\7\uffff\1\60\1\uffff\1\60\1\55\2\uffff\11\55\2\uffff"+
		"\1\55\2\uffff\15\55\1\uffff\6\55\1\uffff\12\55\1\uffff\2\55\3\56\13\55"+
		"\1\uffff\12\55\1\uffff\12\55\1\uffff\10\55\1\uffff\1\56\14\55\2\uffff"+
		"\1\60\30\55\1\56\1\55\1\52\7\55\2\56\12\55\1\uffff\2\55\1\uffff\2\55\1"+
		"\uffff\3\55\1\uffff\3\55\1\56\4\55\1\60\1\uffff\3\55\1\uffff\2\55\1\uffff"+
		"\3\55\1\uffff\2\55\1\uffff\4\55\1\uffff\10\55\1\56\7\55\1\uffff\11\55"+
		"\1\56\12\55\3\uffff\15\55\1\uffff\4\55\1\52\1\uffff\2\55\1\uffff\5\55"+
		"\1\uffff\1\55\1\56\1\uffff\7\55\1\uffff\5\55\1\56\1\55\1\uffff\2\55\2"+
		"\uffff\2\55\2\uffff";
	static final String DFA39_maxS =
		"\1\uffff\21\172\5\uffff\1\57\2\172\1\57\10\172\1\uffff\3\172\1\uffff\2"+
		"\uffff\2\172\2\uffff\12\172\1\uffff\22\172\7\uffff\1\71\1\uffff\1\71\1"+
		"\172\2\uffff\11\172\2\uffff\1\172\2\uffff\15\172\1\uffff\6\172\1\uffff"+
		"\12\172\1\uffff\2\172\1\56\1\71\1\56\13\172\1\uffff\12\172\1\uffff\12"+
		"\172\1\uffff\10\172\1\uffff\1\71\14\172\2\uffff\31\172\1\71\11\172\1\56"+
		"\13\172\1\uffff\2\172\1\uffff\2\172\1\uffff\3\172\1\uffff\11\172\1\uffff"+
		"\3\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\1\uffff\4\172\1\uffff"+
		"\20\172\1\uffff\24\172\3\uffff\15\172\1\uffff\5\172\1\uffff\2\172\1\uffff"+
		"\5\172\1\uffff\2\172\1\uffff\7\172\1\uffff\7\172\1\uffff\2\172\2\uffff"+
		"\2\172\2\uffff";
	static final String DFA39_acceptS =
		"\22\uffff\1\37\1\40\1\41\1\42\1\43\21\uffff\1\63\1\64\2\uffff\1\55\1\50"+
		"\12\uffff\1\16\22\uffff\1\37\1\40\1\41\1\42\1\43\1\52\1\44\1\uffff\1\45"+
		"\2\uffff\1\62\1\47\11\uffff\1\51\1\56\1\uffff\1\61\1\63\15\uffff\1\60"+
		"\6\uffff\1\57\12\uffff\1\30\20\uffff\1\1\12\uffff\1\32\12\uffff\1\25\10"+
		"\uffff\1\54\15\uffff\1\2\1\3\57\uffff\1\36\2\uffff\1\21\2\uffff\1\24\3"+
		"\uffff\1\27\11\uffff\1\46\3\uffff\1\7\2\uffff\1\6\3\uffff\1\31\2\uffff"+
		"\1\22\4\uffff\1\34\20\uffff\1\17\24\uffff\1\20\1\23\1\33\15\uffff\1\26"+
		"\5\uffff\1\4\2\uffff\1\12\5\uffff\1\35\2\uffff\1\53\7\uffff\1\5\7\uffff"+
		"\1\15\2\uffff\1\10\1\11\2\uffff\1\13\1\14";
	static final String DFA39_specialS =
		"\1\0\42\uffff\1\1\3\uffff\1\2\u0154\uffff}>";
	static final String[] DFA39_transitionS = {
			"\11\51\2\50\2\51\1\50\22\51\1\50\6\51\1\47\1\43\1\51\1\27\1\51\1\23\1"+
			"\42\1\51\1\32\1\30\1\31\10\41\1\24\1\25\1\51\1\22\3\51\1\6\1\12\1\5\1"+
			"\13\2\46\1\1\1\3\7\46\1\2\4\46\1\4\5\46\6\51\1\16\1\11\1\10\1\44\1\45"+
			"\1\33\1\40\1\45\1\34\1\45\1\21\1\45\1\35\1\17\1\20\1\45\1\7\1\15\1\45"+
			"\1\36\1\14\1\37\4\45\1\51\1\26\uff83\51",
			"\1\55\1\uffff\1\54\12\53\7\uffff\4\53\1\52\25\53\6\uffff\32\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\16\53\1\56\13\53\6\uffff\32\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\23\53\1\60\6\53\6\uffff\16\53\1\57"+
			"\13\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\61\7\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\1\63\15\53\1\62\13\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\64\21\53\1\65"+
			"\5\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\16\67\1\66\13\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\7\67\1\71\3\67\1\73\1"+
			"\67\1\72\1\74\13\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\16\67\1\75\2\67\1\76"+
			"\10\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\1\77\31\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\100\21\53",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\21\67\1\102\1\101\7\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\4\67\1\103\25\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\13\67\1\104\3\67\1\105"+
			"\4\67\1\106\5\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\2\67\1\110\13\67\1\107"+
			"\13\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\17\67\1\111\12\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\4\67\1\112\25\67",
			"",
			"",
			"",
			"",
			"",
			"\1\120",
			"\1\55\1\122\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\55\1\124\1\54\12\125\7\uffff\32\53\6\uffff\32\53",
			"\1\126\4\uffff\1\126",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\16\67\1\130\13\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\3\67\1\132\10\67\1\131"+
			"\15\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\4\67\1\133\11\67\1\134"+
			"\5\67\1\135\5\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\4\67\1\136\25\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\10\67\1\137\21\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\31\67\1\140",
			"\1\55\1\141\1\54\12\125\7\uffff\32\53\6\uffff\32\53",
			"\1\55\2\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\50\142\1\uffff\uffd7\142",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\4\67\1\143\25\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\32\67",
			"\1\55\1\uffff\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\0\144",
			"",
			"",
			"\2\55\1\54\12\53\7\uffff\23\53\1\146\6\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"\2\55\1\54\12\53\7\uffff\22\53\1\147\7\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\150\7\53",
			"\2\55\1\54\12\53\7\uffff\23\53\1\151\6\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\152\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\153\1\154\13\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\155\27\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\156\27\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\157\6\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\17\161\1\160\12\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\161",
			"",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\1\164\3\161\1\165\25\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\16\161\1\166\13\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\16\161\1\167\13\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\14\161\1\170\15\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\24\161\1\171\5\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\161",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\173\7\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\6\53\1\174\23\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\4\161\1\175\25\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\10\161\1\176\21\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\1\177\21\161\1\u0080\7"+
			"\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\6\161\1\u0081\23\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\17\161\1\u0082\12\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\3\161\1\u0083\26\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\15\161\1\u0084\14\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u0086\31\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\4\161\1\u0087\25\161",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0088\11\u0089",
			"",
			"\1\u008a\11\141",
			"\1\55\1\u008b\1\54\12\125\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\15\161\1\u008c\14\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u008d\31\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\4\161\1\u008e\25\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\22\161\1\u008f\7\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\3\161\1\u0090\26\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\13\161\1\u0091\16\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\27\161\1\u0092\2\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\3\161\1\u0093\26\161",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\10\161\1\u0094\21\161",
			"",
			"",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\5\161\1\u0095\24\161",
			"",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\23\53\1\u0097\6\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0098\6\53",
			"\2\55\1\54\12\53\7\uffff\17\53\1\u0099\12\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u009a\10\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u009c\5\53\1\u009b\6"+
			"\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\12\53\1\u009d\17\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\7\53\1\u009e\22\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u009f\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\7\53\1\u00a0\22\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\uffff\12\55\7\uffff\32\u00a2\6\uffff\32\u00a2",
			"",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u00a3\10\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\14\53\1\u00a4\15\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u00a5\14\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u00a6\7\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\17\53\1\u00a7\12\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u00a8\14\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00a9\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00aa\25\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u00ab\10\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\13\53\1\u00ad\16\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\17\53\1\u00ae\12\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u00af\13\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\13\53\1\u00b0\16\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00b1\21\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\u00b2\27\53",
			"",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\20\53\1\u00b3\11\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\17\53\1\u00b4\12\53",
			"\1\141",
			"\1\141\1\uffff\12\u00b6",
			"\1\141",
			"\1\55\2\uffff\1\u00b7\11\u00b8\7\uffff\32\55\6\uffff\32\55",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u00b9\6\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\6\53\1\u00ba\23\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u00bb\14\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u00bc\7\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00bd\25\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u00be\6\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u00bf\6\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00c0\25\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\17\53\1\u00c1\12\53",
			"\1\162\1\55\1\54\12\53\7\uffff\32\53\6\uffff\13\53\1\u00c2\16\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\u00c5\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u00c6\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00c7\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00c8\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00c9\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00ca\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\17\53\1\u00cb\12\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u00cc\13\53",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\u00a2\6\uffff\32\u00a2",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u00cd\7\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00ce\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\u00cf\27\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00d0\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u00d1\10\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\3\53\1\u00d2\26\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\u00d3\27\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u00d4\7\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u00d5\14\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\14\53\1\u00d6\15\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u00d7\13\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u00d8\10\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00d9\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u00da\13\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00db\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\24\53\1\u00dc\5\53",
			"\1\u00dd\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\1\141\1\uffff\12\u00de",
			"\1\55\1\141\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\55\1\141\1\uffff\12\u00df\7\uffff\32\55\6\uffff\32\55",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00e1\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u00e2\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u00e3\31\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\13\53\1\u00e4\16\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00e5\21\53",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u00e6\13\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u00e7\31\53",
			"",
			"",
			"\1\54\1\u00e8\1\u00e9\7\54\7\uffff\32\54\6\uffff\32\54",
			"\2\55\1\uffff\12\55\7\uffff\1\u00ea\31\55\6\uffff\32\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u00eb\14\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\u00ec\27\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00ed\25\53",
			"\1\u00ee\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u00ef\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u00f0\10\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00f1\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\u00f2\27\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00f3\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00f5\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u00f6\31\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u00f8\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u00f9\31\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u00fb\14\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u00fc\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\2\53\1\u00fd\27\53",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u00ff\25\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\1\u0100\31\55",
			"\1\141\1\uffff\12\141",
			"\1\55\1\u0101\1\uffff\12\u00df\7\uffff\32\55\6\uffff\32\55",
			"\1\120\2\uffff\1\120\2\uffff\12\u0102\7\uffff\32\u0102\6\uffff\32\u0102",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u0103\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\6\53\1\u0104\23\53",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\17\53\1\u0105\12\53",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0106\6\53",
			"\1\u0107",
			"\1\54\1\uffff\12\54\7\uffff\32\54\6\uffff\32\54",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\6\55\1\u0109\23\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u010a\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u010b\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\uffff\12\55\7\uffff\2\55\1\u010d\27\55\6\uffff\32\55",
			"\1\u010e\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u0110\21\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0111\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u0112\31\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u0114\7\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u0115\10\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\14\53\1\u0117\15\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u0118\7\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0119\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u011a\31\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\13\55\1\u011c\16\55",
			"\1\55\2\uffff\1\u011d\11\u011e\7\uffff\32\55\6\uffff\32\55",
			"\1\u011f\1\uffff\12\u0102\7\uffff\32\u0102\6\uffff\32\u0102",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0120\6\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u0121\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u0122\31\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u0123\25\53",
			"\1\54\1\u0124\10\54\7\uffff\32\54\6\uffff\32\54",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\4\55\1\u0125\25\55",
			"\1\u0126\1\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u0127\21\53",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\16\55\1\u0128\13\55",
			"\2\55\1\uffff\12\55\7\uffff\4\55\1\u012a\6\55\1\u0129\16\55\6\uffff"+
			"\32\55",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\31\53\1\u012b",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\13\53\1\u012d\16\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\22\53\1\u012e\7\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\30\53\1\u012f\1\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u0130\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\4\53\1\u0131\25\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\7\53\1\u0132\22\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0133\6\53",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\10\55\1\u0134\21\55",
			"\1\55\1\141\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\55\1\141\1\uffff\12\u0135\7\uffff\32\55\6\uffff\32\55",
			"\1\120\2\uffff\12\u0136\7\uffff\32\u0136\6\uffff\32\u0136",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\30\53\1\u0137\1\53",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\21\53\1\u0138\10\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\54\1\uffff\12\54\7\uffff\32\54\6\uffff\32\54",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\15\55\1\u0139\14\55",
			"\2\55\1\uffff\12\55\7\uffff\13\55\1\u013b\7\55\1\u013a\6\55\6\uffff"+
			"\32\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u013c\13\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\15\55\1\u013d\14\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\1\u013e\31\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\15\55\1\u013f\14\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\1\u0140\31\53",
			"",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\14\53\1\u0144\15\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u0145\21\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\25\55\1\u0146\4\55",
			"\1\55\1\u0147\1\uffff\12\u0135\7\uffff\32\55\6\uffff\32\55",
			"\1\u011f\1\uffff\12\u0136\7\uffff\32\u0136\6\uffff\32\u0136",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0148\6\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\23\55\1\u0149\6\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\30\55\1\u014a\1\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\4\55\1\u014b\25\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u014c\14\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\23\55\1\u014d\6\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\15\55\1\u014e\14\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\2\55\1\u014f\27\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\23\53\1\u0150\6\53",
			"",
			"",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u0152\13\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\4\55\1\u0153\25\55",
			"\1\55\2\uffff\1\u0154\11\u0155\7\uffff\32\55\6\uffff\32\55",
			"\2\55\1\u0156\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\17\55\1\u0158\12\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\15\55\1\u0159\14\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\21\55\1\u015b\10\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\6\55\1\u015c\23\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\16\55\1\u015d\13\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\10\53\1\u015e\21\53",
			"",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u015f\14\53",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\55\2\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\55\2\uffff\12\u0161\7\uffff\32\55\6\uffff\32\55",
			"\1\u0163\2\uffff\1\u0163\2\uffff\12\u0162\7\uffff\32\u0162\6\uffff\32"+
			"\u0162",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\4\55\1\u0164\25\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\6\55\1\u0165\23\55",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\16\55\1\u0166\13\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\24\55\1\u0167\5\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\3\55\1\u0168\26\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\16\53\1\u0169\13\53",
			"\2\55\1\u00e0\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\2\55\1\uffff\12\u0161\7\uffff\32\55\6\uffff\32\55",
			"\1\u016a\1\uffff\12\u0162\7\uffff\32\u0162\6\uffff\32\u0162",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\23\55\1\u016c\6\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\13\55\1\u016d\16\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\1\u016e\31\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\10\55\1\u016f\21\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\15\53\1\u0170\14\53",
			"\1\u0163\2\uffff\12\u0171\7\uffff\32\u0171\6\uffff\32\u0171",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\7\55\1\u0172\22\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\6\55\1\u0174\23\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\15\55\1\u0175\14\55",
			"\2\55\1\54\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u016a\1\uffff\12\u0171\7\uffff\32\u0171\6\uffff\32\u0171",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\4\55\1\u0178\25\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\6\55\1\u0179\23\55",
			"",
			"",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"\2\55\1\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			""
	};

	static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
	static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
	static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
	static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
	static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
	static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
	static final short[][] DFA39_transition;

	static {
		int numStates = DFA39_transitionS.length;
		DFA39_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
		}
	}

	protected class DFA39 extends DFA {

		public DFA39(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 39;
			this.eot = DFA39_eot;
			this.eof = DFA39_eof;
			this.min = DFA39_min;
			this.max = DFA39_max;
			this.accept = DFA39_accept;
			this.special = DFA39_special;
			this.transition = DFA39_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GET | POST | HOST | USER_AGENT | CONTENT_TYPE | ACCEPT | COOKIE | AUTHORIZATION | CONTENT_LENGTH | CONNECTION | ACCEPT_LANGUAGE | ACCEPT_ENCODING | CACHE_CONTROL | Q | CHARSET | BOUNDARY | BASIC | DIGEST | USERNAME | REALM | URI | ALGORITHM | NONCE | NC | CNONCE | QOP | RESPONSE | OPAQUE | KEEP_ALIVE | CLOSE | EQUALS | COMMA | COLUMN | SEMI_COLUMN | TERMINAL | STAR | INT_NUM | HTTP_VERSION | PATH | DNS | IPV4 | MIME | MULTIPART_MIME | Q_VAL | PRODUCT | PRODUCT_INFO | ENCODING_ELEMENT | LANGUAGE_ELEMENT | STRING | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA39_0 = input.LA(1);
						s = -1;
						if ( (LA39_0=='G') ) {s = 1;}
						else if ( (LA39_0=='P') ) {s = 2;}
						else if ( (LA39_0=='H') ) {s = 3;}
						else if ( (LA39_0=='U') ) {s = 4;}
						else if ( (LA39_0=='C') ) {s = 5;}
						else if ( (LA39_0=='A') ) {s = 6;}
						else if ( (LA39_0=='q') ) {s = 7;}
						else if ( (LA39_0=='c') ) {s = 8;}
						else if ( (LA39_0=='b') ) {s = 9;}
						else if ( (LA39_0=='B') ) {s = 10;}
						else if ( (LA39_0=='D') ) {s = 11;}
						else if ( (LA39_0=='u') ) {s = 12;}
						else if ( (LA39_0=='r') ) {s = 13;}
						else if ( (LA39_0=='a') ) {s = 14;}
						else if ( (LA39_0=='n') ) {s = 15;}
						else if ( (LA39_0=='o') ) {s = 16;}
						else if ( (LA39_0=='k') ) {s = 17;}
						else if ( (LA39_0=='=') ) {s = 18;}
						else if ( (LA39_0==',') ) {s = 19;}
						else if ( (LA39_0==':') ) {s = 20;}
						else if ( (LA39_0==';') ) {s = 21;}
						else if ( (LA39_0=='|') ) {s = 22;}
						else if ( (LA39_0=='*') ) {s = 23;}
						else if ( (LA39_0=='0') ) {s = 24;}
						else if ( (LA39_0=='1') ) {s = 25;}
						else if ( (LA39_0=='/') ) {s = 26;}
						else if ( (LA39_0=='f') ) {s = 27;}
						else if ( (LA39_0=='i') ) {s = 28;}
						else if ( (LA39_0=='m') ) {s = 29;}
						else if ( (LA39_0=='t') ) {s = 30;}
						else if ( (LA39_0=='v') ) {s = 31;}
						else if ( (LA39_0=='g') ) {s = 32;}
						else if ( ((LA39_0 >= '2' && LA39_0 <= '9')) ) {s = 33;}
						else if ( (LA39_0=='-') ) {s = 34;}
						else if ( (LA39_0=='(') ) {s = 35;}
						else if ( (LA39_0=='d') ) {s = 36;}
						else if ( (LA39_0=='e'||LA39_0=='h'||LA39_0=='j'||LA39_0=='l'||LA39_0=='p'||LA39_0=='s'||(LA39_0 >= 'w' && LA39_0 <= 'z')) ) {s = 37;}
						else if ( ((LA39_0 >= 'E' && LA39_0 <= 'F')||(LA39_0 >= 'I' && LA39_0 <= 'O')||(LA39_0 >= 'Q' && LA39_0 <= 'T')||(LA39_0 >= 'V' && LA39_0 <= 'Z')) ) {s = 38;}
						else if ( (LA39_0=='\'') ) {s = 39;}
						else if ( ((LA39_0 >= '\t' && LA39_0 <= '\n')||LA39_0=='\r'||LA39_0==' ') ) {s = 40;}
						else if ( ((LA39_0 >= '\u0000' && LA39_0 <= '\b')||(LA39_0 >= '\u000B' && LA39_0 <= '\f')||(LA39_0 >= '\u000E' && LA39_0 <= '\u001F')||(LA39_0 >= '!' && LA39_0 <= '&')||LA39_0==')'||LA39_0=='+'||LA39_0=='.'||LA39_0=='<'||(LA39_0 >= '>' && LA39_0 <= '@')||(LA39_0 >= '[' && LA39_0 <= '`')||LA39_0=='{'||(LA39_0 >= '}' && LA39_0 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA39_35 = input.LA(1);
						s = -1;
						if ( ((LA39_35 >= '\u0000' && LA39_35 <= '\'')||(LA39_35 >= ')' && LA39_35 <= '\uFFFF')) ) {s = 98;}
						else s = 41;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA39_39 = input.LA(1);
						s = -1;
						if ( ((LA39_39 >= '\u0000' && LA39_39 <= '\uFFFF')) ) {s = 100;}
						else s = 41;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 39, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
