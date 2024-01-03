package com.java.codefit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Suppose {

//    public static void main(String[] args) {
//        
//        int N = 3; // Change N to the desired value
//
//        if (N > 0 && N <= listOfNumber.size()) {
//            List<Integer> sortedList = new ArrayList<>(listOfNumber);
//            Collections.sort(sortedList);
//
//            System.out.println("Ascending order: "+ sortedList);
//            int NthSmallest = sortedList.get(N - 1);
//            int index = listOfNumber.indexOf(NthSmallest);
//
//            listOfNumber.remove(index);
//
//            System.out.println("After removing the " + N + "th smallest element: " + listOfNumber);
//        } else {
//            System.out.println("Invalid value of N. N should be between 1 and the size of the list.");
//        }
//    }
	
//	public static void main(String[] args) {
//        List<Integer> listOfNumber = new ArrayList<>(Arrays.asList(99, 345, 2, 12, 24, 12, 275));
//        int N =3; // Change N to the desired value
//
//        if (N > 0 && N <= listOfNumber.size()) {
//            List<Integer> sortedList = new ArrayList<>(listOfNumber);
//            Collections.sort(sortedList);
//            int NthSmallest = sortedList.get(N - 1);
//
//            // Filter and remove all occurrences of the Nth smallest element
//            List<Integer> modifiedList = listOfNumber.stream()
//                    .filter(i -> i != NthSmallest)
//                    .collect(Collectors.toList());
//
//            System.out.println("After removing all occurrences of the " + N + "th smallest element: " + modifiedList);
//        } else {
//            System.out.println("Invalid value of N. N should be between 1 and the size of the list.");
//        }
//    }
	
	public static void main(String[] args) {
        List<Integer> listOfNumber = Arrays.asList(99, 345, 2, 12, 24, 12, 275);
        int N = 3; // Change N to the desired value

        if (N > 0 && N <= listOfNumber.size()) {
            List<Integer> modifiedList = listOfNumber.stream()
                    .sorted()
                    .filter(i -> i != listOfNumber.stream()
                            .sorted()
                            .limit(N)
                            .skip(N - 1)
                            .findFirst()
                            .orElse(null))
                    .collect(Collectors.toList());

            System.out.println("After removing the " + N + "th smallest element: " + modifiedList);
        } else {
            System.out.println("Invalid value of N. N should be between 1 and the size of the list.");
        }
    }
}

