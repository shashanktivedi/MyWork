package com.java.codefit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloTest2 {

	public static void main(String[] args) {
		


		
		/** Sort elements by age, by city = Mumbai also use optional for address*/
		Address addres = new Address("India", "Mumbai", "Wakad");
		Address addres2 = new Address("India", "Pune", "MIDC");

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Shashank", 38));
		list.add(new Employee("Akshay", 35));
		list.add(new Employee("Anand", 35, addres));
		list.add(new Employee("Swapnil", 35, addres2));

		

		
		
		/**  Sort elements by age, by city = Mumbai , without using optional for address  */


       
        
        
        
        
		
		
		/** Sort elements by name then by age */
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee("shashank", 30));
		listOfEmp.add(new Employee("Akshay", 35));
		

		
		
		
		/**	find String Characters & its count using Map 
			find non repeative letter
			find most repeative letter
			find letter which is reoccuring odd number of times */
		String ss = "aakkkssdfehg";
		List<Character> charList = new ArrayList<>();
		
		
			
//			ConcurrentMap<Character, Integer> conMap = new ConcurrentHashMap<Character, Integer>();
			
			
			
		/** Number of occurence of a string */
		   List<String> strListing = Arrays.asList("One", "Two", "Three", "Two", "Three", "Three");
             
			

		        
		        
		        
		/** Add two streams */
		   List<String> list1 = Arrays.asList("apple", "banana", "orange");
		   List<String> list2 = Arrays.asList("grape", "melon", "kiwi");

		        
		        
		        
		        
		        
		        
		/** Now print even occurence character */
		   List<Character> listOfEvenChar = new ArrayList<Character>();
	

		
		
		
		/** Convert List of string to Map keys */
			List<String> strList = Arrays.asList("One", "Two", "Three");
		



		/** Reverse string */
			String strr = "Shashank Trivedi";
		
		
		
		
		
		/** Longest length string */
		 	List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
	        
	        
	        
	        
	        
		/** Reverse each word at their same place */
	        String stringg = new String("shashank trivedi");
	        
		/** Print number starts with 2 in the list of numbers */
	        List<Integer> numbers = Arrays.asList(123, 234, 25, 456, 678, 29);
	      

	    /** Add all numbers in the list of numbers */
	        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5);
	       
	        
	        
	        /** Add all numbers in the list of numbers */
	        List<String> num = Arrays.asList("1","2", "3", "4", "5");
	        

	        
	        
	        
		/** Explain with code to find max value */
	        List<Integer> number = Arrays.asList(7, 2, 9, 4, 5);
	        
	        

	        /** Palindrom check*/
		    boolean isPalindrome = false;
		    String s = new String("ASAMASA");
		    for(int i =0; i<= s.length()-1; i++){	
		    }
		   
									

	

	        
	    /** Print all employess records which are same */
			List<Employee> emplist = new ArrayList<Employee>();
			emplist.add(new Employee("Shashank", 38 ));
			emplist.add(new Employee("Akshay", 35));
			emplist.add(new Employee("Anand", 35 ));
			emplist.add(new Employee("Shashank", 35));
			emplist.add(new Employee("Shashank", 35));
									


//			Output:
//				Employee [name=Anand, age=35, address=null]=1
//				Employee [name=Shashank, age=38, address=null]=1
//				Employee [name=Akshay, age=35, address=null]=1
//				Employee [name=Shashank, age=35, address=null]=2
									
			
									
		/** Print all records in numeric sorted order */
			List<String> strL = Arrays.asList("On3e", "T1wo", "Thre2e");
	      
			
	}
	
	// Other than main()
    private static int extractNumericPart(String s) {
		return 0;
    // Find and return the numeric part of the string
   
    }
}
