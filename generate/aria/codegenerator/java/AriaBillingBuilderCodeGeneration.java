package aria.codegenerator.java;

import java.io.IOException;
import aria.codegenerator.common.CodeGeneration;

/**
 * Generate dynamically the AriaBillingBuilder.java class code
 */
public class AriaBillingBuilderCodeGeneration {
	private static final String		CLASS_SUB_PACKAGE	= "sdk/classes";
	private static final String		CLASS_NAME				= "AriaBillingBuilder.java";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								wsdlUrl;
	private CodeGeneration				codeGeneration;

	public AriaBillingBuilderCodeGeneration(String wsdlUrl, String generationRoot) {
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

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.classes;\n");
			header.append("\n");
			header.append("public class AriaBillingBuilder {\n");
			header.append("\n");
			header.append("	private static AriaBillingCompleteRest ariaBillingCompleteRest = null;\n");
			header.append("\n");
			header.append("	private static AriaBillingCompleteSoap ariaBillingCompleteSoap = null;\n");
			header.append("\n");
			header.append("	private AriaBillingBuilder(){}\n");
			header.append("\n");
			header.append("	public static AriaBillingComplete getAriaSDK(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{\n");
			header.append("		if(baseAriaBillingDTO.getCallType().equals(CallType.REST)) {\n");
			header.append("			if(ariaBillingCompleteRest == null) {\n");
			header.append("				ariaBillingCompleteRest = new AriaBillingCompleteRest(baseAriaBillingDTO);\n");
			header.append("			}\n");
			header.append("			return ariaBillingCompleteRest;\n");
			header.append("		} else {\n");
			header.append("			if(ariaBillingCompleteSoap == null) {\n");
			header.append("				ariaBillingCompleteSoap = new AriaBillingCompleteSoap(baseAriaBillingDTO);\n");
			header.append("			}\n");
			header.append("			return ariaBillingCompleteSoap;\n");
			header.append("		}\n");
			header.append("	}\n");
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
