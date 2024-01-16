package utils;

import org.antlr.runtime.Token;

public class Header {
	private Token key;
	private String value;

	public Header(Token k, String v) {
		key = k;
		value = v;
	}

	public Token getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}
