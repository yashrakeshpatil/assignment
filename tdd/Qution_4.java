package tdd;

public class Qution_4 {

	public static boolean Armstrong(int number)
	{
		int tempVeriable=number;
		int number2=number;
		int count=0;
		
		while (tempVeriable>0)
		{
			count++;
			tempVeriable/=10;
		}
		
		;
		int Sum=0;
		while(number>0)
		{
			int reminder=number%10;
			Sum+=power(reminder,count);
			number/=10;
		}
		
		if(Sum==number2)
			return true;
		else
			return false; 
	}

	private static int power(int number, int power) {
		
		int add=number;
		for(int q=1;q<power;q++)
		{
			add*=number;
		}
		return add;
	}

	
}
