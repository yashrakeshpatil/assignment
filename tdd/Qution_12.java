package tdd;

public class Qution_12 implements Cloneable {
	
	int id;
	String name;
	public Qution_12(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
    
	public static boolean checkClone(Qution_12 q1,Qution_12 q2)
	{
		if(q1.id==q2.id && q1.name==q2.name)
			return true;
		else
			return false;
	}
}
