package compiler;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import utils.Variable;

public class SemanticHandler {
	public static int DIVSION_BY_ZERO_ERROR = 0;
	public static int NO_DECLARATION_WARNING = 1;
	
	Hashtable<String, Double> symbolTable;
	String result;
	ArrayList<String> errors;
	ArrayList<String> warnings;
	
	public SemanticHandler() {
		symbolTable = new Hashtable<String, Double>();
		result = "";
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
	}

	public Variable setFactToNum(Token num) {
		return new Variable(num.getText(), Double.parseDouble(num.getText()));
	}
	
	public Variable setFactToId(Token id) {
		double val;
		if (symbolTable.containsKey(id.getText())) {
			val = symbolTable.get(id.getText());
		} else {
			addWarning(NO_DECLARATION_WARNING, id);
			val = 0;
		}
		return new Variable(id.getText(), val);
	}

	public Variable update(Variable res, Variable f2, Token op) {
		String expr = res.getExpr() + " " + f2.getExpr() + " " + op.getText();
		double val = res.getValue();
		switch (op.getType()) {
		case EspressioniParser.ADD:
			val += f2.getValue();
			break;
		case EspressioniParser.SUB:
			val -= f2.getValue();
			break;
		case EspressioniParser.MUL:
			val *= f2.getValue();
			break;
		case EspressioniParser.DIV:
			if (f2.getValue() == 0) {
				addError(DIVSION_BY_ZERO_ERROR, op);
				val = Double.NaN;
			} else {
				val /= f2.getValue();
			}
		}
		return new Variable(expr, val);
	}

	public void addExpression(Token id, Variable e) {
		symbolTable.put(id.getText(), e.getValue());
		result += id.getText() + " == " + e.getValue() + " = " + e.getExpr() + "\n";
	}
	
	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {
		if (tk.getType() == EspressioniParser.ERROR_TOKEN) 
			errors.add("Errore Lessicale");
		else
			errors.add("Errore Sintattico");
	}
	
	public boolean hasErrors () {
		return (errors.size()!=0);
	}
	
	public ArrayList<String> getErrors () {
		return errors;
	}
	
	public int getNErrors () {
		return errors.size();
	}
	
	public boolean hasWarnings () {
		return (warnings.size()!=0);
	}
	
	public ArrayList<String> getWarnings () {
		return warnings;
	}
	
	public int getNWarnings () {
		return warnings.size();
	}
	
	void addError (int errCode, Token tk) {
		String msg = "Errore alla riga " + tk.getLine() + ": ";
		if (errCode == DIVSION_BY_ZERO_ERROR)
			msg += "divisione per 0";
		errors.add(msg);
	}

	void addWarning (int warnCode, Token tk) {
		String msg = "Warning alla riga " + tk.getLine() + ": ";
		if (warnCode == NO_DECLARATION_WARNING)
			msg += "'" + tk.getText() + "'non dichiarato";
		warnings.add(msg);
	}
	
	public void printResult() {
		for (int n = 0; n<getNErrors(); n++)	    	
	    	System.out.println(getErrors().get(n));		    	

	    for (int n = 0; n<getNWarnings(); n++)	    	
	    	System.out.println(getWarnings().get(n));	
		
		System.out.println("\n" +  result);
		
	}



}
