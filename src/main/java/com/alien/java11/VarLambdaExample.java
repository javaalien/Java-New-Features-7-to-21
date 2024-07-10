package com.alien.java11;

import java.util.List;

//  How do you use the var keyword in Java 11?

public class VarLambdaExample {

	public static void main(String[] args) {
		List<String> list = List.of("Java", "Kotlin", "Scala");

		list.forEach((var item) -> System.out.println(item));

		var number = 10;
		var str = "chetan";

		System.out.println(number);
		System.out.println(str);
	}

}
