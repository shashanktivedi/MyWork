package com.learn.string;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		char c = firstNonRepeatingChar("Rama");
		System.out.println(c);
	}
	
	public static char firstNonRepeatingChar(String str) {
	    int[] count = new int[256];

	    for (char c : str.toCharArray()) {
	        count[c]++;
	    }

	    for (char c : str.toCharArray()) {
	        if (count[c] == 1) {
	            return c;
	        }
	    }
	    return '\0'; // No non-repeating character found
	}

}
