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
public class AriaServiceClientTestCodeGenerationNet {
	private static final String		CLASS_SUB_PACKAGE	= "";
	private static final String		CLASS_NAME				= "AriaCompleteTest.cs";
	private static final String		REQUEST						= "Request";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								wsdlUrl;
	private String								generationRoot;
	private CodeGeneration				codeGeneration;

	public AriaServiceClientTestCodeGenerationNet(String wsdlUrl, String generationRoot) {
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

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("using System;\n");
			header.append("using NUnit.Framework;\n");
			header.append("using System.Configuration;\n");
			header.append("using Aria.SDK.AriaServices.AriaWebServices;\n");
			header.append("using Aria.SDK.AriaServices.AriaWebServices.AriaComplete;\n");
			header.append("\n");
			header.append("namespace Aria.SDK.AriaServices.AriaRestServices.Test\n");
			header.append("{\n");
			header.append("  public class AriaCompleteTest\n");
			header.append("  {\n");
			header.append("    private const string ARIA_CLIENT_NUMBER = " + (char) 34 + "aria-client-number" + (char) 34
					+ ";\n");
			header.append("    private const string ARIA_AUTHORIZATION_KEY = " + (char) 34 + "aria-authorization-key"
					+ (char) 34 + ";\n");
			header.append("    private const string ARIA_DISPATCHER_URL = " + (char) 34 + "aria-dispatcher-url"
					+ (char) 34 + ";\n");
			header.append("    private const string VALID_ACCOUNT_NUMBER = " + (char) 34 + "valid-account-number" + (char) 34
					+ ";\n");
			header.append("    private const string VALID_ACCOUNT_USERID = " + (char) 34 + "valid-account-userid" + (char) 34
					+ ";\n");
			header.append("    private const string VALID_ACCOUNT_PASSWORD = " + (char) 34 + "valid-account-password"
					+ (char) 34 + ";\n");
			header.append("    private const string VALID_PLAN_NUMBER = " + (char) 34 + "valid-plan-number" + (char) 34
					+ ";\n");
			header.append("    private const string VALID_PLAN_SERVICE_NUMBER = " + (char) 34 + "valid-plan-service-number"
					+ (char) 34 + ";\n");
			header.append("    private const string VALID_SUPPLEMENTAL_PLAN_NUMBER = " + (char) 34
					+ "valid-supplemental-plan-number" + (char) 34 + ";\n");
			header
					.append("    private const string VALID_PROMO_CODE = " + (char) 34 + "valid-promo-code" + (char) 34 + ";\n");
			header.append("    private const string VALID_SUPPLEMENTAL_FIELD_NAME = " + (char) 34
					+ "valid-supplemental-field-name" + (char) 34 + ";\n");
			header.append("    public static AriaBillingComplete mService;\n");
			header.append("\n");
			header.append("    [TestFixtureSetUp]\n");
			header.append("    public void setUp()\n");
			header.append("    {\n");
			header.append("        mService = new AriaBillingComplete(ConfigurationManager.AppSettings[ARIA_DISPATCHER_URL]);\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public long AccountNumber\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return long.Parse(ConfigurationManager.AppSettings[VALID_ACCOUNT_NUMBER]);\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public long ClientNumber\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return long.Parse(ConfigurationManager.AppSettings[ARIA_CLIENT_NUMBER]);\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public long ServiceNumber\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return long.Parse(ConfigurationManager.AppSettings[VALID_PLAN_SERVICE_NUMBER]);\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public long PlanNumber\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return long.Parse(ConfigurationManager.AppSettings[VALID_PLAN_NUMBER]);\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public string AuthorizationKey\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return ConfigurationManager.AppSettings[ARIA_AUTHORIZATION_KEY];\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public string UserId\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return ConfigurationManager.AppSettings[VALID_ACCOUNT_USERID];\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public string Password\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return ConfigurationManager.AppSettings[VALID_ACCOUNT_PASSWORD];\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public long SupplementalPlanNumber\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return long.Parse(ConfigurationManager.AppSettings[VALID_SUPPLEMENTAL_PLAN_NUMBER]);\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public string PromoCode\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return ConfigurationManager.AppSettings[VALID_PROMO_CODE];\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("    public string SupplementalFieldName\n");
			header.append("    {\n");
			header.append("      get\n");
			header.append("      {\n");
			header.append("        return ConfigurationManager.AppSettings[VALID_SUPPLEMENTAL_FIELD_NAME];\n");
			header.append("      }\n");
			header.append("    }\n");
			header.append("\n");
			header.append("	#region Api Calls TEST\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("		#endregion Api Calls TEST\n");
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
		String originalName = buildFieldName(method.getName());
		result.append("	[Test]\n");
		result.append("	public void ");
		result.append(originalName);
		result.append("()\n");
		result.append("	{\n");
		result.append("       ");
		result.append(originalName);
		result.append(REQUEST);
		result.append(" request = new ");
		result.append(originalName);
		result.append(REQUEST);
		result.append("\n");
		return result;
	}

	private static StringBuilder methodBody(Method method) {
		StringBuilder result = new StringBuilder();
		StringBuilder callREST = buildRestCall(method);
		String originalName = buildFieldName(method.getName());
		result.append(callREST);
		result.append("\n");
		result.append("		var response = mService.");
		result.append(originalName);
		result.append("(request);\n");
		result.append("		Assert.IsNotNull(response);\n");
		result.append("	}\n\n");
		return result;
	}

	@SuppressWarnings("rawtypes")
	private static StringBuilder buildRestCall(Method method) {
		Annotation[][] paramanota = method.getParameterAnnotations();
		StringBuilder inParms = new StringBuilder();
		StringBuilder callREST = new StringBuilder();
		callREST.append("       		{\n");
		for (int i = 0; i < paramanota.length; i++) {
			for (int j = 0; j < paramanota[i].length; j++) {
				WebParam webParam = (WebParam) paramanota[i][j];
				if (WebParam.Mode.IN == webParam.mode() || WebParam.Mode.INOUT == webParam.mode()) {
					String paramType = CodeGeneration.getParamType(method, i, webParam);
					String parmType = paramType.toLowerCase();
					String parmName = webParam.name();
					String value = getParmValue(parmName, parmType);
					if (inParms.length() > 0){ 
						inParms.append(",\n");
					}
					inParms.append("			" + parmName + " = " + value);
				}
			}
		}
		callREST.append(inParms);
		callREST.append("\n       		};\n");
		return callREST;
	}

	private static String getParmValue(String parmName, String parmType) {
		String ret = "";
		if (parmName.equalsIgnoreCase("client_no")) {
			ret = "ClientNumber";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("auth_key")) {
			ret = "AuthorizationKey";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("account_no") || parmName.equalsIgnoreCase("senior_account_no")
				|| parmName.equalsIgnoreCase("source_account_no")) {
			ret = "AccountNumber";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("supp_plan_no")) {
			ret = "SupplementalPlanNumber";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("plan_no") && parmType.contains("array") == false) {
			ret = "PlanNumber";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("service_no")) {
			ret = "ServiceNumber";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("userid")) {
			ret = "UserId";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("client_order_id") || parmName.equalsIgnoreCase("client_receipt_id")
				|| parmName.equalsIgnoreCase("reference_code")) {
			ret = "Guid.NewGuid().ToString()";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("initial_credit_date")) {
			ret = "DateTime.Now.ToShortDateString()";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("start_date_range") || parmName.equalsIgnoreCase("date_range_start")) {
			ret = "DateTime.Now.AddMonths(-1).ToShortDateString()";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("promo_code")) {
			ret = "PromoCode";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("field_name")) {
			ret = "SupplementalFieldName";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("start_date")) {
			ret = "DateTime.Now.AddYears(15).ToShortDateString()";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("first_bill_date")) {
			ret = "DateTime.Now.AddYears(15).ToShortDateString()";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("first_usage_date")) {
			ret = "DateTime.Now.ToShortDateString()";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("cc_expire_mm")) {
			ret = "DateTime.Now.Month";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("cc_expire_yyyy")) {
			ret = "DateTime.Now.Year";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("cc_number")) {
			ret = "4111111111111111";
		} else if (parmName.equalsIgnoreCase("reset_dates_after_status")) {
			ret = "y";
		} else if (parmName.equalsIgnoreCase("pay_method")) {
			ret = "5";
		} else if (parmName.equalsIgnoreCase("password")) {
			ret = "Password";
			parmType = "attribute";
		} else if (parmName.equalsIgnoreCase("CVV")) {
			ret = "111";
		} else {
			if (parmType.contains("long")) {
				ret = "1";
			} else if (parmType.contains("double")) {
				ret = "1";
			} else if (parmType.contains("integer")) {
				ret = "1";
			} else if (parmType.contains("string")) {
				ret = "";
			} else if (parmType.contains("boolean")) {
				ret = "true";
			} else if (parmType.contains("array")) {
				ret = "new[]{new "+parmName+"_row()}";
			} else if (parmType.contains("date")) {
				ret = "DateTime.Now.AddMilliseconds(1).ToString()";
			}
		}

		if (parmType.contains("string")) {
			ret = (char) 34 + ret + (char) 34;
		}
		
		return ret;
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