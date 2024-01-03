package com.java.codefit;

public interface MyInterface2 {

	default void defaultMethod() {
		System.out.println("1");
	}
	
//	default int defaultMethod1() {
//		System.out.println("1");
//		return 0;
//	}
}
