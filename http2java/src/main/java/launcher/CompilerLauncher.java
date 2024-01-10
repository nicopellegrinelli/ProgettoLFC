package launcher;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compiler.EspressioniLexer;
import compiler.EspressioniParser;
import compiler.SemanticHandler;

/* 
 * Questa � una classe di esempio
 * che simula un'applicazione 
 * che vuole usare un parser
 */
public class CompilerLauncher {
	public static void main(String[] args) {
		EspressioniParser parser;
		String fileIn = ".\\resources\\input.file";
  	
  	try {
  		// Inizializzazione del parser (antlr docet):
  		//		1. Si inizializza il lexer
  		//		2. Si crea uno stream di token
  		//		3. si istanzia il parser passandogli lo stream di token

  		// 1. 
  		EspressioniLexer lexer = new EspressioniLexer (
  										new ANTLRReaderStream(
  											new FileReader(fileIn))); 

  		// 2. 
  		CommonTokenStream tokens = new CommonTokenStream(lexer);	

  		// 3. 
		parser = new EspressioniParser(tokens);

			
	    // 4. si lancia il parser dallo start simbol (prima produzione specificata)
	    parser.axiom();
	    
	    // 5. mi faccio restituire l'handler semantico per analizzare i risultati
	    SemanticHandler h = parser.getHandler();
	    h.printResult();
	    
  	
  	} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }

}
