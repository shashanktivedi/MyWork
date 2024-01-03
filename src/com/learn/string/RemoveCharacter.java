package com.learn.string;

public class RemoveCharacter {

	public static void main(String[] args) {
		char charValue = 'a';
		removeCharacter("Shashank",charValue);
	}
	public static String removeCharacter(String str, char c) {
	    return str.replaceAll(String.valueOf(c), "");
	}

}
