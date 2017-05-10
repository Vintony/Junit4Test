package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.snailClimb;

public class snailClimbTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		snailClimb snailClimb = new snailClimb();
		snailClimb.cal();
		assertEquals(8, snailClimb.getResult());
	}

}
