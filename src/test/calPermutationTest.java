package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calPermutation;

public class calPermutationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calPermutation calPermutation = new calPermutation();
		calPermutation.cal(3, 1);
		assertEquals(3, calPermutation.getResult());
	}

}
