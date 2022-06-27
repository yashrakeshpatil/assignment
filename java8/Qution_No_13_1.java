package java8;

public class Qution_No_13_1 {

	public static void main(String[] args) {
		
	
	int array[]= {33,34,95,49,06,83,82,84};
	
	for(int j=0;j<array.length;j++)
	{
		if (j<=4)
		{
			String o=array[j]+"-"+(array[j+2]);
			System.out.println(o+",");
			j=j+2;	
		}
		else if (j<=10)
		{
			String o=array[j]+"-"+(array[j+4]);
			System.out.println(o+",");
			j=j+4;
		}
		else {
			String o=array[j]+"-"+(array[j+3]);
			System.out.println(o+" ");
			j=j+3;
		}
	}
}
}