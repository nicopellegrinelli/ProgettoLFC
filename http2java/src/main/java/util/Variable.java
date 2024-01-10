package util;

public class Variable {
	String expr;
	double value;
	
	public Variable (String expr, double value) {
		this.expr = expr;
		this.value = value;
	}

	public String getExpr() {
		return expr;
	}

	public double getValue() {
		return value;
	}
	
	
}
