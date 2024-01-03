package com.learn.comparatorSort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.learn.comparableSort.Laptop;

public class ComparatorRunner {

	public static void main(String[] args) {
		
		List <Integer> laps = new ArrayList();
		
		laps.add(285);
		laps.add(282);
		laps.add(284);
		laps.add(281);
		laps.add(283);
		laps.add(293);
		laps.add(273);
		
//		Comparator<Integer> com = new Comparator<Integer>() {		
//				public int compare(Integer i, Integer j) {
//				if(i%100>j%100) 
//					return 1;
//				else
//					return -1;
//			}
//	};
//	    Collections.sort(laps, com);
				
//				OR
				
//		Comparator<Integer> com = new Comparator<Integer>() {
//				public int compare(Integer i, Integer j) {
//				return i%100>j%100?1:-1;  
//				}
//		  };
//	    Collections.sort(laps, com);
				
//				OR
			
//		Comparator<Integer> com = (Integer i, Integer j) -> 
//		{
//			return i%100>j%100?1:-1;
//		};
//	    Collections.sort(laps, com);
		
//		OR
		
//		Comparator<Integer> com = ( i,  j) ->  i%100>j%100?1:-1;
//		Collections.sort(laps, com);
		
//		OR
		
//		 No Need to instantiate comparator ananymous class.
		Collections.sort(laps, ( i,  j) ->  i%10>j%10?1:-1);
	    
	    for(Integer o : laps) {
	    System.out.println(o);	
	    }
	    }

}

