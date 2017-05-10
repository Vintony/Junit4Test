package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.Fibonacci;

public class FibonacciTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("¿ªÊ¼²âÊÔ");
	}

	@Test
	public void test10() {
		Fibonacci fcal = new Fibonacci();
		fcal.cal(10);
		assertEquals(55, fcal.getResult());
	}

	@Test
	public void test12() {
		Fibonacci fcal = new Fibonacci();
		fcal.cal(12);
		assertEquals(144, fcal.getResult());
	}
}
