package yash.SpringCore.Qution4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class employeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employee> myList = new ArrayList<employee>();

		ApplicationContext obj = new ClassPathXmlApplicationContext("Qution4empDept.xml");
		employee e1 = (employee) obj.getBean("emp1");

		employee e2 = (employee) obj.getBean("emp2");
		myList.add(e1);
		myList.add(e2);

		List<employee> sortedlist = myList.stream().sorted((s1, s2) -> Double.compare(s1.empSallary, s2.empSallary))
				.toList();

		System.out.println("sorted list as per the employee salary");
		for (employee e : sortedlist) {
			System.out.println(e.toString());
		}
	}

}
