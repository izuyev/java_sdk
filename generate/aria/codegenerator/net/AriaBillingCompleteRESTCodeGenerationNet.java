package aria.codegenerator.net;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import javax.jws.WebParam;
import aria.codegenerator.common.CodeGeneration;
import com.aria.common.shared.CompletePort;

/**
 * Generate dynamically the AriaBillingComplete class code
 */
public class AriaBillingCompleteRESTCodeGenerationNet {
	private static final String		CLASS_SUB_PACKAGE	= "";
	private static final String		CLASS_NAME				= "AriaBillingComplete.cs";
	private static final String		REQUEST						= "Request";
	private static final String		RESPONSE					= "Response";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								wsdlUrl;
	private String								generationRoot;
	private String								dispatcher;
	private CodeGeneration				codeGeneration;

	public AriaBillingCompleteRESTCodeGenerationNet(String wsdlUrl, String generationRoot) {
		super();
		this.wsdlUrl = wsdlUrl;
		this.generationRoot = generationRoot;
	}

	/************************************ GETTERS AND SETTERS ****************************************/
	private String getDispatcher() {
		if (dispatcher == null){
			if (getWsdlUrl()==null){
				dispatcher = "";
			}else{
				dispatcher = (char)34+getWsdlUrl().substring(0, getWsdlUrl().indexOf("/api/")+5)+
										"ws/api_ws_class_dispatcher.php"+(char)34;
			}
		}
		return dispatcher;
	}
	
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

