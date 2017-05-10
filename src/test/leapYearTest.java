package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.leapYear;

public class leapYearTest {

	static int Year1 = 2001;
	static int year2 = 3100;
	static int year3 = 2004;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("¿ªÊ¼²âÊÔ");
	}

	@Test
	public void testYear1() {
		leapYear leapYear1 = new leapYear();
		leapYear1.isLeapYear(Year1);
		assertEquals(false, leapYear1.getResult());
	}
	
	@Test
	public void testyear2(){
		leapYear leapYear2 = new leapYear();
		leapYear2.isLeapYear(year2);
		assertEquals(false, leapYear2.getResult());
	}
	
	@Test
	public void testyear3(){
		leapYear leapYear3 = new leapYear();
		leapYear3.isLeapYear(year3);
		assertEquals(true, leapYear3.getResult());
	}
}
