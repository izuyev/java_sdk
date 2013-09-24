package aria.codegenerator.java;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.jws.WebParam;
import com.aria.common.shared.CompletePort;
import aria.codegenerator.common.CodeGeneration;

/** Generate dynamically the AriaBillingComplete class code
 *
 */
public class AriaBillingCompleteRESTCodeGeneration {
	private static final String	CLASS_SUB_PACKAGE	= "sdk/classes";
	private static final String	CLASS_NAME	= "AriaBillingCompleteRest.java";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								fileDir;
	private String								wsdlUrl;
	private String								generationRoot;
	private CodeGeneration									codeGeneration;

	public AriaBillingCompleteRESTCodeGeneration(String wsdlUrl, String generationRoot) {
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
			fileDir = getGenerationRoot() + "/AriaBillingCompleteRest.java";
		return fileDir;
	}

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.classes;\n\n");
			header.append("import java.util.Map;\n");
			header.append("\n");
			header.append("import javax.ws.rs.core.MultivaluedMap;\n");
			header.append("\n");
			header.append("import com.aria.common.rest.RestUtilities;\n");
			header.append("import com.sun.jersey.api.client.Client;\n");
			header.append("import com.sun.jersey.api.client.WebResource;\n");
			header.append("import com.sun.jersey.api.client.config.DefaultClientConfig;\n");
			header.append("import com.sun.jersey.core.util.MultivaluedMapImpl;\n");
			header.append("\n");
			header.append("/**\n");
			header.append(" * AriaBillingCompleteRest\n");
			header.append(" * Web Service class\n");
			header.append(" * @copyright Aria Systems, Inc\n");
			header.append(" */\n");
			header.append("public class AriaBillingCompleteRest extends BaseAriaBilling implements AriaBillingComplete {\n");
			header.append("	/************** CONSTRUCTOR ************************/\n");
			header.append("	public AriaBillingCompleteRest(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {\n");
			header.append("		super(baseAriaBillingDTO);\n");
			header.append("	}\n");
			header.append("	/*************** END - CONSTRUCTOR ****************/\n");
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
		Method[] methods = CompletePort.class.getMethods();
		StringBuilder resultString = new StringBuilder();
		resultString.append(getHeader());
		for (Method method : methods) {
			StringBuilder methodDocumentation = new StringBuilder(methodDocumentation(method));
			StringBuilder methodDefinition = methodDefinition(method);
			StringBuilder methodBody = methodBody(method);
			resultString.append(methodDocumentation.toString() + methodDefinition.toString() + "{\n" + methodBody.toString()
					+ "	}\n\n");

			methodDocumentation = new StringBuilder(methodDocumentation(method));
			methodDefinition = methodDefinition2(method);
			methodBody = methodBody2(method);
			resultString.append(methodDocumentation.toString() + methodDefinition.toString() + "{\n" + methodBody.toString()
					+ "	}\n\n");
		}
		resultString.append(getFooter());
		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}

	/********************************* END - MAIN **********************************************/

	/********************************* BASIC METHODS **********************************************/
	@SuppressWarnings("rawtypes")
	private static StringBuilder methodDefinition(Method method) {
		StringBuilder result = new StringBuilder();
		Annotation[][] paramanota = method.getParameterAnnotations();
		StringBuilder inParms = new StringBuilder();
		HashMap<Integer, String> hashMapInParms = new HashMap<Integer, String>();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode() || WebParam.Mode.INOUT == webParam.mode()) {
					if (inParms.length() != 0) {
						inParms.append(", ");
					}
					String parmType = CodeGeneration.getParamType(method, i, webParam);
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
		StringBuilder callREST = buildRestCall(method);
		result.append(callREST);
		result.append("		return getHashMapReturnValues();\n");
		return result;
	}

	@SuppressWarnings("rawtypes")
	private static StringBuilder methodBody2(Method method) {
		StringBuilder result = new StringBuilder();
		Annotation[][] paramanota = method.getParameterAnnotations();
		StringBuilder inParms = new StringBuilder();
		StringBuilder sendParms = new StringBuilder();
		HashMap<Integer, String> hashMapInParms = new HashMap<Integer, String>();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode() || WebParam.Mode.INOUT == webParam.mode()) {
					if (inParms.length() != 0) {
						sendParms.append(", ");
					}
					String parmType = CodeGeneration.getParamType(method, i, webParam);
					inParms.append("		");
					inParms.append(parmType);
					inParms.append(" ");
					inParms.append(webParam.name());
					inParms.append(" = ");
					inParms.append("(");
					inParms.append(parmType);
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
	private static StringBuilder buildRestCall(Method method) {
		Annotation[][] paramanota = method.getParameterAnnotations();
		StringBuilder fullParms = new StringBuilder();
		StringBuilder outParms = new StringBuilder();
		StringBuilder inParms = new StringBuilder();
		int numOutParms = 0;
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode() || WebParam.Mode.INOUT == webParam.mode()) {
					String paramType = CodeGeneration.getParamType(method, i, webParam);
					String parmType = paramType.toLowerCase();
					if (parmType.contains("long")) {
						inParms.append("		addParameters(parameters," + (char) 34 + webParam.name() + (char) 34 + ",getValue("
								+ (char) 34 + "Long" + (char) 34 + "," + webParam.name() + "));\n");
					} else if (parmType.contains("double")) {
						inParms.append("		addParameters(parameters," + (char) 34 + webParam.name() + (char) 34 + ",getValue("
								+ (char) 34 + "Double" + (char) 34 + "," + webParam.name() + "));\n");
					} else if (parmType.contains("array")) {
						inParms.append("		RestUtilities.addParameterValuesFromArray(parameters," + webParam.name() + ");\n");
					} else {
						inParms.append("		addParameters(parameters," + (char) 34 + webParam.name() + (char) 34 + ",getValue("
								+ (char) 34 + "String" + (char) 34 + "," + webParam.name() + "));\n");
					}
				}
				if (WebParam.Mode.OUT == webParam.mode() || WebParam.Mode.INOUT == webParam.mode()) {
					outParms.append("		returnValues[" + numOutParms + "] = " + (char) 34 + webParam.name() + (char) 34 + ";\n");
					numOutParms++;
				}
				if (fullParms.length() > 0)
					fullParms.append(", ");
				fullParms.append(webParam.name());
			}
		}
		StringBuilder callREST = new StringBuilder();
		callREST.append("		MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();\n");
		callREST.append(inParms);
		callREST.append("\n");
		callREST.append("		WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("
				+ (char) 34 + buildFieldName(method.getName()) + (char) 34 + "));\n");
		callREST.append("		String ret = webResource.type(\"application/x-www-form-urlencoded\").accept(\"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\").header(\"accept-encoding\", \"deflate\").header(\"accept-encoding\", \"gzip\").post(String.class, parameters);\n");

		callREST.append("		String[] returnValues = new String[" + numOutParms + "];\n");
		callREST.append(outParms);
		callREST.append("		buildHashMapReturnValues(ret,returnValues);\n");
		return callREST;
	}

	/** Java to Wsdl For example parmName to parm_name */
	private static String buildFieldName(String methodName) {
		String realName = "";
		for (char character : methodName.toCharArray()) {
			if (Character.isUpperCase(character))
				realName += "_";
			realName += Character.toLowerCase(character);
		}
		return realName;
	}

	private static String methodDocumentation(Method method) {
		StringBuilder methodDocumentation = new StringBuilder();
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
