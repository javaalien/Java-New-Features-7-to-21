package com.alien.java9;

// Java 9 - Private Methods in Interface

interface CustomInterface {
	public abstract void abstractMethod();

	public default void defaultMethod() {
		privateMethod(); // private method inside default method
		privateStaticMethod(); // static method inside other non-static method
		System.out.println("default method");
	}

	public static void staticMethod() {
		privateStaticMethod(); // static method inside other static method
		System.out.println("static method");
	}

	private void privateMethod() {
		System.out.println("private method");
	}

	private static void privateStaticMethod() {
		System.out.println("private static method");
	}
}

public class PrivateInterfaceMethod implements CustomInterface {

	public static void main(String[] args) {
		CustomInterface customInterface = new PrivateInterfaceMethod();
		customInterface.defaultMethod();
		customInterface.abstractMethod();
		CustomInterface.staticMethod();
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract Method implementation");
	}
}
