package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.selectSort;

public class selectSortTest {

	static int[] number = {10,9,8,7,6,5,4,3,2,1};
	
	private static selectSort selectSortObject = new selectSort();
	
	@Before
	public void setUp() throws Exception {
		selectSortObject.selectSortFunction(number);
	}

	@Test
	public void testSelectSortFunction() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(a, selectSortObject.getResult());
	}

}
