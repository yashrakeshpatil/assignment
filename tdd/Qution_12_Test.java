package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Qution_12_Test {

	@Test
	void test() throws CloneNotSupportedException {
		Qution_12 q1=new Qution_12(505,"Rakesh");
		Qution_12 q2=(Qution_12)q1.clone();
		assertEquals(true, Qution_12.checkClone(q1, q2));
		
	}

}
