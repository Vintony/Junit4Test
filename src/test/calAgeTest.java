package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import service.calAge;

public class calAgeTest {

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCalA() {
		calAge calA=new calAge();
		Date birthday = new Date(95,9,25);
		calA.calA(birthday);
		assertEquals(21, calA.getResult());
	}

}
