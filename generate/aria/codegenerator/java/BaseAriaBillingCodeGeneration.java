package aria.codegenerator.java;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import aria.codegenerator.common.CodeGeneration;

/**
 * Generate dynamically the AriaBillingBuilder.java class code
 * @author Julio Alexander Guevara
 */
public class BaseAriaBillingCodeGeneration {
	private static final String		CLASS_SUB_PACKAGE	= "sdk/classes";
	private static final String		CLASS_NAME				= "BaseAriaBilling.java";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								wsdlUrl;
	private CodeGeneration				codeGeneration;
	private String								wsdlVersion;

	public BaseAriaBillingCodeGeneration(String wsdlUrl, String generationRoot) {
		super();
		this.wsdlUrl = wsdlUrl;
	}

	/************************************ GETTERS AND SETTERS ****************************************/
	public CodeGeneration getCodeGeneration() {
		if (codeGeneration == null) {
			codeGeneration = CodeGeneration.getInstance();
		}
		return codeGeneration;
	}

	public String getWsdlUrl() {
		return wsdlUrl;
	}

	public String getWsdlVersion() {

		if (wsdlVersion == null) {
			if (wsdlUrl == null) {
				return "";
			}
			try {
			URL data = new URL(wsdlUrl);
			URLConnection dataConnection = data.openConnection();
			DataInputStream dis = new DataInputStream(dataConnection.getInputStream());
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(dis);
			String version = doc.getDocumentElement().getAttribute("targetNamespace");
						
			// https://secure.future.stage.ariasystems.net/api/Advanced/wsdl/5.7/complete-doc_literal_wrapped.wsdl
			//String lookFor = "wsdl/";
			String lookFor = ":vers:";
			
			//int beginIndex = getWsdlUrl().indexOf(lookFor) + lookFor.length();
			int beginIndex = version.indexOf(lookFor) + lookFor.length();
			if (beginIndex > 0) {
				//wsdlVersion = getWsdlUrl().substring(beginIndex, getWsdlUrl().indexOf("/", beginIndex));
				wsdlVersion = version.substring(beginIndex, version.indexOf(":", beginIndex));
			}else{
				wsdlVersion = "";
			}
			} catch (Exception e) {wsdlVersion = "";}
		}

		return wsdlVersion;
	}

