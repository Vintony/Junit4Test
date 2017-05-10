package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import service.calDaysBetween;

public class calDaysBetweenTest {

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDaysBetween() {
		calDaysBetween calD=new calDaysBetween();
		Date date1 = new Date(95,9,25);
		Date date2 = new Date(117,5,5);
		calD.daysBetween(date1, date2);
		assertEquals(7894, calD.getResult());
	}

}
