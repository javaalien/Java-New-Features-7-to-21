package com.alien.java11;

import java.util.Optional;

// Explain the new methods added to the Optional class in Java 11.

public class OptionalNewMethodsAddedExample {

	public static void main(String[] args) {

		Optional<String> opt = Optional.of("Java 11");

		System.out.println(opt.isEmpty());

		opt.ifPresentOrElse(value -> System.out.println("Value :" + value),
				() -> System.out.println("Value is Absent"));

		Optional<String> orOpt = Optional.<String>empty().or(() -> Optional.of("Default"));

		System.out.println(orOpt.get());

		opt.stream().forEach(System.out::println);
	}
}
