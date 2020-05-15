package com.sapient.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

	public static void main(String[] args) throws IOException {
		
		String directoryName = Reader.rd.nextLine();
		Path currentDirectory = Paths.get("." + directoryName );
		Files.list(currentDirectory).forEach(System.out::println);

	}

}
