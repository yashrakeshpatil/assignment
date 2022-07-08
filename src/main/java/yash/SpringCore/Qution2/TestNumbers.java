package yash.SpringCore.Qution2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNumbers {

	public static void main(String[] args) {
		ApplicationContext Qution2 = new ClassPathXmlApplicationContext("Qution2.AvgNumbers.xml");
		Numbers num = (Numbers) Qution2.getBean("numbean");
		
		
		List<Integer> numlist= num.numberlist;
		
		
	}

}
