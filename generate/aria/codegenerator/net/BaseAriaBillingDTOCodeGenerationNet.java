package aria.codegenerator.net;

import java.io.IOException;
import aria.codegenerator.common.CodeGeneration;

/**
 * Generate dynamically the AriaBillingBuilder.java class code
 * @author Julio Alexander Guevara
 */
public class BaseAriaBillingDTOCodeGenerationNet {
	private static final String		CLASS_SUB_PACKAGE	= "";
	private static final String		CLASS_NAME				= "BaseAriaBillingDTO.cs";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								wsdlUrl;
	private CodeGeneration				codeGeneration;

	public BaseAriaBillingDTOCodeGenerationNet(String wsdlUrl, String generationRoot) {
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
			header.append("using System;\n");
			header.append("\n");
			header.append("namespace Aria.SDK.AriaServices.AriaRestServices\n");
			header.append("{\n");
			header.append("    public class BaseAriaBillingDTO\n");
			header.append("    {\n");
			header.append("        #region CLASS ATTRIBUTES\n");
			header.append("        private string url;\n");
			header.append("        private string logFile;\n");
			header.append("        private Boolean debug;\n");
			header.append("        private CallType callType;\n");
			header.append("        private OutPutFormat outPutFormat;\n");
			header.append("        #endregion\n");
			header.append("\n");
			header.append("        /**\n");
			header.append("         * Constructor for the BaseAriaBillingDTO class.\n");
			header.append("         * @param url\n");
			header.append("         * @param logFile\n");
			header.append("         * @param debug\n");
			header.append("         * @param calltype\n");
			header.append("         * @param outPutFormat\n");
			header.append("         * @author Julio Alexander Guevara Marulanda\n");
			header.append("         */\n");
			header.append("        public BaseAriaBillingDTO(String url, String logFile, Boolean debug,\n");
			header.append("                CallType calltypeIn, OutPutFormat outPutFormat)\n");
			header.append("        {\n");
			header.append("            this.url = url;\n");
			header.append("            this.logFile = logFile;\n");
			header.append("            this.debug = debug;\n");
			header.append("            callType = calltypeIn;\n");
			header.append("            this.outPutFormat = outPutFormat;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public BaseAriaBillingDTO()\n");
			header.append("        {\n");
			header.append("        }\n");
			header.append("        /******************* GETTERS ********************/\n");
			header.append("        public String getUrl()\n");
			header.append("        {\n");
			header.append("            return url;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public String getLogFile()\n");
			header.append("        {\n");
			header.append("            return logFile;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public Boolean getDebug()\n");
			header.append("        {\n");
			header.append("            return debug;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public CallType getCallType()\n");
			header.append("        {\n");
			header.append("            return callType;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public OutPutFormat getOutPutFormat()\n");
			header.append("        {\n");
			header.append("            return outPutFormat;\n");
			header.append("        }\n");
			header.append("        /******************* END - GETTERS ********************/\n");
			header.append("\n");
			header.append("        /******************* SETTERS ********************/\n");
			header.append("        public void setUrl(String url)\n");
			header.append("        {\n");
			header.append("            this.url = url;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public void setLogFile(String logFile)\n");
			header.append("        {\n");
			header.append("            this.logFile = logFile;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public void setDebug(Boolean debug)\n");
			header.append("        {\n");
			header.append("            this.debug = debug;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public void setCallType(CallType callType)\n");
			header.append("        {\n");
			header.append("            this.callType = callType;\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public void setOutPutFormat(OutPutFormat outPutFormat)\n");
			header.append("        {\n");
			header.append("            this.outPutFormat = outPutFormat;\n");
			header.append("        }\n");
			header.append("        /******************* END - SETTERS ********************/\n");
			header.append("    }\n");
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
