package aria.codegenerator.net;

import static org.w3c.dom.Node.ELEMENT_NODE;
import java.io.IOException;
import java.util.Iterator;
import javax.wsdl.Definition;
import javax.wsdl.Types;
import javax.wsdl.WSDLException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import aria.codegenerator.common.CodeGeneration;
import com.ibm.wsdl.extensions.schema.SchemaImpl;

/**
 * Generate dynamically the AriaBillingComplete class code
 */
public class RestUtilitiesCodeGenerationNet {
	private static final String	CLASS_SUB_PACKAGE	= "";
	private static final String	CLASS_NAME	= "RestUtilities.cs";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								fileDir;
	private static String					RETURN_ELEMENT	= "ReturnElement";
	private static StringBuilder	buildReturnElement;
	private static StringBuilder	imports;
	private static String					packageRoute		= "";
	private String								wsdlUrl;
	private String								generationRoot;
	private CodeGeneration				codeGeneration;

	public RestUtilitiesCodeGenerationNet(String wsdlUrl, String generationRoot) {
		super();
		this.wsdlUrl = wsdlUrl;
		this.generationRoot = generationRoot;
	}

	/* *********************************** GETTERS AND SETTERS *************************************** */
	public CodeGeneration getCodeGeneration() {
		if (codeGeneration == null) {
			codeGeneration = CodeGeneration.getInstance();
		}
		return codeGeneration;
	}

