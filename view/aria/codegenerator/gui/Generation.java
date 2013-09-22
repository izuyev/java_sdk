package aria.codegenerator.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

public class Generation extends JFrame {
	private static final long serialVersionUID = 8640945963198083820L;
	private static ResourceBundle resourceBundle;
	private final String WSDL = getResourceBundle().getString("wsdlLabel");
	private final String SOURCE_PATH = getResourceBundle().getString("sourcePathLabel");

	private final String PACKAGE_PATH = getResourceBundle().getString("packagePathLabel");

	private final String LIBRARY_PATH = getResourceBundle().getString("libraryPathLabel");

	private final String LIBRARY_NAME = getResourceBundle().getString("libraryName");

	private final String LANGUAGE = getResourceBundle().getString("languageLabel");

	private final String GENERATE = getResourceBundle().getString("generateLabel");

	private final String GENERATE_LIBRARY = getResourceBundle().getString("generateLibraryLabel");

	private final String GENERATE_LIBRARY_KEY = "generateLibrary";
	private final String PARAMETER_LABEL = getResourceBundle().getString("parameterLabel");

	private final String PATH_LABEL = getResourceBundle().getString("pathLabel");
	private HashMap<Integer, HashMap<String, String>> xmlNodesLanguageParms;
	private HashMap<Integer, HashMap<String, String>> xmlNodesBasicSettings;
	private JFileChooser fileChooser;
	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JTextArea jTextArea1;
	private JTable languageTable;
	private JToggleButton libraryButton;
	private JTextField libraryNameTextField;
	private JTextField libraryTextField;
	private JTextArea microHelpTextArea;
	private JTextField packageTextField;
	private JTextPane resultsTextPane;
	private JToggleButton sourcePathButton;
	private JTextField sourcePathTextField;
	private JToggleButton specificPathsButton;
	private JTable specificPathsJTable;
	private JToggleButton wsdlButton;
	private JTextField wsdlTextField;

	public ResourceBundle getResourceBundle() {
		if (resourceBundle == null) {
			resourceBundle = ResourceBundle.getBundle(getBundlePath());
		}
		return resourceBundle;
	}

	private static String getGeneratorFilesPath() {
		return "GeneratorFiles/";
	}

	private String getIconPath() {
		return "lib/favicon.ico";
	}

	private File getXmlFile() {
		File file = new File(getXmlFilePath());
		file = file.getAbsoluteFile();
		return file;
	}

	private File getTempXmlFile() {
		File file = new File(getTempXmlFilePath());
		file = file.getAbsoluteFile();
		return file;
	}

	private String getXmlFilePath() {
		return getGeneratorFilesPath() + "GenerationParms.xml";
	}

	private String getTempXmlFilePath() {
		return getGeneratorFilesPath() + "Temp.xml";
	}

	private static String getBundlePath() {
		return "Bundle";
	}

	public Generation() {
		initComponents();
	}

