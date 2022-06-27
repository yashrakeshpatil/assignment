package java8;

import java.util.ArrayList;
import java.util.List;

public class Qution_5 {

	public static void main(String[] args) {
	   
		String [] listOfName= {"Padmakr","Destinatio","Hope","world","happy"};
		List<Integer> stringcount=new ArrayList<Integer>();
		
		for(String s:listOfName) {
			int count=0;
			char[]A=s.toCharArray();
			for(char ch:A)
			{
				count++;	
			}
			stringcount.add(count);
		}
		Integer maximum=stringcount.stream().max((k1,k2)->k1.intValue()>k2.intValue()?1:-1).get();
		System.out.println(maximum);
	
}}
