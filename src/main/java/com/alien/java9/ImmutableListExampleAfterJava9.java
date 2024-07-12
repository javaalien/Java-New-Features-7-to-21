package com.alien.java9;

import java.util.List;

public class ImmutableListExampleAfterJava9 {

	public static void main(String[] args) {
		List<String> fruits = List.of("Banana", "Apple", "Mango", "Orange");
		fruits.forEach(e -> System.out.println(e));

		List<String> list = List.of("A", "B", "C", "D");
		list.forEach(e -> System.out.println(e));
	}
}
