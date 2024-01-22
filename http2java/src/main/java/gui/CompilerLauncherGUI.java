package gui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import compiler.HttpLexer;
import compiler.HttpParser;
import variables.Output;

public class CompilerLauncherGUI {
	
	public static Output launch(String filePath) throws FileNotFoundException, IOException, RecognitionException {
		HttpLexer lexer = new HttpLexer(new ANTLRReaderStream(new FileReader(filePath)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HttpParser parser = new HttpParser(tokens);

		parser.request();
		
		return new Output(parser.h.getJavaCode(), parser.h.getErrors(), parser.h.getWarnings());
	}

}
