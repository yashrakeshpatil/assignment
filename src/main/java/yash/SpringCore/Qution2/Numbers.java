package yash.SpringCore.Qution2;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

public class Numbers {
//2. WAP in spring core to read the data using post_construct annotated method by user and
//	perform calculation of average of numbers.
	List<Integer> numberlist;

	public Numbers(List<Integer> numberlist) {
		super();
		this.numberlist = numberlist;
	}

	@PostConstruct
	public void calculateAvg() {
		System.out.println(numberlist);
		Double avgnum = numberlist.stream().collect(Collectors.averagingDouble(e -> e));
		System.out.println("average of list is: " + avgnum);
	}
}
