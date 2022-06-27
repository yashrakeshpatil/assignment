package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Qution_1 {

	public static void main(String[] args) {
		// 1. WAP to find out average marks from the list of the marks, user will enter the marks through 
	//	the input box and you need to fetch them and calculate the marks.
			
		Scanner nt=new Scanner(System.in);
		List<Integer> listOfMarks= new ArrayList<>();
		System.out.println("Enter the Marks: ");
		for (int j=0;j<8;j++) 
		{
			listOfMarks.add(nt.nextInt());
		}
		double Av=listOfMarks.stream().collect(Collectors.averagingDouble(s1 -> s1));
		
		System.out.println(listOfMarks);
		System.out.println("Average of the Marks:"+Av);
		
		
	}

}
