package com.dan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		String newFileContent = fileContent.replace("Dan", "Kajal");
		Path newPath = Paths.get("./resources/sample-new.txt");
		Files.writeString(newPath, newFileContent);
		System.out.println(Files.readString(newPath));
		
	}

}
