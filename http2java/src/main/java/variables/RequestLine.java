package variables;

public class RequestLine {
	private String method;
	private String path;
	private String version;

	public RequestLine(String method, String path, String version) {
		this.method = method;
		this.path = path;
		this.version = version;
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
