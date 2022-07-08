package yash.SpringCore.Qution3;

import java.util.Scanner;

//. WAP to print No of EMI for a given amount of loan for a given number of years or month. 
//You have to fetch the interest rate from the xml file and loam amount and rate of interest is 
//entered by you

public class EmiCalculation {
   float interest_Rate;
   
   

//public float getInterest_Rate() {
//	return interest_Rate;
//}

public void setInterest_Rate(float interest_Rate) {
	this.interest_Rate = interest_Rate;
}
public void calculateEmi(float rate) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Amount For the loan: ");
	float amount = sc.nextFloat();
	
	System.out.println();

	System.out.print("Enter the number of Years: ");
	int tenure = sc.nextInt();
	
	int tenureInMonts = tenure * 12;

	float totalPayAmount = amount + ((amount * rate) / 100) * tenure;
	System.out.println("total payable amount is Rs. " + totalPayAmount);

	float emi = totalPayAmount / tenureInMonts;
	System.out.println("emi per month for " + amount + " for " + tenure + " years will be " + emi);
}
	
	
}
