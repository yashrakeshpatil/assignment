package tdd;

public class Qution_3 {
	public static boolean cheak(String username,String Password)
	{
	//3) Write a Junit test where you will enter email and password, and if data is matched with 
//		database then test will true, else false. 	
	
  String mail="rakesh@yash.com";
  String password="admin@123";
  
  if(mail.equals(username)&&(password.equals(password)))
	  return true;
  else 
	  return false;
	}
}
