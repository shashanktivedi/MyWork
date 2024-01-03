package com.java.codefit;

public interface MyInterface {

	default void defaultMethod() {
		System.out.println("1");
	}
}
