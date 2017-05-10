package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calAP;

public class calAPTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calAP calAP = new calAP();
		calAP.cal(1, 5, 3);
		assertEquals(18, calAP.getResult(),0.01);
	}

}
