// Decompiled by DJ v3.6.6.79 Copyright 2004 Atanas Neshkov  Date: 8/15/2013 9:42:52 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   GenerationAdmin.java

package aria.codegenerator.gui;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Map;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.wsdl.Binding;
import javax.wsdl.Definition;
import javax.wsdl.Operation;
import javax.wsdl.PortType;
import javax.wsdl.WSDLException;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.wsdl.xml.WSDLWriter;

public class GenerationAdmin {

	public GenerationAdmin() {
	}

	public void generateCode(String wsdl, String pkgPath, JTextPane resultsTextArea) {
		setWsdlUrl(wsdl);
		setPackagePath(pkgPath);
		setResultsTextArea(resultsTextArea);
		prepareResultTextStyles();
		try {
			baseCodeGenerator();
		} catch (Exception e) {
			showProcessText(e.getMessage(), ERROR);
		}
		System.out.println(getResultsTextArea().getText());
	}

	private void baseCodeGenerator() throws IOException {
		showProcessText("Code generation in process", HEADER);
		showProcessText("Shared Files", INIT_PROCESS);
		if (createCXF_Resources() != 0) {
			showProcessText("CXF resource building error.", ERROR);
			return;
		} else {
			showProcessText("Shared Files", END_PROCESS);
			return;
		}
	}

