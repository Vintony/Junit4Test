package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calCombination;

public class calCombinationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calCombination calCombination=new calCombination();
		calCombination.cal(5, 3);
		assertEquals(10, calCombination.getResult());
	}

}
