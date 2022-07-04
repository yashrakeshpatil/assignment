package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Qution_11Test {

	@Test
	public void testSinglton()
	{
		Qution_11 temp1=Qution_11.getInstance();
		Qution_11 temp2=Qution_11.getInstance();
		System.out.println("Checking singleton object equality");
		assertEquals(true, temp1==temp2);
	}

}
