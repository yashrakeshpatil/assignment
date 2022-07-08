package yash.SpringCore.Qution1;

public class Role {
 //1. WAP in spring core to demonstrate role based object creation using factory method.
	 private Role(){
		 
	 }
	 
	 public static Role getRole() {
		 return new Role();
	 }
	 
	public void show() {
		System.out.println("object is created");
	}
}
