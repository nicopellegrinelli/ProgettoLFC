grammar Http;

options {
  language = Java;
  k = 1;		
}

@header{
package compiler; 		
import utils.Variable;
}

@lexer::header{
package compiler; 	
}

@members{
	SemanticHandler h = new SemanticHandler();
	
	public SemanticHandler getHandler() {
		return h;
	}
	
}

/* ***********************************************
			Syntactic Rule definition starts here
************************************************** */ 

// The 1st rule is the axiom
request
	:
		requestLine
		header*
		body?
	;
	
requestLine
	:
		method
		PATH
		VERSION
	;

method
	:
		  GET
		| POST
	;
	
header
	:
		'header'
	;

body
	:
		STRING
	;

/* ***********************************************
			Tokens defintion part starts here
************************************************** */ 
GET		: 'GET' ;
POST		: 'POST' ;
		
INTNUM	
	:	NUM
	;

DOTNUM	
	:	NUM ('.' NUM)+
	;
		
COMMANUM	
	:	NUM ',' ('0'..'9')+
	;

VERSION
	: 'HTTP/' DOTNUM
	;

PATH
	:	('/' | ('/' PATH_ELEMENT)+ '/'?) ('?' QUERY_ELEMENT ('&' QUERY_ELEMENT)*)?
	;

STRING
    :	'"' (ESC_SEQ | ~('\\'|'"'))* '"'
    ;

COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;

WS
	:	(' '
	|	'\t'
	|	'\r'
	|	'\n'
	)	{$channel=HIDDEN;}
	;

fragment 
NUM	
	:	'0'
	|	('1'..'9')('0'..'9')*
	;
	
fragment
PATH_ELEMENT
	:	(('0'..'9')
	|	('a'..'z')
	|	('A'..'Z')
	|	'.' | '~' | '-' | '_'
	|	'%' HEX_DIGIT HEX_DIGIT)+
	;
	
fragment
QUERY_ELEMENT
	:	PATH_ELEMENT '=' PATH_ELEMENT
	;

fragment
ESC_SEQ
    :	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |	UNICODE_ESC
    |	OCTAL_ESC
    ;
    
fragment
OCTAL_ESC
    :	'\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |	'\\' ('0'..'7') ('0'..'7')
    |	'\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :	'\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment
HEX_DIGIT 
	:	('0'..'9'|'a'..'f'|'A'..'F')
	;

ERROR_TOKEN
	:	.
	;
