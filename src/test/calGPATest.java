package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calGPA;

public class calGPATest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		calGPA calG=new calGPA();
		double[] grade = {100,93,95,97,96};
		calG.calG(grade);
		assertEquals(4.0,calG.getResult(),0.001);
	}
	
	@Test 
	public void test2(){
		calGPA calG=new calGPA();
		double[] grade = {78,98,76,98,88};
		calG.calG(grade);
		assertEquals(3.479, calG.getResult(),0.001);
	}
}
