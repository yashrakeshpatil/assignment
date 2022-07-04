package tdd;

public class Qution_6 {

	/*public static int vowelsCount(String name)
	{
		int count=0;
		for(int q=0;q<name.length();q++)
		{
			if(name.charAt(q)=='a'|| name.charAt(q)=='e'||name.charAt(q)=='i'|| name.charAt(q)=='o'||name.charAt(q)=='u')
			{
				count++;
			}
		}
		return count;
		
	}*/


	public static int vowelsCount(String name) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int q=0;q<name.length();q++)
		{
			if(name.charAt(q)=='a'|| name.charAt(q)=='e'||name.charAt(q)=='i'|| name.charAt(q)=='o'||name.charAt(q)=='u')
			{
				count++;
			}
		}
		return count;
		//return 0;
	}

	
}
