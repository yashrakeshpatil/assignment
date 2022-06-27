package java8;

import java.util.ArrayList;
import java.util.List;
interface max
{
	void findMax();
}
public class Qution_No_12 {
	
	//12. WAP to find maxium of 5 no , pass array to lambda expression , and return the maximum 
	//		using lambda expression. dont use nested if else.
  
	
	  public static void main(String[] args) 
	  {
		max obj =() -> {
			int a[]= {34,76,87,36,9,64,};
			int max=a[0];
			
			for(int i=1;i<a.length;i++)
			{
				if (a[i]>max)
				{
					max=a[i];
				}
			}
			System.out.println("Maximum number :"+max);
		};
		obj.findMax();
		
		}}
