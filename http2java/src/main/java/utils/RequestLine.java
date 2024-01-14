package utils;

public class RequestLine {
	private String method;
	private String path;
	private String version;

	public RequestLine(String m, String p, String v) {
		method = m;
		path = p;
		version = v;
	}
	
	public String getMethod() {
		return method;
	}
	public String getPath() {
		return path;
	}
	public String getVersion() {
		return version;
	}
}
