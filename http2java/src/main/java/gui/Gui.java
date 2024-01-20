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
import javax.swing.filechooser.FileNameExtensionFilter;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compiler.HttpLexer;
import compiler.HttpParser;
import compiler.SemanticHandler;
import utils.CompilerError;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
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
		splitPane.setRightComponent(right_panel);
		right_panel.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_Errors = new JPanel();
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
		splitPane.setLeftComponent(left_panel);
		GridBagLayout gbl_left_panel = new GridBagLayout();
		gbl_left_panel.columnWidths = new int[] { 0, 0 };
		gbl_left_panel.rowHeights = new int[] { 0, 0, 0 };
		gbl_left_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_left_panel.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		left_panel.setLayout(gbl_left_panel);

		JPanel panel_HTTP = new JPanel();
		GridBagConstraints gbc_panel_HTTP = new GridBagConstraints();
		gbc_panel_HTTP.insets = new Insets(0, 0, 5, 0);
		gbc_panel_HTTP.fill = GridBagConstraints.BOTH;
		gbc_panel_HTTP.gridx = 0;
		gbc_panel_HTTP.gridy = 0;
		left_panel.add(panel_HTTP, gbc_panel_HTTP);
		panel_HTTP.setLayout(new BorderLayout(0, 0));

		JLabel lblHTTP = new JLabel("HTTP request:");
		lblHTTP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHTTP.setHorizontalAlignment(SwingConstants.CENTER);
		panel_HTTP.add(lblHTTP, BorderLayout.NORTH);

		JTextArea txtrInsertHttpRequest = new JTextArea();
		txtrInsertHttpRequest.setText("Insert HTTP request here:");
		panel_HTTP.add(txtrInsertHttpRequest);

		JPanel panel_Java = new JPanel();
		GridBagConstraints gbc_panel_Java = new GridBagConstraints();
		gbc_panel_Java.fill = GridBagConstraints.BOTH;
		gbc_panel_Java.gridx = 0;
		gbc_panel_Java.gridy = 1;
		left_panel.add(panel_Java, gbc_panel_Java);
		panel_Java.setLayout(new BorderLayout(0, 0));

		JLabel lblJava = new JLabel("Java code:");
		lblJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblJava.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_Java.add(lblJava, BorderLayout.NORTH);

		JTextArea textArea_Java = new JTextArea();
		panel_Java.add(textArea_Java);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_text = new JPanel();
		panel.add(panel_text, BorderLayout.CENTER);

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

		JPanel panel_buttons = new JPanel();
		panel.add(panel_buttons, BorderLayout.EAST);
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
						txtrInsertHttpRequest.setText(content.toString());
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
						txtrInsertHttpRequest.setText(readFileContent(inputFile).toString());
					}
					//leggo da textBox
					else {
						lexer = new HttpLexer(new ANTLRReaderStream(new StringReader(txtrInsertHttpRequest.getText())));
					}
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					HttpParser parser = new HttpParser(tokens);
					parser.request();
					SemanticHandler h = parser.getHandler();
					// Se si sono verificati degli errori
					if (!h.getErrors().isEmpty()) {
						// svuoto il risultato della traduzione
						textArea_Java.setText("");
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
					if (!h.getWarnings().isEmpty()) {
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
		// legge il contenuto del file e lo stampa in textArea_http
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		StringBuilder content = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			content.append(line).append("\n");
		}
		return content;
	}

}
