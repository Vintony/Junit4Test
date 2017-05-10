package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calAP2;

public class calAP2Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calAP2 calAP2 = new calAP2();
		calAP2.cal(1, 11, 3);
		assertEquals(18, calAP2.getResult(),0.01);
	}

}
