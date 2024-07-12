package com.alien.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExampleBeforeJava9 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");

		fruits = Collections.unmodifiableList(fruits);

		fruits.forEach(e -> System.out.println(e));

	}
}
