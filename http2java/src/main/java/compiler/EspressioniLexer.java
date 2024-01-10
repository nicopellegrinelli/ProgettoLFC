// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g 2023-12-18 17:53:47

package compiler; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class EspressioniLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int COMMENT=5;
	public static final int DIV=6;
	public static final int DOT=7;
	public static final int DOUBLE=8;
	public static final int EQ=9;
	public static final int ERROR_TOKEN=10;
	public static final int ID=11;
	public static final int LP=12;
	public static final int MUL=13;
	public static final int NUM=14;
	public static final int RP=15;
	public static final int SC=16;
	public static final int SUB=17;
	public static final int WS=18;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public EspressioniLexer() {} 
	public EspressioniLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public EspressioniLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g"; }

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:74:5: ( '+' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:74:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:75:5: ( '-' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:75:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:76:5: ( '*' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:76:7: '*'
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
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:77:5: ( '/' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:77:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:78:4: ( '(' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:78:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:79:4: ( ')' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:79:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:80:4: ( ';' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:80:6: ';'
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
	// $ANTLR end "SC"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:81:4: ( '.' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:81:6: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:82:3: ( '=' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:82:5: '='
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
	// $ANTLR end "EQ"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:83:7: ( 'double' )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:83:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:85:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:85:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:85:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop1;
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
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:88:5: ( ( '1' .. '9' ) ( '0' .. '9' )* ( DOT ( '0' .. '9' )+ )? )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:88:7: ( '1' .. '9' ) ( '0' .. '9' )* ( DOT ( '0' .. '9' )+ )?
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:88:18: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:
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
					break loop2;
				}
			}

			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:88:30: ( DOT ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:88:31: DOT ( '0' .. '9' )+
					{
					mDOT(); 

					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:88:35: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
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
	// $ANTLR end "NUM"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:92:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='/') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='/') ) {
					alt8=1;
				}
				else if ( (LA8_1=='*') ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:92:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:92:14: (~ ( '\\n' | '\\r' ) )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:
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
							break loop5;
						}
					}

					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:92:28: ( '\\r' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='\r') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:92:28: '\\r'
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
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:93:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:93:14: ( options {greedy=false; } : . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='*') ) {
							int LA7_1 = input.LA(2);
							if ( (LA7_1=='/') ) {
								alt7=2;
							}
							else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
								alt7=1;
							}

						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:93:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop7;
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
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:96:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:96:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:104:2: ( . )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:105:3: .
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
		// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:8: ( ADD | SUB | MUL | DIV | LP | RP | SC | DOT | EQ | DOUBLE | ID | NUM | COMMENT | WS | ERROR_TOKEN )
		int alt9=15;
		int LA9_0 = input.LA(1);
		if ( (LA9_0=='+') ) {
			alt9=1;
		}
		else if ( (LA9_0=='-') ) {
			alt9=2;
		}
		else if ( (LA9_0=='*') ) {
			alt9=3;
		}
		else if ( (LA9_0=='/') ) {
			int LA9_4 = input.LA(2);
			if ( (LA9_4=='*'||LA9_4=='/') ) {
				alt9=13;
			}

			else {
				alt9=4;
			}

		}
		else if ( (LA9_0=='(') ) {
			alt9=5;
		}
		else if ( (LA9_0==')') ) {
			alt9=6;
		}
		else if ( (LA9_0==';') ) {
			alt9=7;
		}
		else if ( (LA9_0=='.') ) {
			alt9=8;
		}
		else if ( (LA9_0=='=') ) {
			alt9=9;
		}
		else if ( (LA9_0=='d') ) {
			int LA9_10 = input.LA(2);
			if ( (LA9_10=='o') ) {
				int LA9_25 = input.LA(3);
				if ( (LA9_25=='u') ) {
					int LA9_29 = input.LA(4);
					if ( (LA9_29=='b') ) {
						int LA9_30 = input.LA(5);
						if ( (LA9_30=='l') ) {
							int LA9_31 = input.LA(6);
							if ( (LA9_31=='e') ) {
								int LA9_32 = input.LA(7);
								if ( ((LA9_32 >= '0' && LA9_32 <= '9')||(LA9_32 >= 'A' && LA9_32 <= 'Z')||LA9_32=='_'||(LA9_32 >= 'a' && LA9_32 <= 'z')) ) {
									alt9=11;
								}

								else {
									alt9=10;
								}

							}

							else {
								alt9=11;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

				}

				else {
					alt9=11;
				}

			}

			else {
				alt9=11;
			}

		}
		else if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'c')||(LA9_0 >= 'e' && LA9_0 <= 'z')) ) {
			alt9=11;
		}
		else if ( ((LA9_0 >= '1' && LA9_0 <= '9')) ) {
			alt9=12;
		}
		else if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
			alt9=14;
		}
		else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\b')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\u001F')||(LA9_0 >= '!' && LA9_0 <= '\'')||LA9_0==','||LA9_0=='0'||LA9_0==':'||LA9_0=='<'||(LA9_0 >= '>' && LA9_0 <= '@')||(LA9_0 >= '[' && LA9_0 <= '^')||LA9_0=='`'||(LA9_0 >= '{' && LA9_0 <= '\uFFFF')) ) {
			alt9=15;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 9, 0, input);
			throw nvae;
		}

		switch (alt9) {
			case 1 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:10: ADD
				{
				mADD(); 

				}
				break;
			case 2 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:14: SUB
				{
				mSUB(); 

				}
				break;
			case 3 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:18: MUL
				{
				mMUL(); 

				}
				break;
			case 4 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:22: DIV
				{
				mDIV(); 

				}
				break;
			case 5 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:26: LP
				{
				mLP(); 

				}
				break;
			case 6 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:29: RP
				{
				mRP(); 

				}
				break;
			case 7 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:32: SC
				{
				mSC(); 

				}
				break;
			case 8 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:35: DOT
				{
				mDOT(); 

				}
				break;
			case 9 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:39: EQ
				{
				mEQ(); 

				}
				break;
			case 10 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:42: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 11 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:49: ID
				{
				mID(); 

				}
				break;
			case 12 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:52: NUM
				{
				mNUM(); 

				}
				break;
			case 13 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:56: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 14 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:64: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:1:67: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}



}
