package com.java.codefit;

import java.util.Arrays;
import java.util.List;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> studentNames = Arrays.asList("Alice", "Bob", "Anna", "David", "Alex");

        studentNames.stream()
                    .filter(name -> name.startsWith("A")).sorted()
                    .forEach(System.out::println);
        
        String s = studentNames.stream().skip(2).findFirst().orElse(null);
        System.out.println("Third name from the list is: "+s);
	}

}
