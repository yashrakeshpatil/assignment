package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Qution_7 {

	public static void main(String[] args) {
		//7. WAP to print only those price which are even from the given item list.
		 List<Item>itemList= new ArrayList<Item>();
		    
		    itemList.add(new Item("Book",89));
		    itemList.add(new Item("notebook",67));
		    itemList.add(new Item("pen",35));
		    itemList.add(new Item("bag",699));
		    itemList.add(new Item("coffeCup",120));
		    itemList.add(new Item("keyBord",300));
		    itemList.add(new Item("headphoen",500));
		    
		   List<Double>evenPrice=itemList.stream().filter(o->o.itemPrice%2==0).map(o->o.itemPrice).collect(Collectors.toList());
		   System.out.println("Even Price"+evenPrice);
	}

}
