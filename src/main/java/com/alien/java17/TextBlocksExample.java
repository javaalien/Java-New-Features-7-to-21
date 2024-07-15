package com.alien.java17;

// How do you use the new text blocks in Java 17?

public class TextBlocksExample {

	public static void main(String[] args) {
		String textBlock = """
				{
				    "name": "Java 17",
				    "type": "LTS"
				}
				""";

		System.out.println(textBlock);
	}
}
