package java8;

import java.util.Arrays;
import java.util.List;

public class Qution_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	2. WAP to print distinct marks from the list of given marks
		List<Integer> Marks=Arrays.asList(65,76,90,54,39,78);
		
		Marks.stream().distinct().forEach(System.out::println);
	}

}
