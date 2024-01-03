package com.java.codefit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloTest {

	public static void main(String[] args) {

		
		/** Sort elements by age, by city = Mumbai */
		Address addres = new Address("India", "Mumbai", "Wakad");
		Address addres2 = new Address("India", "Pune", "MIDC");

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Shashank", 38));
		list.add(new Employee("Akshay", 35));
		list.add(new Employee("Anand", 35, addres));
		list.add(new Employee("Swapnil", 35, addres2));

		list.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
//          .sorted(Comparator.comparing(Employee::getName))
				.filter(emp -> emp.getAge() == 35).filter(emp -> {
					Optional<Address> address = Optional.ofNullable(emp.getAddress());
					return address.isPresent() && "Mumbai".equals(address.get().getCity());
				}).forEach(e -> System.out.println(e));

		
		
		/**Without optional fetch address too of employee  */
        Map<String, List<Employee>> groupedByCity = list.stream()
                .filter(emp -> emp.getAddress() != null && "Mumbai".equals(emp.getAddress().getCity()))
                .collect(Collectors.groupingBy(emp -> emp.getAddress().getCity()));

        // Print employees within each city (sorted by age in descending order)
        groupedByCity.forEach((city, employees) -> {
            System.out.println("Employees in " + city + ":");
            employees.stream()
                    .sorted(Comparator.comparing(Employee::getAge).reversed())
                    .forEach(System.out::println);
        });
        
        
        /** */
	List<Atos> listOfAtosEmpl = new ArrayList();
		
		listOfAtosEmpl.add(new Atos("shashank", "finance", 11000, 2000));
		listOfAtosEmpl.add(new Atos("Akshay", "IT", 15000, 2003));
		listOfAtosEmpl.add(new Atos("Abhay", "IT", 15000, 2003));
		listOfAtosEmpl.add(new Atos("Ajay", "HR", 18000, 2001));
		listOfAtosEmpl.add(new Atos("Kartik", "finance", 25000, 2002));
		
		
		Map<String, Double> averageSalaryByDepartment = listOfAtosEmpl.stream()
										 .collect(Collectors.groupingBy(Atos::getDepartment,   Collectors.averagingLong(Atos::getEmployeeSalary)));

		  averageSalaryByDepartment.forEach((department, avgSalary) ->
          System.out.println("Department: " + department + ", Average Salary: " + avgSalary));
		
		
		List<Atos> greatList = listOfAtosEmpl.stream().sorted(Comparator.comparing(Atos::getYearOfJoining).reversed()).collect(Collectors.toList());
		greatList.forEach(System.out::println);
        
		
		
		/** Sort elements by name then by age */
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee("shashank", 30));
		listOfEmp.add(new Employee("Akshay", 35));
		listOfEmp.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
		System.out.println(listOfEmp);

		
		
		
		/**	find String Characters & its count using Map 
			find non repeative letter
			find most repeative letter
			find letter which is reoccuring odd number of times */
		String ss = "aakkkssdfehg";
		List<Character> charList = new ArrayList<>();
		Map<Character, Long> frequencyMap = ss.chars()
											  .mapToObj(c -> (char) c)
											  .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println("frequencyMap are :" + frequencyMap.entrySet());
		List<Character> listOfSingleChar = new ArrayList<Character>();
		List<Character> listOfMostOccurChar = new ArrayList<Character>();
			frequencyMap.forEach((c, frequency) -> {
			if (frequency == 1) {
				listOfSingleChar.add(c);
			}else {
				listOfMostOccurChar.add(c);
			}
		});
			System.out.println("listOfSingleChar: "+listOfSingleChar);
			System.out.println("listOfMostOccurChar: "+ listOfMostOccurChar);
		
			
//			ConcurrentMap<Character, Integer> conMap = new ConcurrentHashMap<Character, Integer>();
			
			
			
			 /** Number of occurence of a string */
			 List<String> strListing = Arrays.asList("One", "Two", "Three", "Two", "Three", "Three");
             Map<Long, List<String>> frequencyMapping = strListing.stream()
		                									    .collect(Collectors.groupingBy(
		                									     str -> strListing.stream().filter(s -> s.equals(str)).count()));
		        System.out.println("String frequencyMapping: "+frequencyMapping);
			

		        
		     /** Print string char count ,also maintain insersion order*/
				String stg = "sapsplause";
				Map<Object, Long> mappedStr =  stg.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
				mappedStr.forEach((o,l)->{
					System.out.println("Character is: " + o.toString() + " count is; "+ l);
				});
				
				
				
		        
		        /** Add two streams list */
		        List<String> list1 = Arrays.asList("apple", "banana", "orange");
		        List<String> list2 = Arrays.asList("grape", "melon", "kiwi");
		        List<String> list3 = Arrays.asList("grape", "melon", "kiwi");
		        List<String> combinedList = Stream.of(list1, list2, list3)
		                .flatMap(List::stream)
		                .collect(Collectors.toList());

		        System.out.println("Combined List: " + combinedList);
		        
		        
		        
		        
		        
		/** Now print even occurence character */
		List<Character> listOfEvenChar = new ArrayList<Character>();
		frequencyMap.forEach((c, frequency) -> {
			if (frequency % 2 == 0) {
				listOfEvenChar.add(c);
			}
		});
		System.out.println("listOfEvenChar are : " + listOfEvenChar);

		
		
		
		/** Convert List of string to Map keys */
		List<String> strList = Arrays.asList("One", "Two", "Three");
		Map<String, Integer> map = strList.stream()
                .collect(Collectors.toMap(str -> str, String::length));
        System.out.println("Resulting convert List of string to Map: " + map);



		/** Reverse string */
		String strr = "Shashank Trivedi";
		char c = 0;
		List<Character> listOfChar = new ArrayList<Character>();
		String string = strr.toLowerCase();
		for (int i = string.length()-1; i >= 0 ; i--) {
			 c= string.charAt(i);
			 listOfChar.add(c);
		}
		System.out.print("Reverse String are: "+ listOfChar);
		
		
		
		
		/** Longest length string */
		 List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
	        String longestString = strings.stream()
	                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
	                .orElse("");
	        System.out.println("Longest String: " + longestString);
	        
	        
	        
	        
		/** Reverse each word at their same place */

		/** Print number starts with 2 in the list of numbers */
	        List<Integer> numbers = Arrays.asList(123, 234, 25, 456, 678, 29);
	        numbers.stream()
	                .map(String::valueOf) // Convert to String
	                .filter(str -> str.startsWith("2"))
	                .forEach(System.out::println);

	    /** Add all numbers in the list of numbers */
	        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5);
	        int sum = numberss.stream()
	                .reduce(0, Integer::sum);
	        System.out.println("Sum of Numbers: " + sum);
	        
	        
	        /** Add all numbers in the list of numbers */
	        List<String> num = Arrays.asList("1","2", "3", "4", "5");
	        		int summ = num.stream()
	        				.map(Integer::parseInt)  // Convert strings to integers
	                        .reduce(0, Integer::sum);
	        		System.out.println(summ);

	        
	        
	        
		/** Explain with code string is immutable */
	        List<Integer> number = Arrays.asList(7, 2, 9, 4, 5);
	        int maxNumber = number.stream()
	                .reduce(Integer.MIN_VALUE, Integer::max);
	        System.out.println("Max Number: " + maxNumber);
	        

	        /** Palindrom check*/
		    boolean isPalindrome = false;
		    String s = new String("ASAMASA");
		    for(int i =0; i<= s.length()-1; i++){	
		    	char chr = s.charAt(i);
		    	for(int j=s.length()-1; j>=0 ; j--){
		    		char c2 = s.charAt(j);
		    		if(chr==c2){
		    		    isPalindrome = true;
		    		}else{
		    			isPalindrome = false;
		    		}
		    	}
		    }
		    if (isPalindrome) {
	            System.out.println("It's a palindrome");
	        } else {
	            System.out.println("It's not a palindrome");
	        }
		   
									

	

	        
	    /** Print all employess records which are same */
			List<Employee> emplist = new ArrayList<Employee>();
			emplist.add(new Employee("Shashank", 38 ));
			emplist.add(new Employee("Akshay", 35));
			emplist.add(new Employee("Anand", 35 ));
			emplist.add(new Employee("Shashank", 35));
			emplist.add(new Employee("Shashank", 35));
									
									 emplist.stream()
