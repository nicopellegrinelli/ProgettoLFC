package variables;

import org.antlr.runtime.Token;

public class Header {
	private Token key;
	private String value;

	public Header(Token key, String value) {
		this.key = key;
		this.value = value;
	}

	public Token getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}
