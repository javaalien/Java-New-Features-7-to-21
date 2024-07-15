package com.alien.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

// How has the Random Number Generation been enhanced in Java 17?

public class RandomGeneratorExample {

	public static void main(String[] args) {

		RandomGenerator random = RandomGeneratorFactory.of("L64X128MixRandom").create();
		random.ints(5).forEach(System.out::println);

	}
}
