package java8;

import java.util.Iterator;

public class Qution_No_14_2 {

	//2. User will input the “ABCD” now you need to print how many permutation is created like 
//	BACD, CBAD, and many others.
static void Qution_No_14_2(String perm, String word)
{
	if(word.isEmpty()) {
		System.out.println(perm+word);
		System.out.println();
	}
	else
	{
     for (int i = 0; i < word.length(); i++)	 
     {
    	 Qution_No_14_2(perm + word.charAt(i),word.substring(0, i)+word.substring(i+ 1,word.length()));
	}
	}
}
public static void Qution_No_14_2(String input)
{
	Qution_No_14_2(" ",input);
	
}
public static void main(String[] args) {
	Qution_No_14_2("ABCD");
}
}
