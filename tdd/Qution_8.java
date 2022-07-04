package tdd;

public class Qution_8 {
	
	public static int countEven(int a[])
	{
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
				count++;
		}
		return count;
		
	}

}