	public String getWsdlUrl() {
		if (wsdlUrl == null) {
			wsdlUrl = "";
		}
		return wsdlUrl;
	}

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}

	public static StringBuilder getImports() {
		if (imports == null) {
			imports = new StringBuilder();
		}
		return imports;
	}

	private static void setImports(Node node) {
		String className = buildJavaName(node.getAttributes().getNamedItem("name").getNodeValue());
		getImports().append("import " + packageRoute + "." + className + ";\n");
	}

	public String getFileDir() {
		if (fileDir == null)
			fileDir = getGenerationRoot() + "/com/aria/common/rest/RestUtilities.java";
		return fileDir;
	}

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("using Aria.SDK.AriaServices.AriaWebServices.AriaComplete;\n");
			header.append("\n");
			header.append("namespace Aria.SDK.AriaServices.AriaWebServices\n");
			header.append("{\n");
			header.append("    class RestUtilities\n");
			header.append("    {\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("	}\n");
			footer.append("}");
		}
		return footer;
	}

	public String getGenerationRoot() {
		return generationRoot;
	}

	public void setGenerationRoot(String generationRoot) {
		this.generationRoot = generationRoot;
	}

	/* ******************************** END - GETTERS ********************************************* */

	public void build() throws IOException, WSDLException {
		StringBuilder resultString = new StringBuilder();
		//String classBody = generalMethods();
		/* Warning, The getHeader MUST be after buildReturnElements thanks to the --imports-- */
		//resultString.append(getHeader() + classBody);
		resultString.append(getHeader());
		RestUtilitiesArraytoParmsNet arrayToParams = new RestUtilitiesArraytoParmsNet();
		resultString.append(arrayToParams.build(getWsdlUrl()));
		resultString.append(getFooter());

		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}

	/* ***************************** GENERAL METHODS ********************************* */
	/** Wsdl to Java For example parm_name to ParmName */
	private static String buildJavaName(String name) {
		String ret = "";
		boolean toUpper = true;
		/* SpecialCase */
		for (char character : name.toCharArray()) {
			if (toUpper)
				character = Character.toUpperCase(character);
			toUpper = character == '_' || Character.toString(character).matches("[0-9]");
			if (character != '_')
				ret += character;
		}
		return ret;
	}

	private static StringBuilder getMethodHeader(Node node) {
		StringBuilder methodHeader = new StringBuilder();
		String className = buildJavaName(node.getAttributes().getNamedItem("name").getNodeValue());

		// methodHeader.append("	@SuppressWarnings(" + (char) 34 + "unused" + (char) 34 + ")\n");
		methodHeader.append("	public static ArrayList<" + className + "> build");
		methodHeader.append(className);
		methodHeader.append("(JSONArray jSonArray) {\n");
		methodHeader.append("		ArrayList<" + className + "> returnElement = new ArrayList<" + className + ">();\n");
		methodHeader.append("		if (jSonArray == null) return returnElement;\n");
		return methodHeader;
	}

	private static StringBuilder getMethodFooter(Node node) {
		StringBuilder methodFooter = new StringBuilder();
		methodFooter.append("		return returnElement;\n");
		methodFooter.append("	}\n\n");
		return methodFooter;
	}

	@SuppressWarnings("unused")
	private String generalMethods() throws WSDLException {
		StringBuilder buildReturnMethods = new StringBuilder();
		Definition wsdlInstance = getCodeGeneration().getwsdlInstance();
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
				if (!nodeName.contains(RETURN_ELEMENT.toLowerCase()))
					continue;
				setImports(node);
				StringBuilder methodHeader = getMethodHeader(node);
				StringBuilder methodBody = getMethodBody(node);
				StringBuilder methodFooter = getMethodFooter(node);
				buildReturnMethods.append(methodHeader.toString() + methodBody.toString() + methodFooter.toString());
				buildReturnElementMethod(node);
			}
		}// catch Schema Imports ONLY ONCE
		buildReturnMethods
				.append("	/* ****************** END - SPECIFIC METHODS FOR EACH RETURN ELEMENT (build<#name#>) **************************************** */\n\n");
		getBuildReturnElement().append("		return ret;\n");
		getBuildReturnElement().append("	}\n");
		getBuildReturnElement().append(
				"		/* ****************** END - RETURN ELEMENT BASE METHOD ********************************* */\n");
		return buildReturnMethods.toString();
	}

	private static StringBuilder getMethodBody(Node node) {
		StringBuilder methodBody = new StringBuilder();
		String className = buildJavaName(node.getAttributes().getNamedItem("name").getNodeValue());
		methodBody.append("		for (int i = 0;i < jSonArray.size();i++) {\n");
		methodBody.append("			" + className + " entity = new " + className + "();\n");
		methodBody.append("			JSONObject jSONObject=(JSONObject)jSonArray.get(i);\n");
		methodBody.append(buildMethodBodySets(node));
		methodBody.append("			returnElement.add(entity);\n");
		methodBody.append("		}\n");

		return methodBody;
	}

	private static String buildMethodBodySets(Node node) {
		StringBuilder ret = new StringBuilder();
		NodeList sequenceNode = node.getChildNodes();
		sequenceNode.getLength();
		NodeList elements = sequenceNode.item(1).getChildNodes();
		int numElements = elements.getLength();
		for (int j = 0; j < numElements; j++) {
			Node element = elements.item(j);
			if (element.getAttributes() == null)
				continue;
			if (node.getNodeType() != ELEMENT_NODE)
				continue;
			String fieldName = element.getAttributes().getNamedItem("name").getNodeValue();
			String fieldJavaName = buildJavaName(element.getAttributes().getNamedItem("name").getNodeValue());
			String fieldType = element.getAttributes().getNamedItem("type").getNodeValue().toLowerCase();
			/* For example: entity.setParamName((String)jSONObject.get("param_name")); */
			if (fieldType.contains(RETURN_ELEMENT.toLowerCase())) {
				fieldType = validateFieldName(fieldType.substring(4));
				
				ret.append("		ArrayList<"+buildJavaName(fieldType)+"> arrayList = build" + buildJavaName(fieldType)
						+ "((JSONArray)jSONObject.get(" + (char) 34 + fieldName + (char) 34 + "));\n");
				ret.append("		for ("+buildJavaName(fieldType)+" element : arrayList){\n");
				ret.append("			entity.get"+fieldJavaName+"().add(element);\n");
				ret.append("		}\n");
//				ret.append("			entity.set" + fieldJavaName + "(build" + buildJavaName(fieldType)
//						+ "((JSONArray)jSONObject.get(" + (char) 34 + fieldName + (char) 34 + ")));\n");
			} else {
				fieldType = getDataConversionMethod(element.getAttributes().getNamedItem("type").getNodeValue());
				ret.append("			entity.set" + fieldJavaName + "(" + fieldType + "jSONObject," + (char) 34 + fieldName
						+ (char) 34 + "));\n");
			}
		}
		return ret.toString();
	}

	private static String validateFieldName(String field) {
		field = field.toLowerCase();
		if (field.contains("tns:"))
			field = field.substring(4);
		field = field.replaceFirst(RETURN_ELEMENT.toLowerCase(), RETURN_ELEMENT);
		return field;
	}

	@SuppressWarnings("unused")
	private static String getFieldType(String nodeValue) {
		String ret = "UnKnownType" + nodeValue;
		nodeValue = nodeValue.toLowerCase();
		if (nodeValue.contains("string")) {
			ret = "(String)";
		} else if (nodeValue.contains("long")) {
			ret = "(Long)";
		} else if (nodeValue.contains("double")) {
			ret = "(Double)";
		} else if (nodeValue.contains("integer")) {
			ret = "(Integer)";
		}
		return ret;
	}

	private static String getDataConversionMethod(String nodeValue) {
		String ret = "UnKnownType" + nodeValue;
		nodeValue = nodeValue.toLowerCase();
		if (nodeValue.contains("string")) {
			ret = "getStringValue(";
		} else if (nodeValue.contains("long")) {
			ret = "getLongValue(";
		} else if (nodeValue.contains("double")) {
			ret = "getDoubleValue(";
		} else if (nodeValue.contains("integer")) {
			ret = "(Integer)";
		}
		return ret;
	}

	private static void buildReturnElementMethod(Node node) {
		String nodeName = node.getAttributes().getNamedItem("name").getNodeValue();
		getBuildReturnElement().append(
				"		if (value.equalsIgnoreCase(" + (char) 34
						+ nodeName.toLowerCase().replaceAll("_" + RETURN_ELEMENT.toLowerCase(), "") + (char) 34 + ")){\n");
		getBuildReturnElement().append("			ret = build" + buildJavaName(nodeName) + "(jSonArray);\n");
		getBuildReturnElement().append("		}\n");
	}

	public static StringBuilder getBuildReturnElement() {
		if (buildReturnElement == null) {
			buildReturnElement = new StringBuilder();
			buildReturnElement.append("	private static Object buildReturnElement(JSONObject jSonObj, String value) {\n");
			buildReturnElement.append("		JSONArray jSonArray=(JSONArray)jSonObj.get(value);\n");
			buildReturnElement.append("		Object ret = new Object();\n");
		}
		return buildReturnElement;
	}

	public void setBuildReturnElement(StringBuilder buildReturnElement) {
		RestUtilitiesCodeGenerationNet.buildReturnElement = buildReturnElement;
	}
	/* ***************************** END - GENERAL METHODS ********************************* */
}