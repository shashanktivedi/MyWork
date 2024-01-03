package com.java.codefit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trial {

	


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int array[] = {0,1,0,1,0,0,1};
//
//		String result = Arrays.stream(array).mapToObj(Integer::toString).collect(Collectors.joining(" "));
//
//		System.out.println(result);
//
//	}

	
	   public static void main(String[] args) {
	        int[] array = {1, 0, 1, 1, 0, 0, 1, 0, 1};
	        
	        List<Integer> numbers = Arrays.asList(1, 0, 1, 1, 0, 0, 1, 0, 1);
	        int sum = numbers.stream()
	                .mapToInt(Integer::intValue)
	                .sum();
	        System.out.println("Sum of all:"+sum);
	        
	        String input = "Hello World";
	        String[] words = input.split(" ");
	        List<String> reversedWords = Arrays.stream(words)
	                .map(s -> new StringBuilder(s).reverse().toString())
	                .collect(Collectors.toList());
	        System.out.println(String.join(" ", reversedWords));
	        
//	        List list1 = Arrays.asList(1,2,3,4);
//	        List list2 = Arrays.asList(4,5,6,7);
//	        List<Integer> result = new ArrayList<>(list1);
//	        System.out.println(result.retainAll(list2));
	        
//	        Arrays.stream(array).distinct().limit(1).forEach(i -> System.out.println(i));
	        
	        System.out.println("Count of elements: "+ Arrays.stream(array).count());
	        
	        Arrays.stream(array)
	              .filter(i -> i == 0)
	              .forEach(i -> System.out.print("0 "));
	        
	        Arrays.stream(array)
	              .filter(i -> i == 1)
	              .forEach(i -> System.out.print("1 "));

	        System.out.println(); // Add a new line for readability
	    }
}
