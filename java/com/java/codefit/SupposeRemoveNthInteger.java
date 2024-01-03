package com.java.codefit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupposeRemoveNthInteger {

	public static void main(String[] args) {

		//Create list of integers
		List<Integer> listOfNumber = new ArrayList<>(Arrays.asList(99, 345, 2, 12, 24, 12, 275));
		
		//Mention Nth interger
		Integer N = 3;
		
		//Create Stream of integer in ascending order
		System.out.println("Original list in ascending order: " + listOfNumber.stream()
        .sorted()
        .collect(Collectors.toList()));


		
		//Perform logic to remove Nth smallest integer.
		 List<Integer> modifiedList = listOfNumber.stream()
                 .sorted()
                 .filter(i -> i != listOfNumber.stream()
                         .sorted()
                         .limit(N)
                         .skip(N - 1)
                         .findFirst()
                         .orElse(null))
                 .collect(Collectors.toList());
		
		System.out.println(modifiedList);
	}

	
}
