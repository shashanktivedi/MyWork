package com.learn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class CollectionMethods {

	public static void main(String[] args) {
		
		Collection collectionObj = new ArrayList();
		
		boolean obj1 = collectionObj.add(null);
		boolean obj2 = collectionObj.addAll(null);
					   collectionObj.clear(); //void
		boolean obj4 = collectionObj.contains(null);
		boolean obj5 = collectionObj.containsAll(null);
		boolean obj6 = collectionObj.equals(null);
			int obj7 = collectionObj.hashCode();
		boolean obj8 = collectionObj.isEmpty();
		Iterator obj9 =collectionObj.iterator();
		Stream obj10 = collectionObj.stream();
		Stream obj11 = collectionObj.parallelStream();
		boolean obj12= collectionObj.remove(null);
		boolean obj13 = collectionObj.removeAll(null);
		boolean obj14 = collectionObj.removeIf(null);
		boolean obj15 = collectionObj.retainAll(null);
		int obj16     = collectionObj.size();
		Spliterator obj17 = collectionObj.spliterator();
		Object[] obj18 = collectionObj.toArray();
	}
}
