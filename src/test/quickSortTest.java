package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.quickSort;

public class quickSortTest {

	static int[] number = {10,9,8,7,6,5,4,3,2,1};
	
	private static quickSort quickSortObject = new quickSort();
	
	@Before
	public void setUp() throws Exception {
		quickSortObject.quickSortFunction(number);
	}

	@Test
	public void testQuickSortFunction() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(a, quickSortObject.getResult());
	}

}
