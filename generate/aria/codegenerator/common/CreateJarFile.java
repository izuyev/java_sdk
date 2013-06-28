package aria.codegenerator.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

public class CreateJarFile {
	public static int	BUFFER_SIZE	= 10240;

	 public static void main(String[] args) {
	 String pkgPath = "d:/ariasdk.jar";
	 
	 createJarFile(new File(pkgPath), "C:/Test", "JAVA");
	 }

	public static void createJarFile(File destinationFile, String sourcePath, String language) {
		if (language.equalsIgnoreCase("JAVA")) {
			File[] tobeJared = new File[2];
			tobeJared[0] = new File("C:/CVS/Aria/Root/5. Development/5.03 Source/AriaSDK/src/com/aria/common/rest/RestUtilities.java");
			tobeJared[1] = new File("C:/CVS/Aria/Root/5. Development/5.03 Source/AriaSDK/src/com/aria/sdk/classes/AriaBillingBuilder.java");
			createJarFile(destinationFile, tobeJared);
		} else if (language.equalsIgnoreCase(".NET")) {
			CodeGeneration.showProcessText("Undefined file packer: (" + language + ")", CodeGeneration.ERROR);
		} else if (language.equalsIgnoreCase("PHP")) {
			CodeGeneration.showProcessText("Undefined file packer: (" + language + ")", CodeGeneration.ERROR);
		} else {
			return;
		}
	}

	public static void createJarFile(File archiveFile, File[] tobeJared) {
		try {
			byte buffer[] = new byte[BUFFER_SIZE];
			// Open archive file
			FileOutputStream stream = new FileOutputStream(archiveFile);
			JarOutputStream out = new JarOutputStream(stream, new Manifest());

			for (int i = 0; i < tobeJared.length; i++) {
				if (tobeJared[i] == null || !tobeJared[i].exists() || tobeJared[i].isDirectory())
					continue; // Just in case...
				System.out.println("Adding " + tobeJared[i].getName());

				// Add archive entry
				JarEntry jarAdd = new JarEntry(tobeJared[i].getName());
				jarAdd.setTime(tobeJared[i].lastModified());
				out.putNextEntry(jarAdd);

				// Write file to archive
				FileInputStream in = new FileInputStream(tobeJared[i]);
				while (true) {
					int nRead = in.read(buffer, 0, buffer.length);
					if (nRead <= 0)
						break;
					out.write(buffer, 0, nRead);
				}
				in.close();
			}

			out.close();
			stream.close();
			System.out.println("Adding completed OK");
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Error: " + ex.getMessage());
		}
	}
}