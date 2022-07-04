package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Qution_15Test {

	@Test
	void tearDown() throws Exception{
		
	}
	@Test
	void test()
	{
		Qution_15 i=new Qution_15(1,"Sugar",40,44,LocalDate.of(2022,12,12),LocalDate.of(2021,12,06));
		assertEquals(true,i.createObject(i));
	}

}
