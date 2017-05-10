package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calSpeed;

public class calSpeedTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalS() {
		calSpeed calS = new calSpeed();
		calS.calS(20);
		assertEquals(20, calS.getResult(),0.001);
	}

}
