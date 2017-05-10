package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calGCD;

public class calGCDTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		calGCD calG=new calGCD();
		calG.calG(10, 5);
		assertEquals(5, calG.getResult());
	}

	@Test
	public void test2(){
		calGCD calG=new calGCD();
		calG.calG(77, 66);
		assertEquals(11, calG.getResult());
	}
	
}
