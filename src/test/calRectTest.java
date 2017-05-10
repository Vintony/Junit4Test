package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calRect;

public class calRectTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calRect calRect = new calRect();
		calRect.cal(10, 20);
		assertEquals(200, calRect.getResult(),0.001);
	}

}
