package com.huda.streams;

import java.util.stream.Stream;

public class MoreStreams {

	public static void main(String[] args) {

		System.out.println("filter() + map() + sorted():");
		Stream.of("a1", "c2", "c1", "b2", "b1", "a2")
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);


		System.out.println("\nmap() + mapToInt() + max(): ");
		Stream.of("a1", "a2", "a3")
			.map(s -> s.substring(1))
	    	.mapToInt(Integer::parseInt)
	    	.max().ifPresent(System.out::println);
		

		System.out.println("\nmapToInt() + mapToObj(): ");
		Stream.of(1.0, 2.0, 3.0)
			.mapToInt(Double::intValue)
			.mapToObj(i -> "a" + i)
			.forEach(System.out::println);
		
		
		System.out.println("\nfilter(): ");
		Stream.of("d2", "a2", "b1")
	    	.filter(s -> {
	    		System.out.print(s);
	    		return true;
	    		})
	    	.forEach(s -> System.out.println(" forEach: " + s));
		
		
		System.out.println("\nmap() + filter() + forEach(): ");
		Stream.of("d2", "a2", "b1")
	    	.map(s -> {
	        	System.out.println("map: " + s);
	        	return s.toUpperCase();
	    		})
	    	.filter(s -> {
	        	System.out.println("filter: " + s);
	        	return s.startsWith("A");
	    		})
	    	.forEach(s -> System.out.println("forEach: " + s));
		
		
		System.out.println("\nfilter() + map() + forEach(): ");
		Stream.of("d2", "a2", "c1")
	    	.filter(s -> {
	        	System.out.println("filter: " + s);
	        	return s.startsWith("a");
	    		})
	    	.map(s -> {
	        	System.out.println("map: " + s);
	        	return s.toUpperCase();
	    		})
	    	.forEach(s -> System.out.println("forEach: " + s));

		
		System.out.println("\nfilter() + sort() + map() + forEach(): ");
		Stream.of("d2", "a2", "b1", "a3", "a1")
	    	.filter(s -> s.startsWith("a"))
	    	.sorted((s1, s2) -> {
	        	System.out.printf("sort: %s; %s\n", s1, s2);
	        	return s1.compareTo(s2);
	    		})
	    	.map(s -> s.toUpperCase())
	    	.forEach(s -> System.out.println("forEach: " + s));
		
		
	}
}
