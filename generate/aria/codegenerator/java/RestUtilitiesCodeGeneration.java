package aria.codegenerator.java;

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
 * @author Julio Alexander Guevara
 */
public class RestUtilitiesCodeGeneration {
	private static final String	CLASS_SUB_PACKAGE	= "common/rest";
	private static final String	CLASS_NAME	= "RestUtilities.java";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								fileDir;
	private static String					RETURN_ELEMENT	= "ReturnElement";
	private static StringBuilder	buildReturnElement;
	private static StringBuilder	imports;
	private static String					packageRoute		= "com.aria.common.shared";
	private String								wsdlUrl;
	private String								generationRoot;
	private CodeGeneration				codeGeneration;

	public RestUtilitiesCodeGeneration(String wsdlUrl, String generationRoot) {
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
			header.append("package com.aria.common.rest;\n");
			header.append("\n");
			header.append("import java.lang.reflect.InvocationTargetException;\n");
			header.append("import java.lang.reflect.Method;\n");
			header.append("import java.util.ArrayList;\n");
			header.append("import java.util.HashMap;\n");
			header.append("import javax.ws.rs.core.MultivaluedMap;\n");
			header.append("\n");
			header.append("import org.json.simple.JSONArray;\n");
			header.append("import org.json.simple.JSONObject;\n");
			header.append("import org.json.simple.JSONValue;\n");
			header.append("\n");
			header.append("import com.aria.common.shared.*;\n");
			header.append("\n");
			header.append("/**\n");
			header.append(" * RestUtilities\n");
			header.append(" * Web Service class which has method used on rest service calls\n");
			header.append(" * @copyright Aria Systems, Inc\n");
			header.append(" * @author (Automatic generated) PSL - Julio Alexander Guevara Marulanda\n");
			header.append(" */\n");
			header.append("public class RestUtilities {\n");
			header.append("\n");
			header
					.append("	public static HashMap<String, Object> buildJSonReturn(String response, String[] returnValues) {\n");
			header.append("		HashMap<String,Object> returnHashMap = new HashMap<String,Object>();\n");
			header.append("		JSONObject jSonObj = (JSONObject)JSONValue.parse(response);\n");
			header.append("		if (jSonObj == null) return null;\n");
			header.append("		for (int i = 0;i < returnValues.length;i++){\n");
			header.append("			if (!jSonObj.containsKey(returnValues[i])) continue;\n");
			header.append("			if (jSonObj.get(returnValues[i]) instanceof JSONArray){\n");
			header.append("				returnHashMap.put(returnValues[i],buildReturnElement(jSonObj,returnValues[i]));\n");
			header.append("			}else{\n");
			header.append("				returnHashMap.put(returnValues[i],jSonObj.get(returnValues[i]));\n");
			header.append("			}\n");
			header.append("		}\n");
			header.append("		return returnHashMap;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	public static String getValue(String type, Object value) {\n");
			header.append("		String ret = " + (char) 34 + "" + (char) 34 + ";\n");
			header.append("		if (type.equalsIgnoreCase(" + (char) 34 + "long" + (char) 34 + ")){\n");
			header.append("			Long longValue = (Long) value;\n");
			header.append("			if (longValue!=null){\n");
			header.append("				ret = Long.toString(longValue);\n");
			header.append("			}\n");
			header.append("		}else if (type.equalsIgnoreCase(" + (char) 34 + "double" + (char) 34 + ")){\n");
			header.append("			Double doubleValue = (Double) value;\n");
			header.append("			if (doubleValue!=null){\n");
			header.append("				ret = Double.toString(doubleValue);\n");
			header.append("			}\n");
			header.append("		}else if (type.equalsIgnoreCase(" + (char) 34 + "string" + (char) 34 + ")){\n");
			header.append("			String stringValue = (String) value;\n");
			header.append("			if (stringValue!=null){\n");
			header.append("				ret = stringValue;\n");
			header.append("			}\n");
			header.append("		}\n");
			header.append("		return ret;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	private static Double getDoubleValue(JSONObject jSONObject, String field) {\n");
			header.append("		if (jSONObject.get(field)==null) return 0D;\n");
			header.append("		Double doubleValue = 0D;\n");
			header.append("        try {\n");
			header.append("        	doubleValue = Double.parseDouble(jSONObject.get(field).toString());\n");
			header.append("        } catch (NumberFormatException e) {\n");
			header.append("        	String newValue = jSONObject.get(field).toString()+" + (char) 34 + ".0" + (char) 34
					+ ";\n");
			header.append("            try {\n");
			header.append("            	doubleValue = Double.parseDouble(newValue);\n");
			header.append("            } catch (NumberFormatException ex) {\n");
			header.append("            	doubleValue = 0D;\n");
			header.append("            }\n");
			header.append("        }\n");
			header.append("		return doubleValue;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	private static Long getLongValue(JSONObject jSONObject, String field) {\n");
			header.append("		if (jSONObject.get(field)==null) return 0L;\n");
			header.append("		Long longValue = 0L;\n");
			header.append("		try {\n");
			header.append("			longValue = Long.parseLong(jSONObject.get(field).toString());\n");
			header.append("		} catch (NumberFormatException e) {\n");
			header.append("			longValue = 0L;\n");
			header.append("		}\n");
			header.append("		return longValue;\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	private static String getStringValue(JSONObject jSONObject, String field) {\n");
			header.append("		String ret = " + (char) 34 + "" + (char) 34 + ";\n");
			header.append("		if (jSONObject.get(field)==null) return ret;\n");
			header.append("		return jSONObject.get(field).toString();\n");
			header.append("	}\n");
			header.append("\n");
			header.append("	/* ****************** RETURN ELEMENT BASE METHOD ********************************* */\n");
			header.append("	private static Object buildReturnElement(JSONObject jSonObj, String value) {\n");
			header.append("		JSONArray jSonArray=(JSONArray)jSonObj.get(value);\n");
			header.append("		Object ret = new Object();\n");
			header.append("		if (value.equalsIgnoreCase(value)){\n");
			header.append("			try {\n");
			header.append("				String methodName = buildJavaName(value);\n");
			header.append("				methodName = " + (char) 34 + "build" + (char) 34 + "+methodName+" + (char) 34 + RETURN_ELEMENT
					+ (char) 34 + ";\n");
			header.append("				Class<?>[] classes = {JSONArray.class};\n");
			header.append("				Method method = RestUtilities.class.getDeclaredMethod (methodName, classes);\n");
			header.append("				ret = method.invoke(new RestUtilities(),jSonArray);\n");
			header.append("			} catch (SecurityException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			} catch (NoSuchMethodException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			} catch (IllegalArgumentException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			} catch (IllegalAccessException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			} catch (InvocationTargetException e) {\n");
			header.append("				throw new RuntimeException(e);\n");
			header.append("			} \n");
			header.append("		}\n");
			header.append("		return ret;\n");
			header.append("	}\n");
			header.append("	\n");
			header.append("	/** Wsdl to Java For example parm_name to ParmName  */\n");
			header.append("	private static String buildJavaName(String name) {\n");
			header.append("		String ret = " + (char) 34 + "" + (char) 34 + ";\n");
			header.append("		boolean toUpper = true;\n");
			header.append("		/*SpecialCase*/\n");
			header.append("		for (char character : name.toCharArray()) {\n");
			header.append("			if (toUpper) character = Character.toUpperCase(character);\n");
			header.append("			toUpper = character == '_' || Character.toString(character).matches(" + (char) 34 + "[0-9]"
					+ (char) 34 + ");\n");
			header.append("			if (character != '_') ret += character;\n");
			header.append("		}\n");
			header.append("		return ret;\n");
			header.append("	}\n");
			header.append("	/* ****************** END - RETURN ELEMENT BASE METHOD ********************************* */\n");
			header.append("\n");
			header
					.append("	/* ****************** SPECIFIC METHODS FOR EACH RETURN ELEMENT (build<#name#>) ********************************************** */\n");
		}
		return header;
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
		String classBody = generalMethods();
		/* Warning, The getHeader MUST be after buildReturnElements thanks to the --imports-- */
		resultString.append(getHeader() + classBody);
		RestUtilitiesArraytoParms arrayToParams = new RestUtilitiesArraytoParms();
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

				ret.append("			ArrayList<"+buildJavaName(fieldType)+"> arrayList" + buildJavaName(fieldType) + " = build" + buildJavaName(fieldType)
						+ "((JSONArray)jSONObject.get(" + (char) 34 + fieldName + (char) 34 + "));\n");
				ret.append("			for ("+buildJavaName(fieldType)+" element : arrayList" + buildJavaName(fieldType) + "){\n");
				ret.append("				entity.get"+fieldJavaName+"().add(element);\n");
				ret.append("			}\n");
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
		RestUtilitiesCodeGeneration.buildReturnElement = buildReturnElement;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("}");
		}
		return footer;
	}
	/* ***************************** END - GENERAL METHODS ********************************* */
}