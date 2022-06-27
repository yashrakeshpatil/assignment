package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Qution_6 {

	public static void main(String[] args) {
		//6. WAP to create list of item price whose price is less than avg price of all item

    List<Item>itemList= new ArrayList<Item>();
    
    itemList.add(new Item("Book",89));
    itemList.add(new Item("notebook",67));
    itemList.add(new Item("pen",35));
    itemList.add(new Item("bag",699));
    itemList.add(new Item("coffeCup",120));
    itemList.add(new Item("keyBord",300));
    itemList.add(new Item("headphoen",500));
    
    double Average= itemList.stream().collect(Collectors.averagingDouble(q->q.itemPrice));
    System.out.println("Average Price:"+Average);
	}

}
