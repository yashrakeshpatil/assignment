package tdd;



//2) Write a Junit test in which you will take two strings, you have to find out when two strings 
//are palindrome of each other or not .
public class Qution_2 {
   public static boolean palindromString()
   {
	   String q= "Rakesh";
	   String q1= "Patil";
	   String q2= "";
	   
	   for(int j=q.length()-1;j>=0;j--)
	   {
		   q2=q2+q.charAt(j);
	   }
	   if(q.equals(q2))
	   {
		   return false;
	   }
	   else
	   {
		   return true;
	   } 
   }
   public static void main(String[] args) {
	Qution_2 w= new Qution_2();
	System.out.println(w.palindromString());
}
   
}
