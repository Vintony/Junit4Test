package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.heapSort;

public class heapSortTest {

	static int[] number = {46,79,56,38,40,84};
	
	private static heapSort heapSortObject = new heapSort();
	
	@Before
	public void setUp() throws Exception {
		heapSortObject.heapSortFunction(number);
	}

	@Test
	public void testHeapSortFunction() {
		int[] a = {38,40,46,56,79,84};
		assertArrayEquals(a, heapSortObject.getResult());
	}

}
