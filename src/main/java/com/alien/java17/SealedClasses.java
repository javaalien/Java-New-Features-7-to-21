package com.alien.java17;

// What are Sealed Classes in Java 17, and how do they work?
// Sealed classes and interfaces restrict which other classes or interfaces may extend or 
// implement them. This feature enhances the ability to model data and provides more control 
// over the class hierarchy.

abstract sealed class Shape permits Circle, Rectangle {

}

final class Circle extends Shape {
	
}

final class Rectangle extends Shape {
	
}

public class SealedClasses {

	public static void main(String[] args) {

	}
}