//	        						.sorted(Comparator.comparing(Employee::getName))   //  Not required
									 .collect(Collectors.groupingBy(employee -> employee, Collectors.counting()))
//	        						.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
	        						.entrySet().stream()
	        						.filter(st -> st.getValue()>0)
	        						.forEach(System.out::println);

//			Output:
//				Employee [name=Anand, age=35, address=null]=1
//				Employee [name=Shashank, age=38, address=null]=1
//				Employee [name=Akshay, age=35, address=null]=1
//				Employee [name=Shashank, age=35, address=null]=2
									
			
		/** Print first 20 Prime no*/
			int count = 0;
			int numbr = 2; // Starting with the first prime number

			System.out.println("First 20 Prime Numbers:");
			while (count < 20) {
				if (isPrime(numbr)) {
					System.out.println(numbr + " ");
					count++;
				}
					numbr++;
			} 
			
			//---------
			double[] dob = {11,12.6,2.4};
			double result = 0;
			for(int i=0;i<3;i++) {
				result=result+dob[i];
				System.out.println("double division: "+result/3);
			}
			
			double a,b,ci;
			a=3.0/0;
			b=0/4.0;
			ci=0/0.0;
			System.out.println(a);
			System.out.println(b);
			System.out.println(ci);
			System.out.println("--ended ---");
			
			
			/**find 3rd largest no without any implicit java methods */
			 List<Integer> listOfNum = Arrays.asList(21, 40, 11, 23, 9);
		        int[] arr = {21, 40, 11, 23, 9};

		        // Sorting the list manually
		        for (int i = 0; i < listOfNum.size() - 1; i++) {
		            for (int j = 0; j < listOfNum.size() - i - 1; j++) {
		                if (listOfNum.get(j) > listOfNum.get(j + 1)) {
		                    // Swapping elements
		                    int temp = listOfNum.get(j);
		                    listOfNum.set(j, listOfNum.get(j + 1));
		                    listOfNum.set(j + 1, temp);
		                }
		            }
		        }
		        // Getting the element after skipping 3 elements
		        int ii = listOfNum.get(3);
		        System.out.println(ii);
		  
			
			
			/** Whats output*/
			int[] array = new int[5];
			for (int i = 5; i > 0; i--) {
			    array[5 - i] = i;
			    Arrays.sort(array);
			    System.out.println(Arrays.binarySearch(array, 4));
			}

		/**       We have result class
Under wee have aethod
Public static List<integer> intArray, int startingIndex, int endingOndex){}
We have to use main method in Solution class
And wanted an output like below:
Sample input:
12345678910
5
9
Sample output:
[1,2,3,4, 5,6,10,9,8,7]*/
			
			List<Integer> output = Result.intArray(5, 9); // created seperate Result class in same pkg
	        System.out.println(output);
	        
	        
	        
			
			/** */
	    	String para = "GenAI tools can also create efficiency in work processes, reducing the time to perform mundane or repetitive tasks. In the pharmaceutical industry, GenAI has shown it can drastically reduce the drug development timeline. In one recent case, it took just 12 months instead of the usual five years to bring a new drug to human trials.";
			
			String [] srr = para.split(" ");
			
			List<String> stList = Arrays.asList(srr);
			
			
			Map<String,Long> mapping =stList.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
			System.out.println(mapping);
			
