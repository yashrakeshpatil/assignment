package tdd;

public class Qution_9 {

	public static String remove(String temp)
	{
	    temp=temp.replaceAll("[^a-zA-Z ]","");
	    return temp;
	}
}
