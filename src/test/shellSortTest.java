package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.shellSort;

public class shellSortTest {

	static int[] number = {10,9,8,7,6,5,4,3,2,1};
	
	private static shellSort shellSortObject = new shellSort();
	
	@Before
	public void setUp() throws Exception {
		shellSortObject.shellSortFunction(number);
	}

	@Test
	public void testShellSortFunction() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(a, shellSortObject.getResult());
	}

}
