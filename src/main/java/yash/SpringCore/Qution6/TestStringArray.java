package yash.SpringCore.Qution6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStringArray {

	public static void main(String[] args) {
		ApplicationContext obj=new ClassPathXmlApplicationContext("Qution6noVowel.xml");
		
		StringArray strr= (StringArray) obj.getBean("Stringbean");
		
		String[] stringArray= strr.str;
		for(String str: stringArray) {
			System.out.println(str);
		}
		
		System.out.println("strings having no vowels:");
		for(String s: stringArray) {
			String st= s.replaceAll("[aeiouAEIOU]", "");
			
			if(s.equals(st)) {
				System.out.println(s);
				
			}
			
		}
		
	}
	
}
