package tryjunit4.rules;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.JUnitCore;

public class TemporaryFolderTest {
	public static void main(String[] args) {
		System.out.printf("java.io.tmpdir is %s%n", System.getProperty("java.io.tmpdir"));
		JUnitCore.main(TemporaryFolderTest.class.getName());
	}

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException {
		tryTemporaryFolder();
	}

	@Test
	public void testUsingTempFolder2() throws IOException {
		tryTemporaryFolder();
	}

	private void tryTemporaryFolder() throws IOException {		
		File createdFile = folder.newFile("myfile.txt");
		File createdFolder = folder.newFolder("subfolder");
		File randomFile = folder.newFile();
		assertTrue(createdFolder.isDirectory());
		assertTrue(createdFile.isFile());
		assertTrue(randomFile.isFile());

		System.out.println("\n-------------");
		System.out.println("root folder is  ->" + folder.getRoot());
		System.out.println(createdFile.getAbsolutePath());
		System.out.println(createdFolder.getAbsolutePath());
		System.out.println(randomFile.getAbsolutePath());
		System.out.println();
	}
}
