package tdd;

import java.security.DomainCombiner;
import java.time.LocalDate;

public class Qution_15 {
   int itemId;
   String ItemName;
   int costPrice;
   int sellPrice;
   LocalDate dateOfManu;
   LocalDate dateOfExp;

public Qution_15(int itemId, String itemName, int costPrice, int sellPrice, LocalDate dateOfManu, LocalDate dateOfExp) {
	super();
	this.itemId = itemId;
	ItemName = itemName;
	this.costPrice = costPrice;
	this.sellPrice = sellPrice;
	this.dateOfManu = dateOfManu;
	this.dateOfExp = dateOfExp;
}
   Qution_15 i=null;
   
   public static boolean createObject(Qution_15 i) {
	   if(countDigit(i.itemId)>=3)
	   if (i.ItemName.matches("[a-zA-Z]-"))
		   if(i.sellPrice>0 && i.costPrice>0)
			   if(i.dateOfExp!=LocalDate.now())
				   if(i.sellPrice!=i.costPrice)
					   i=new Qution_15(i.itemId,i.ItemName,i.costPrice, i.sellPrice,i.dateOfManu,i.dateOfExp);
	   if(i!=null)
		   return true;
	   else
       	return false;
	
}

private static int countDigit(int itemId) {
	
    int count=0;
    while(itemId>0) {
    	count++;
    	itemId/=10;
    }
	return count;
	
}
public static void main(String[] args) {
	Qution_15 i=new Qution_15(1,"Sugar",40,44,LocalDate.of(2022,12,12),LocalDate.of(2021,12,06));
	System.out.println(Qution_15.createObject(i));
	
}
}
