package aria.codegenerator.common;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Calendar;

import javax.jws.WebParam;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.wsdl.Definition;
import javax.wsdl.WSDLException;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import aria.codegenerator.java.AriaBillingBuilderCodeGeneration;
import aria.codegenerator.java.AriaBillingCompleteCodeGeneration;
import aria.codegenerator.java.AriaBillingCompleteRESTCodeGeneration;
import aria.codegenerator.java.AriaBillingCompleteSOAPCodeGeneration;
import aria.codegenerator.java.AriaServiceClientTestCodeGeneration;
import aria.codegenerator.java.BaseAriaBillingCodeGeneration;
import aria.codegenerator.java.BaseAriaBillingDTOCodeGeneration;
import aria.codegenerator.java.CallTypeCodeGeneration;
import aria.codegenerator.java.OutPutFormatCodeGeneration;
import aria.codegenerator.java.RestUtilitiesCodeGeneration;
import aria.codegenerator.net.AriaBillingCompleteRESTCodeGenerationNet;
import aria.codegenerator.net.AriaServiceClientTestCodeGenerationNet;
import aria.codegenerator.net.RestUtilitiesCodeGenerationNet;

public class CodeGeneration {
	public static final int				INIT_PROCESS				= 0;
	public static final int				END_PROCESS					= 1;
	public static final int				MESSAGE							= 2;
	public static final int				ERROR								= 3;
	public static final int				HEADER							= 4;
	public static final int				FOOTER							= 5;
	public static final String		INIT_PROCESS_STYLE	= "initProcessStyle";
	public static final String		END_PROCESS_STYLE		= "endProcessStyle";
	public static final String		MESSAGE_STYLE				= "messageStyle";
	public static final String		ERROR_STYLE					= "errorStyle";
	public static final String		HEADER_STYLE				= "headerStyle";
	public static final String		FOOTER_STYLE				= "footerStyle";
	private static String					wsdlUrl;
	private static String					sourcePath;
	private static String					packagePath;
	private static CodeGeneration	instance;
	private static JTextPane			resultsTextArea;
	private static String[]				languagesArray;
	private Definition						wsdlInstance;
	private static String tempoGenerationFolder;

	/* *********************************** GETTERS AND SETTERS *************************************** */
	/** Instantiate the class */
	public static CodeGeneration getInstance() {
		if (instance == null) {
			instance = new CodeGeneration();
		}
		return instance;
	}

