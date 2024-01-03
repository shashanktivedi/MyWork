package com.learn.string;

public class ReverseWordInSentence {

	public static void main(String[] args) {
		String s = reverseWordsInSentence("I am an Engineer.");
		System.out.println(s);
//		StringBuilder sb = new StringBuilder();
//		sb.reverse();
	}
	
	public static String reverseWordsInSentence(String sentence) {
	    String[] words = sentence.split(" ");
//	    System.out.println("words:"+ words.toString());
	    StringBuilder reversed = new StringBuilder();
	    for (int i = words.length - 1; i >= 0; i--) {
	        reversed.append(words[i]);
//	        if (i > 0) {
	            reversed.append(" ");
//	        }
	    }
	    return reversed.toString();
	}

}
