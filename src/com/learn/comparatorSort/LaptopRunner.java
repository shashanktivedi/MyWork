package com.learn.comparatorSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopRunner {

	public static void main(String[] args) {

		List <Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 900));
		laps.add(new Laptop("HP", 24, 900));
		
		
		  Comparator<Laptop> com = new Comparator<Laptop>() {
		  
				public int compare(Laptop l1, Laptop l2) {

					if (l1.getPrice() == l2.getPrice())

//						if (l1.getBrand().length() > l2.getBrand().length()) //output based on brand spell count
							return 1;
						else
							return -1;
				}
		  };
		  
		  Collections.sort(laps, com);
		  
//		
//		for(Laptop laps3:laps) {
//			System.out.println(laps3);
		  
		  int prevPrice = 2; // Initialize with a value that is not possible
		    for (Laptop laps3 : laps) {
		        if (laps3.getPrice() == prevPrice) {
		            System.out.println(laps3);
		        } else {
		            prevPrice = laps3.getPrice();
		        }
		    }
		}
		  
		
}
