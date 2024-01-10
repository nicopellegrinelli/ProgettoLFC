grammar Espressioni;

options {
  language = Java;
  k = 1;		
}

@header{
package myCompilerPackage; 		
import util.Variable;
}

@lexer::header{
package myCompilerPackage; 	
}

@members{
	SemanticHandler h = new SemanticHandler();
	
	public SemanticHandler getHandler() {
		return h;
	}
	
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		// in tokenNames c'è la lista dei token che si sarebbe voluto trovare
		// token che genera l'errore
		Token tk = input.LT(1);
		// header e corpo dell'errore gestito automaticamente da ANTLR
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		
		// passo tutto all'handler che lo 
		h.handleError(tokenNames, tk, e, hdr, msg);
	}
	
}

/* ***********************************************
			Syntactic Rule definition starts here
************************************************** */ 

// The 1st rule is the axiom
axiom
	:
	  (DOUBLE? id=ID EQ e=expr { h.addExpression($id, e); } SC)+
	;

expr returns [Variable res]
	:
	  t1=term { res = t1; }
	  ((op=ADD | op=SUB)
	  t2=term { res = h.update(res, t2, $op); }
	  )*
	;
	
term returns [Variable res]
	:
	  f1=fact { res = f1; }
	  ((op=MUL | op=DIV)
	  f2=fact { res = h.update(res, f2, $op); }
	  )*
	;

fact returns [Variable res]
	:
	    num=NUM { res = h.setFactToNum($num); }
	  | id=ID { res = h.setFactToId($id); }
	  | LP e=expr { res = e; } RP 
	  
	;
/* ***********************************************
			Tokens defintion part starts here
************************************************** */ 
ADD	: '+' ;
SUB	: '-' ;
MUL : '*' ;
DIV : '/' ;
LP : '(' ;
RP : ')' ;
SC : ';' ;
DOT: '.' ;
EQ: '=' ;
DOUBLE: 'double' ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
    
NUM :	('1'..'9') ('0'..'9')* (DOT ('0'..'9')+)?
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
ERROR_TOKEN
	:
		.
	;
