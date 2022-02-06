package com.practices;

import java.util.stream.IntStream;

class FizzBuzzSolution {
	
	public static void fizzBuzz(int n) {
		IntStream.rangeClosed(1, n)
        .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
        .forEach(System.out::println);
	}
}

public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzzSolution.fizzBuzz(15);
	}
}
