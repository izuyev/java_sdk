package aria.codegenerator.java;

import static org.w3c.dom.Node.ELEMENT_NODE;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

import javax.jws.WebParam;
import javax.wsdl.Definition;
import javax.wsdl.Types;
import javax.wsdl.WSDLException;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import aria.codegenerator.common.CodeGeneration;

import com.aria.common.shared.CompletePort;
import com.ibm.wsdl.extensions.schema.SchemaImpl;

/**
 * Generate dynamically the AriaBillingComplete class code
 */
public class AriaBillingCompleteCodeGeneration {
	private static final String							CLASS_SUB_PACKAGE	= "sdk/classes";
	private static final String							CLASS_NAME				= "AriaBillingComplete.java";
	private static StringBuilder						header;
	private static StringBuilder						footer;
	private static String										MARK							= "##";
	private static HashMap<Integer, String>	parmNamesToReturn;
	private String													fileDir;
	private String													wsdlUrl;
	private String													packagePath;
	private String													sourcePath;
	@SuppressWarnings("unused")
	private static String										RESPONSE_ELEMENT	= "ResponseElement";
	private CodeGeneration									codeGeneration;

	public AriaBillingCompleteCodeGeneration(String wsdlUrl, String sourcePath, String packagePath) {
		super();
		this.wsdlUrl = wsdlUrl;
		this.sourcePath = sourcePath;
		this.packagePath = packagePath;
	}
	
