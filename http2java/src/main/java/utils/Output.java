package utils;

import java.util.List;

public class Output {
	private List<CompilerError> errors;
	private List<CompilerError> warnings;
	private String javaCode;
	
	public Output(String javaCode, List<CompilerError> errors, List<CompilerError> warnings) {
		this.errors = errors;
		this.warnings = warnings;
		this.javaCode = javaCode;
	}
	
	public List<CompilerError> getErrors() {
		return errors;
	}
	public List<CompilerError> getWarnings() {
		return warnings;
	}
	public String getJavaCode() {
		return javaCode;
	}

}
