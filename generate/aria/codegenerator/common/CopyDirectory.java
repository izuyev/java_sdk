package aria.codegenerator.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.wsdl.WSDLException;

public class CopyDirectory {
	public static void main(String[] args) throws IOException, WSDLException {
		CodeGeneration.showProcessText("Copying files to the specified locations", CodeGeneration.MESSAGE);
		String[] langArray = CodeGeneration.getLanguageArray();
		for (int i = 0; i < langArray.length; i++) {
			String language = langArray[i];
			String generateText = CodeGeneration.getLanguageParametersFromXML("language", language, "generate");
			boolean generate = false;
			if (generateText.equalsIgnoreCase("true")) {
				generate = true;
			}

			if (!generate) {
				continue;
			}

			CodeGeneration.showProcessText("Copying Source code", CodeGeneration.MESSAGE);
			String sourcePath = CodeGeneration.getBasicSettingsFromXML("sourcePath");
			String libraryPath = CodeGeneration.getBasicSettingsFromXML("libraryPath");
			String libraryName = CodeGeneration.getBasicSettingsFromXML("libraryName");

			String specSourcePath = CodeGeneration.getLanguageParametersFromXML("language", language, "sourcePath");
			if (specSourcePath != null && specSourcePath.length() > 0) {
				sourcePath = specSourcePath;
			} else {
				sourcePath += "/" + language;
			}
			File targetLocation = new File(sourcePath + "\\" + "AriaSDK_src.zip");
			File sourceLocation = new File("");
			sourceLocation = new File(sourceLocation.getAbsolutePath() + "\\" + "generated\\"+ language + "\\" + "AriaSDK_src.zip");
			copyDirectory(sourceLocation, targetLocation);
			CodeGeneration.showProcessText("Source code copied", CodeGeneration.MESSAGE);

			/* Jar Copy */
			String extension = ".jar";
			if (language.equalsIgnoreCase(".Net")){
				extension = ".dll";
				CodeGeneration.showProcessText(".Net library generation must be done manually, please check the Readme.txt file on the .Net SDK folder.", CodeGeneration.MESSAGE);
				continue;
			}
			String generateLibText = CodeGeneration.getLanguageParametersFromXML("language", language, "generateLibrary");
			boolean generateLib = false;
			if (generateLibText.equalsIgnoreCase("true")) {
				generateLib = true;
			}
			if (generateLib) {
				CodeGeneration.showProcessText("Copying Library File", CodeGeneration.MESSAGE);
				String specLibraryPath = CodeGeneration.getLanguageParametersFromXML("language", language, "libraryPath");
				if (specLibraryPath != null && specLibraryPath.length() > 0) {
					libraryPath = specLibraryPath;
				} else {
					libraryPath += "/" + language;
				}
				/* Library copy */
				sourceLocation = new File("");
				sourceLocation = new File(sourceLocation.getAbsolutePath() + "\\" + "generated\\" + language + "\\" + "AriaSDK"+extension);
				targetLocation = new File(libraryPath + "\\" + libraryName + extension);
				copyDirectory(sourceLocation, targetLocation);
				CodeGeneration.showProcessText("Library File copied", CodeGeneration.MESSAGE);
			}
		}
		CodeGeneration.showProcessText("Finished Copying files", CodeGeneration.MESSAGE);
	}

	public static void copyDirectory(File sourceLocation, File targetLocation) throws IOException {
		String fileDir = targetLocation.getAbsolutePath();
		/* If targetLocation does not exist, it will be created. */
		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				CodeGeneration.showProcessText("Creating missing directories at: (" + fileDir + ")", CodeGeneration.MESSAGE);
				if (targetLocation.getParentFile() != null && !targetLocation.getParentFile().mkdirs()) {
					/* handle permission problems here */
					CodeGeneration.showProcessText(
							"No permissions on the root directory or some error ocurred during directories creation",
							CodeGeneration.MESSAGE);
				}
				CodeGeneration.showProcessText("Creating file: (" + fileDir + ")", CodeGeneration.MESSAGE);
			}

			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]), new File(targetLocation, children[i]));
			}
		} else {
			if (!targetLocation.getParentFile().exists()) {
				CodeGeneration.showProcessText("Creating missing directories at: (" + fileDir + ")", CodeGeneration.MESSAGE);
				if (targetLocation.getParentFile() != null && !targetLocation.getParentFile().mkdirs()) {
					/* handle permission problems here */
					CodeGeneration.showProcessText(
							"No permissions on the root directory or some error ocurred during directories creation",
							CodeGeneration.MESSAGE);
				}
			}
			CodeGeneration.showProcessText("Creating file: (" + fileDir + ")", CodeGeneration.MESSAGE);
			if (!targetLocation.createNewFile()) {
				CodeGeneration.showProcessText("Could not create or Already exists file: " + fileDir, CodeGeneration.ERROR);
			}
			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
	}
}
