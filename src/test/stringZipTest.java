package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.stringZip;

public class stringZipTest {

	static String str1 = "aaabbbbccdddd";
	static String str2 = "abcd";
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("¿ªÊ¼²âÊÔ");
	}

	@Test
	public void testStr1() {
		stringZip stringZip1 = new stringZip();
		stringZip1.zip(str1);
		assertEquals("a3b4c2d4", stringZip1.getResult());
	}
	
	@Test
	public void testStr2(){
		stringZip stringZip2 = new stringZip();
		stringZip2.zip(str2);
		assertEquals("abcd", stringZip2.getResult());
	}

}
