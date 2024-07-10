package com.alien.java11;

//  What are the new methods added to the String class in Java 11?

public class StringMethodsExample {

	public static void main(String[] args) {

		String str = "  Java 11 Alien  ";

		// Returns true if the string is empty or contains only white space code points.
		System.out.println(str.isBlank());

		// Removes leading and trailing white space.
		System.out.println(str.strip());

		// Removes leading white space.
		System.out.println(str.stripLeading());

		// Removes trailing white space.
		System.out.println(str.stripTrailing());

		// Returns a stream of lines extracted from the string, separated by line
		// terminators.
		System.out.println("Java\nKotlin\nScala".lines().count());

		// Returns a string whose value is the concatenation of this string repeated
		// count times.
		System.out.println("Hello ".repeat(3));

	}
}
