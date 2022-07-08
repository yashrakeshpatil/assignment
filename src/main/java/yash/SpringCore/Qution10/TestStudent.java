package yash.SpringCore.Qution10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext obj = new ClassPathXmlApplicationContext("Qution10studentMap.xml");
		Student studmap = (Student) obj.getBean("studbean");

		Map<String, Float> map = studmap.getStuddetails();
		System.out.println("original student data:");
		System.out.println(map);

		// sort the list
		List<Map.Entry<String, Float>> sortedlist = map.entrySet().stream()
				.sorted((e1, e2) -> Float.compare(e1.getValue(), e2.getValue())).toList();
		System.out.println("sorted Student data: ");
		System.out.println(sortedlist);



	}

}
