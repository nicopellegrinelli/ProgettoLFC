package launcher;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

import compiler.HttpLexer;
import compiler.HttpParser;
import compiler.SemanticHandler;

/* 
 * Questa è una classe di esempio
 * che simula un'applicazione 
 * che vuole usare un parser
 */
public class CompilerLauncher {
	public static void main(String[] args) {
		HttpParser parser;
		String fileIn = ".\\resources\\input.file";

		try {
			// Inizializzazione del parser (antlr docet):
			// 1. Si inizializza il lexer
			// 2. Si crea uno stream di token
			// 3. si istanzia il parser passandogli lo stream di token

			// 1.
			HttpLexer lexer = new HttpLexer(new ANTLRReaderStream(new FileReader(fileIn)));

//			Token tk;
//			int i;
//
//			System.out.println("Test ANTLR lexer");
//
//			i = 1;
//			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
//			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo
//			// nextToken)
//			// fino ad incontrare l' End Of File EOF
//			while ((tk = lexer.nextToken()).getType() != HttpLexer.EOF) {
//				// recuper le informazioni relative ai token rilevati
//				int line = tk.getLine();
//				int col = tk.getCharPositionInLine() + 1;
//				int type = tk.getType();
//				String text = tk.getText();
//
//				// attivo questo controllo se voglio scartare i token nascosti
//				if (tk.getChannel() != HttpLexer.HIDDEN)
//					// stampo le informazioni del token corrente
//					System.out.println("Token " + i++ + ": " + "(" + line + "," + col + ")\t\t" + "TokenType: " + type
//							+ "\t" + text);
//			}

			// 3.
//			lexer = new HttpLexer(new ANTLRReaderStream(new FileReader(fileIn)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new HttpParser(tokens);

			// 4. si lancia il parser dallo start simbol (prima produzione specificata)
			parser.request();

			// 5. mi faccio restituire l'handler semantico per analizzare i risultati
			SemanticHandler h = parser.getHandler();

			System.out.println("\n\nParsing con ANTLR terminato con successo\n\n");

		} catch (Exception e) {
			System.out.println("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
	}

}
