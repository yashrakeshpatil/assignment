package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Qution_9 {
// odd Number
	
	
	 public static void main(String[] args)
	 {
		ArrayList<Integer> num=new ArrayList<Integer>();
		{
			num.add(78);
			num.add(44);
			num.add(55);
			num.add(11);
			num.add(62);
			
			Long EvenNumber= num.stream().filter(O -> O%2==0).collect(Collectors.counting());
			System.out.println("Even Number: "+EvenNumber);
			
			Long oddNumber= num.stream().filter(O -> O%2!=0).collect(Collectors.counting());
			System.out.println("Even Number: "+oddNumber);
			
		}
		
	 }
}
