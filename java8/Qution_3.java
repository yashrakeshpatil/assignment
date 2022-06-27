package java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Qution_3 {

	public static void main(String[] args) {
		//. WAP tke name of employee, sort all employee name using stream and print only unique 
		//name from it.
		List<String> list=Arrays.asList("arjit","k.k","jasraj","Pravain","Ganesh");
		
		List<String>List=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
   
		System.out.println(List);
}
}