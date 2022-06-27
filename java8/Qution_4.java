package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Qution_4 {

	public static void main(String[] args) {
	
		//4. WAP to find maximum from array of numbers with the help of stream api
		
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 10, 6, 8);

		Optional<Integer> maxNumber = list.stream()
		      .max((i, j) -> i.compareTo(j));

		System.out.println(maxNumber.get());

	}

}
