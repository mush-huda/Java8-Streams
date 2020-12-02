package com.huda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * - A Stream does not store data, in that sense, it is not a data structure.
 * - It does not modify the original data source. It only provides the results as per pipelined methods.
 */

public class StreamSource {

	public static void main(String[] args) {

		/*
		 * By calling the stream() method of the Collection interface
		 * 		- default Stream<E> stream()
		 */
		
		System.out.println("Way 1: Collection.stream(): ");
		
		// 1. First create a collection and then call stream() method on that collection
		List<String> myList = Arrays.asList("a1", "c2", "c1", "b2", "b1", "a2");
		myList.stream().forEach(System.out::println);

		// 2. Shorthand of the above way
		System.out.println("\nShorthand: ");
		Arrays.asList("a1", "a2", "a3").stream().forEach(System.out::println);

		
		/*
		 * By calling the static method stream() of the Array class.
		 * 		- static <T> Stream<T> stream(T[] array)
		 * In this case, we create the array inside the stream() method.
		 */
		
		System.out.println("\nWay 2: Arrays.stream(): ");
		Arrays.stream(new int[] { 1, 2, 3 }).forEach(System.out::println);
		
		System.out.println("\n");
		Arrays.stream(new String[] { "a1", "b2", "c1" }).forEach(System.out::println);


		/*
		 * By calling the static method of() of the Stream interface.
		 * 		- static <T> Stream<T>	of(T... values)
		 */
		
		System.out.println("\nWay 3: Stream.of(): ");
		Stream.of("a1", "a2", "a3").forEach(System.out::println);

	}

}