	public StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("using System;\n");
			header.append("using System.IO;\n");
			header.append("using System.Net;\n");
			header.append("using Newtonsoft.Json;\n");
			header.append("using Aria.SDK.AriaServices.AriaWebServices.AriaComplete;\n");
			header.append("\n");
			header.append("namespace Aria.SDK.AriaServices.AriaWebServices\n");
			header.append("{\n");
			header.append("    public class AriaBillingComplete : IDisposable\n");
			header.append("    {\n");
			header.append("        #region attributes\n");
			header.append("        public string URL;\n");
			header.append("        #endregion attributes\n");
			header.append("\n");
			header.append("        #region Constructor\n");
			header.append("        /*Creates a new AriaBillingComplete with no parms*/\n");
			header.append("        public AriaBillingComplete() : this (" + getDispatcher() + ")\n");
			header.append("        {\n");
			header.append("        }\n");
			header.append("        /*Creates a new AriaBillingComplete with URL parm*/\n");
			header.append("        public AriaBillingComplete(String URL)\n");
			header.append("        {\n");
			header.append("            if (URL == null)\n");
			header.append("            {\n");
			header.append("                return;\n");
			header.append("            }\n");
			header.append("            setURL(URL);\n");
			header.append("        }\n");
			header.append("        #endregion\n");
			header.append("\n");
			header.append("				#region Disposable\n");
			header.append("				public void Dispose()\n");
			header.append("				{\n");
			header.append("					    GC.SuppressFinalize(this);\n");
			header.append("				}\n");
			header.append("				#endregion Disposable\n");
			header.append("\n");
			header.append("        #region gets\n");
			header.append("        private static string getMethod()\n");
			header.append("        {\n");
			header.append("            return " + (char) 34 + "POST" + (char) 34 + ";\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        private static string getContentType()\n");
			header.append("        {\n");
			header.append("            return " + (char) 34 + "application/Json" + (char) 34 + ";\n");
			header.append("        }\n");
			header.append("\n");
			header.append("        public string getURL()\n");
			header.append("        {\n");
			header.append("            return URL;\n");
			header.append("        }\n");
			header.append("        #endregion gets\n");
			header.append("\n");
			header.append("        #region sets\n");
			header.append("        public void setURL(string url)\n");
			header.append("        {\n");
			header.append("            URL = url;\n");
			header.append("        }\n");
			header.append("        #endregion sets\n");
			header.append("\n");
			header.append("        #region General methods\n");
			header.append("        protected string buildUrl(string restCallMethod)\n");
			header.append("        {\n");
			header.append("            return getURL() + " + (char) 34 + "?output_format=json&rest_call=" + (char) 34
					+ " + restCallMethod;\n");
			header.append("        }\n");
			header.append("        #endregion General methods\n");
			header.append("\n");
			header.append("		#region Api Calls\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("		#endregion Api Calls\n");
			footer.append("	}\n");
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
			resultString.append(methodDocumentation.toString() + methodDefinition.toString() + methodBody.toString());
		}
		resultString.append(getFooter());
		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}

	/********************************* END - MAIN **********************************************/

	/********************************* BASIC METHODS **********************************************/
	private static StringBuilder methodDefinition(Method method) {
		StringBuilder result = new StringBuilder();
		StringBuilder inParms = new StringBuilder();
		String originalName = buildFieldName(method.getName());
		inParms.append(originalName);
		inParms.append(REQUEST);
		result.append("		public ");
		result.append(originalName);
		result.append(RESPONSE);
		result.append(" ");
		result.append(originalName);
		result.append("(");
		result.append(inParms);
		result.append(" request)\n");
		result.append("		{\n");
		result.append("			if (request == null)\n");
		result.append("			{\n");
		result.append("				return null;\n");
		result.append("			}\n");
		result.append("			var url = buildUrl(" + (char) 34 + originalName + (char) 34 + ");\n");

		return result;
	}

	private static StringBuilder methodBody(Method method) {
		StringBuilder result = new StringBuilder();
		StringBuilder callREST = buildRestCall(method);
		result.append(callREST);
		result.append("			return myDeserializedObj;\n");
		result.append("		}\n\n");
		return result;
	}

	@SuppressWarnings("rawtypes")
	private static StringBuilder buildRestCall(Method method) {
		Annotation[][] paramanota = method.getParameterAnnotations();
		StringBuilder fullParms = new StringBuilder();
		StringBuilder inParms = new StringBuilder();
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode() || WebParam.Mode.INOUT == webParam.mode()) {
					String paramType = CodeGeneration.getParamType(method, i, webParam);
					String parmType = paramType.toLowerCase();
					String parmName = webParam.name();
					if (parmType.contains("array")) {
						inParms.append("			RestUtilities.addParameterValuesFromArray(ref url, request." + parmName + ");\n");
					} else {
						inParms.append("			url += " + (char) 34 + "&" + parmName + "=" + (char) 34 + " + request." + parmName
								+ ";\n");
					}
				}
				if (fullParms.length() > 0)
					fullParms.append(", ");
				fullParms.append(webParam.name());
			}
		}
		String originalName = buildFieldName(method.getName());
		StringBuilder callREST = new StringBuilder();
		callREST.append(inParms);
		callREST.append("\n");
		callREST.append("			WebRequest webRequest = WebRequest.Create(url);\n");
		callREST.append("			webRequest.Method = getMethod();\n");
		callREST.append("			webRequest.ContentType = getContentType();\n");
		callREST.append("			string returnString;\n");
		callREST.append("			using (var responseReader = new StreamReader(webRequest.GetResponse().GetResponseStream()))\n");
		callREST.append("			{\n");
		callREST.append("			    returnString = responseReader.ReadToEnd();\n");
		callREST.append("			}\n");
		callREST.append("			JsonSerializer json = new JsonSerializer\n");
		callREST.append("                          {\n");
		callREST.append("                              NullValueHandling = NullValueHandling.Ignore,\n");
		callREST.append("                              ObjectCreationHandling = ObjectCreationHandling.Replace,\n");
		callREST.append("                              MissingMemberHandling = MissingMemberHandling.Ignore,\n");
		callREST.append("                              ReferenceLoopHandling = ReferenceLoopHandling.Ignore\n");
		callREST.append("                          };\n");
		callREST.append("			StringReader sr = new StringReader(returnString);\n");
		callREST.append("			JsonTextReader reader = new JsonTextReader(sr);\n");
		callREST.append("			");
		callREST.append(originalName + RESPONSE);
		callREST.append(" myDeserializedObj = json.Deserialize(reader, typeof("+originalName + RESPONSE+")) as "+originalName + RESPONSE+";\n");
		callREST.append("			reader.Close();\n");
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
	/********************************* END - BASIC METHODS **********************************************/
}