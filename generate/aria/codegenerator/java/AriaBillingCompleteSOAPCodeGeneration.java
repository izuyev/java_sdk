package aria.codegenerator.java;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.jws.WebParam;
import aria.codegenerator.common.CodeGeneration;

/** Generate dynamically the AriaBillingComplete class code
 * 
 * @author Diego trejos, Julio Alexander Guevara */
public class AriaBillingCompleteSOAPCodeGeneration {
	private static final String	CLASS_SUB_PACKAGE	= "sdk/classes";
	private static final String	CLASS_NAME	= "AriaBillingCompleteSoap.java";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								fileDir;
	private String								wsdlUrl;
	private String								generationRoot;
	private CodeGeneration									codeGeneration;

	public AriaBillingCompleteSOAPCodeGeneration(String wsdlUrl, String generationRoot) {
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
		if (fileDir == null)
			fileDir = getGenerationRoot() + "com/aria/sdk/classes/AriaBillingCompleteSoap.java";
		return fileDir;
	}

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.classes;\n\n");
			header.append("import java.net.MalformedURLException;\n");
			header.append("import java.net.URL;\n");
			header.append("import java.util.Map;\n");
			header.append("import com.aria.common.shared.AriaCompleteApi;\n");
			header.append("import com.aria.common.shared.CompletePort;\n");
			header.append("\n");
			header.append("/**\n");
			header.append(" * AriaBillingCompleteSoap\n");
			header.append(" * Web Service class\n");
			header.append(" * @copyright Aria Systems, Inc\n");
			header.append(" * @author (Automatic generated) PSL - Julio Alexander Guevara Marulanda\n");
			header.append(" */\n");
			header.append("public class AriaBillingCompleteSoap extends BaseAriaBilling implements AriaBillingComplete {\n");
			header.append("	/*************** CLASS ATTRIBUTES ****************/\n");
			header.append("	private CompletePort completePort = null;\n");
			header.append("	/*************** END - CLASS ATTRIBUTES ****************/\n");
			header.append("\n");
			header.append("	/************** CONSTRUCTOR ************************/\n");
			header.append("	public AriaBillingCompleteSoap(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {\n");
			header.append("		super(baseAriaBillingDTO);\n");
			header.append("	}\n");
			header.append("	/*************** END - CONSTRUCTOR ****************/\n");
			header.append("\n");
			header.append("	/*************** GETTERS ****************/\n");
			header.append("	public CompletePort getCompletePort() {\n");
			header.append("		if (completePort == null){\n");
			header.append("			try {\n");
			header.append("				URL wsdlURL = new URL(getURL());\n");
			header.append("				AriaCompleteApi ss = new AriaCompleteApi(wsdlURL);\n");
			header.append("				completePort = ss.getCompletePort();\n");
			header.append("			} catch (MalformedURLException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			}\n");
			header.append("		}\n");
			header.append("		return completePort;\n");
			header.append("	}\n");
			header.append("	/*************** END - GETTERS ****************/\n");
			header.append("\n");
			header
					.append("	/********************************** METHODS IMPLEMENTATION ***********************************************/\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer
					.append("	/********************************** END - METHODS IMPLEMENTATION ***********************************************/\n");
			footer.append("}");
		}
		return footer;
	}

	/********************************* END - GETTERS **********************************************/

	/********************************* MAIN **********************************************/
	public void build() throws IOException {
		Method[] methods = com.aria.common.shared.CompletePort.class.getMethods();
		StringBuilder resultString = new StringBuilder();
		resultString.append(getHeader());
		for (Method method : methods) {
			StringBuilder methodDocumentation = new StringBuilder(methodDocumentation(method));
			StringBuilder methodDefinition = methodDefinition(method);
			StringBuilder methodBody = methodBody(method);
			resultString.append(methodDocumentation.toString() + methodDefinition.toString() + "{\n" + methodBody.toString()
					+ "	}\n\n");

			methodDefinition = methodDefinition2(method);
			methodBody = methodBody2(method);
			resultString.append(methodDefinition.toString() + "{\n" + methodBody.toString()
					+ "	}\n\n");
		}
		resultString.append(getFooter());
		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}

	/********************************* END - MAIN **********************************************/

	/********************************* BASIC METHODS **********************************************/
	@SuppressWarnings("rawtypes")
	private static StringBuilder methodDefinition(Method method) {
		if(method.getName().equalsIgnoreCase("genInvoice"))  
		{
			String a = "sdfsdf";
		}
		StringBuilder result = new StringBuilder();
		Annotation[][] paramanota = method.getParameterAnnotations();
		Class[] parmTypes = method.getParameterTypes();
		StringBuilder inParms = new StringBuilder();
		HashMap<Integer, String> hashMapInParms = new HashMap<Integer, String>();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode()) {
					if (inParms.length() != 0) {
						inParms.append(", ");
					}
					String parmType = parmTypes[i].getName();
					if (parmType.equals("long")){
						parmType = "Long";
					}
					inParms.append(parmType);
					inParms.append(" ");
					inParms.append(webParam.name());
					hashMapInParms.put(hashMapInParms.size(), webParam.name());
				}
			}
		}
		result.append("	public Map<String,Object> ");
		result.append(method.getName());
		result.append("(" + inParms + ")");
		return result;
	}

	private static StringBuilder methodDefinition2(Method method) {
		StringBuilder result = new StringBuilder();
		result.append("	public Map<String,Object> ");
		result.append(method.getName());
		result.append("(Map<String,Object> map)");
		return result;
	}

	private static StringBuilder methodBody(Method method) {
		StringBuilder result = new StringBuilder();
		StringBuilder callSOAP = buildSoapCall(method);
		result.append(callSOAP);
		result.append("		return getHashMapReturnValues();\n");
		return result;
	}

	@SuppressWarnings("rawtypes")
	private static StringBuilder methodBody2(Method method) {
		StringBuilder result = new StringBuilder();
		Annotation[][] paramanota = method.getParameterAnnotations();
		Class[] parmTypes = method.getParameterTypes();
		StringBuilder inParms = new StringBuilder();
		StringBuilder sendParms = new StringBuilder();
		HashMap<Integer, String> hashMapInParms = new HashMap<Integer, String>();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode()) {
					if (inParms.length() != 0) {
						sendParms.append(", ");
					}
					String type = getParmType(parmTypes[i].getName());
					inParms.append("		");
					inParms.append(type);
					inParms.append(" ");
					inParms.append(webParam.name());
					inParms.append(" = ");
					inParms.append("(");
					inParms.append(type);
					inParms.append(")");
					inParms.append(" map.get(");
					inParms.append((char) 34);
					inParms.append(webParam.name());
					inParms.append((char) 34);
					inParms.append(");\n");
					sendParms.append(webParam.name());
					hashMapInParms.put(hashMapInParms.size(), webParam.name());
				}
			}
		}
		result.append(inParms);
		result.append("		return ");
		result.append(method.getName());
		result.append("(");
		result.append(sendParms);
		result.append(");\n");
		return result;
	}

	@SuppressWarnings("rawtypes")
	private static StringBuilder buildSoapCall(Method method) {
		Annotation[][] paramanota = method.getParameterAnnotations();
		Class[] parmTypes = method.getParameterTypes();
		StringBuilder fullParms = new StringBuilder();
		StringBuilder outParms = new StringBuilder();
		StringBuilder inParms = new StringBuilder();
		StringBuilder hashMapPut = new StringBuilder();
		HashMap<Integer, String> hashMapOutParms = new HashMap<Integer, String>();
		HashMap<Integer, String> hashMapInParms = new HashMap<Integer, String>();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode()) {
					if (inParms.length() != 0) {
						inParms.append(", ");
					}
					String parmType = parmTypes[i].getName();
					if (parmType.equals("long")){
						parmType = "Long";
					}
					inParms.append(parmType);
					inParms.append(" ");
					inParms.append(webParam.name());
					hashMapInParms.put(hashMapInParms.size(), webParam.name());
				} else {
					outParms.append("		");
					outParms.append(parmTypes[i].getName());
					outParms.append(" ");
					outParms.append(webParam.name());
					outParms.append(" = new ");
					outParms.append(parmTypes[i].getName());
					outParms.append("();\n");
					hashMapOutParms.put(hashMapOutParms.size(), webParam.name());
					hashMapPut.append("		getHashMapReturnValues().put(" + (char) 34 + webParam.name() + (char) 34 + ",(("
							+ parmTypes[i].getName() + ")" + webParam.name() + ").value);\n");
				}
				if (fullParms.length() > 0){
					fullParms.append(", ");
				}
//				String parmType = parmTypes[i].getName();
//				if (parmType.equals("long")){
//					fullParms.append(webParam.name()+".longValue()");
//				} else {
//				}
				fullParms.append(webParam.name());
			}
		}
		StringBuilder callSOAP = new StringBuilder();
		callSOAP.append(outParms == null ? "" : outParms);
		callSOAP.append("\n");
		callSOAP.append("		getCompletePort()." + method.getName() + "(" + fullParms.toString() + ");\n");
		callSOAP.append(hashMapPut);
		callSOAP.append("\n");
		return callSOAP;
	}

	private static String methodDocumentation(Method method) {
		StringBuilder methodDocumentation = new StringBuilder();
		methodDocumentation.append("	@SuppressWarnings({" + (char) 34 + "rawtypes" + (char) 34 + "," + (char) 34
				+ "unchecked" + (char) 34 + "})\n");
		return methodDocumentation.toString();
	}

	private static String getParmType(String type) {
		String ret = type;
		type = type.toLowerCase();
		if (type.contains("long")){
			ret = "Long";
		} else if (type.contains("string")){
			ret = "String";
		} else if (type.contains("double")){
			ret = "Double";
		}
		return ret;
	}
	/********************************* END - BASIC METHODS **********************************************/
}
