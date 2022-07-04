package tdd;

public class Qution_7 {
    //7) Write a Junit test to check given number is palindrome.
	public static boolean palindromCheck(int number)
	{
		int temp=number;
		int revrse=0;
		while(number>0)
		{
			int reminder=number%10;
			revrse=revrse*10+reminder;
			number/=10;
		}
		if (revrse==temp)
			return true;
		else
			return false;	
	}
	
	
}
