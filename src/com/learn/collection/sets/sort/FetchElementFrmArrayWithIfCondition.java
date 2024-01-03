package com.learn.collection.sets.sort;

import java.util.TreeSet;

public class FetchElementFrmArrayWithIfCondition {

	public static void main(String[] args) {
		int m []= {0,1,2};
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(10);
		ts.add(15);
		
		for(int i=0; i<= m.length-1; i++) {
		if(m[i] == 1 && ts.contains(1)) {
		System.out.println("We found element equals to one:");
		Object higherObj =  ts.higher(1);
		System.out.println("Found the next higher element in the TreeSet: " + higherObj.toString());
		}
	}
}
}