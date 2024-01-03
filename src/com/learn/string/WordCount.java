package com.learn.string;

public class WordCount {

	public static void main(String[] args) {
		String str = new String("Hello World");
		
		System.out.println("Number of words: " + countWords(str));
	}
	
	public static int countWords(String str) {
	    String[] words = str.trim().split("\\s+");
	    return words.length;
	}

}
