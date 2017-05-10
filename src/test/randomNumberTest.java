package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.randomNumber;

public class randomNumberTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetRandom() {
		randomNumber randomNumber1 = new randomNumber();
		randomNumber randomNumber2 = new randomNumber();
		randomNumber1.getRandom();
		int temp1 = randomNumber1.getResult();
		randomNumber2.getRandom();
		int temp2 = randomNumber2.getResult();
		assertNotEquals(temp1, temp2);
	}

}
