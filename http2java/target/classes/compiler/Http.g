grammar Http;

options {
  language = Java;
  k = 2;		
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
		pathRule
		HTTP_VERSION
		TERMINAL
	;

pathRule
	:	PATH
	|	STRING
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
	|	contentLengthRule
	|	connectionRule
	|	acceptLanguageRule
	|	acceptEncodingRule
	|	chacheControlRule
	|	genericHeaderRule
	;
	
	
hostRule
	:	HOST COLUMN 
		(DNS | IPV4)
		(COLUMN INT_NUM)?
		TERMINAL
	;
	
userAgentRule
	:	USER_AGENT COLUMN
		productRule
		(productRule
		extensionRule*)?
		TERMINAL
	;
	
productRule
	:	PRODUCT PRODUCT_INFO?
	;
	
extensionRule
	:	PRODUCT
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
	:	MIME qValueRule?
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

contentLengthRule
	:	CONTENT_LENGTH COLUMN
		INT_NUM
		TERMINAL
	;
	
connectionRule
	:	CONNECTION COLUMN
		(KEEP_ALIVE | CLOSE)
		TERMINAL
	;
	
acceptLanguageRule
	:	ACCEPT_LANGUAGE COLUMN
		languageList
		TERMINAL
	;
	
languageList
	:	languageElement
		(COMMA languageElement)* 
	;
	
languageElement
	:	(LANGUAGE_ELEMENT|STAR)
		qValueRule?
	;
	
acceptEncodingRule
	:	ACCEPT_ENCODING COLUMN
		encodingList
		TERMINAL
	;
	
encodingList
	:	encodingElement
		(COMMA encodingElement)* 
	;
	
encodingElement
	:	(ENCODING_ELEMENT|STAR)
		qValueRule?
	;
	
chacheControlRule
	:	CACHE_CONTROL COLUMN
		STRING (COMMA STRING)*
		TERMINAL
	;
	
genericHeaderRule
	:	STRING COLUMN STRING
		TERMINAL
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
CONTENT_LENGTH	: 'Content-Length'	;
CONNECTION		: 'Connection'		;
ACCEPT_LANGUAGE	: 'Accept-Language'	;
ACCEPT_ENCODING	: 'Accept-Encoding'	;
CACHE_CONTROL	: 'Cache-Control'	;
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
KEEP_ALIVE		: 'keep-alive'		;
CLOSE			: 'close'			;
EQUALS			: '='				;
COMMA			: ',' 				;
COLUMN			: ':'				;
SEMI_COLUMN		: ';'				;
TERMINAL			: '|'				;
STAR				: '*'				;

INT_NUM	
	:	NUM
	;
	
HTTP_VERSION
	:	'HTTP/' ('1.1'
				|'2')
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
	
PRODUCT
	:	ALPHA_NUM_CHAR+ '/' VERS_NUM
	;
	
PRODUCT_INFO
	:	'(' (~('('|')'))* ')'
	;
	
ENCODING_ELEMENT
	:	'gzip'
	|	'compress'
	|	'deflate'
	|	'br'
	|	'identity'
	;

LANGUAGE_ELEMENT
	:	('a'..'z')('a'..'z')('a'..'z')? ('-' ALPHA_CHAR+)?
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
	|	'%' HEX_DIGIT HEX_DIGIT
	)+
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
