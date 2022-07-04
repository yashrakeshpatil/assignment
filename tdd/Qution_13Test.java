package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Qution_13Test {

	@Test
	void add() {
	 assertEquals(20,Qution_13.add(15,5));
	}
	@Test
	void sub() {
	 assertEquals(1,Qution_13.Sub(2,1));
	}
	@Test
	void mul() {
	 assertEquals(6,Qution_13.mul(3,2));
	}
	@Test
	void div() {
	 assertEquals(2,Qution_13.div(10,5));
	}
	@Test
	void mod(){
	 assertEquals(0,Qution_13.mod(100,10));
	}

}
