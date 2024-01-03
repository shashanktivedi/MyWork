package com.learn.string;

public class StringCharCount {

	public static void main(String[] args) {
		
		String str = new String("Shashank");
		String str2 = str.toLowerCase();
		int count=0;
		for(char c : str2.toCharArray()) {
			count++;
		}
		System.out.println(count++);
	}
}
