package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import service.calTax;

public class calTaxTest {

	@Before
	public void setUp() throws Exception {
	}

	@Rule 
	public ExpectedException Exception = ExpectedException.none();
	
	@Test
	public void test1() {
		Exception.expect(IllegalArgumentException.class);
		calTax calT = new calTax();
		calT.cal(-1000);
	}
	
	@Test
	public void test2(){
		calTax calT = new calTax();
		calT.cal(8970);
		assertEquals(448.5, calT.getResult(),0.00001);
	}

}
