// $ANTLR 3.5.1 C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g 2023-12-18 17:53:47

package compiler; 		
import org.antlr.runtime.*;

import utils.Variable;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class EspressioniParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "COMMENT", "DIV", "DOT", 
		"DOUBLE", "EQ", "ERROR_TOKEN", "ID", "LP", "MUL", "NUM", "RP", "SC", "SUB", 
		"WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public EspressioniParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public EspressioniParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return EspressioniParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g"; }


		SemanticHandler h = new SemanticHandler();
		
		public SemanticHandler getHandler() {
			return h;
		}
		
		public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			// in tokenNames c'� la lista dei token che si sarebbe voluto trovare
			// token che genera l'errore
			Token tk = input.LT(1);
			// header e corpo dell'errore gestito automaticamente da ANTLR
			String hdr = getErrorHeader(e);
			String msg = getErrorMessage(e, tokenNames);
			
			// passo tutto all'handler che lo 
			h.handleError(tokenNames, tk, e, hdr, msg);
		}
		



	// $ANTLR start "axiom"
	// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:43:1: axiom : ( ( DOUBLE )? id= ID EQ e= expr SC )+ ;
	public final void axiom() throws RecognitionException {
		Token id=null;
		Variable e =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:44:2: ( ( ( DOUBLE )? id= ID EQ e= expr SC )+ )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:45:4: ( ( DOUBLE )? id= ID EQ e= expr SC )+
			{
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:45:4: ( ( DOUBLE )? id= ID EQ e= expr SC )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DOUBLE||LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:45:5: ( DOUBLE )? id= ID EQ e= expr SC
					{
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:45:5: ( DOUBLE )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DOUBLE) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:45:5: DOUBLE
							{
							match(input,DOUBLE,FOLLOW_DOUBLE_in_axiom63); 
							}
							break;

					}

					id=(Token)match(input,ID,FOLLOW_ID_in_axiom68); 
					match(input,EQ,FOLLOW_EQ_in_axiom70); 
					pushFollow(FOLLOW_expr_in_axiom74);
					e=expr();
					state._fsp--;

					 h.addExpression(id, e); 
					match(input,SC,FOLLOW_SC_in_axiom78); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
	// $ANTLR end "axiom"



	// $ANTLR start "expr"
	// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:48:1: expr returns [Variable res] : t1= term ( (op= ADD |op= SUB ) t2= term )* ;
	public final Variable expr() throws RecognitionException {
		Variable res = null;


		Token op=null;
		Variable t1 =null;
		Variable t2 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:49:2: (t1= term ( (op= ADD |op= SUB ) t2= term )* )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:50:4: t1= term ( (op= ADD |op= SUB ) t2= term )*
			{
			pushFollow(FOLLOW_term_in_expr100);
			t1=term();
			state._fsp--;

			 res = t1; 
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:51:4: ( (op= ADD |op= SUB ) t2= term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADD||LA4_0==SUB) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:51:5: (op= ADD |op= SUB ) t2= term
					{
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:51:5: (op= ADD |op= SUB )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ADD) ) {
						alt3=1;
					}
					else if ( (LA3_0==SUB) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:51:6: op= ADD
							{
							op=(Token)match(input,ADD,FOLLOW_ADD_in_expr111); 
							}
							break;
						case 2 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:51:15: op= SUB
							{
							op=(Token)match(input,SUB,FOLLOW_SUB_in_expr117); 
							}
							break;

					}

					pushFollow(FOLLOW_term_in_expr125);
					t2=term();
					state._fsp--;

					 res = h.update(res, t2, op); 
					}
					break;

				default :
					break loop4;
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
		return res;
	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:56:1: term returns [Variable res] : f1= fact ( (op= MUL |op= DIV ) f2= fact )* ;
	public final Variable term() throws RecognitionException {
		Variable res = null;


		Token op=null;
		Variable f1 =null;
		Variable f2 =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:57:2: (f1= fact ( (op= MUL |op= DIV ) f2= fact )* )
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:58:4: f1= fact ( (op= MUL |op= DIV ) f2= fact )*
			{
			pushFollow(FOLLOW_fact_in_term154);
			f1=fact();
			state._fsp--;

			 res = f1; 
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:59:4: ( (op= MUL |op= DIV ) f2= fact )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||LA6_0==MUL) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:59:5: (op= MUL |op= DIV ) f2= fact
					{
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:59:5: (op= MUL |op= DIV )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==MUL) ) {
						alt5=1;
					}
					else if ( (LA5_0==DIV) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:59:6: op= MUL
							{
							op=(Token)match(input,MUL,FOLLOW_MUL_in_term165); 
							}
							break;
						case 2 :
							// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:59:15: op= DIV
							{
							op=(Token)match(input,DIV,FOLLOW_DIV_in_term171); 
							}
							break;

					}

					pushFollow(FOLLOW_fact_in_term179);
					f2=fact();
					state._fsp--;

					 res = h.update(res, f2, op); 
					}
					break;

				default :
					break loop6;
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
		return res;
	}
	// $ANTLR end "term"



	// $ANTLR start "fact"
	// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:64:1: fact returns [Variable res] : (num= NUM |id= ID | LP e= expr RP );
	public final Variable fact() throws RecognitionException {
		Variable res = null;


		Token num=null;
		Token id=null;
		Variable e =null;

		try {
			// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:65:2: (num= NUM |id= ID | LP e= expr RP )
			int alt7=3;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt7=1;
				}
				break;
			case ID:
				{
				alt7=2;
				}
				break;
			case LP:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:66:6: num= NUM
					{
					num=(Token)match(input,NUM,FOLLOW_NUM_in_fact209); 
					 res = h.setFactToNum(num); 
					}
					break;
				case 2 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:67:6: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_fact220); 
					 res = h.setFactToId(id); 
					}
					break;
				case 3 :
					// C:\\Users\\lenovo\\Desktop\\UniBG\\Linguaggi Formali e Compilatori\\NotazionePolacca\\src\\myCompilerPackage\\Espressioni.g:68:6: LP e= expr RP
					{
					match(input,LP,FOLLOW_LP_in_fact229); 
					pushFollow(FOLLOW_expr_in_fact233);
					e=expr();
					state._fsp--;

					 res = e; 
					match(input,RP,FOLLOW_RP_in_fact237); 
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
		return res;
	}
	// $ANTLR end "fact"

	// Delegated rules



	public static final BitSet FOLLOW_DOUBLE_in_axiom63 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_axiom68 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EQ_in_axiom70 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_expr_in_axiom74 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_SC_in_axiom78 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_term_in_expr100 = new BitSet(new long[]{0x0000000000020012L});
	public static final BitSet FOLLOW_ADD_in_expr111 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_SUB_in_expr117 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_term_in_expr125 = new BitSet(new long[]{0x0000000000020012L});
	public static final BitSet FOLLOW_fact_in_term154 = new BitSet(new long[]{0x0000000000002042L});
	public static final BitSet FOLLOW_MUL_in_term165 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_DIV_in_term171 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_fact_in_term179 = new BitSet(new long[]{0x0000000000002042L});
	public static final BitSet FOLLOW_NUM_in_fact209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fact220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_fact229 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_expr_in_fact233 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_fact237 = new BitSet(new long[]{0x0000000000000002L});
}
