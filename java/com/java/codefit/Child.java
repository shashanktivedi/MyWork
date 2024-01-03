package com.java.codefit;

public class Child extends Parent {

//	public Child(int id, String name) {
//		super(id, name);
//		// TODO Auto-generated constructor stub
//	}
	
	public String sm() {
		try {
		int i = 10/0;
		}catch(ArithmeticException ae) {
			throw ae;
		}
		System.out.println("Hi s1");
		return " ";
		
	}
	
	public void sm1() {
		System.out.println("Hi s1");
		
	}

}