	private int createCXF_Resources() throws FileNotFoundException, IOException {
		String parentpath = (new File("")).getAbsolutePath();
		createPropertiesFile(parentpath);
		String apacheANT = "apache-ant";
		StringBuilder wsdl2JavaCall = new StringBuilder("SET PATH=%PATH%;");
		wsdl2JavaCall.append(parentpath);
		wsdl2JavaCall.append("/");
		wsdl2JavaCall.append(apacheANT);
		wsdl2JavaCall.append("/bin\n\r");
		wsdl2JavaCall.append("ant -buildfile build.xml");
		String batName = (new StringBuilder()).append(parentpath).append("\\ARIA_SDK_BUILDER.bat").toString();
		File file = new File(batName);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeBytes(wsdl2JavaCall.toString());
		dos.close();
		String cmd = (new StringBuilder()).append("\"").append(batName).append("\"").toString();
		Process pr = Runtime.getRuntime().exec(cmd);
		int result = 1;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			for (String line = null; (line = in.readLine()) != null;)
				showProcessText(line, MESSAGE);

			pr.waitFor();
			result = pr.exitValue();
		} catch (InterruptedException e) {
			showProcessText(e.getMessage(), ERROR);
		}
		return result;
	}

	private void createPropertiesFile(String parentpath) throws FileNotFoundException, IOException {
		String wsdlUrl = getWsdlUrl();
		wsdlUrl = buildComponents(wsdlUrl, parentpath);
		StringBuilder antPropertiesFile = new StringBuilder();
		antPropertiesFile.append("cxf.home=");
		antPropertiesFile.append(parentpath);
		antPropertiesFile.append("/apache-cxf");
		antPropertiesFile.append("\n\rcxf.dest.dir=");
		antPropertiesFile.append(parentpath);
		antPropertiesFile.append("/generate");
		antPropertiesFile.append("\n\rcxf.wsdl.targetnamespace=");
		antPropertiesFile.append(getwsdlInstance().getTargetNamespace());
		antPropertiesFile.append("=com.aria.common.shared");
		antPropertiesFile.append("\n\rcxf.wsdl.url=");
		antPropertiesFile.append(wsdlUrl);
		File file = new File((new StringBuilder()).append(parentpath).append("\\build.properties").toString());
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeBytes(antPropertiesFile.toString().replaceAll("\\\\", "/"));
		dos.close();
	}

	// Method to form a temporary wsdl without the create_acct_hierarchy api to avoid 'too many parameters' compilation error
	private String buildComponents(String wsdlURI, String parentPath) throws RuntimeException {
		String wsdlFile = parentPath + File.separator + "wsdl_no_create_acct_hier.wsdl";
		String apiNameToRemove = "create_acct_hierarchy";
		showProcessText("Creating temp wsdl file without create_acct_hierarchy api: " + wsdlFile, INIT_PROCESS);
		try {
			// Create the WSDL Reader object
			WSDLReader reader = WSDLFactory.newInstance().newWSDLReader();
			WSDLWriter writer = WSDLFactory.newInstance().newWSDLWriter();
			// Read the WSDL and get the top-level Definition object
			Definition def = reader.readWSDL(null, wsdlURI);

			// Get the services defined in the document
			Map bindings = def.getBindings();
			// Remove the api from binding
			Binding binding = (Binding) bindings.values().iterator().next();
			binding.removeBindingOperation(apiNameToRemove, null, null);

			Map ports = def.getPortTypes();
			PortType portType = (PortType) ports.values().iterator().next();
			for (int i = 0; i < portType.getOperations().size(); i++) {
				Operation operation = (Operation) portType.getOperations().get(i);
				if (operation.getName().equals(apiNameToRemove)) {
					// Remove the input and output definitions of the api
					def.removeMessage(operation.getInput().getMessage().getQName());
					def.removeMessage(operation.getOutput().getMessage().getQName());
				}
			}
			// Remove the operation definition of the api
			portType.removeOperation(apiNameToRemove, null, null);

			writer.writeWSDL(def, new FileOutputStream(wsdlFile));
			showProcessText("Temp wsdl file created", END_PROCESS);
		} catch (Throwable t) {
			// Process the error/exception
			System.err.println(t.getMessage());
			throw new RuntimeException(t);
		}
		return wsdlFile;
	}

	private static void showProcessText(String object, int type) {
		String text = "";
		String messageStyle = "messageStyle";
		switch (type) {
		case 4: // '\004'
			if (getResultsTextArea() != null && getResultsTextArea().getText() != null
					&& getResultsTextArea().getText().length() > 0)
				text = "\n";
			text = (new StringBuilder()).append(text).append(object).toString();
			messageStyle = "headerStyle";
			break;

		case 5: // '\005'
			text = object;
			messageStyle = "headerStyle";
			break;

		case 0: // '\0'
			text = (new StringBuilder()).append("Generating ").append(object).append("...").toString();
			messageStyle = "initProcessStyle";
			break;

		case 1: // '\001'
			text = (new StringBuilder()).append("Generation of ").append(object).append(" Finished successfully.")
					.toString();
			messageStyle = "endProcessStyle";
			break;

		case 2: // '\002'
			text = object;
			messageStyle = "messageStyle";
			break;

		case 3: // '\003'
			text = object;
			messageStyle = "errorStyle";
			break;
		}
		if (type != 2)
			text = (new StringBuilder()).append(text).append(" - Date time: ").append(Calendar.getInstance().getTime())
					.toString();
		System.out.println(text);
		setResultText(text, messageStyle);
	}

	private static void setResultText(String text, String style) {
		if (getResultsTextArea() == null)
			return;
		text = (new StringBuilder()).append(text).append("\n").toString();
		StyledDocument doc = getResultsTextArea().getStyledDocument();
		try {
			doc.insertString(doc.getLength(), text, doc.getStyle(style));
		} catch (BadLocationException e) {
			throw new RuntimeException(e);
		}
		resultsTextArea.update(resultsTextArea.getGraphics());
	}

	private static JTextPane getResultsTextArea() {
		return resultsTextArea;
	}

	private static String getWsdlUrl() {
		return wsdlUrl;
	}

	private static String getPackagePath() {
		return packagePath;
	}

	private Definition getwsdlInstance() {
		if (wsdlInstance == null)
			try {
				WSDLFactory wsdlFactory = WSDLFactory.newInstance();
				WSDLReader wsdlReader = wsdlFactory.newWSDLReader();
				showProcessText((new StringBuilder()).append("Retrieving document at: ").append(getWsdlUrl())
						.toString(), 2);
				wsdlInstance = wsdlReader.readWSDL(null, getWsdlUrl());
			} catch (WSDLException e) {
				e.printStackTrace();
			}
		return wsdlInstance;
	}

	private void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	private void setResultsTextArea(JTextPane resultsTextArea) {
		this.resultsTextArea = resultsTextArea;
	}

	private void setWsdlUrl(String wsdl) {
		this.wsdlUrl = wsdl;
	}

	private void prepareResultTextStyles() {
		javax.swing.text.Style style = resultsTextArea.addStyle("initProcessStyle", null);
		StyleConstants.setForeground(style, Color.darkGray);
		StyleConstants.setBold(style, true);
		style = resultsTextArea.addStyle("endProcessStyle", null);
		StyleConstants.setForeground(style, Color.darkGray);
		StyleConstants.setBold(style, true);
		style = resultsTextArea.addStyle("messageStyle", null);
		StyleConstants.setForeground(style, Color.darkGray);
		style = resultsTextArea.addStyle("errorStyle", null);
		StyleConstants.setForeground(style, Color.red);
		StyleConstants.setBold(style, true);
		style = resultsTextArea.addStyle("headerStyle", null);
		StyleConstants.setForeground(style, Color.blue);
		StyleConstants.setBold(style, true);
	}

	public static final int INIT_PROCESS = 0;
	public static final int END_PROCESS = 1;
	public static final int MESSAGE = 2;
	public static final int ERROR = 3;
	public static final int HEADER = 4;
	public static final int FOOTER = 5;
	public static final String INIT_PROCESS_STYLE = "initProcessStyle";
	public static final String END_PROCESS_STYLE = "endProcessStyle";
	public static final String MESSAGE_STYLE = "messageStyle";
	public static final String ERROR_STYLE = "errorStyle";
	public static final String HEADER_STYLE = "headerStyle";
	public static final String FOOTER_STYLE = "footerStyle";
	private static String wsdlUrl;
	private static String packagePath;
	private static JTextPane resultsTextArea;
	private Definition wsdlInstance;
}