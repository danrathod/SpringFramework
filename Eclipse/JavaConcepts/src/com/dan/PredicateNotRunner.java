package com.dan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateNotRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 67, 89, 88);

		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		System.out.println(evenNumberPredicate.test(11));

		System.out.println(numbers.stream().anyMatch(evenNumberPredicate));
		System.out.println(numbers.stream().filter(evenNumberPredicate).findFirst());

		List<Integer> evenList = numbers.stream().filter(evenNumberPredicate).toList();
		System.out.println(evenList);
//		evenList.add(10);

		Integer a[] = new Integer[3];
		a[0] = 10;
		a[1] = 15;
		a[2] = 20;
		System.out.println(Stream.of(a).filter(num -> num % 2 == 0).toList());
		
		numbers.stream().forEach(num -> System.out.println(num));

	}

}
