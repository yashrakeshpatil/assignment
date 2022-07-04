package tdd;

public class Qution_1 {
  
	//1) Write a Junit test in which you will take two numbers and you will test that HCF of two 
	//numbers are come to same or not.
	    public static int hcf(int p, int q)
	    {
	    	int number1=p, number2=q, hcf=0;
	    	for(int j=1;j<=number1|| j<=number2;j++)
	    	{
	    		if (number1%j==0 &&number2%j==0)
	    			hcf=j;
	    	}
	    	return hcf;
	    }
}
