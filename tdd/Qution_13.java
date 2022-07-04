package tdd;

public class Qution_13 {
  
	// Addition
	public static int add(int a, int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	// Sub
		public static int Sub(int a, int b)
		{
			System.out.println(a-b);
			return a-b;
		}
		// Multiplication
		public static int mul(int a, int b)
		{
			System.out.println(a*b);
			return a*b;
		}
		// div
		public static int div (int a, int b)
		{
			int result=0;
			try {
			System.out.println(a/b);
			return a/b;
			}
			catch (ArithmeticException e)
			{
				System.out.println("Invalid divisor : can not be divided by zero"+e);
			}
			return a/b;
		}
		// Mod 
				public static int mod (int a, int b)
				{
					System.out.println(a%b);
					return a%b;
				}
				
				public static void main(String[] args) {
					Qution_13.add(10, 10);
					Qution_13.div(12, 2);
					Qution_13.mod(15, 5);
					Qution_13.mul(3, 3);
					Qution_13.Sub(16, 6);
				}
}
