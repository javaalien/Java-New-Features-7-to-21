package com.alien.java9;

import java.util.Set;

public class ImmutableSetExample {

	public static void main(String[] args) {
		Set<String> fruits = Set.of("Banana", "Apple", "Mango", "Orange");
		fruits.forEach(e -> System.out.println(e));

		Set<String> set = Set.of("A", "B", "C", "D");
		set.forEach(e -> System.out.println(e));

	}
}
