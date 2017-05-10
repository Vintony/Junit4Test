package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.codeTest;

public class codeTestTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRun() {
		codeTest ctt = new codeTest("3");
		codeTest.run();
		assertEquals("231[23]4", ctt.getResult());
	}

}
