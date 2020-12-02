package com.huda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * public interface Stream<T> extends BaseStream<T, Stream<T>>
 */

public class IntermedateOperations {
	
	public static void main(String[] args) {
		
		List<String> listOfCities = 
				Arrays.asList("Dhaka", "Ankara", "Paris", "Berlin", "Paris");
		
		System.out.println("\n skip(long n):");
		listOfCities.stream()
			.skip(2)
			.forEach(System.out::println);
		
		
		System.out.println("\n limit(long maxSize):");
		listOfCities.stream()
			.limit(2)
			.forEach(System.out::println);
		
		
		System.out.println("\n disinct():");
		listOfCities.stream()
			.distinct()
			.forEach(System.out::println);
		
		
		System.out.println("\n sorted():");
		listOfCities.stream()
			.sorted()
			.forEach(System.out::println);

		
		System.out.println("\n filter(Predicate<T>):");
		listOfCities.stream()
			.filter(x -> x.startsWith("A"))
			.forEach(System.out::println);
		
		
		System.out.println("\n map(Function <T>):");		
		listOfCities.stream()
			.map(String::toLowerCase)
			.forEach(System.out::println);
		
		
		/*
		 * Stream<List<String>>	-> flatMap ->	Stream<String>
		 */
		System.out.println("\n flatMap(Function <T>):");
		List<String> listOfCountries = 
				Arrays.asList("Bangladesh", "Turkey", "France", "Germany");
		
		List<List<String>> listOfLists = 
				Arrays.asList(listOfCities, listOfCountries);
		
		System.out.println("Before flatting: " + listOfLists);
		
		List<String> flatMap =listOfLists.stream()
				.flatMap(x -> x.stream())
				.collect(Collectors.toList());
		
		System.out.println("After flatting: " + flatMap);
		

		System.out.println("\n peek(Consumer <T>):");
		List<String> peek = listOfCities.stream()
			.peek(System.out::println)		// peek() is an intermediate operator. Thus, this line alone will not print anything to the console
			.map(s -> s.toLowerCase())
			.collect(Collectors.toList());
		System.out.println("Peek will not show the changes that took place later: " + peek);

	}

}
