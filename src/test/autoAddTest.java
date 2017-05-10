package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.autoAdd;

public class autoAddTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		autoAdd add = new autoAdd();
		add.cal(10);
		assertEquals(55, add.getResult());
	}

}