	@SuppressWarnings("rawtypes")
	public void build() throws IOException {
		// Definition wsdlInstance = getCodeGeneration().getwsdlInstance();
		// Map servicesMap = wsdlInstance.getServices();
		// Set s = servicesMap.keySet();
		// Iterator it = s.iterator();
		// if (it.hasNext()) {
		// javax.wsdl.Service serv = (javax.wsdl.Service) servicesMap.get(it.next());
		// Map m = serv.getPorts();
		// Set set = m.keySet();
		// Iterator itr = set.iterator();
		// if (itr.hasNext()) {
		// Port port = (Port) m.get(itr.next());
		// Binding bind = port.getBinding();
		// PortType pt = bind.getPortType();
		// QName name = (QName) pt.getQName();
		// List operations = pt.getOperations();
		// Iterator oper = operations.iterator();
		// for (int i = 0; oper.hasNext(); i++) {
		// Operation op = (Operation) oper.next();
		// System.out.println(" ....... " + op.getName());
		//
		// StringBuilder resultString = new StringBuilder();
		// resultString.append(getHeader());
		// StringBuilder methodDefinition = new StringBuilder();
		// methodDefinition.append("	abstract Map<String,Object> " + op.getName());
		// StringBuilder inParms = new StringBuilder();
		// HashMap<Integer, String> hashMapOutParms = new HashMap<Integer, String>();
		// HashMap<Integer, String> hashMapInParms = new HashMap<Integer, String>();
		// hashMapInParms = getMethodParameters(op.getName(),true);
		// javax.wsdl.Part part = null;
		// QName nameT = null;
		// javax.wsdl.Message input = op.getInput().getMessage();
		// List entradal = op.getParameterOrdering();
		// System.out.println("--");
		// Iterator entradai = new Vector().iterator();
		// if (entradal != null)
		// entradai = entradal.iterator();
		// System.out.println(" \t-> " + part.getName());
		// while (entradai.hasNext()) {
		// part = (javax.wsdl.Part) input.getPart((String) entradai.next());
		// nameT = part.getTypeName();
		// System.out.println(" \t-> " + part.getName());
		// }
		// }
		// }
		// }

		Method[] methods = CompletePort.class.getMethods();
		StringBuilder resultString = new StringBuilder();
		resultString.append(getHeader());
		for (Method method : methods) {
			StringBuilder methodDefinition = new StringBuilder();
			methodDefinition.append("	abstract Map<String,Object> " + method.getName());
			Class[] parmTypes = method.getParameterTypes();
			Annotation[][] paramanota = method.getParameterAnnotations();
			StringBuilder inParms = new StringBuilder();
			HashMap<Integer, String> hashMapOutParms = new HashMap<Integer, String>();
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
						hashMapInParms.put(hashMapInParms.size(), webParam.name() + MARK + parmType);
					} else {
						String parmType = getParmTypeOut(webParam.name());
						if (parmType.length() <= 0)
							parmType = parmTypes[i].getName();
						hashMapOutParms.put(hashMapOutParms.size(), webParam.name() + MARK + parmType);
					}
				}
			}
			methodDefinition.append("(" + inParms + ");\n");
			StringBuilder methodDocumentation = new StringBuilder(getDocumentation(
					method.getName(),
					hashMapInParms,
					hashMapOutParms));
			resultString.append(methodDocumentation.toString() + methodDefinition.toString() + "\n");

			methodDefinition = new StringBuilder();
			methodDefinition.append("	abstract Map<String,Object> " + method.getName());
			methodDefinition.append("(Map<String,Object> map);\n");
			resultString.append(methodDocumentation.toString() + methodDefinition.toString() + "\n");
		}
		resultString.append(getFooter());

		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
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

	public String getSourcePath() {
		return sourcePath;
	}

	public String getPackagePath() {
		return packagePath;
	}

	public String getFileDir() {
		if (fileDir == null) {
			fileDir = getSourcePath() + getPackagePath() + CLASS_SUB_PACKAGE + CLASS_NAME;
		}
		return fileDir;
	}

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.classes;\n\n");
			header.append("import java.util.Map;\n");
			header.append("\n");
			header.append("/**\n");
			header.append(" * AriaBillingComplete\n");
			header.append(" * Web Service class\n");
			header.append(" * @copyright Aria Systems, Inc\n");
			header.append(" * @author (Automatic generated)\n");
			header.append(" */\n");
			header.append("public interface AriaBillingComplete {\n");
			header.append("	/********************************** METHODS ***********************************************/\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer
					.append("	/********************************** END - METHODS ***********************************************/\n");
			footer.append("}");
		}
		return footer;
	}

	public static HashMap<Integer, String> getParmNamesToReturn() {
		if (parmNamesToReturn == null) {
			parmNamesToReturn = new HashMap<Integer, String>();
			parmNamesToReturn.put(0, "supp_field_values");
			parmNamesToReturn.put(1, "queued_plans");
			parmNamesToReturn.put(2, "all_plans");
			parmNamesToReturn.put(3, "so");
			parmNamesToReturn.put(4, "client_receipt");
			parmNamesToReturn.put(5, "acct_groups");
			parmNamesToReturn.put(6, "order");
			parmNamesToReturn.put(7, "order_items");
			parmNamesToReturn.put(8, "web_vals_out");
			parmNamesToReturn.put(9, "stat_hist");
			parmNamesToReturn.put(10, "inv_calc_out");
			parmNamesToReturn.put(11, "client_country");
			parmNamesToReturn.put(12, "events");
			parmNamesToReturn.put(13, "accts_with_pay_method");
			parmNamesToReturn.put(14, "unapplied_service_credits");
			parmNamesToReturn.put(15, "plans");
			parmNamesToReturn.put(16, "out_reg_uss_params");
			parmNamesToReturn.put(17, "client_plans");
			parmNamesToReturn.put(18, "acct_groups");
			parmNamesToReturn.put(19, "supp_fields");
			parmNamesToReturn.put(20, "acct_receipt");
			parmNamesToReturn.put(21, "order");
			parmNamesToReturn.put(22, "plan_services");
			parmNamesToReturn.put(23, "acct_plan_contract");
			parmNamesToReturn.put(24, "so_items");
			parmNamesToReturn.put(25, "acct_plans");
			parmNamesToReturn.put(26, "invoice_payments");
			parmNamesToReturn.put(27, "plans_basic");
			parmNamesToReturn.put(28, "fam_trans");
			parmNamesToReturn.put(29, "usage_history_records");
			parmNamesToReturn.put(30, "all_acct_plans");
			parmNamesToReturn.put(31, "out_reg_uss_config_params");
			parmNamesToReturn.put(32, "pay_methods");
			parmNamesToReturn.put(33, "invoice_line_items");
			parmNamesToReturn.put(34, "all_client_plans");
			parmNamesToReturn.put(35, "plan_service_rates");
			parmNamesToReturn.put(36, "acct_comments");
			parmNamesToReturn.put(37, "child_accts");
			parmNamesToReturn.put(38, "history");
			parmNamesToReturn.put(39, "rate_sched");
			parmNamesToReturn.put(40, "client_items");
			parmNamesToReturn.put(41, "plan_hist");
			parmNamesToReturn.put(42, "su");
			parmNamesToReturn.put(43, "payment_applications");
			parmNamesToReturn.put(44, "receipt_action");
		}
		return parmNamesToReturn;
	}

	/********************************* END - GETTERS **********************************************/
	public HashMap<Integer, String> getMethodParameters(String methodName, boolean parmType) {
		HashMap<Integer, String> hashMapParms = new HashMap<Integer, String>();
		try {
			WSDLFactory wsdlFactory;
			wsdlFactory = WSDLFactory.newInstance();
			WSDLReader wsdlReader = wsdlFactory.newWSDLReader();
			Definition wsdlInstance = (Definition) wsdlReader.readWSDL(null, getWsdlUrl());
			wsdlInstance = (Definition) wsdlReader.readWSDL(null, getWsdlUrl());
			// getCodeGeneration().getwsdlInstance();
			Types types = wsdlInstance.getTypes();
			Iterator<?> schemaitr = types.getExtensibilityElements().iterator();
			while (schemaitr.hasNext()) {
				SchemaImpl schema = (SchemaImpl) schemaitr.next();
				int numSchemas = schema.getElement().getChildNodes().getLength();
				for (int i = 0; i < numSchemas; i++) {
					Node node = schema.getElement().getChildNodes().item(i);
					if (node.getNodeType() != ELEMENT_NODE)
						continue; // not-text
					String nodeName = node.getAttributes().getNamedItem("name").getNodeValue().toLowerCase();
					if (!nodeName.equalsIgnoreCase(methodName)) {
						continue;
					}

					NodeList sequenceNode = node.getChildNodes();
					sequenceNode.getLength();
					NodeList elements = sequenceNode.item(1).getChildNodes();
					elements = elements.item(1).getChildNodes();
					int numElements = elements.getLength();
					for (int j = 0; j < numElements; j++) {
						Node element = elements.item(j);
						if (element.getAttributes() == null)
							continue;
						if (node.getNodeType() != ELEMENT_NODE)
							continue;
						String fieldName = element.getAttributes().getNamedItem("name").getNodeValue();
						// String fieldJavaName = buildJavaName(element.getAttributes().getNamedItem("name").getNodeValue());
						String fieldType = element.getAttributes().getNamedItem("type").getNodeValue().toLowerCase();
						hashMapParms.put(hashMapParms.size(), fieldName + MARK + fieldType);
					}
					break;
				}
			}
		}
		catch (WSDLException e) {
			e.printStackTrace();
		}
		return hashMapParms;
	}

	/** Wsdl to Java For example parm_name to parmName */
	private static String getParmTypeOut(String parmName) {
		String parmType = "";
		if (isReturnableParm(parmName)) {
			boolean toUpper = true;
			for (char character : parmName.toCharArray()) {
				if (toUpper)
					character = Character.toUpperCase(character);
				toUpper = character == '_';
				if (!toUpper)
					parmType += character;
			}
			parmType = "ArrayList&#60;" + parmType + "ReturnElement&#62;";
		}
		return parmType;
	}

	private static boolean isReturnableParm(String parmName) {
		for (int i = 0; i < getParmNamesToReturn().size(); i++)
			if (getParmNamesToReturn().get(i).equalsIgnoreCase(parmName))
				return true;
		return false;
	}

	private static String getDocumentation(String name, HashMap<Integer, String> hashMapInParms,
			HashMap<Integer, String> hashMapOutParms) {
		StringBuilder methodDocumentation = new StringBuilder();
		methodDocumentation.append("	/**\n");
		methodDocumentation.append("	* " + name);
		for (int i = 0; i < hashMapInParms.size(); i++) {
			String parmName = hashMapInParms.get(i).substring(0, hashMapInParms.get(i).indexOf(MARK));
			String parmType = hashMapInParms.get(i).substring(hashMapInParms.get(i).indexOf(MARK) + MARK.length());;
			methodDocumentation.append("\n");
			methodDocumentation.append("	* @param ");
			methodDocumentation.append(parmName);
			methodDocumentation.append(" - Type: ");
			methodDocumentation.append(parmType);
		}
		methodDocumentation.append("\n	* @return ");
		methodDocumentation.append("A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:\n");
		for (int i = 0; i < hashMapOutParms.size(); i++) {
			String parmName = hashMapOutParms.get(i).substring(0, hashMapOutParms.get(i).indexOf(MARK));
			String parmType = hashMapOutParms.get(i).substring(hashMapOutParms.get(i).indexOf(MARK) + MARK.length());;
			methodDocumentation.append("	*	");
			methodDocumentation.append(parmName);
			methodDocumentation.append(" - Type: ");
			methodDocumentation.append(parmType);
			methodDocumentation.append("<br>\n");
		}
		methodDocumentation.append("\n	*/\n");
		return methodDocumentation.toString();
	}
}
