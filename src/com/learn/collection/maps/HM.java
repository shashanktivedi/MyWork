package com.learn.collection.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HM {
	public static void main(String[] args) {
		
	Map<String,String> map = new HashMap<>();
	map.put("name1", "Shashank");
	map.put("name2", "Shashank");
	map.put("name", "Nikhil");
	map.put("name", "Shubham");
	map.put("city", "KGN");
	map.put("number", "9691911581");
	
//	Set <String> set = new HashSet<String>(hm.get(hm));
	
	Collection<String> values = map.values();
	Set<String> valueSet = new HashSet<>(values);
	
System.out.println(map);
System.out.println(valueSet);

	}
}