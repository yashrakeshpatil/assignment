package java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Qution_8 {

	public static boolean check(int no)
	{
		Predicate<Integer>Xyz=p->(p%2==0);
		return Xyz.test(no);
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number:");
		
		int no=sc.nextInt();
		
		if(Qution_8.check(no)==true)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}
		
		
	}
}