	public StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.classes;\n");
			header.append("\n");
			header.append("import java.io.IOException;\n");
			header.append("import java.util.HashMap;\n");
			header.append("import java.util.logging.FileHandler;\n");
			header.append("import java.util.logging.Level;\n");
			header.append("import java.util.logging.Logger;\n");
			header.append("import java.util.logging.SimpleFormatter;\n");
			header.append("\n");
			header.append("import javax.ws.rs.core.MultivaluedMap;\n");
			header.append("\n");
			header.append("import com.aria.common.rest.RestUtilities;\n");
			header.append("\n");
			header.append("/**\n");
			header.append(" * BaseAriaBilling\n");
			header.append(" * Web Service class that abstracts SOAP and REST calls\n");
			header.append(" * @copyright Aria Systems, Inc\n");
			header.append(" * @author PSL - Julio Alexander Guevara Marulanda\n");
			header.append(" */\n");
			header.append("public abstract class BaseAriaBilling {\n");
			header.append("	/*************** CLASS ATTRIBUTES ****************/\n");
			header.append("	protected String version = " + (char) 34 + "" + (char) 34 + ";\n");
			header.append("	public static final String OUTPUT_JSON = " + (char) 34 + "json" + (char) 34 + ";\n");
			header.append("	public static final String OUTPUT_WDDX = " + (char) 34 + "wddx" + (char) 34 + ";\n");
			header.append("	public static final String OUTPUT_HTML = " + (char) 34 + "html" + (char) 34 + ";\n");
			header.append("	public static final String OUTPUT_XML = " + (char) 34 + "xml" + (char) 34 + ";\n");
			header.append("	protected static String logFile;\n");
			header.append("	protected CallType callType = CallType.REST;\n");
			header.append("	protected int timeout = 120;\n");
			header.append("	protected boolean debug;\n");
			header.append("	protected String wsdlName = " + (char) 34 + "complete-doc_literal_wrapped.wsdl" + (char) 34
					+ ";;\n");
			header.append("	protected String wsdlVersion = " + (char) 34 + getWsdlVersion() + (char) 34 + ";\n");
			header.append("	public String URL;\n");
			header.append("	public javax.xml.ws.Holder<java.lang.String> errorMsg;\n");
			header.append("	public javax.xml.ws.Holder<java.lang.Long> errorCode;\n");
			header.append("	public final String RESULT = " + (char) 34 + "result" + (char) 34 + ";\n");
			header.append("	private OutPutFormat outPutFormat;\n");
			header.append("	private HashMap<String,Object> hashMapReturnValues;\n");
			header.append("	private static Logger logger;\n");
			header.append("	private static FileHandler fileHandler;\n");
			header.append("	/*************** END - CLASS ATTRIBUTES  ****************/\n");
			header.append("\n");
			header.append("	/********************** CONSTRUCTOR ***********************/\n");
			header.append("	public BaseAriaBilling(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {\n");
			header.append("		setClassAttributes(baseAriaBillingDTO);\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	/********************** BASE AND GENERAL METHODS ***********************/\n");
			header.append("	public void setClassAttributes(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{\n");
			header.append("		if (baseAriaBillingDTO.getUrl() == null) {\n");
			header.append("			throw new RuntimeException(" + (char) 34 + "URL parameter required" + (char) 34 + " );\n");
			header.append("		}\n");
			header.append("		setLogFile(baseAriaBillingDTO.getLogFile());\n");
			header.append("		setDebug(baseAriaBillingDTO.getDebug());\n");
			header.append("		setCallType(baseAriaBillingDTO.getCallType());\n");
			header.append("		setURL(baseAriaBillingDTO.getUrl());\n");
			header.append("		setOutPutFormat(baseAriaBillingDTO.getOutPutFormat());\n");
			header.append("		validateOutPutFormat();\n");
			header.append("\n");
			header.append("		if (getCallType().equals(CallType.SOAP)){\n");
			header.append("			String dispatcherString = " + (char) 34 + "ws/api_ws_class_dispatcher.php" + (char) 34 + ";\n");
			header.append("			if (getURL().contains(dispatcherString)){\n");
			header.append("				String url = getURL().substring(0, getURL().indexOf(dispatcherString));\n");
			header.append("				url += " + (char) 34 + "Advanced/wsdl/" + (char) 34 + ";\n");
			header.append("				url += getWsdlVersion()+" + (char) 34 + "/" + (char) 34 + ";\n");
			header.append("				url += getWsdlName();\n");
			header.append("				setURL(url);\n");
			header.append("			}\n");
			header.append("		}\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public static FileHandler getFileHandler() {\n");
			header.append("		if (fileHandler == null){\n");
			header.append("			if (getLogFile() == null) throw new RuntimeException(" + (char) 34 + "Log file route required"
					+ (char) 34 + ");\n");
			header.append("			try {\n");
			header.append("				fileHandler = new FileHandler(getLogFile());\n");
			header.append("			} catch (SecurityException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			} catch (IOException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			}\n");
			header.append("			fileHandler.setFormatter(new SimpleFormatter());\n");
			header.append("		}\n");
			header.append("		return fileHandler;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public static Logger getLogger() {\n");
			header.append("		if (logger == null){\n");
			header.append("			String pack = BaseAriaBilling.class.getPackage().getName();\n");
			header.append("			logger = Logger.getLogger(pack+" + (char) 34 + ".BaseAriaBilling" + (char) 34 + ");\n");
			header.append("			logger.setLevel(Level.ALL);\n");
			header.append("		}\n");
			header.append("		return logger;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setMessageToLogger(Level level,String message) {\n");
			header.append("		if (isDebug()){\n");
			header.append("			getLogger().addHandler(getFileHandler());\n");
			header.append("			if (getLogger() == null) throw new RuntimeException(" + (char) 34 + "Logger not initialized"
					+ (char) 34 + " );\n");
			header.append("			logger.log(level,message);\n");
			header.append("		}\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	private void validateOutPutFormat() {\n");
			header.append("		if(getOutPutFormat()==null\n");
			header.append("				||(!getOutPutFormat().equals(OutPutFormat.OUTPUT_WDDX)\n");
			header.append("						&!getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)\n");
			header.append("						&!getOutPutFormat().equals(OutPutFormat.OUTPUT_HTML)\n");
			header.append("						&!getOutPutFormat().equals(OutPutFormat.OUTPUT_XML))){\n");
			header.append("			setOutPutFormat(OutPutFormat.OUTPUT_JSON);\n");
			header.append("		}\n");
			header.append("		setOutPutFormat(OutPutFormat.OUTPUT_JSON);\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public String getValue(String type, Object value) {\n");
			header.append("		return RestUtilities.getValue(type, value);\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	protected void buildHashMapReturnValues(String response,String[] returnValues) {\n");
			header.append("		if (getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)){\n");
			header.append("			setHashMapReturnValues(RestUtilities.buildJSonReturn(response,returnValues));\n");
			header.append("		}else if (getOutPutFormat().equals(OutPutFormat.OUTPUT_WDDX)){\n");
			header.append("			/*\n");
			header.append("			InputSource source = new InputSource(new StringReader(response));\n");
			header.append("			try {\n");
			header.append("				WddxDeserializer wddx = new WddxDeserializer();\n");
			header.append("				Hashtable wddxData = (Hashtable)wddx.deserialize(source);\n");
			header.append("				for (int i = 0;i < returnValues.length;i++){\n");
			header.append("					if (!wddxData.containsKey(returnValues[i])) continue;\n");
			header.append("					getHashMapReturnValues().put(returnValues[i],wddxData.get(returnValues[i]));\n");
			header.append("				}\n");
			header.append("			} catch (WddxDeserializationException e) {\n");
			header.append("			} catch (IOException e) { }\n");
			header.append("			 * */\n");
			header.append("		}\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	protected String buildUrl(String restCallMethod) {\n");
			header.append("		if (getOutPutFormat() == null){\n");
			header.append("			return getURL()+" + (char) 34 + "?rest_call=" + (char) 34 + "+restCallMethod;\n");
			header.append("		}else{\n");
			header.append("			String outPutFormat = " + (char) 34 + "json" + (char) 34 + ";\n");
			header.append("			if (getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)){\n");
			header.append("				outPutFormat = " + (char) 34 + "json" + (char) 34 + ";\n");
			header.append("			}\n");
			header.append("			return getURL()+" + (char) 34 + "?output_format=" + (char) 34 + "+outPutFormat+" + (char) 34
					+ "&rest_call=" + (char) 34 + "+restCallMethod;\n");
			header.append("		}\n");
			header.append("	}\n");
			header.append("\n");
			header
					.append("	protected void addParameters(MultivaluedMap<String, String> parameters, String parmName, String value) {\n");
			header.append("		if (value == null || value.length() <= 0){\n");
			header.append("			return;\n");
			header.append("		}\n");
			header.append("		parameters.add(parmName,value);\n");
			header.append("	}\n");
			header.append("	/********************** END - BASE AND GENERAL METHODS ***********************/\n");
			header.append("\n");
			header.append("	/*************** GETTERS ****************/\n");
			header.append("	public javax.xml.ws.Holder<java.lang.String> getErrorMsg() {\n");
			header.append("		return errorMsg;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public javax.xml.ws.Holder<java.lang.Long> getErrorCode() {\n");
			header.append("		return errorCode;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public HashMap<String, Object> getHashMapReturnValues() {\n");
			header.append("		if (this.hashMapReturnValues == null)\n");
			header.append("			this.hashMapReturnValues = new HashMap<String,Object>();\n");
			header.append("		return this.hashMapReturnValues;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public String getVersion() {\n");
			header.append("		return version;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public static String getLogFile() {\n");
			header.append("		return logFile;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public CallType getCallType() {\n");
			header.append("		return callType;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public int getTimeout() {\n");
			header.append("		return timeout;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public boolean isDebug() {\n");
			header.append("		return debug;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public OutPutFormat getOutPutFormat() {\n");
			header.append("		return outPutFormat;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public String getWsdlName() {\n");
			header.append("		return wsdlName;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public String getWsdlVersion() {\n");
			header.append("		return wsdlVersion;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public String getURL() {\n");
			header.append("		return URL;\n");
			header.append("	}\n");
			header.append("	/*************** END - GETTERS ****************/\n");
			header.append("\n");
			header.append("	/******************* SETTERS ********************/\n");
			header.append("	public void setErrorMsg(javax.xml.ws.Holder<java.lang.String> errorMsg) {\n");
			header.append("		this.errorMsg = errorMsg;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setErrorCode(javax.xml.ws.Holder<java.lang.Long> errorCode) {\n");
			header.append("		this.errorCode = errorCode;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setVersion(String version) {\n");
			header.append("		this.version = version;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setLogFile(String logger) {\n");
			header.append("		BaseAriaBilling.logFile = logger;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setCallType(CallType type) {\n");
			header.append("		this.callType = type;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setTimeout(int timeout) {\n");
			header.append("		this.timeout = timeout;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setDebug(boolean debug) {\n");
			header.append("		this.debug = debug;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setOutPutFormat(OutPutFormat outPutFormat) {\n");
			header.append("		this.outPutFormat = outPutFormat;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setURL(String url) {\n");
			header.append("		this.URL = url;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public void setHashMapReturnValues(HashMap<String, Object> hashMapReturnValues) {\n");
			header.append("		this.hashMapReturnValues = hashMapReturnValues;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	/******************* END - SETTERS ********************/\n");
			header.append("}\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("");
		}
		return footer;
	}

	/********************************* END - GETTERS **********************************************/

	/********************************* MAIN **********************************************/
	public void build() throws IOException {
		StringBuilder resultString = new StringBuilder();
		resultString.append(getHeader());
		resultString.append(getFooter());
		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}
	/********************************* END - MAIN **********************************************/
}
