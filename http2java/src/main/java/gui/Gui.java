package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compiler.HttpLexer;
import compiler.HttpParser;
import compiler.SemanticHandler;
import utils.CompilerError;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.Point;

public class Gui {

	private JFrame frame;
	private JTextField txtC;
	private String filepath = "";
	private Boolean parsedCorrectly = false;
	private File inputFile;

	// Lancia la GUI
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setTitle("http2java");
					window.frame.setVisible(true);
					window.frame.setResizable(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea l'applicazione
	public Gui() {
		initialize();
	}

	// Inizializza i contenuti del frame
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 928, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Http2Java");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerLocation(0.5);
		splitPane.setResizeWeight(0.7);
		frame.getContentPane().add(splitPane);

		JPanel right_panel = new JPanel();
		right_panel.setBorder(new EmptyBorder(0, 0, 0, 10));
		splitPane.setRightComponent(right_panel);
		right_panel.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_Errors = new JPanel();
		panel_Errors.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		right_panel.add(panel_Errors);
		panel_Errors.setLayout(new BorderLayout(0, 0));

		JLabel lblErrors = new JLabel("Errors");
		lblErrors.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblErrors.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Errors.add(lblErrors, BorderLayout.NORTH);

		JTextArea textArea_Errors = new JTextArea();
		textArea_Errors.setEditable(false);
		panel_Errors.add(textArea_Errors);

		JPanel panel_Warnings = new JPanel();
		panel_Warnings.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		right_panel.add(panel_Warnings);
		panel_Warnings.setLayout(new BorderLayout(0, 0));

		JLabel lblWarnings = new JLabel("Warnings");
		lblWarnings.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWarnings.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Warnings.add(lblWarnings, BorderLayout.NORTH);

		JTextArea textArea_Warnings = new JTextArea();
		textArea_Warnings.setEditable(false);
		panel_Warnings.add(textArea_Warnings);

		JPanel left_panel = new JPanel();
		left_panel.setBorder(new EmptyBorder(0, 10, 0, 0));
		splitPane.setLeftComponent(left_panel);
		left_panel.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_HTTP = new JPanel();
		panel_HTTP.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		left_panel.add(panel_HTTP);
		panel_HTTP.setLayout(new BorderLayout(0, 0));

		JLabel lblHTTP = new JLabel("HTTP request:");
		lblHTTP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHTTP.setHorizontalAlignment(SwingConstants.CENTER);
		panel_HTTP.add(lblHTTP, BorderLayout.NORTH);

		JTextArea textArea_HTTP = new JTextArea();
		textArea_HTTP.setBorder(new EmptyBorder(10,10,10,10));
		textArea_HTTP.setLineWrap(true);
		textArea_HTTP.setEditable(false);
		
		JScrollPane scrollPane_HTTP = new JScrollPane(textArea_HTTP);
		panel_HTTP.add(scrollPane_HTTP);
		
		TextLineNumber lineNumber = new TextLineNumber(textArea_HTTP, 2);
		lineNumber.setUpdateFont(true);
		float fontSize = textArea_HTTP.getFont().getSize() - 1;
		Font font = textArea_HTTP.getFont().deriveFont(fontSize);
		lineNumber.setFont(font);
		lineNumber.setBorderGap(20);
		lineNumber.setForeground(Color.BLACK);
		lineNumber.setDigitAlignment(TextLineNumber.LEFT);
		scrollPane_HTTP.setRowHeaderView(lineNumber);
		
		//panel_HTTP.add(textArea_HTTP);

		JPanel panel_Java = new JPanel();
		panel_Java.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_Java.setLayout(new BorderLayout(0, 0));
		left_panel.add(panel_Java);
		

		JLabel lblJava = new JLabel("Java code:");
		lblJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblJava.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_Java.add(lblJava, BorderLayout.NORTH);

		JTextArea textArea_Java = new JTextArea();
		panel_Java.add(textArea_Java);;

		JPanel bottom_panel = new JPanel();
		frame.getContentPane().add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_text = new JPanel();
		bottom_panel.add(panel_text, BorderLayout.CENTER);

		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setHorizontalAlignment(SwingConstants.LEFT);
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtC.setText("c:\\");
		panel_text.add(txtC);
		txtC.setColumns(40);

		JToggleButton tglbtnFileOrText = new JToggleButton("Toggle File");
		tglbtnFileOrText.setSelected(true);
		tglbtnFileOrText.setToolTipText(
				"If selected, the input is the taken from the file; otherwise, if not selected, the input is taken from the HTTP text box");
		panel_text.add(tglbtnFileOrText);
		tglbtnFileOrText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnFileOrText.isSelected()) {
					textArea_HTTP.setEditable(false);
				}
				else {
					textArea_HTTP.setEditable(true);
				}
			}
		});

		JPanel panel_buttons = new JPanel();
		bottom_panel.add(panel_buttons, BorderLayout.EAST);
		panel_buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));

		JButton btnImport = new JButton("Import File");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser j = new JFileChooser(System.getProperty("user.dir"));
					FileNameExtensionFilter filter1 = new FileNameExtensionFilter(".txt", "txt");
					FileNameExtensionFilter filter2 = new FileNameExtensionFilter(".file", "file");
					j.setFileFilter(filter1);
					j.setFileFilter(filter2);
					int result = j.showSaveDialog(null);
					if (result == JFileChooser.APPROVE_OPTION) {
						inputFile = j.getSelectedFile();
						// salva il path del file e lo stampa nella textbox piccola
						filepath = inputFile.getAbsolutePath();
						txtC.setText(filepath);
						StringBuilder content = readFileContent(inputFile);
						textArea_HTTP.setText(content.toString());
					} else {
						if (!filepath.equals("")) {
							txtC.setText(filepath);
						} else {
							txtC.setText("Operazione annullata");
						}
					}
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_buttons.add(btnImport);

		JButton btnTranslate = new JButton("Translate");
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HttpLexer lexer;
					// leggo da file
					if (tglbtnFileOrText.isSelected()) {
						lexer = new HttpLexer(new ANTLRReaderStream(new FileReader(filepath)));
						textArea_HTTP.setText(readFileContent(inputFile).toString());
					}
					//leggo da textBox
					else {
						lexer = new HttpLexer(new ANTLRReaderStream(new StringReader(textArea_HTTP.getText())));
					}
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					HttpParser parser = new HttpParser(tokens);
					parser.request();
					SemanticHandler h = parser.getHandler();
					// Se si sono verificati degli errori
					if (!h.getErrors().isEmpty()) {
						// svuoto il risultato della traduzione
						textArea_Java.setText("");
						textArea_Errors.setText("");
						textArea_Warnings.setText("");
						// Segno che il parsing ha avuto dei problemi
						parsedCorrectly = false;
						// Stampali nella box degli errori
						for (CompilerError item : h.getErrors()) {
							textArea_Errors.setText(textArea_Errors.getText() + "\n" + item.getErrorMsg().toString());
						}
						// Rimuove la prima riga vuota
						textArea_Errors.replaceRange("", 0, textArea_Errors.getLineEndOffset(0));
					}
					// Se non si sono verificati errori
					else {
						// pulisco la textBox degli errori
						textArea_Errors.setText("");
						// stampo il risultato del parsing
						textArea_Java.setText(h.getJavaCode());
						// segno che il parsing ha avuto esito positivo
						parsedCorrectly = true;
					}
					// ad ogni modo, se ci sono dei warnings
					if (!h.getWarnings().isEmpty()) {
						//pulisci la casella per poi riscrivere
						textArea_Warnings.setText("");
						// Stampa i warnings nella box dei warnings
						for (CompilerError item : h.getWarnings()) {
							textArea_Warnings
									.setText(textArea_Warnings.getText() + "\n" + item.getErrorMsg().toString());
							// Rimuove la prima riga vuota
							textArea_Warnings.replaceRange("", 0, textArea_Warnings.getLineEndOffset(0));
						}
					}
					// se non ci sono warning, pulisco la relativa textbox
					else {
						textArea_Warnings.setText("");
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_buttons.add(btnTranslate);

		JButton btnCopy = new JButton("Copy");
		btnCopy.addActionListener(new ActionListener() {
			// Alla pressione del pulsante "copy", copia nella clipboard il testo presente
			// nella textbox Java
			public void actionPerformed(ActionEvent e) {
				if (parsedCorrectly.equals(true)) { // Se il parsing è terminato con successo
					// copia il codice Java nella clipboard
					Toolkit.getDefaultToolkit().getSystemClipboard()
							.setContents(new StringSelection(textArea_Java.getText()), null);
				} else {
					txtC.setText("Errore nel parsing, copia fallita");
				}
			}
		});
		panel_buttons.add(btnCopy);
	}

	private StringBuilder readFileContent(File inputFile) throws FileNotFoundException, IOException {
		// legge il contenuto del file e lo restituisce sotto forma di StringBuilder
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		StringBuilder content = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			content.append(line).append("\n");
		}
		reader.close();
		return content;
	}

}
