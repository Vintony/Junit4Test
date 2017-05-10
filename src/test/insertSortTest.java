package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.insertSort;

public class insertSortTest {
	
	static int[] number = {10,9,8,7,6,5,4,3,2,1};
	
	private static insertSort insertSortObject = new insertSort();
	
	@Before
	public void setUp() throws Exception {
		insertSortObject.insertSortFunction(number);
	}

	@Test
	public void testInsertSort() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(a, insertSortObject.getResult());
	}
}
