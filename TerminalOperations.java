package com.huda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
	
	public static void main(String[] args) {
		
		List<String> listOfNames = 
				Arrays.asList("Bart", "Joe", "Ava", "Aneri", "Albert", "Joe");
				
				
		System.out.println("\n count() :");
		long totalElements = listOfNames.stream().count();
		System.out.println(totalElements);
		
		
		System.out.println("\n findFirst():");
		listOfNames.stream()
			.sorted()
			.findFirst().ifPresent(System.out::println);
		
		
		System.out.println("\n findAny():");
		listOfNames.stream()
			.sorted()
			.findAny().ifPresent(System.out::println);
		
		
		System.out.print("\n anyMatch(): ");
		boolean res1 = listOfNames.stream().anyMatch(s -> s.startsWith("A"));
		System.out.println(res1);
		
		
		System.out.print("\n allMatch(): ");
		boolean res2 = listOfNames.stream().allMatch(s -> s.startsWith("A"));
		System.out.println(res2);
		
		
		System.out.print("\n noneMatch(): ");
		boolean res3 = listOfNames.stream().noneMatch(s -> s.startsWith("Z"));
		System.out.println(res3);
		
		
		System.out.println("\n collect():");
		List<String> distinctElements = listOfNames.stream()
		                        .distinct()
		                        .collect(Collectors.toList());
		System.out.println(distinctElements);
		
	
		System.out.println("\n toArray() :");
		String message = "It is raining outside";
		String[] arrayOfWords = Arrays.stream(message.split("\\s+"))
				.toArray(String[]::new);
		
		for(String word : arrayOfWords) {
			System.out.println(word);
		}
		
	
		System.out.println("\n max() :");
	
	
		System.out.println("\n min() :");
		
	}

}
