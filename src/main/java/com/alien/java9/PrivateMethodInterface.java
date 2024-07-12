package com.alien.java9;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

interface CustomCalculator {
	default int addEvenNumbers(int... nums) {
		return add(n -> n % 2 == 0, nums);
	}

	default int addOddNumbers(int... nums) {
		return add(n -> n % 2 != 0, nums);
	}

	private int add(IntPredicate predicate, int... nums) {
		return IntStream.of(nums).filter(predicate).sum();
	}
}

public class PrivateMethodInterface implements CustomCalculator {

	public static void main(String... args) {
		CustomCalculator demo = new PrivateMethodInterface();

		int sumOfEvens = demo.addEvenNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(sumOfEvens);

		int sumOfOdds = demo.addOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(sumOfOdds);

	}
}
