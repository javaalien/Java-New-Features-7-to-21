package com.alien.java17;

// Explain Pattern Matching for instanceof in Java 17

public class PatternMatchingExample {

	public static void main(String[] args) {

		Object obj = "Hello, Java 17";

		if (obj instanceof String s) {
			System.out.println(s.toUpperCase());
		}
	}
}
