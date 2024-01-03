package com.learn.comparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopRunner {

	public static void main(String[] args) {

		List <Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 700));
		
		
		Collections.sort(laps);
		
		
		  for(Laptop laps3:laps) { 
			  System.out.println(laps3); 
			  }
		 
	}
		//direct laps dalne pa error aaraha bcz sort() need comparable bwt objects.
		//therefore we have to implement
		//comparable interface in Laptop classs
		//Collections.sort(laps); 
		
		/*
		 * once implemented with comparator we can remove comparable implementation from
		 * Laptop class bcz comparator is used when we cant customm logic to implement;
		 * where String and Integer class already implements comparable interface
		 */ 
		
		/*
		 * Comparator<Laptop> com = new Comparator<Laptop>() {
		 * 
		 * public int compare(Laptop l1, Laptop l2) { 
		 *
		 * if(l1.getPrice()> l2.getPrice()) 
		 * OR
		 * if(l1.getBrand().length() > l2.getBrand().length()) 
		 * return 1; 
		 * else 
		 * return -1; } };
		 * 
		 * Collections.sort(laps, com);
		 */
		
		
	

}
