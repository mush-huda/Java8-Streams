package com.huda.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {

	/*
	 * interface IntStream extends BaseStream<Integer, IntStream>
	 */

	public static void main(String[] args) {

		System.out.println(" range(int startInc,int endExcl):");
		IntStream.range(1, 10)
			.forEach(System.out::println);


		System.out.println("\n skip(long n):");
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));

		
		System.out.println("\n mapToObj(): ");
		IntStream.range(1, 4)
			.mapToObj(i -> "a" + i)
			.forEach(System.out::println);
		
		
		System.out.println("\nIntStream specific terminal operations");
		
		
		System.out.println("\n sum():");
		int sum = IntStream.range(1, 5).sum();
		System.out.println(sum);
		
		
		System.out.println("\n average():");
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x)
			.average().ifPresent(System.out::println);
		
		
		System.out.println("\n max():");
		IntStream.range(1, 10)
			.max().ifPresent(System.out::println);

		
		System.out.println("\n min():");
		IntStream.range(1, 10)
			.min().ifPresent(System.out::println);
		
		
		System.out.println("\n reduce():");
		int total = Stream.of(6, 1, 3)
				.reduce(45, (a , b) -> a + b );
		System.out.println("Total = " + total);
		
		System.out.println("\n summaryStatistics():");
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);
	}

}
