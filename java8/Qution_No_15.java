package java8;

public class Qution_No_15 {
  //3. From a given set of numbers in array, you need to find out how many number satisfy the 
	//Pythagoras template
	
	static boolean isTriplet(int arr[],int n)
	{
		for (int i = 0; i < n; i++)
		{
		for (int j = i+1; j < n; j++) 
		{
			for (int j2 = j+1; j2 <n; j2++)
			{
				int x=arr[i]*arr[i],y=arr[j]*arr[j],z=arr[j2]*arr[j2];
				if(x==y+z||y==x+z||z==x+y)
					return true;
			}
		  }	
		}
		return false;
			
	}
	public static void main(String[] args) 
	{
		int arr[]= {3,1,4,6,9};
		int arr_size=arr.length;
		if (isTriplet(arr, arr_size)==true)
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
