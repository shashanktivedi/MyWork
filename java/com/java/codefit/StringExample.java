package com.java.codefit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringExample {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("ABBCDEEFH");
//		System.out.println(sb.reverse());
		
//		String str = new String("ABBCDEEFH");
//		
//		for(int i =str.length()-1;i>=0; i-- ) {
//			char c= str.charAt(i);
//			System.out.print(c);
//			Map<Character, Integer> map = new HashMap();
//			for(char ch:c) {
//				System.out.println(ch);
				

		//=============================================================================
				
				String inputStr = "Apple";
				List<Character> recurringLetters = new ArrayList<>();

				for (int i = 0; i < inputStr.length(); i++) {
				    char c = inputStr.charAt(i);
				    if (inputStr.indexOf(c, i + 1) != -1 && !recurringLetters.contains(c)) {
				        recurringLetters.add(c);
				    }
				}

				System.out.println(recurringLetters);
				

				//=============================================================================
				
				String input = "jaskdhuiwo123123dada";
				Map<Character, Integer> charFrequencies = new HashMap<>();

				for (int i = 0; i < input.length(); i++) {
				    char c = input.charAt(i);
				    charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
				}
				List<Character> unevenlyOccurringCharacters = new ArrayList<>();

				charFrequencies.forEach((ch, frequency) -> {
				    if (frequency % 2 != 0) {
				        unevenlyOccurringCharacters.add(ch);
				    }
				});

				System.out.println("unevenlyOccurringCharacters: "+unevenlyOccurringCharacters);
		
				//=============================================================================
				
				String inputString = "jaskdhuiwo123123dada";

				List<Character> unevenlyOccurringCharacterss = inputString.chars()
				        .mapToObj(c -> (char) c)
				        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				        .entrySet().stream()
				        .filter(entry -> entry.getValue() % 2 != 0)
				        .map(Map.Entry::getKey)
				        .collect(Collectors.toList());

				System.out.println("unevenlyOccurringCharacters using streamAPI: "+unevenlyOccurringCharacterss);


//			}
//		}
	}
}
