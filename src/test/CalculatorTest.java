package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.Calculator;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();
	
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(5);
		assertEquals(7, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(8);
		assertEquals(2, calculator.getResult());
		
	}

	@Test
	public void testMultiply() {
		calculator.add(2);
		calculator.multiply(3);
		assertEquals(6, calculator.getResult());
	}

	@Test
	public void testDivide() {
		calculator.add(4);
		calculator.divide(2);
		assertEquals(2, calculator.getResult());
	}

	@Test
	public void testSquare() {
		calculator.square(3);
		assertEquals(9, calculator.getResult());
	}

	@Test
	public void testSquareRoot() {
		calculator.squareRoot(4);
		assertEquals(2, calculator.getResult());
	}
}
