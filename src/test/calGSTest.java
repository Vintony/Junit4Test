package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calGS;

public class calGSTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calGS calGS = new calGS();
		calGS.cal(1, 2, 3);
		assertEquals(7, calGS.getResult(),0.01);
	}

}
