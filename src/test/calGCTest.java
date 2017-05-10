package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calGC;

public class calGCTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		calGC calGC =new calGC();
		calGC.cal(10);
		assertEquals(3, calGC.getResult1());
		assertEquals(7, calGC.getResult2());
	}

}
