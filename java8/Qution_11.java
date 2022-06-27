package java8;

import java.util.stream.IntStream;

public class Qution_11 {
	//11. wap to perform parrallel stream api to find the no.

	public  static void main(String[] args) {
		
		
		System.out.println("parrallel");
		
		IntStream Range0= IntStream.rangeClosed(1,10);
		Range0.parallel().forEach(System.out::println);
		
        System.out.println("Normal");
		
		IntStream Range01= IntStream.rangeClosed(1,10);
		Range01.forEach(System.out::println);
	}

}
