package tdd;

public class Qution_10 {
 
	public static String concatString() {
		String [] furits={"apple","orange","banana","lemon"};
		String result=String.join("-", furits);
		
		System.out.println(result);
  return result;
  
		
	}
	public static void main(String[] args) {
		concatString();
	}
}
