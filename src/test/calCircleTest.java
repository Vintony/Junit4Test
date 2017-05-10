package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calCircle;

public class calCircleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calCircle calCircle = new calCircle();
		calCircle.cal(10);
		assertEquals(314, calCircle.getResult(),0.01);
	}

}
