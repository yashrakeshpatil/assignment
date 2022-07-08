package yash.SpringCore.Qution15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
public static void main(String[] args) {
	ApplicationContext obj= new ClassPathXmlApplicationContext("Qution15item.xml");
	Customer cust1=(Customer) obj.getBean("custbean");
	System.out.println(cust1.toString());
	
}
}
