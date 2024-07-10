package com.alien.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// How do you read and write strings from/to files in Java 11?

public class FileReadWriteExample {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("example.txt");

		// Writing a string to a file
		Files.writeString(path, "Hello, Java 11!");

		// Reading a string from a file
		String content = Files.readString(path);
		System.out.println(content); // "Hello, Java 11!"

	}
}
