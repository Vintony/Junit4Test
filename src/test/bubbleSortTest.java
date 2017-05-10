package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.bubbleSort;

public class bubbleSortTest {
	
	static int[] number = {10,9,8,7,6,5,4,3,2,1};
	
	private static bubbleSort bubbleSortObject = new bubbleSort();

	@Before
	public void setUp() throws Exception {
		bubbleSortObject.bubbleSortFunction(number);
	}

	@Test
	public void testBubbleSortFunction() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(a, bubbleSortObject.getResult());
	}

}
