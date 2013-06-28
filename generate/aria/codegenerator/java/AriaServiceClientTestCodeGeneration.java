package aria.codegenerator.java;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import javax.jws.WebParam;
import aria.codegenerator.common.CodeGeneration;
import com.aria.common.shared.CompletePort;

/** Generate dynamically the AriaBillingComplete class code
 * 
 * @author Julio Alexander Guevara */
public class AriaServiceClientTestCodeGeneration {
	private static final String	CLASS_SUB_PACKAGE	= "sdk/unitTest";
	private static final String	CLASS_NAME	= "AriaServiceClientTest.java";
	private static String					arrayParms;
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								fileDir;
	private String								wsdlUrl;
	private String								generationRoot;
	private CodeGeneration									codeGeneration;

	public AriaServiceClientTestCodeGeneration(String wsdlUrl, String generationRoot) {
		super();
		this.wsdlUrl = wsdlUrl;
		this.generationRoot = generationRoot;
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

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}

	public String getGenerationRoot() {
		return generationRoot;
	}

	public void setGenerationRoot(String generationRoot) {
		this.generationRoot = generationRoot;
	}

	public String getFileDir() {
		if (fileDir == null) {
			fileDir = getGenerationRoot() + "com/aria/sdk/unitTest/AriaServiceClientTest.java";
		}
		return fileDir;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("	/*************************** END - TEST ******************************/\n");
			footer.append("}");
		}
		return footer;
	}

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.unitTest;\n\n");
			header.append("import static org.junit.Assert.assertEquals;\n");
			header.append("\n");
			header.append("import java.util.HashMap;\n");
			header.append("import java.util.Map;\n");
			header.append("\n");
			header.append("import org.junit.Test;\n");
			header.append("\n");
			header.append("import com.aria.common.shared.*;\n");
			header.append("import com.aria.sdk.classes.*;\n");
			header.append("\n");
			header.append("public class AriaServiceClientTest {\n");
			header.append("	/**************************** CLASS ATTRIBUTES ***********************/\n");
			header.append("	public final String ERROR_CODE = " + (char) 34 + "error_code" + (char) 34 + ";\n");
			header.append("	public final String ERROR_MESSAGE = " + (char) 34 + "error_msg" + (char) 34 + ";\n");
			header.append("	public CompletePort completePort;\n");
			header.append("	private long clientNo = 100;\n");
			header.append("	private String authKey = " + (char) 34 + "stEKy9vvN9mKEPTeAdNkfeuUE5CGHknB" + (char) 34 + ";\n");
			header.append("	private Map<String,Object> hashMapReturnValues = new HashMap<String,Object>();\n");
			header.append("	private AriaBillingComplete ariaBillingComplete;\n");
			header.append("	private String dispatcher = " + (char) 34
					+ "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php" + (char) 34 + ";\n");
			header.append("	/**************************** END - CLASS ATTRIBUTES ***********************/\n");
			header.append("\n");
			header.append("	/**************************** GETTERS ***********************/\n");
			header.append("	public AriaBillingComplete getBaseAriaBilling() throws Exception {\n");
			header.append("		if (ariaBillingComplete == null){\n");
			header.append("			/*SOAP CALL*/\n");
			header.append("			BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(dispatcher," + (char) 34
					+ "logger" + (char) 34 + ",false/*Debug*/,CallType.SOAP,null);\n");
			header.append("			/*REST CALL*/\n");
			header.append("			//BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(dispatcher," + (char) 34
					+ "logger" + (char) 34 + ",false/*Debug*/,CallType.REST,OutPutFormat.OUTPUT_JSON);\n");
			header.append("			ariaBillingComplete = AriaBillingBuilder.getAriaSDK(baseAriaBillingDTO);\n");
			header.append("		}\n");
			header.append("		return ariaBillingComplete;\n");
			header.append("	}\n");
			header.append("	public long getClientNo() {\n");
			header.append("		return clientNo;\n");
			header.append("	}\n");
			header.append("	public String getAuthKey() {\n");
			header.append("		return authKey;\n");
			header.append("	}\n");
			header.append("	/**************************** END - GETTERS ***********************/\n\n");
			header.append("	@org.junit.BeforeClass\n");
			header.append("	public static void init() {\n");
			header.append("	}\n");
			header.append("	/*************************** TEST ******************************/\n");
		}
		return header;
	}

	/************************************ END - GETTERS AND SETTERS ****************************************/

	public void build() throws IOException {
		Method[] methods = CompletePort.class.getMethods();
		StringBuilder mainMethod = new StringBuilder();
		mainMethod.append("	@Test\n");
		mainMethod.append("	/* Please, UnComment the method call on which you wnat to do the test */\n");
		mainMethod.append("	public void fullTest() throws Exception{\n");
		StringBuilder allMethods = new StringBuilder();
		for (Method method : methods) {
			arrayParms = "";
			mainMethod.append("		//");
			mainMethod.append(method.getName());
			mainMethod.append("();\n");

			StringBuilder methodDefinition = new StringBuilder();
			methodDefinition.append("	//@Test\n");
			methodDefinition.append("	public void ");
			methodDefinition.append(method.getName());
			methodDefinition.append("() throws Exception {\n");
			StringBuilder methodBody = new StringBuilder();
			methodBody.append("		hashMapReturnValues = getBaseAriaBilling().");
			methodBody.append(method.getName());
			methodBody.append("(");
			methodBody.append(getCallParms(method));
			methodBody.append(");\n");
			methodBody.append("		if (hashMapReturnValues.get(ERROR_CODE) != null) {\n");
			methodBody.append("			String errorMessage = " + (char) 34 + method.getName() + " - " + (char) 34
					+ " + ERROR_CODE + " + (char) 34 + " (" + (char) 34 + " + hashMapReturnValues.get(ERROR_CODE) + " + (char) 34
					+ ") " + (char) 34 + ";\n");
			methodBody.append("			if (hashMapReturnValues.get(ERROR_MESSAGE) != null) {\n");
			methodBody.append("			errorMessage += ERROR_MESSAGE + " + (char) 34 + " (" + (char) 34
					+ " + hashMapReturnValues.get(ERROR_MESSAGE) + " + (char) 34 + ")" + (char) 34 + ";\n");
			methodBody.append("			}\n");
			methodBody.append("			assertEquals(errorMessage, 0L, hashMapReturnValues.get(ERROR_CODE));\n");
			methodBody.append("		}\n");
			methodBody.append("	}\n");
			allMethods.append(methodDefinition.toString() + arrayParms + methodBody.toString() + "\n");
		}
		mainMethod.append("	}");
		String resultString = getHeader() + mainMethod.toString() + "\n\n" + allMethods.toString() + getFooter();
		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}

	@SuppressWarnings("rawtypes")
	private static Object getCallParms(Method method) {
		Class[] parmTypes = method.getParameterTypes();
		Annotation[][] paramanota = method.getParameterAnnotations();
		StringBuilder inParms = new StringBuilder();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN != webParam.mode())
					continue;
				if (inParms.length() != 0)
					inParms.append(", ");
				if (webParam.name().equalsIgnoreCase("client_no")) {
					inParms.append("getClientNo()");
				} else if (webParam.name().equalsIgnoreCase("auth_key")) {
					inParms.append("getAuthKey()");
				} else {
					String parmType = parmTypes[i].getName().toLowerCase();
					if (parmType.contains("long")) {
						inParms.append("1L");
					} else if (parmType.contains("double")) {
						inParms.append("1d");
					} else if (parmType.contains("integer")) {
						inParms.append("1");
					} else if (parmType.contains("string")) {
						inParms.append((char) 34 + "" + (char) 34);
					} else if (parmType.contains("boolean")) {
						inParms.append("true");
					} else if (parmType.contains("array")) {
						String parmName = parmTypes[i].getName().substring(
								parmTypes[i].getName().lastIndexOf(".", parmTypes[i].getName().length()) + 1);
						arrayParms += "		" + parmTypes[i].getName() + " " + parmName + " = " + "new " + parmTypes[i].getName()
								+ "();\n";
						inParms.append(parmName);
					} else if (parmType.contains("date")) {
						inParms.append((char) 34 + "01/01/2010" + (char) 34);
					}
				}
			}
		}
		if (inParms.length() <= 0)
			inParms.append("");
		return inParms;
	}
}
