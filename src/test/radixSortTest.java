package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.radixSort;

public class radixSortTest {

	static int[] number = {201,111,601,875,300};
	
	private static radixSort radixSortObject = new radixSort();
	
	@Before
	public void setUp() throws Exception {
		radixSortObject.radixSortFunction(number);
	}

	@Test
	public void testRadixSortFunction() {
		int[] a = {111,201,300,601,875};
		assertArrayEquals(a, radixSortObject.getResult());
	}

}
