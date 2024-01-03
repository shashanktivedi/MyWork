package com.java.codefit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Result {

	 public static List<Integer> intArray(int startingIndex, int endingIndex) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array

	        List<Integer> result = IntStream.rangeClosed(startingIndex, endingIndex)
	                .mapToObj(i -> arr[i - 1])
	                .collect(Collectors.toList());

	        if (startingIndex <= endingIndex) {
	            return result;
	        } else {
	            List<Integer> reversedResult = new ArrayList<>(result);
	            return IntStream.rangeClosed(1, reversedResult.size())
	                    .mapToObj(i -> reversedResult.get(reversedResult.size() - i))
	                    .collect(Collectors.toList());
	        }
	    }
}
