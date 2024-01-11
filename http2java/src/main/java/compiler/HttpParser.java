// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g 2024-01-11 16:56:18

package compiler; 		
import utils.Variable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HttpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMANUM", "COMMENT", "DOTNUM", 
		"ERROR_TOKEN", "ESC_SEQ", "GET", "HEX_DIGIT", "INTNUM", "NUM", "OCTAL_ESC", 
		"PATH", "PATH_ELEMENT", "POST", "QUERY_ELEMENT", "STRING", "UNICODE_ESC", 
		"VERSION", "WS", "'header'"
	};
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int COMMANUM=4;
	public static final int COMMENT=5;
	public static final int DOTNUM=6;
	public static final int ERROR_TOKEN=7;
	public static final int ESC_SEQ=8;
	public static final int GET=9;
	public static final int HEX_DIGIT=10;
	public static final int INTNUM=11;
	public static final int NUM=12;
	public static final int OCTAL_ESC=13;
	public static final int PATH=14;
	public static final int PATH_ELEMENT=15;
	public static final int POST=16;
	public static final int QUERY_ELEMENT=17;
	public static final int STRING=18;
	public static final int UNICODE_ESC=19;
	public static final int VERSION=20;
	public static final int WS=21;

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
		



	// $ANTLR start "request"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:31:1: request : requestLine ( header )* ( body )? ;
	public final void request() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:32:2: ( requestLine ( header )* ( body )? )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:33:3: requestLine ( header )* ( body )?
			{
			pushFollow(FOLLOW_requestLine_in_request61);
			requestLine();
			state._fsp--;

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:34:3: ( header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==22) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:34:3: header
					{
					pushFollow(FOLLOW_header_in_request65);
					header();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:35:3: ( body )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==STRING) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:35:3: body
					{
					pushFollow(FOLLOW_body_in_request70);
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:38:1: requestLine : method PATH VERSION ;
	public final void requestLine() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:39:2: ( method PATH VERSION )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:40:3: method PATH VERSION
			{
			pushFollow(FOLLOW_method_in_requestLine85);
			method();
			state._fsp--;

			match(input,PATH,FOLLOW_PATH_in_requestLine89); 
			match(input,VERSION,FOLLOW_VERSION_in_requestLine93); 
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:45:1: method : ( GET | POST );
	public final void method() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:46:2: ( GET | POST )
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
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:51:1: header : 'header' ;
	public final void header() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:52:2: ( 'header' )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:53:3: 'header'
			{
			match(input,22,FOLLOW_22_in_header128); 
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



	// $ANTLR start "body"
	// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:56:1: body : STRING ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:57:2: ( STRING )
			// C:\\Users\\lenovo\\Desktop\\ProgettiGit\\ProgettoLFC\\http2java\\src\\main\\java\\compiler\\Http.g:58:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_body141); 
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



	public static final BitSet FOLLOW_requestLine_in_request61 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_header_in_request65 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_body_in_request70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_requestLine85 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PATH_in_requestLine89 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_VERSION_in_requestLine93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_header128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_body141 = new BitSet(new long[]{0x0000000000000002L});
}