	private void initComponents() {
		this.jScrollPane3 = new JScrollPane();
		this.jTextArea1 = new JTextArea();
		this.jPanel1 = new JPanel();
		this.jScrollPane1 = new JScrollPane();
		this.languageTable = new JTable();
		this.jPanel2 = new JPanel();
		this.wsdlTextField = new JTextField();
		this.jLabel1 = new JLabel();
		this.wsdlButton = new JToggleButton();
		this.jLabel2 = new JLabel();
		this.packageTextField = new JTextField();
		this.sourcePathButton = new JToggleButton();
		this.jLabel3 = new JLabel();
		this.sourcePathTextField = new JTextField();
		this.jLabel4 = new JLabel();
		this.libraryTextField = new JTextField();
		this.libraryButton = new JToggleButton();
		this.jLabel5 = new JLabel();
		this.libraryNameTextField = new JTextField();
		this.jPanel3 = new JPanel();
		this.jScrollPane2 = new JScrollPane();
		this.specificPathsJTable = new JTable();
		this.specificPathsButton = new JToggleButton();
		this.jButton1 = new JButton();
		this.jPanel4 = new JPanel();
		this.jScrollPane4 = new JScrollPane();
		this.resultsTextPane = new JTextPane();
		this.fileChooser = new JFileChooser();
		this.microHelpTextArea = new JTextArea();

		this.jTextArea1.setColumns(20);
		this.jTextArea1.setRows(5);
		this.jScrollPane3.setViewportView(this.jTextArea1);

		setDefaultCloseOperation(3);
		ResourceBundle bundle = ResourceBundle.getBundle("Bundle");
		setTitle(bundle.getString("windowTitle"));
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent evt) {
				Generation.this.windowOpened(evt);
			}
		});
		this.jPanel1.setBorder(BorderFactory.createTitledBorder(bundle.getString("languageLabel")));
		this.jPanel1.setToolTipText(bundle.getString("languageTableToolTip"));
		this.jPanel1.setName("");
		this.jPanel1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.languageTable.setModel(new DefaultTableModel(new Object[0][], new String[] { "Language", "Generate",
				"Generate Library" }) {
			Class[] types = { String.class, Boolean.class, Boolean.class };
			boolean[] canEdit = { false, true, true };

			public Class getColumnClass(int columnIndex) {
				return this.types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return this.canEdit[columnIndex];
			}
		});
		this.languageTable.setToolTipText(bundle.getString("languageTableToolTip"));
		this.languageTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Generation.this.rowChangedLanguageTable(evt);
			}
		});
		this.languageTable.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.jScrollPane1.setViewportView(this.languageTable);
		this.languageTable.getColumnModel().getColumn(0).setMaxWidth(100);
		this.languageTable.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("languageLabel"));
		this.languageTable.getColumnModel().getColumn(1).setMaxWidth(60);
		this.languageTable.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("generateLabel"));
		this.languageTable.getColumnModel().getColumn(2).setMaxWidth(100);
		this.languageTable.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("generateLibraryLabel"));

		GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 262, -2)
						.addContainerGap(-1, 32767)));

		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
						jPanel1Layout.createSequentialGroup().addComponent(this.jScrollPane1, -1, 91, 32767)
								.addContainerGap()));

		this.jPanel2.setBorder(BorderFactory.createTitledBorder(bundle.getString("basicSettingsLabel")));
		this.jPanel2.setToolTipText("These values are used by defaiult on the code generation.");
		this.jPanel2.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.wsdlTextField.setHorizontalAlignment(2);
		this.wsdlTextField.setToolTipText(bundle.getString("wsdlToolTip"));
		this.wsdlTextField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.jLabel1.setText(bundle.getString("wsdlLabel"));

		this.wsdlButton.setText(bundle.getString("selectPathButtonLabel"));
		this.wsdlButton.setToolTipText(bundle.getString("selectPathButtonToolTip"));
		this.wsdlButton.setMaximumSize(new Dimension(23, 23));
		this.wsdlButton.setMinimumSize(new Dimension(23, 23));
		this.wsdlButton.setPreferredSize(new Dimension(23, 23));
		this.wsdlButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Generation.this.wsdlButtonActionPerformed(evt);
			}
		});
		this.jLabel2.setText(bundle.getString("packagePathLabel"));

		this.packageTextField.setToolTipText(bundle.getString("packagePathToolTip"));
		this.packageTextField.setEnabled(false);
		this.packageTextField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.sourcePathButton.setText(bundle.getString("selectPathButtonLabel"));
		this.sourcePathButton.setToolTipText(bundle.getString("selectPathButtonToolTip"));
		this.sourcePathButton.setMaximumSize(new Dimension(23, 23));
		this.sourcePathButton.setMinimumSize(new Dimension(23, 23));
		this.sourcePathButton.setPreferredSize(new Dimension(23, 23));
		this.sourcePathButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Generation.this.sourcePathButtonActionPerformed(evt);
			}
		});
		this.jLabel3.setText(bundle.getString("sourcePathLabel"));

		this.sourcePathTextField.setToolTipText(bundle.getString("sourcePathToolTip"));
		this.sourcePathTextField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.jLabel4.setText(bundle.getString("libraryPathLabel"));

		this.libraryTextField.setToolTipText(bundle.getString("libraryPathToolTip"));
		this.libraryTextField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.libraryButton.setText(bundle.getString("selectPathButtonLabel"));
		this.libraryButton.setToolTipText(bundle.getString("selectPathButtonToolTip"));
		this.libraryButton.setMaximumSize(new Dimension(23, 23));
		this.libraryButton.setMinimumSize(new Dimension(23, 23));
		this.libraryButton.setPreferredSize(new Dimension(23, 23));
		this.libraryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Generation.this.libraryButtonActionPerformed(evt);
			}
		});
		this.jLabel5.setText(bundle.getString("libraryName"));

		this.libraryNameTextField.setToolTipText(bundle.getString("libraryNameToolTip"));
		this.libraryNameTextField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
		this.jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(
						jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4)
								.addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel1)
								.addComponent(this.jLabel5)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
										this.libraryTextField, -1, 693, 32767).addComponent(this.libraryNameTextField,
										-1, 693, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
										this.sourcePathButton, -2, -1, -2).addComponent(this.libraryButton, -1, -1,
										32767)).addContainerGap()).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(79, 79, 79).addComponent(this.packageTextField, -1, 693,
						32767).addContainerGap(77, 32767)).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(79, 79, 79).addComponent(this.sourcePathTextField, -1,
						693, 32767).addContainerGap(77, 32767)).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(79, 79, 79).addComponent(this.wsdlTextField, -2, -1, -2)
						.addContainerGap(77, 32767)).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(778, 778, 778).addComponent(this.wsdlButton, -2, -1, -2)
						.addContainerGap(48, 32767)));

		jPanel2Layout.linkSize(0, new Component[] { this.jLabel1, this.jLabel2, this.jLabel3, this.jLabel4 });

		jPanel2Layout.linkSize(0, new Component[] { this.libraryNameTextField, this.libraryTextField,
				this.packageTextField, this.sourcePathTextField, this.wsdlTextField });

		jPanel2Layout.linkSize(0, new Component[] { this.libraryButton, this.sourcePathButton, this.wsdlButton });

		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(
						jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
								this.wsdlTextField, -2, -1, -2).addComponent(this.jLabel1).addComponent(
								this.wsdlButton, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
										jPanel2Layout.createSequentialGroup().addGroup(
												jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(this.sourcePathTextField, -2, -1, -2)
														.addComponent(this.jLabel3)).addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED).addGroup(
												jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(this.packageTextField, -2, -1, -2).addComponent(
																this.jLabel2))).addComponent(this.sourcePathButton, -2,
										-1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(
								jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
										this.libraryTextField, -2, -1, -2).addComponent(this.jLabel4).addComponent(
										this.libraryButton, -2, -1, -2)).addPreferredGap(
								LayoutStyle.ComponentPlacement.RELATED).addGroup(
								jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
										this.libraryNameTextField, -2, -1, -2).addComponent(this.jLabel5))
						.addContainerGap(-1, 32767)));

		jPanel2Layout.linkSize(1, new Component[] { this.jLabel1, this.jLabel2, this.jLabel3, this.jLabel4,
				this.libraryButton, this.libraryTextField, this.packageTextField, this.sourcePathButton,
				this.sourcePathTextField, this.wsdlButton, this.wsdlTextField });

		jPanel2Layout.linkSize(1, new Component[] { this.jLabel5, this.libraryNameTextField });

		this.wsdlTextField.getAccessibleContext().setAccessibleName("wsdl");

		this.jPanel3.setBorder(BorderFactory.createTitledBorder(bundle.getString("SpecificPathTableLabel")));
		this.jPanel3.setToolTipText(bundle.getString("specificPathTableToolTip"));

		this.specificPathsJTable.setModel(new DefaultTableModel(new Object[0][], new String[] { "Parameter", "Path" }) {
			Class[] types = { String.class, String.class };
			boolean[] canEdit = { false, true };

			public Class getColumnClass(int columnIndex) {
				return this.types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return this.canEdit[columnIndex];
			}
		});
		this.specificPathsJTable.setToolTipText(bundle.getString("specificPathTableToolTip"));
		this.specificPathsJTable.setCellSelectionEnabled(true);
		this.specificPathsJTable.setCursor(new Cursor(0));
		this.specificPathsJTable.setName("specpaths");
		this.specificPathsJTable.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.jScrollPane2.setViewportView(this.specificPathsJTable);
		this.specificPathsJTable.getColumnModel().getSelectionModel().setSelectionMode(1);

		this.specificPathsJTable.getColumnModel().getColumn(0).setMaxWidth(100);
		this.specificPathsJTable.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("parameterLabel"));
		this.specificPathsJTable.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("pathLabel"));
		this.specificPathsJTable.getAccessibleContext().setAccessibleName("specpaths");

		this.specificPathsButton.setText(bundle.getString("selectPathButtonLabel"));
		this.specificPathsButton.setToolTipText(bundle.getString("selectPathButtonToolTip"));
		this.specificPathsButton.setMaximumSize(new Dimension(23, 23));
		this.specificPathsButton.setMinimumSize(new Dimension(23, 23));
		this.specificPathsButton.setPreferredSize(new Dimension(23, 23));
		this.specificPathsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Generation.this.specificPathsButtonActionPerformed(evt);
			}
		});
		GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
		this.jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -2, -1, -2)
						.addGap(18, 18, 18).addComponent(this.specificPathsButton, -2, -1, -2).addContainerGap(-1,
								32767)));

		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addGroup(
						jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
								this.jScrollPane2, -2, 91, -2).addComponent(this.specificPathsButton, -2, -1, -2))
						.addContainerGap(-1, 32767)));

		this.jButton1.setText(bundle.getString("generateButtonLabel"));
		this.jButton1.setToolTipText(bundle.getString("generateButtonToolTip"));
		this.jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Generation.this.jButton1ActionPerformed(evt);
			}
		});
		this.jButton1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.jPanel4.setBorder(BorderFactory.createTitledBorder(bundle.getString("resultsLabel")));
		this.jPanel4.setToolTipText(bundle.getString("resultsToolTip"));
		this.jPanel4.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.resultsTextPane.setBorder(null);
		this.resultsTextPane.setToolTipText(bundle.getString("resultsToolTip"));
		this.resultsTextPane.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				Generation.this.generalFocusGained(evt);
			}
		});
		this.jScrollPane4.setViewportView(this.resultsTextPane);

		GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
		this.jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane4, -1, 784, 32767)
						.addContainerGap()));

		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanel4Layout.createSequentialGroup().addComponent(this.jScrollPane4, -1, 195, 32767)
								.addContainerGap()));

		this.fileChooser.setDialogTitle("Select path...");

		this.microHelpTextArea.setColumns(20);
		this.microHelpTextArea.setEditable(false);
		this.microHelpTextArea.setFont(new Font("Arial", 0, 10));
		this.microHelpTextArea.setRows(4);
		this.microHelpTextArea.setEnabled(false);
		this.microHelpTextArea.setOpaque(false);
		this.microHelpTextArea.setRequestFocusEnabled(false);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
								layout.createSequentialGroup().addContainerGap().addGroup(
										layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
												GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup().addComponent(this.microHelpTextArea, -1,
														740, 32767).addGap(113, 113, 113).addComponent(
														this.fileChooser, -2, 8, -2)).addGroup(
												layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
														.addComponent(this.jPanel2, GroupLayout.Alignment.LEADING, -1,
																-1, 32767).addGroup(
																GroupLayout.Alignment.LEADING,
																layout.createSequentialGroup().addComponent(
																		this.jPanel1, -2, -1, -2).addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(this.jPanel3, -2, -1, -2)))))
								.addGroup(
										layout.createSequentialGroup().addGap(367, 367, 367)
												.addComponent(this.jButton1)).addGroup(
										layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel4, -2,
												-1, -2))).addContainerGap()));

		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, -1, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3,
										-1, -1, 32767).addComponent(this.jPanel1, -2, -1, -2)).addPreferredGap(
								LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel4, -2, -1, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
										this.fileChooser, -2, 11, -2).addComponent(this.microHelpTextArea, -2, 42, -2))
						.addContainerGap()));

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 861) / 2, (screenSize.height - 694) / 2, 861, 694);
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		try {
			updateXMLFile();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Generation.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Generation.class.getName()).log(Level.SEVERE, null, ex);
		}
		this.resultsTextPane.setText("");
		int totalLanguagesGenerated = 0;
		int numRows = this.languageTable.getRowCount();
		for (int i = 0; i < numRows; i++) {
			boolean generate = false;
			if (getTableData(this.languageTable, i, getResourceBundle().getString("generateLabel")) != null) {
				generate = ((Boolean) getTableData(this.languageTable, i, getResourceBundle()
						.getString("generateLabel"))).booleanValue();
			}
			if (generate) {
				totalLanguagesGenerated++;
			}
		}
		if (totalLanguagesGenerated == 0) {
			try {
				Style style = this.resultsTextPane.addStyle("errorStyle", null);
				StyleConstants.setForeground(style, Color.red);
				StyleConstants.setBold(style, true);
				StyledDocument doc = this.resultsTextPane.getStyledDocument();
				doc.insertString(doc.getLength(), getResourceBundle().getString("noLanguageSelectedMessage"), doc
						.getStyle("errorStyle"));
			} catch (BadLocationException ex) {
				throw new RuntimeException(ex);
			}
			return;
		}

		String wsdl = this.wsdlTextField.getText();
		GenerationAdmin admin = new GenerationAdmin();
		admin.generateCode(wsdl, this.packageTextField.getText(), this.resultsTextPane);
	}

	private void processGeneration(String wsdl) {
		int numRows = this.languageTable.getRowCount();
		this.resultsTextPane.setText("");
		int totalLanguagesGenerated = 0;
		for (int i = 0; i < numRows; i++) {
			String sourcePath = this.sourcePathTextField.getText();
			String packagePath = this.packageTextField.getText();
			String libraryPath = this.libraryTextField.getText();
			boolean generate = false;
			if (getTableData(this.languageTable, i, getResourceBundle().getString("generateLabel")) != null) {
				generate = ((Boolean) getTableData(this.languageTable, i, getResourceBundle()
						.getString("generateLabel"))).booleanValue();
			}

			if (generate) {
				String language = getTableData(this.languageTable, i, getResourceBundle().getString("languageLabel"))
						.toString();
				String specSourcePath = getLanguageParametersFromXML("language", language, "sourcePath");
				if ((specSourcePath != null) && (specSourcePath.length() > 0))
					sourcePath = specSourcePath;
				else {
					sourcePath = sourcePath + "/" + language;
				}

				String specPackagePath = getLanguageParametersFromXML("language", language, "packagePath");
				if ((specPackagePath != null) && (specPackagePath.length() > 0)) {
					packagePath = specPackagePath;
				}

				boolean library = false;
				if (getTableData(this.languageTable, i, getResourceBundle().getString("generateLibraryLabel")) != null) {
					library = ((Boolean) getTableData(this.languageTable, i, getResourceBundle().getString(
							"generateLibraryLabel"))).booleanValue();
				}
				if (library) {
					String specLibraryPath = getLanguageParametersFromXML("language", language, "libraryPath");
					if ((specLibraryPath != null) && (specLibraryPath.length() > 0))
						libraryPath = specLibraryPath;
					else {
						libraryPath = libraryPath + "/" + language;
					}
				}
				totalLanguagesGenerated++;
			}
		}
		if (totalLanguagesGenerated == 0)
			this.resultsTextPane.setText(getResourceBundle().getString("noLanguageSelectedMessage"));
	}

	private void rowChangedLanguageTable(MouseEvent evt) {
		int rowIndex = getSelectedRow(evt);

		if (rowIndex < 0) {
			return;
		}
		setLanguagesParmsFromXML(rowIndex);
	}

	private void windowOpened(WindowEvent evt) {
		Image icon = Toolkit.getDefaultToolkit().getImage(getIconPath());
		setIconImage(icon);

		DefaultTableModel model = (DefaultTableModel) this.specificPathsJTable.getModel();
		model.insertRow(model.getRowCount(), new Object[] { this.SOURCE_PATH, "" });
		model.insertRow(model.getRowCount(), new Object[] { this.PACKAGE_PATH, "" });
		model.insertRow(model.getRowCount(), new Object[] { this.LIBRARY_PATH, "" });
		model.insertRow(model.getRowCount(), new Object[] { this.LIBRARY_NAME, "" });

		setlanguagesFromXML();
		setLanguagesParmsFromXML(0);
		this.languageTable.setRowSelectionInterval(0, 0);
		setBasicSettigsFromXML();
		this.languageTable.getModel().addTableModelListener(new MyTableModelListener(this.languageTable));
		this.specificPathsJTable.getModel().addTableModelListener(new MyTableModelListener(this.specificPathsJTable));
	}

	private void wsdlButtonActionPerformed(ActionEvent evt) {
		String text = this.wsdlTextField.getText();
		File file = openDirectoryChooser(this.WSDL, text, false);
		String path = file.getPath();
		this.wsdlTextField.setText(path);
	}

	private void sourcePathButtonActionPerformed(ActionEvent evt) {
		String text = this.sourcePathTextField.getText();
		File file = openDirectoryChooser(this.SOURCE_PATH, text, true);
		String path = file.getPath();
		this.sourcePathTextField.setText(path);
	}

	private void libraryButtonActionPerformed(ActionEvent evt) {
		String text = this.libraryTextField.getText();
		File file = openDirectoryChooser(this.LIBRARY_PATH, text, true);
		String path = file.getPath();
		this.libraryTextField.setText(path);
	}

	private void specificPathsButtonActionPerformed(ActionEvent evt) {
		int rowIndex = this.specificPathsJTable.getSelectedRow();
		if (rowIndex < 0) {
			return;
		}
		String title = getTableData(this.specificPathsJTable, rowIndex, this.PARAMETER_LABEL).toString();
		String currentDir = getTableData(this.specificPathsJTable, rowIndex, this.PATH_LABEL).toString();
		if ((title.equalsIgnoreCase(this.LIBRARY_NAME)) || (title.equalsIgnoreCase(this.PACKAGE_PATH))) {
			return;
		}
		File file = openDirectoryChooser(title, currentDir, true);
		String path = file.getPath();
		int colNumPath = getColumnByName(this.specificPathsJTable, this.PATH_LABEL);
		setTableData(this.specificPathsJTable, path, rowIndex, colNumPath);
	}

	private void generalFocusGained(FocusEvent evt) {
		JComponent component = (JComponent) evt.getSource();
		String toolTipText = component.getToolTipText();
		if ((toolTipText != null) && (toolTipText.length() > 0)) {
			toolTipText = formatToolTipText(toolTipText);
			this.microHelpTextArea.setText(toolTipText);
		}
	}

	private String formatToolTipText(String text) {
		if ((text == null) || (text.length() <= 0)) {
			return "";
		}
		text = text.replaceAll("<html>", "");
		text = text.replaceAll("</html>", "");
		text = text.replaceAll("<br>", "\n");
		text = text.replaceAll("</br>", "");
		text = text.replaceAll("<strong>", "");
		text = text.replaceAll("</strong>", "");
		return text;
	}

	private File openDirectoryChooser(String dialogTitle, String currentDirectory, boolean directoriesOnly) {
		if ((currentDirectory == null) || (currentDirectory.length() <= 0)) {
			currentDirectory = ".";
		}
		this.fileChooser.setCurrentDirectory(new File(currentDirectory));
		this.fileChooser.setDialogTitle(getResourceBundle().getString("pleaseSelectDirectory") + " " + dialogTitle
				+ "...");
		if (directoriesOnly) {
			this.fileChooser.setFileSelectionMode(1);
			this.fileChooser.addChoosableFileFilter(null);
		} else {
			this.fileChooser.addChoosableFileFilter(new WsdlFileChooserFilter());
		}
		this.fileChooser.setAcceptAllFileFilterUsed(false);
		int returnVal = this.fileChooser.showOpenDialog(this);
		if (returnVal == 0) {
			return this.fileChooser.getSelectedFile();
		}
		System.out.println(getResourceBundle().getString("fileAccessCancelled"));

		return null;
	}

	private void setBasicSettigsFromXML() {
		String wsdl = getBasicSettingsFromXML("wsdl");
		String specSourcePath = getBasicSettingsFromXML("sourcePath");
		String specPackagePath = getBasicSettingsFromXML("packagePath");
		String speclibraryPath = getBasicSettingsFromXML("libraryPath");
		String speclibraryName = getBasicSettingsFromXML("libraryName");
		this.wsdlTextField.setText(wsdl);
		this.sourcePathTextField.setText(specSourcePath);
		this.packageTextField.setText(specPackagePath);
		this.libraryTextField.setText(speclibraryPath);
		this.libraryNameTextField.setText(speclibraryName);
	}

	private void setLanguagesParmsFromXML(int rowIndex) {
		String langId = getTableData(this.languageTable, rowIndex, getResourceBundle().getString("languageLabel"))
				.toString();
		String specSourcePath = getLanguageParametersFromXML("language", langId, "sourcePath");
		String specPackagePath = getLanguageParametersFromXML("language", langId, "packagePath");
		String speclibraryPath = getLanguageParametersFromXML("language", langId, "libraryPath");
		String speclibraryName = getLanguageParametersFromXML("language", langId, "libraryName");

		int colNumPath = getColumnByName(this.specificPathsJTable, getResourceBundle().getString("pathLabel"));
		int colNumParameter = getColumnByName(this.specificPathsJTable, getResourceBundle().getString("parameterLabel"));
		int rowIndexSource = getRowByDataOnColumn(this.specificPathsJTable, colNumParameter, this.SOURCE_PATH);
		int rowIndexPackagePath = getRowByDataOnColumn(this.specificPathsJTable, colNumParameter, this.PACKAGE_PATH);
		int rowIndexLibraryPath = getRowByDataOnColumn(this.specificPathsJTable, colNumParameter, this.LIBRARY_PATH);
		int rowIndexLibraryName = getRowByDataOnColumn(this.specificPathsJTable, colNumParameter, this.LIBRARY_NAME);
		setTableData(this.specificPathsJTable, specSourcePath, rowIndexSource, colNumPath);
		setTableData(this.specificPathsJTable, specPackagePath, rowIndexPackagePath, colNumPath);
		setTableData(this.specificPathsJTable, speclibraryPath, rowIndexLibraryPath, colNumPath);
		setTableData(this.specificPathsJTable, speclibraryName, rowIndexLibraryName, colNumPath);
	}

	private void setlanguagesFromXML() {
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("langParameters");
			int colNumLang = getColumnByName(this.languageTable, getResourceBundle().getString("languageLabel"));
			int colNumGenerate = getColumnByName(this.languageTable, getResourceBundle().getString("generateLabel"));
			int colNumGenerateLib = getColumnByName(this.languageTable, getResourceBundle().getString(
					"generateLibraryLabel"));
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node fstNode = nodeList.item(i);
				if (fstNode.getNodeType() == 1) {
					Element fstElmnt = (Element) fstNode;

					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("language");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					String language = fstNm.item(0).getNodeValue();

					fstNmElmntLst = fstElmnt.getElementsByTagName("generate");
					fstNmElmnt = (Element) fstNmElmntLst.item(0);
					fstNm = fstNmElmnt.getChildNodes();
					String generateText = fstNm.item(0).getNodeValue();
					boolean generate = false;
					if (generateText.equalsIgnoreCase("true")) {
						generate = true;
					}

					fstNmElmntLst = fstElmnt.getElementsByTagName("generateLibrary");
					fstNmElmnt = (Element) fstNmElmntLst.item(0);
					fstNm = fstNmElmnt.getChildNodes();
					String generateLibText = fstNm.item(0).getNodeValue();
					boolean generateLib = false;
					if (generateLibText.equalsIgnoreCase("true")) {
						generateLib = true;
					}

					if (this.languageTable.getRowCount() <= i) {
						DefaultTableModel model = (DefaultTableModel) this.languageTable.getModel();
						model.insertRow(model.getRowCount(), new Object[][] { { language, Boolean.valueOf(generate),
								Boolean.valueOf(generateLib) } });
					}
					setTableData(this.languageTable, language, i, colNumLang);
					setTableData(this.languageTable, Boolean.valueOf(generate), i, colNumGenerate);
					setTableData(this.languageTable, Boolean.valueOf(generateLib), i, colNumGenerateLib);
					System.out.println("Lang : " + fstNm.item(0).getNodeValue());
				}
			}
		} catch (Exception e) {
		}
	}

	private String getBasicSettingsFromXML(String nodeName) {
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("basicSettings");
			for (int s = 0; s < nodeList.getLength(); s++) {
				Node fstNode = nodeList.item(s);
				if (fstNode.getNodeType() == 1) {
					Element fstElmnt = (Element) fstNode;

					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName(nodeName);
					if (lstNmElmntLst == null) {
						return "";
					}
					Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList lstNm = lstNmElmnt.getChildNodes();
					return lstNm.item(0).getNodeValue();
				}
			}
		} catch (Exception e) {
		}
		return "";
	}

	private String getLanguageParametersFromXML(String parentNodeName, String id, String nodeName) {
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("langParameters");
			for (int s = 0; s < nodeList.getLength(); s++) {
				Node fstNode = nodeList.item(s);
				if (fstNode.getNodeType() == 1) {
					Element fstElmnt = (Element) fstNode;

					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName(parentNodeName);
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					String nodeValue = fstNm.item(0).getNodeValue();
					if (nodeValue.equalsIgnoreCase(id)) {
						System.out.println("Lang : " + fstNm.item(0).getNodeValue());

						NodeList lstNmElmntLst = fstElmnt.getElementsByTagName(nodeName);
						if (lstNmElmntLst == null) {
							return "";
						}
						Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
						NodeList lstNm = lstNmElmnt.getChildNodes();
						return lstNm.item(0).getNodeValue();
					}
				}
			}
		} catch (Exception e) {
		}
		return "";
	}

	private void readXML() {
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			NodeList nodeLst = doc.getElementsByTagName("langParameters");
			System.out.println("Information of all parameters");
			for (int s = 0; s < nodeLst.getLength(); s++) {
				Node fstNode = nodeLst.item(s);
				if (fstNode.getNodeType() == 1) {
					Element fstElmnt = (Element) fstNode;

					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("language");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					System.out.println("Lang : " + fstNm.item(0).getNodeValue());

					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("sourcePath");
					Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList lstNm = lstNmElmnt.getChildNodes();
					System.out.println(this.SOURCE_PATH + " : " + lstNm.item(0).getNodeValue());
				}
			}
		} catch (Exception e) {
		}
	}

	public void setTableData(JTable table, Object obj, int rowIndex, int colIndex) {
		table.getModel().setValueAt(obj, rowIndex, colIndex);
	}

	private int getSelectedRow(MouseEvent evt) {
		Point p = evt.getPoint();
		if (SwingUtilities.isRightMouseButton(evt)) {
			return -1;
		}
		int selectedRow = this.languageTable.rowAtPoint(p);
		return selectedRow;
	}

	private String getSpecPathData(JTable table, String colSearch, String searchData, String colData) {
		int colNum = getColumnByName(table, colSearch);
		int rowIndex = getRowByDataOnColumn(table, colNum, searchData);
		String ret = "";
		if (rowIndex >= 0) {
			ret = getTableData(table, rowIndex, colData).toString();
		}
		return ret;
	}

	private int getRowByDataOnColumn(JTable table, int colNum, String data) {
		int numRows = table.getRowCount();
		for (int i = 0; i < numRows; i++) {
			String evalData = getTableData(table, i, colNum).toString();
			if (evalData != null) {
				if (evalData.equalsIgnoreCase(data))
					return i;
			}
		}
		return -1;
	}

	private int getColumnByName(JTable table, String colNameSearch) {
		int numCols = table.getColumnCount();
		for (int i = 0; i < numCols; i++) {
			String colNameEvaluate = table.getColumnName(i);
			if (colNameEvaluate != null) {
				if (colNameEvaluate.equalsIgnoreCase(colNameSearch))
					return i;
			}
		}
		return -1;
	}

	private Object getTableData(JTable table, int rowIndex, int colIndex) {
		return table.getModel().getValueAt(rowIndex, colIndex);
	}

	private Object getTableData(JTable table, int rowIndex, String colName) {
		int colNumber = getColumnByName(table, colName);
		if (colNumber >= 0) {
			return getTableData(table, rowIndex, colNumber);
		}
		return null;
	}

	private HashMap<Integer, HashMap<String, String>> getXmlNodesLanguageParms() {
		this.xmlNodesLanguageParms = new HashMap();
		int rowNum = this.languageTable.getRowCount();
		for (int i = 0; i < rowNum; i++) {
			HashMap xmlNode = new HashMap();
			String language = getTableData(this.languageTable, i, this.LANGUAGE).toString();
			boolean generate = ((Boolean) getTableData(this.languageTable, i, this.GENERATE)).booleanValue();
			boolean generateLibrary = ((Boolean) getTableData(this.languageTable, i, this.GENERATE_LIBRARY))
					.booleanValue();
			String specSourcePath = getLanguageParametersFromXML("language", language, "sourcePath");
			String specPackagePath = getLanguageParametersFromXML("language", language, "packagePath");
			String speclibraryPath = getLanguageParametersFromXML("language", language, "libraryPath");
			String speclibraryName = getLanguageParametersFromXML("language", language, "libraryName");

			xmlNode.put("language", language);
			xmlNode.put("generate", Boolean.toString(generate));
			xmlNode.put("generateLibrary", Boolean.toString(generateLibrary));
			xmlNode.put("sourcePath", specSourcePath);
			xmlNode.put("packagePath", specPackagePath);
			xmlNode.put("libraryPath", speclibraryPath);
			xmlNode.put("libraryName", speclibraryName);
			this.xmlNodesLanguageParms.put(Integer.valueOf(i), xmlNode);
		}
		return this.xmlNodesLanguageParms;
	}

	private HashMap<Integer, HashMap<String, String>> getXmlNodesBasicSettings() {
		this.xmlNodesBasicSettings = new HashMap();
		int rowNum = 1;
		for (int i = 0; i < rowNum; i++) {
			HashMap xmlNode = new HashMap();
			String wsdl = this.wsdlTextField.getText();
			String sourcePath = this.sourcePathTextField.getText();
			String packagePath = this.packageTextField.getText();
			String libraryPath = this.libraryTextField.getText();
			String libraryName = this.libraryNameTextField.getText();

			xmlNode.put("wsdl", wsdl);
			xmlNode.put("sourcePath", sourcePath);
			xmlNode.put("packagePath", packagePath);
			xmlNode.put("libraryPath", libraryPath);
			xmlNode.put("libraryName", libraryName);
			this.xmlNodesBasicSettings.put(Integer.valueOf(i), xmlNode);
		}
		return this.xmlNodesBasicSettings;
	}

	private void updateXMLFile() throws FileNotFoundException, IOException {
		Element e = null;
		Node n = null;
		Node node = null;

		Document xmldoc = new DocumentImpl();

		Element root = xmldoc.createElement("parameters");
		Iterator iterate = getXmlNodesLanguageParms().entrySet().iterator();
		while (iterate.hasNext()) {
			e = xmldoc.createElementNS(null, "langParameters");
			Map.Entry pairs = (Map.Entry) iterate.next();
			HashMap xmlNode = (HashMap) pairs.getValue();
			Iterator iterateSub = xmlNode.entrySet().iterator();
			while (iterateSub.hasNext()) {
				Map.Entry pairsSub = (Map.Entry) iterateSub.next();
				node = xmldoc.createElementNS(null, pairsSub.getKey().toString());
				n = xmldoc.createTextNode(pairsSub.getValue().toString());
				node.appendChild(n);
				e.appendChild(node);
			}
			root.appendChild(e);
		}

		iterate = getXmlNodesBasicSettings().entrySet().iterator();
		while (iterate.hasNext()) {
			e = xmldoc.createElementNS(null, "basicSettings");
			Map.Entry pairs = (Map.Entry) iterate.next();
			HashMap xmlNode = (HashMap) pairs.getValue();
			Iterator iterateSub = xmlNode.entrySet().iterator();
			while (iterateSub.hasNext()) {
				Map.Entry pairsSub = (Map.Entry) iterateSub.next();
				node = xmldoc.createElementNS(null, pairsSub.getKey().toString());
				n = xmldoc.createTextNode(pairsSub.getValue().toString());
				node.appendChild(n);
				e.appendChild(node);
			}
			root.appendChild(e);
		}

		xmldoc.appendChild(root);

		FileOutputStream fos = new FileOutputStream(getTempXmlFile());

		OutputFormat of = new OutputFormat("XML", "ISO-8859-1", true);
		of.setIndent(1);
		of.setIndenting(true);
		XMLSerializer serializer = new XMLSerializer(fos, of);

		serializer.asDOMSerializer();
		serializer.serialize(xmldoc.getDocumentElement());
		fos.close();
		copyFile(getTempXmlFile(), getXmlFile());
	}

	private void copyFile(File fromFile, File newFile) throws FileNotFoundException, IOException {
		File inputFile = fromFile;
		File outputFile = newFile;

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) {
		System.out.println(ResourceBundle.getBundle("sdk").getString("client.no"));
		if(1 == 1){
			return;
		}
		try {
			ResourceBundle bundle = ResourceBundle.getBundle(getBundlePath());
			UIManager.setLookAndFeel(bundle.getString("lookAndFeel"));
		} catch (Exception evt) {
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Generation().setVisible(true);
			}
		});
	}

	public String getColKey(JTable table, int rowIndex, int colIndex) {
		String colName = table.getColumnName(colIndex);
		String ret = "";
		if (colName.equalsIgnoreCase(this.GENERATE)) {
			ret = "generate";
		} else if (colName.equalsIgnoreCase(this.GENERATE_LIBRARY)) {
			ret = "generateLibrary";
		} else if (colName.equalsIgnoreCase(this.LANGUAGE)) {
			ret = "language";
		} else if (colName.equalsIgnoreCase(this.PARAMETER_LABEL)) {
			ret = "parameter";
		} else if (colName.equalsIgnoreCase(this.PATH_LABEL)) {
			String rowLabel = getTableData(table, rowIndex, this.PARAMETER_LABEL).toString();
			if (rowLabel.equalsIgnoreCase(this.SOURCE_PATH))
				ret = "sourcePath";
			else if (rowLabel.equalsIgnoreCase(this.PACKAGE_PATH))
				ret = "packagePath";
			else if (rowLabel.equalsIgnoreCase(this.LIBRARY_PATH))
				ret = "libraryPath";
			else if (rowLabel.equalsIgnoreCase(this.LIBRARY_NAME)) {
				ret = "libraryName";
			}
		}
		return ret;
	}

	public void updateNodeXMLFile(String language, String nodeNameSearch, String value) {
		try {
			String filepath = getXmlFilePath();
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);

			NodeList nodeList = doc.getElementsByTagName("langParameters");
			for (int s = 0; s < nodeList.getLength(); s++) {
				Node fstNode = nodeList.item(s);
				if (fstNode.getNodeType() == 1) {
					Element fstElmnt = (Element) fstNode;

					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("language");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					String nodeValue = fstNm.item(0).getNodeValue();
					if (nodeValue.equalsIgnoreCase(language)) {
						NodeList lstNmElmntLst = fstElmnt.getElementsByTagName(nodeNameSearch);
						if (lstNmElmntLst == null) {
							return;
						}
						Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
						NodeList lstNm = lstNmElmnt.getChildNodes();
						Node node = lstNm.item(0);
						if (node == null) {
							node = doc.createTextNode(value);
							lstNmElmnt.appendChild(node);
							break;
						}
						node.setTextContent(value);
						break;
					}
				}
			}

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
		} catch (ParserConfigurationException pce) {
		} catch (TransformerException tfe) {
		} catch (IOException ioe) {
		} catch (SAXException sae) {
		}
	}

	public class MyTableModelListener implements TableModelListener {
		JTable table;

		MyTableModelListener(JTable table) {
			this.table = table;
		}

		public void tableChanged(TableModelEvent e) {
			int firstRow = e.getFirstRow();
			int lastRow = e.getLastRow();
			int mColIndex = e.getColumn();
			switch (e.getType()) {
			case 1:
				for (int r = firstRow; r <= lastRow; r++)
					;
				break;
			case 0:
				if (firstRow == -1) {
					if (mColIndex != -1) {
						break;
					}
				} else {
					for (int r = firstRow; r <= lastRow; r++) {
						if (mColIndex != -1) {
							String language = Generation.this.getTableData(Generation.this.languageTable,
									Generation.this.languageTable.getSelectedRow(), Generation.this.LANGUAGE)
									.toString();
							String value = this.table.getModel().getValueAt(r, mColIndex).toString();
							String key = Generation.this.getColKey(this.table, r, mColIndex);
							if (language.equalsIgnoreCase(".Net")) {
								boolean printError = false;

								if ((key.equalsIgnoreCase("generateLibrary") & value.equalsIgnoreCase("true"))) {
									Generation.this.setTableData(Generation.this.languageTable, Boolean.valueOf(false),
											r, mColIndex);
									printError = true;
								}

								if (printError) {
									try {
										Generation.this.resultsTextPane.setText("");

										Style style = Generation.this.resultsTextPane.addStyle("errorStyle", null);
										StyleConstants.setForeground(style, Color.blue);
										StyleConstants.setBold(style, true);
										StyledDocument doc = Generation.this.resultsTextPane.getStyledDocument();
										doc.insertString(doc.getLength(), Generation.this.getResourceBundle()
												.getString("noLibraryGenerationNet"), doc.getStyle("errorStyle"));
									} catch (BadLocationException ex) {
										throw new RuntimeException(ex);
									}
									Generation.this.resultsTextPane.update(Generation.this.resultsTextPane
											.getGraphics());
									return;
								}
							}
							Generation.this.updateNodeXMLFile(language, key, value);
						}
					}
				}
				break;
			case -1:
				for (int r = firstRow; r <= lastRow; r++)
					;
			}
		}
	}

	class WsdlFileChooserFilter extends FileFilter {
		WsdlFileChooserFilter() {
		}

		public boolean accept(File file) {
			return (file.isDirectory()) || (file.getAbsolutePath().endsWith(".wsdl"));
		}

		public String getDescription() {
			return "Web Service Description Language (.wsdl)";
		}
	}
}