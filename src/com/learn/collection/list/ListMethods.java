package com.learn.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ListMethods {

	public static void main(String[] args) {
		
		List list = new ArrayList();
//		list.toArray(null);
//		Object[] obj3 = list.toArray(null);
		List obj4 = list.subList(0, 0);
		Stream obj5 = list.stream();
		list.spliterator();
		list.sort(null);
		list.size();
		list.set(0, 1);
		list.parallelStream();
		Object obj = list.remove(0);
		boolean b = list.remove(null);
		int i = list.lastIndexOf(1);
		list.get(4);
		
		
	}

}
