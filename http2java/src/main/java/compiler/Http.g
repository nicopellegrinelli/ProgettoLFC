grammar Http;

options {
 	language = Java;
 	k = 2;		
}

@header{
	package compiler; 		
	import utils.*;
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
	:	rl=requestLine { h.addRequestLine(rl); }
		(hdr=header { h.addHeader(hdr); })*
		(b=body { h.addBody(b); })?
		{ h.generateJavaCode(); }
	;
	
requestLine returns[RequestLine rl]
	:	m=method
		p=pathRule
		v=HTTP_VERSION
		TERMINAL { rl = h.createRequestLine(m, p, $v.getText()); }
	;

pathRule returns[String p]
	:	(s=PATH
	|	s=STRING) { p = $s.getText(); }
	;

method returns[String m]
	:	(s=GET
	|	s=POST) { m = $s.getText(); }
	;
	
header returns[Header hdr]
	:	(hd=hostRule
	|	hd=userAgentRule
	|	hd=contentTypeRule
	|	hd=acceptRule
	|	hd=cookieRule
	|	hd=authorizationRule
	|	hd=contentLengthRule
	|	hd=connectionRule
	|	hd=acceptLanguageRule
	|	hd=acceptEncodingRule
	|	hd=chacheControlRule
	|	hd=genericHeaderRule) { hdr = hd;}
	;
	
	
hostRule returns[Header hd]
	:	{ String value = ""; }
		k=HOST COLUMN 
		(v=(DNS | IPV4) { value = $v.getText(); })
		((c=COLUMN n=INT_NUM) { value += $c.getText() + $n.getText(); })?
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
userAgentRule returns[Header hd]
	:	{ String value = ""; }
		k=USER_AGENT COLUMN
		p=productRule { value = p; }
		(p1=productRule { value += " " + p1; }
		(e=extensionRule { value += " " + e; })*)?
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
productRule returns[String s]
	:	p=PRODUCT { s = $p.getText(); }
		(pi=PRODUCT_INFO { s += " " + $pi.getText();})?
	;
	
extensionRule returns[String s]
	:	p=PRODUCT { s = $p.getText(); }
	;
	
acceptRule returns[Header hd]
	:	k=ACCEPT COLUMN
		value=mimeList
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
mimeList returns[String s]
	:	m=mimeElement { s = m; }
		(c=COMMA m1=mimeElement { s += $c.getText() + " " + m1; })*
	;
	
mimeElement returns[String s]
	:	m=MIME { s = $m.getText();}
		(q=qValueRule { s += q; })? 
	;
	
contentTypeRule returns[Header hd]
	:	{ String value = ""; }
		k=CONTENT_TYPE COLUMN
		(m=MIME { value = $m.getText(); } (cs=charsetRule { value += cs; })?
		|m=MULTIPART_MIME b=boundaryRule { value = $m.getText() + b; } )
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
charsetRule returns[String s]
	:	sc=SEMI_COLUMN cs=CHARSET e=EQUALS str=STRING 
		{ s = $sc.getText() + " " + $cs.getText() + $e.getText() + h.substituteSingleQuote($str.getText(), ""); }
	;
	
boundaryRule returns[String s]
	:	sc=SEMI_COLUMN b=BOUNDARY e=EQUALS str=STRING
		{ s = $sc.getText() + " " + $b.getText() + $e.getText() + h.substituteSingleQuote($str.getText(), ""); }
	;
		
cookieRule returns[Header hd]
	:	k=COOKIE COLUMN
		value=cookieList
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
cookieList returns[String s]
	:	ce=cookieElement { s = ce; }
		(sc=SEMI_COLUMN ce1=cookieElement { s += $sc.getText() + " " + ce1; })* 
	;
	
cookieElement returns[String s]
	:	str1=STRING e=EQUALS str2=STRING
		{ s = h.substituteSingleQuote($str1.getText(), "") + $e.getText() + h.substituteSingleQuote($str2.getText(), ""); }
	;
	
qValueRule returns[String s]
	:	sc=SEMI_COLUMN q=Q e=EQUALS qv=Q_VAL 
		{ s = $sc.getText() + $q.getText() + $e.getText() + $qv.getText(); }
	;
	
authorizationRule returns[Header hd]
	:	k=AUTHORIZATION COLUMN
		(value=basicAuthRule
		| value=digestAuthRule)
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
basicAuthRule returns[String s]
	:	b=BASIC str=STRING
		{ s = $b.getText() + " " + h.substituteSingleQuote($str.getText(), ""); }
	;
	
digestAuthRule returns[String s]
	:	d=DIGEST { s = $d.getText(); }
		a=authRule { s += " " + a; }
		(c=COMMA a1=authRule { s += $c.getText() + " " + a1; })*
	;
	
authRule returns[String s]
	:	{ String substituter = "\\\\\""; }	
	(t=USERNAME	
	|	t=REALM
	|	t=URI	
	|	t=ALGORITHM { substituter = ""; }
	|	t=NONCE
	|	t=NC { substituter = ""; }
	|	t=CNONCE
	|	t=QOP { substituter = ""; }
	|	t=RESPONSE
	|	t=OPAQUE)	
	e=EQUALS str=STRING
	{ s = $t.getText() + $e.getText() + h.substituteSingleQuote($str.getText(), substituter); }
	;

contentLengthRule returns[Header hd]
	:	k=CONTENT_LENGTH COLUMN
		value=INT_NUM
		TERMINAL { hd = new Header($k.getText(), $value.getText()); }
	;
	
connectionRule returns[Header hd]
	:	k=CONNECTION COLUMN
		(value=KEEP_ALIVE | value=CLOSE)
		TERMINAL { hd = new Header($k.getText(), $value.getText()); }
	;
	
acceptLanguageRule returns[Header hd]
	:	k=ACCEPT_LANGUAGE COLUMN
		value=languageList
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
languageList returns[String s]
	:	le=languageElement { s = le; }
		(c=COMMA le1=languageElement { s += $c.getText() + " " + le1; })* 
	;
	
languageElement returns[String s]
	:	(le=LANGUAGE_ELEMENT|le=STAR) { s = $le.getText(); }
		(q=qValueRule { s += q; })?
	;
	
acceptEncodingRule returns[Header hd]
	:	k=ACCEPT_ENCODING COLUMN
		value=encodingList
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
encodingList returns[String s]
	:	ee=encodingElement { s = ee; }
		(c=COMMA ee1=encodingElement { s += $c.getText() + " " + ee1; })* 
	;
	
encodingElement returns[String s]
	:	(ee=ENCODING_ELEMENT|ee=STAR) { s = ee.getText(); }
		(q=qValueRule { s += q; })?
	;
	
chacheControlRule returns[Header hd]
	:	{ String value = ""; }
		k=CACHE_CONTROL COLUMN
		str=STRING { value = h.substituteSingleQuote($str.getText(), ""); }
		(c=COMMA str1=STRING { value += h.substituteSingleQuote($c.getText(), "") + " " + h.substituteSingleQuote($str1.getText(), ""); })*
		TERMINAL { hd = new Header($k.getText(), value); }
	;
	
genericHeaderRule returns[Header hd]
	:	k=STRING COLUMN value=STRING
		TERMINAL { hd = new Header(h.substituteSingleQuote($k.getText(), ""), h.substituteSingleQuote($value.getText(), "")); }
	;

body returns[String s]
	:	str=STRING
		TERMINAL { s = h.substituteSingleQuote($str.getText(), ""); }
	;

/* ***********************************************
			Tokens defintion
************************************************** */ 
GET					: 'GET'				;
POST					: 'POST'				;
HOST					: 'Host'				;
USER_AGENT			: 'User-Agent'		;
CONTENT_TYPE		: 'Content-Type'		;
ACCEPT				: 'Accept'			;
COOKIE				: 'Cookie'			;
AUTHORIZATION		: 'Authorization'	;
CONTENT_LENGTH		: 'Content-Length'	;
CONNECTION			: 'Connection'		;
ACCEPT_LANGUAGE	: 'Accept-Language'	;
ACCEPT_ENCODING	: 'Accept-Encoding'	;
CACHE_CONTROL		: 'Cache-Control'	;
Q						: 'q'				;
CHARSET				: 'charset'			;
BOUNDARY				: 'boundary'			;
BASIC					: 'Basic'			;
DIGEST				: 'Digest'			;
USERNAME				: 'username'			;
REALM					: 'realm'			;
URI					: 'uri'				;
ALGORITHM			: 'algorithm'		;
NONCE					: 'nonce'			;
NC						: 'nc'				;
CNONCE				: 'cnonce'			;
QOP					: 'qop'				;
RESPONSE				: 'response'			;
OPAQUE				: 'opaque'			;
KEEP_ALIVE			: 'keep-alive'		;
CLOSE					: 'close'			;
EQUALS				: '='				;
COMMA					: ',' 				;
COLUMN				: ':'				;
SEMI_COLUMN			: ';'				;
TERMINAL				: '|'				;
STAR					: '*'				;

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
