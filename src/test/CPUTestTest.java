package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.CPUTest;

public class CPUTestTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain() {
		CPUTest.main(null);
		float zero = 0;
		assertEquals(zero, CPUTest.time, 0.000001);
	}
}
