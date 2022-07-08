package yash.SpringCore.Qution3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmiCalculation {
	public static void main(String[] args) {

		ApplicationContext Qution3 = new ClassPathXmlApplicationContext("Qution3.emiCalculator.xml");

		EmiCalculation ECobj = (EmiCalculation) Qution3.getBean("ratebean");
		
		System.out.println("interest rate is " + ECobj.interest_Rate + "%");
		ECobj.calculateEmi(ECobj.interest_Rate);
  
	}


}
