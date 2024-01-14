package utils;

public class Header {
	private String key;
	private String value;

	public Header(String k, String v) {
		key = k;
		value = v;
	}

	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}
