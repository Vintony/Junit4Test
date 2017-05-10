package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.basketballBounce;

public class basketballBounceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		basketballBounce basketballBounce = new basketballBounce();
		basketballBounce.cal(100);
		assertEquals(80, basketballBounce.getResult(),0.00001);
	}

}
