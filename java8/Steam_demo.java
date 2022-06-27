package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Steam_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer>list1=List.of(87, 36,63,83,83);
  System.out.println(list1);
  
  List<Integer>list2=Arrays.asList(23,45,76,76);
  
  //using stream
  
  Stream<Integer> strem=list1.stream();
  strem.filter(i->i%2==0).collect(Collectors .toList());
  
  {
	  
  }
	}

}
