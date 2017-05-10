package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calAP3;

public class calAP3Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calAP3 calAP3 = new calAP3();
		calAP3.cal(2.5, -1.5, 3);
		assertEquals(18, calAP3.getResult(),0.01);
	}

}
