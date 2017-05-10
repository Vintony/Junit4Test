package test;

import static org.junit.Assert.*;  
import org.junit.Before;
import org.junit.Test;

import service.paiCal;

public class paiCalTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("¿ªÊ¼²âÊÔ");
	}

	@Test
	public void testPai() {
		paiCal pCal = new paiCal();
		pCal.pai();
		assertEquals(3.141592653589793238462643383279502384197 , pCal.getResult(),0.00000001);
	}

}
