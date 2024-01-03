package com.learn.collection.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		
	Map map = new HashMap();
	
	Collection obj1 = map.values();
	Object     obj2 = map.replace("key", "oldValue");
	boolean    obj3 = map.replace("key", "oldValue", "newValue");
	                  map.replaceAll(null);
	Object     obj4 = map.putIfAbsent("key", "value");
					  map.putAll(null);
	Object 	   obj6 = map.put("key", "value");
	
	Object     obj7 = map.merge("key", "value", null);
	Set        obj8 = map.keySet();
	Object     obj9 = map.getOrDefault("k", "v");
	Object    obj10 = map.get(null);
	                  map.forEach(null);
	Set 	  obj11 = map.entrySet();
	boolean   obj12 = map.containsKey(null);
	boolean   obj13 = map.containsValue(null);
	
	Object    obj14 = map.compute("key", null);
	Object    obj15 = map.computeIfAbsent(null, null);
	Object    obj16 = map.computeIfPresent(null, null); 
	
	
	
	}	
	
}
