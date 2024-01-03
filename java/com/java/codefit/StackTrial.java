package com.java.codefit;

import java.util.Arrays;
import java.util.List;

public class StackTrial<T> {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,5,2);

        int n = list.size() + 1; // Expected maximum integer
        int totalSum = n * (n + 1) / 2; // Sum of all integers from 1 to n
        int sumOfList = list.stream().mapToInt(Integer::intValue).sum();
        int missingInteger = totalSum - sumOfList;
        System.out.println("Missing integer: " + missingInteger);

		
		int secondHighest = list.stream().distinct().sorted().skip(2).findFirst().orElse(null);
		System.out.println("secondHighest: "+secondHighest);
				
	}
}