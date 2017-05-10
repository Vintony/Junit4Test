package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calSquare;

public class calSquareTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1(){
		calSquare calSquare = new calSquare();
		calSquare.cal(10, 10, 10);
		assertEquals(43.301270189, calSquare.getResult(),0.01);
	}
}
