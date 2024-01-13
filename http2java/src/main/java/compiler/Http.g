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
	
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		System.err.println(hdr + " -- " + msg);
	}
	
}

/* ***********************************************
			Syntactic Rules
************************************************** */ 

// The 1st rule is the axiom
request
	:	requestLine
		(header)*
		(body)?
	;
	
requestLine
	:	method
		PATH
		VERSION
		TERMINAL
	;

method
	:	GET
	|	POST
	;
	
header
	:	hostRule
	|	userAgentRule
	|	contentTypeRule
	|	acceptRule
	|	cookieRule
	|	authorizationRule
	;
	
	
hostRule
	:	HOST COLUMN 
		(DNS | IPV4)
		(COLUMN INT_NUM)?
		TERMINAL
	;
	
userAgentRule
	:	USER_AGENT COLUMN
		productOrPlatformRule
		(productOrPlatformRule
		extensionRule*)?
		TERMINAL
	;
	
productOrPlatformRule
	:	UA_ELEMENT UA_INFO?
	;
	
extensionRule
	:	UA_ELEMENT
	;
	
acceptRule
	:	ACCEPT COLUMN
		mimeList
		TERMINAL
	;
	
mimeList
	:	mimeElement
		(COMMA mimeElement)*
	;
	
mimeElement
	:	MIME (qValueRule)?
	;
	
contentTypeRule
	:	CONTENT_TYPE COLUMN
		(MIME charsetRule?
		|MULTIPART_MIME boundaryRule)
		TERMINAL
	;
		
cookieRule
	:	COOKIE COLUMN
		cookieList
		TERMINAL
	;
	
cookieList
	:	cookieElement
		(SEMI_COLUMN cookieElement)* 
	;
	
cookieElement
	:	STRING EQUALS STRING
	;
	
qValueRule
	:	SEMI_COLUMN Q EQUALS Q_VAL
	;
	
charsetRule
	:	SEMI_COLUMN CHARSET EQUALS STRING
	;
	
boundaryRule
	:	SEMI_COLUMN BOUNDARY EQUALS STRING
	;
	
authorizationRule
	:	AUTHORIZATION COLUMN
		(basicAuthRule
		|digestAuthRule)
		TERMINAL
	;
	
basicAuthRule
	:	BASIC STRING
	;
	
digestAuthRule
	:	DIGEST
		authRule
		(COMMA	authRule)*
	;
	
authRule
	:	(USERNAME	
	|	REALM
	|	URI	
	|	ALGORITHM
	|	NONCE
	|	NC
	|	CNONCE
	|	QOP
	|	RESPONSE
	|	OPAQUE
	)	EQUALS STRING
	;

body
	:	STRING
		TERMINAL
	;

/* ***********************************************
			Tokens defintion
************************************************** */ 
GET				: 'GET'				;
POST				: 'POST'				;
HOST				: 'Host'				;
USER_AGENT		: 'User-Agent'		;
CONTENT_TYPE		: 'Content-Type'		;
ACCEPT			: 'Accept'			;
COOKIE			: 'Cookie'			;
AUTHORIZATION	: 'Authorization'	;
Q				: 'q'				;
CHARSET			: 'charset'			;
BOUNDARY			: 'boundary'			;
BASIC			: 'Basic'			;
DIGEST			: 'Digest'			;
USERNAME			: 'username'			;
REALM			: 'realm'			;
URI				: 'uri'				;
ALGORITHM		: 'algorithm'		;
NONCE			: 'nonce'			;
NC				: 'nc'				;
CNONCE			: 'cnonce'			;
QOP				: 'qop'				;
RESPONSE			: 'response'			;
OPAQUE			: 'opaque'			;
EQUALS			: '='				;
COMMA			: ',' 				;
COLUMN			: ':'				;
SEMI_COLUMN		: ';'				;
TERMINAL			: '|'				;

INT_NUM	
	:	NUM
	;
	
VERSION
	:	'HTTP/' ('1.0'
				|'1.1'
				|'2'
				|'3')
	;

PATH
	:	('/' | ('/' PATH_ELEMENT)+ '/'?) ('?' QUERY_ELEMENT ('&' QUERY_ELEMENT)*)?
	;
	
DNS
	:	DNS_ELEMENT ('.' DNS_ELEMENT)* ('.' ALPHA_CHAR ALPHA_CHAR+)
	;
	
IPV4
	:	NUM '.' NUM '.' NUM '.' NUM
	;
	
MIME
	:	MIME_TYPE '/' MIME_SUBTYPE
	|	'*/*'
	;
	
MULTIPART_MIME
	:	'multipart/' MIME_SUBTYPE
	;
	
Q_VAL
	:	'0' '.' (('0'..'9') 
				|('0'..'9') ('0'..'9')
				|('0'..'9') ('0'..'9') ('0'..'9'))
	|	'1.0'
	;
	
UA_ELEMENT
	:	(ALPHA_NUM_CHAR | ',')+ '/' VERS_NUM
	;
	
UA_INFO
	:	'(' (~('('|')'))* ')'
	;

STRING
    :	'\'' (ESC_SEQ | ~('\\'|'\''))* '\''
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
VERS_NUM	
	:	ALPHA_NUM_CHAR+ ('.' ALPHA_NUM_CHAR+)*
	;
	
fragment
DNS_ELEMENT
	:	(ALPHA_NUM_CHAR | '-') (ALPHA_NUM_CHAR | '-')+
	;

fragment
PATH_ELEMENT
	:	(ALPHA_NUM_CHAR
	|	'.' | '~' | '-' | '_'
	|	'%' HEX_DIGIT HEX_DIGIT)+
	;
	
fragment
QUERY_ELEMENT
	:	PATH_ELEMENT '=' PATH_ELEMENT
	;

fragment
MIME_TYPE
	:	'application'
	|	'audio'
	|	'chemical'
	|	'font'
	|	'image'
	|	'message'
	|	'model'
	|	'text'
	|	'video'
	;	

fragment
MIME_SUBTYPE
	:	(ALPHA_NUM_CHAR | '-')+ ('.' (ALPHA_NUM_CHAR | '-')+)* ('+' ALPHA_CHAR+)?
	|	'*'
	;
	
fragment 
NUM	
	:	'0'
	|	('1'..'9')('0'..'9')*
	;

fragment
ALPHA_CHAR
	:	('a'..'z')
	|	('A'..'Z')
	;
	
fragment
ALPHA_NUM_CHAR
	:	('0'..'9')
	|	ALPHA_CHAR
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
