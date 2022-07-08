package yash.SpringCore.Qution1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole {
public static void main(String[] args) {
	ApplicationContext Qution1= new ClassPathXmlApplicationContext("Qution1.Fact_method.xml");
	Role role= (Role) Qution1.getBean("rolebean");
	role.show();		
}
}