//			Optional<String> s = 
			Map<Object, Long> mapp = stList.stream().collect(Collectors.groupingBy(str -> stList.stream().reduce((s1,s2) -> s1.length()> s2.length()?s1:s2), Collectors.counting()));
			System.out.println("Map Obj: "+ mapp.entrySet());
			

			
			
//			Map<Object, Long> maxp = stList.stream()
//				    .collect(Collectors.groupingBy(
//				        str -> stList.stream()
//				                     .filter(s -> s.length() == stList.stream().mapToInt(String::length).max().orElse(0))
//				                     .findFirst()
//				                     .orElse(null),
//				        Collectors.counting()
//				    ));
//			
//			System.out.println("Map Obj: "+ maxp.entrySet());
			
			
			
			
			
	        
			
		/** Difference of map and flat map code*/	
			List<String> words = Arrays.asList("Hello", "World");
			List<Stream<Character>> mapResult = words.stream()
			                                           .map(word -> word.chars().mapToObj(ch -> (char) ch)).collect(Collectors.toList());;
			System.out.println("Word used in map(): "+ mapResult.toString());
	        System.out.println("Characters from each word:");
	        mapResult.forEach(stream -> {
	            List<Character> characters = stream.collect(Collectors.toList());
	            System.out.println(characters);
	        });
	        
	        
	        
			List<Character> flatMapResult = words.stream()
			                                        .flatMap(word -> word.chars().mapToObj(ch -> (char) ch)).collect(Collectors.toList());;
			System.out.println("Word used in flatMap(): "+ flatMapResult.toString());
			
			
		/** Print all records in numeric sorted order */
			List<String> strL = Arrays.asList("On3e", "T1wo", "Thre2e");
	        strL.sort(Comparator.comparing(HelloTest::extractNumericPart));
	        System.out.println("Sorted List: " + strL);
			}
	
	
	
			// Other than main()
		    private static int extractNumericPart(String s) {
	        // Find and return the numeric part of the string
	        String numericPart = s.replaceAll("\\D", ""); // Remove non-digits
	        return Integer.parseInt(numericPart);
		    }							
		
		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

}