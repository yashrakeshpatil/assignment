package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Qution_No_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //. WAP to create 10 objects of employee class, add all object to arraylist and from arraylist we 
	//	need to convert this to map and set using stream api.
		                List<Employee> emp = Arrays.asList(
		                new Employee("mkyong", 30, new BigDecimal(10000)),
		                new Employee("jack", 27, new BigDecimal(20000)),
		                new Employee("jack", 27, new BigDecimal(20000))
		         // 10 object
		        );
                 // adding the data in the arraylist
		        //Before Java 8
		        List<String> result = new ArrayList<>();
		        for (Employee x : emp) {
		            result.add(x.getName());
		        }
		    
		        // converting the array list map into set 
		        
		        System.out.println(result); //[mkyong, jack, lawrence]

		        //Java 8
		        List<String> collect = emp.stream().map(x -> x.getName()).collect(Collectors.toList());
		        System.out.println(collect); //[mkyong, jack, lawrence]
//		    }

		
	}}