	public static String[] getLanguageArray() {
		if (languagesArray == null) {
			try {
				File file = getXmlFile();
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(file);
				doc.getDocumentElement().normalize();
				NodeList nodeList = doc.getElementsByTagName("langParameters");
				languagesArray = new String[nodeList.getLength()];
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node fstNode = nodeList.item(i);
					if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
						Element fstElmnt = (Element) fstNode;
						NodeList fstNmElmntLst;
						Element fstNmElmnt;
						NodeList fstNm;
						/* Language name */
						fstNmElmntLst = fstElmnt.getElementsByTagName("language");
						fstNmElmnt = (Element) fstNmElmntLst.item(0);
						fstNm = fstNmElmnt.getChildNodes();
						String language = ((Node) fstNm.item(0)).getNodeValue();
						languagesArray[i] = language;
					}
				}
			}
			catch (Exception e) {
				showProcessText("Error reading xml file: "+getXmlFile()+" Exception:"+e.getMessage(), ERROR);
			}
		}
		return languagesArray;
	}

	public static JTextPane getResultsTextArea() {
		return resultsTextArea;
	}

	public static String getWsdlUrl() {
		return wsdlUrl;
	}

	public static String getSourcePath() {
		return sourcePath;
	}

	public static String getPackagePath() {
		return packagePath;
	}

	public String getTempoGenerationFolder() {
		return tempoGenerationFolder;
	}

	public Definition getwsdlInstance() {
		if (wsdlInstance == null) {
			try {
				WSDLFactory wsdlFactory;
				wsdlFactory = WSDLFactory.newInstance();
				WSDLReader wsdlReader = wsdlFactory.newWSDLReader();
				showProcessText("Retrieving document at: " + getWsdlUrl(), CodeGeneration.MESSAGE);
				wsdlInstance = (Definition) wsdlReader.readWSDL(null, getWsdlUrl());
			}
			catch (WSDLException e) {
				e.printStackTrace();
			}
		}
		return wsdlInstance;
	}

	public static void setPackagePath(String packagePath) {
		CodeGeneration.packagePath = packagePath;
	}

	public static void setSourcePath(String path) {
		CodeGeneration.sourcePath = path;
	}

	public static void setTempoGenerationFolder(String tempoGenerationFolder) {
		CodeGeneration.tempoGenerationFolder = tempoGenerationFolder;
	}

	public static void setResultsTextArea(JTextPane resultsTextArea) {
		CodeGeneration.resultsTextArea = resultsTextArea;
	}

	public static void setWsdlUrl(String wsdl) {
		CodeGeneration.wsdlUrl = wsdl;
	}

	/* *********************************** END - GETTERS AND SETTERS *************************************** */

	/* ************************************ MAIN METHODS *************************************************** */
	public static void main(String[] args) throws IOException, WSDLException {
		generationProcess();
	}

	private static void generationProcess() {
		int totalLanguagesGenerated = 0;
		String sourcePathL = getBasicSettingsFromXML("sourcePath");
		String wsdl = getBasicSettingsFromXML("wsdl");
		String packagePathL = getBasicSettingsFromXML("packagePath");
		setWsdlUrl(wsdl);
		JTextPane resultsTextArea = new JTextPane();
		setResultsTextArea(resultsTextArea);
		prepareResultTextStyles();

		for (int i = 0; i < getLanguageArray().length; i++) {
			String language = getLanguageArray()[i];
			setTempoGenerationFolder("generate/"+language);
			String generateText = getLanguageParametersFromXML("language", language, "generate");
			boolean generate = false;
			if (generateText.equalsIgnoreCase("true")) {
				generate = true;
			}

			if (!generate) {
//				continue;
			}

			String specSourcePath = getLanguageParametersFromXML("language", language, "sourcePath");
			if (specSourcePath != null && specSourcePath.length() > 0) {
				sourcePathL = specSourcePath;
			} else {
				sourcePathL += "/" + language;
			}

			String specPackagePath = getLanguageParametersFromXML("language", language, "packagePath");
			if (specPackagePath != null && specPackagePath.length() > 0) {
				packagePathL = specPackagePath;
			}else{
				if (specSourcePath != null && specSourcePath.length() > 0) {
					packagePathL = "";
				}
			}

			setSourcePath(sourcePathL);
			setPackagePath(packagePathL);
			generateCode(language);
			totalLanguagesGenerated++;
		}
		if (totalLanguagesGenerated == 0) {
			showProcessText("No Language Selected", ERROR);
		}
	}

	private static void generateCode(String language) {
		String methodName = "";
		if (language.equalsIgnoreCase("Java")) {
			methodName = "codeGeneratorJAVA";
		} else if (language.equalsIgnoreCase(".NET")) {
			methodName = "codeGeneratorNET";
		} else if (language.equalsIgnoreCase("PHP")) {
			methodName = "codeGeneratorPHP";
		} else {
			showProcessText("Undefined language: (" + language + ")", ERROR);
			return;
		}

		try {
			Class<?>[] classes = {};
			Method method = CodeGeneration.class.getDeclaredMethod(methodName, classes);
			method.invoke(new CodeGeneration());
		}
		catch (SecurityException e) {
			throw new RuntimeException(e);
		}
		catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
		catch (IllegalArgumentException e) {
			throw new RuntimeException(e);
		}
		catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	public static void codeGeneratorJAVA() throws IOException, WSDLException {
		showProcessText("JAVA code generation in process", HEADER);

		AriaBillingBuilderCodeGeneration ariaBillingBuilderCodeGeneration = new AriaBillingBuilderCodeGeneration(
				getWsdlUrl(), getSourcePath());
		showProcessText(AriaBillingBuilderCodeGeneration.class.getName(), INIT_PROCESS);
		ariaBillingBuilderCodeGeneration.build();
		showProcessText(AriaBillingBuilderCodeGeneration.class.getName(), END_PROCESS);

		AriaBillingCompleteCodeGeneration ariaBillingComplete = new AriaBillingCompleteCodeGeneration(getWsdlUrl(),
				getSourcePath(), getPackagePath());
		showProcessText(AriaBillingCompleteCodeGeneration.class.getName(), INIT_PROCESS);
		ariaBillingComplete.build();
		showProcessText(AriaBillingCompleteCodeGeneration.class.getName(), END_PROCESS);

		AriaBillingCompleteRESTCodeGeneration ariaBillingCompleteRest = new AriaBillingCompleteRESTCodeGeneration(
				getWsdlUrl(), getSourcePath());
		showProcessText(AriaBillingCompleteRESTCodeGeneration.class.getName(), INIT_PROCESS);
		ariaBillingCompleteRest.build();
		showProcessText(AriaBillingCompleteRESTCodeGeneration.class.getName(), END_PROCESS);

		AriaBillingCompleteSOAPCodeGeneration ariaBillingCompleteSoap = new AriaBillingCompleteSOAPCodeGeneration(
				getWsdlUrl(), getSourcePath());
		showProcessText(AriaBillingCompleteSOAPCodeGeneration.class.getName(), INIT_PROCESS);
		ariaBillingCompleteSoap.build();
		showProcessText(AriaBillingCompleteSOAPCodeGeneration.class.getName(), END_PROCESS);

		BaseAriaBillingCodeGeneration baseAriaBillingCodeGeneration = new BaseAriaBillingCodeGeneration(getWsdlUrl(),
				getSourcePath());
		showProcessText(BaseAriaBillingCodeGeneration.class.getName(), INIT_PROCESS);
		baseAriaBillingCodeGeneration.build();
		showProcessText(BaseAriaBillingCodeGeneration.class.getName(), END_PROCESS);

		BaseAriaBillingDTOCodeGeneration baseAriaBillingDTOCodeGeneration = new BaseAriaBillingDTOCodeGeneration(
				getWsdlUrl(), getSourcePath());
		showProcessText(BaseAriaBillingDTOCodeGeneration.class.getName(), INIT_PROCESS);
		baseAriaBillingDTOCodeGeneration.build();
		showProcessText(BaseAriaBillingDTOCodeGeneration.class.getName(), END_PROCESS);

		CallTypeCodeGeneration callTypeCodeGeneration = new CallTypeCodeGeneration(getWsdlUrl(), getSourcePath());
		showProcessText(CallTypeCodeGeneration.class.getName(), INIT_PROCESS);
		callTypeCodeGeneration.build();
		showProcessText(CallTypeCodeGeneration.class.getName(), END_PROCESS);

		OutPutFormatCodeGeneration outPutFormatCodeGeneration = new OutPutFormatCodeGeneration(getWsdlUrl(),
				getSourcePath());
		showProcessText(OutPutFormatCodeGeneration.class.getName(), INIT_PROCESS);
		outPutFormatCodeGeneration.build();
		showProcessText(OutPutFormatCodeGeneration.class.getName(), END_PROCESS);

		AriaServiceClientTestCodeGeneration completePortClientTest = new AriaServiceClientTestCodeGeneration(getWsdlUrl(),
				getSourcePath());
		showProcessText(AriaServiceClientTestCodeGeneration.class.getName(), INIT_PROCESS);
		completePortClientTest.build();
		showProcessText(AriaServiceClientTestCodeGeneration.class.getName(), END_PROCESS);

		RestUtilitiesCodeGeneration restUtilities = new RestUtilitiesCodeGeneration(getWsdlUrl(), getSourcePath());
		showProcessText(RestUtilitiesCodeGeneration.class.getName(), INIT_PROCESS);
		restUtilities.build();
		showProcessText(RestUtilitiesCodeGeneration.class.getName(), END_PROCESS);

		showProcessText("JAVA code generation finished successfully", FOOTER);
	}

	public void codeGeneratorNET() throws IOException, WSDLException {
		showProcessText(".NET code generation in process", HEADER);

		AriaBillingCompleteRESTCodeGenerationNet ariaBillingCompleteRest = new AriaBillingCompleteRESTCodeGenerationNet(
				getWsdlUrl(), getSourcePath());
		showProcessText(AriaBillingCompleteRESTCodeGeneration.class.getName(), INIT_PROCESS);
		ariaBillingCompleteRest.build();
		showProcessText(AriaBillingCompleteRESTCodeGeneration.class.getName(), END_PROCESS);

		AriaServiceClientTestCodeGenerationNet completePortClientTest = new AriaServiceClientTestCodeGenerationNet(getWsdlUrl(),
				getSourcePath());
		showProcessText(AriaServiceClientTestCodeGeneration.class.getName(), INIT_PROCESS);
		completePortClientTest.build();
		showProcessText(AriaServiceClientTestCodeGeneration.class.getName(), END_PROCESS);

		RestUtilitiesCodeGenerationNet restUtilities = new RestUtilitiesCodeGenerationNet(getWsdlUrl(), getSourcePath());
		showProcessText(RestUtilitiesCodeGeneration.class.getName(), INIT_PROCESS);
		restUtilities.build();
		showProcessText(RestUtilitiesCodeGeneration.class.getName(), END_PROCESS);

		showProcessText(".NET code generation finished successfully", FOOTER);
	}

	public void codeGeneratorPHP() throws IOException, WSDLException {
		showProcessText("PHP code generation in process", HEADER);
		showProcessText("UnImplemented language generation: (codeGeneratorPHP)", ERROR);
		showProcessText("Exit PHP code generation", FOOTER);
	}

	private void createPropertiesFile(String parentpath) throws FileNotFoundException, IOException {
		StringBuilder antPropertiesFile = new StringBuilder();

		// CXF Home
		antPropertiesFile.append("cxf.home=");
		antPropertiesFile.append(parentpath);
		antPropertiesFile.append("/apache-cxf-2.3.1");

		// Dest Dir
		antPropertiesFile.append("\n\rcxf.dest.dir=");
		antPropertiesFile.append(parentpath);
		antPropertiesFile.append("/");
		antPropertiesFile.append(getPackagePath());
		antPropertiesFile.append("/common");

		// Namespace
		antPropertiesFile.append("\n\rcxf.wsdl.targetnamespace=");
		antPropertiesFile.append(getwsdlInstance().getTargetNamespace());
		antPropertiesFile.append("=shared");

		// Namespace
		antPropertiesFile.append("\n\rcxf.wsdl.url=");
		antPropertiesFile.append(getWsdlUrl());

		// Se crea el archivo.
		File file = new File(parentpath + "\\build.properties");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeBytes(antPropertiesFile.toString().replaceAll("\\\\", "/"));
		dos.close();
	}

	@SuppressWarnings("unused")
	private int createCXF_Resources() throws FileNotFoundException, IOException {
		String parentpath = new File("").getAbsolutePath();

		// Se crea el archivo de propiedades para el ANT
		createPropertiesFile(parentpath);

		/* ********************** EXECUTE ANT - 1.8.2 *********************** */
		String apacheANT = "apache-ant";
		StringBuilder wsdl2JavaCall = new StringBuilder("SET PATH=%PATH%;");
		wsdl2JavaCall.append(parentpath);
		wsdl2JavaCall.append("/");
		wsdl2JavaCall.append(apacheANT);
		wsdl2JavaCall.append("/bin\n\r");
		wsdl2JavaCall.append("ant -buildfile build.xml");

		String batName = parentpath + "\\ARIA_SDK_BUILDER.bat";
		File file = new File(batName);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeBytes(wsdl2JavaCall.toString());
		dos.close();

		String cmd = "\"" + batName + "\"";

		// Se ejecuta el comando.
		Process pr = Runtime.getRuntime().exec(cmd);

		int result = 1;
		try {
			// Se imprime el resultado del proceso.
			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = null;
			while ((line = in.readLine()) != null) {
				showProcessText(line, MESSAGE);
			}

			// Se espera a que termine de procesar el comando.
			pr.waitFor();

			// Se obtiene el resultado del proceso que se ejecutó
			result = pr.exitValue();
		}
		catch (InterruptedException e) {
			// No terminó correctamente
		}
		return result;
		// //////////////////EJECUTAR EL ANT ////////////////////////
	}
	/* *********************** END - MAIN METHODS ************************************** */

	/* *********************** GENERAL METHODS ************************************** */
	public File writeFile(String classSubPackage, String className, String resultString) {
		String fileDir = ".\\" + getTempoGenerationFolder() + "\\" + getPackagePath() + "\\" + classSubPackage + "\\"
				+ className;
		try {
			File file = new File(fileDir);
			if (!file.exists()) {
				if (!file.getParentFile().exists()) {
					showProcessText("Creating missing directories at: (" + fileDir + ")", MESSAGE);
					if (file.getParentFile() != null && !file.getParentFile().mkdirs()) {
						/* handle permission problems here */
						showProcessText(
								"No permissions on the root directory or some error ocurred during directories creation",
								MESSAGE);
					}
				}
				showProcessText("Creating file: (" + fileDir + ")", MESSAGE);
				if (!file.createNewFile()) {
					showProcessText("Could not create: " + fileDir, ERROR);
				}
			}
			showProcessText("Writting on file: (" + fileDir + ")", MESSAGE);
			if (file.isFile()) {
				/* ready to write your content */
				Writer output = null;
				output = new BufferedWriter(new FileWriter(file));
				output.write(resultString.toString());
				output.close();
				return file;
			} else {
				/* handle directory here */
			}
		}
		catch (IOException e) {}
		return null;
	}

	public static void showProcessText(String object, int type) {
		String text = "";
		String messageStyle = MESSAGE_STYLE;
		switch (type) {
			case HEADER:
				if (getResultsTextArea() != null) {
					if (getResultsTextArea().getText() != null && getResultsTextArea().getText().length() > 0) {
						text = "\n";
					}
				}
				text += object;
				messageStyle = HEADER_STYLE;
				break;
			case FOOTER:
				text = object;
				messageStyle = HEADER_STYLE;
				break;
			case INIT_PROCESS:
				text = "Generating " + object + "...";
				messageStyle = INIT_PROCESS_STYLE;
				break;
			case END_PROCESS:
				text = "Generation of " + object + " Finished successfully.";
				messageStyle = END_PROCESS_STYLE;
				break;
			default:
				break;
			case MESSAGE:
				text = object;
				messageStyle = MESSAGE_STYLE;
				break;
			case ERROR:
				text = object;
				messageStyle = ERROR_STYLE;
				break;
		}
		if (type != MESSAGE) {
			text += " - Date time: " + Calendar.getInstance().getTime();
		}
		System.out.println(text);
		setResultText(text, messageStyle);
	}

	public static void setResultText(String text, String style) {
		if (getResultsTextArea() == null) {
			return;
		}
		text += "\n";
		StyledDocument doc = getResultsTextArea().getStyledDocument();
		try {
			doc.insertString(doc.getLength(), text, doc.getStyle(style));
		}
		catch (BadLocationException e) {
			throw new RuntimeException(e);
		}
		resultsTextArea.update(resultsTextArea.getGraphics());
	}

	public static void prepareResultTextStyles() {
		Style style;
		/* This one makes text bold and blue */
		style = resultsTextArea.addStyle(INIT_PROCESS_STYLE, null);
		StyleConstants.setForeground(style, Color.darkGray);
		StyleConstants.setBold(style, true);

		/* This one makes text bold and blue */
		style = resultsTextArea.addStyle(END_PROCESS_STYLE, null);
		StyleConstants.setForeground(style, Color.darkGray);
		StyleConstants.setBold(style, true);

		/* This one makes text dark grey */
		style = resultsTextArea.addStyle(MESSAGE_STYLE, null);
		StyleConstants.setForeground(style, Color.darkGray);

		/* Makes text red */
		style = resultsTextArea.addStyle(ERROR_STYLE, null);
		StyleConstants.setForeground(style, Color.red);
		StyleConstants.setBold(style, true);

		/* Makes text blue and bold */
		style = resultsTextArea.addStyle(HEADER_STYLE, null);
		StyleConstants.setForeground(style, Color.blue);
		StyleConstants.setBold(style, true);
	}

	private static String getGeneratorFilesPath() {
		return "GeneratorFiles/";
	}

	private static String getXmlFilePath() {
		return getGeneratorFilesPath() + "GenerationParms.xml";
	}

	private static File getXmlFile() {
		File file = new File(getXmlFilePath());
		file = file.getAbsoluteFile();
		return file;
	}

	public static String getBasicSettingsFromXML(String nodeName) {
		String ret = "";
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("basicSettings");
			for (int s = 0; s < nodeList.getLength(); s++) {
				Node fstNode = nodeList.item(s);
				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
					Element fstElmnt = (Element) fstNode;

					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName(nodeName);
					if (lstNmElmntLst == null) {
						break;
					}
					Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList lstNm = lstNmElmnt.getChildNodes();
					ret = ((Node) lstNm.item(0)).getNodeValue();
					break;
				}
			}
		}
		catch (Exception e) {}
		return ret;
	}

	public static String getLanguageParametersFromXML(String parentNodeName, String id, String nodeName) {
		String ret = "";
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("langParameters");
			for (int s = 0; s < nodeList.getLength(); s++) {
				Node fstNode = nodeList.item(s);
				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
					Element fstElmnt = (Element) fstNode;

					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName(parentNodeName);
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					String nodeValue = ((Node) fstNm.item(0)).getNodeValue();
					if (!nodeValue.equalsIgnoreCase(id)) {
						continue;
					}

					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName(nodeName);
					if (lstNmElmntLst == null) {
						break;
					}
					Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList lstNm = lstNmElmnt.getChildNodes();
					ret = ((Node) lstNm.item(0)).getNodeValue();
					break;
				}
			}
		}
		catch (Exception e) {}
		return ret;
	}

	@SuppressWarnings("unused")
	private String getlanguagesNodeValueFromXML(String nodeName) {
		try {
			File file = getXmlFile();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("langParameters");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node fstNode = nodeList.item(i);
				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
					Element fstElmnt = (Element) fstNode;
					NodeList fstNmElmntLst;
					Element fstNmElmnt;
					NodeList fstNm;
					/* Language name */
					if (nodeName.equalsIgnoreCase("language")) {
						fstNmElmntLst = fstElmnt.getElementsByTagName("language");
						fstNmElmnt = (Element) fstNmElmntLst.item(0);
						fstNm = fstNmElmnt.getChildNodes();
						String language = ((Node) fstNm.item(0)).getNodeValue();
						return language;
					}

					/* Generate true or false */
					if (nodeName.equalsIgnoreCase("generate")) {
						fstNmElmntLst = fstElmnt.getElementsByTagName("generate");
						fstNmElmnt = (Element) fstNmElmntLst.item(0);
						fstNm = fstNmElmnt.getChildNodes();
						String generateText = ((Node) fstNm.item(0)).getNodeValue();
						return generateText;
					}

					/* Generate Library true or false */
					if (nodeName.equalsIgnoreCase("generateLibrary")) {
						fstNmElmntLst = fstElmnt.getElementsByTagName("generateLibrary");
						fstNmElmnt = (Element) fstNmElmntLst.item(0);
						fstNm = fstNmElmnt.getChildNodes();
						String generateLibText = ((Node) fstNm.item(0)).getNodeValue();
						return generateLibText;
					}
				}
			}
		}
		catch (Exception e) {}
		return "";
	}

	public static String getParamType(Method method, int paramIndex, WebParam webParam) {
		Class[] parmTypes = method.getParameterTypes();
		String paramType = "";
		if (WebParam.Mode.IN == webParam.mode()) {
			paramType = parmTypes[paramIndex].getName();
			String parmType = paramType.toLowerCase();
			if (parmType.contains("long")){
				paramType = "Long";
			} else if (parmType.contains("string")){
				paramType = "String";
			} else if (parmType.contains("double")){
				paramType = "Double";
			}
		} else if (WebParam.Mode.INOUT == webParam.mode()) {
			paramType = CodeGeneration.getParamType(method, paramIndex);
		}
		return paramType;
	}

	public static String getParamType(Method method, int paramIndex) {
		Class[] parmTypes = method.getParameterTypes();
		Type[] genericTypes = method.getGenericParameterTypes();
		String parmType = parmTypes[paramIndex].getName();
		if( genericTypes[paramIndex] instanceof ParameterizedType ) {
			Type[] types = ((ParameterizedType)genericTypes[paramIndex]).getActualTypeArguments();
			if(types != null && types.length >0 && (types[0] instanceof Class<?>) ) {  
				parmType = ((Class<?>) (Class<?>) types[0]).getName();  
			}
		}
		return parmType;
	}

	/* *********************** END - GENERAL METHODS ************************************** */
}
