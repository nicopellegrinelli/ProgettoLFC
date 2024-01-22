package variables;

public class CompilerError implements Comparable<CompilerError> {
	private String errorMsg;
	private int line;
	private int column;
	
	public CompilerError(int line, int column, String errorMsg) {
		this.errorMsg = errorMsg;
		this.line = line;
		this.column = column;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
	public int getLine() {
		return line;
	}
	public int getColumn() {
		return column;
	}

	@Override
	public int compareTo(CompilerError o) {
		if(this.getLine() != o.getLine())
			return Integer.compare(this.getLine(), o.getLine());
		return Integer.compare(this.getColumn(), o.getColumn());
	}
	
	
}
