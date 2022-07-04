package tdd;

public class Qution_11 {
 private static volatile Qution_11 singoletonInstance=new Qution_11();
 
 private Qution_11()
 {
	 
 }

public static Qution_11 getInstance() {
	// TODO Auto-generated method stub
	return singoletonInstance;
}
}
