package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calRabbit;

public class calRabbitTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalR() {
		calRabbit calRabbit = new calRabbit();
		calRabbit.calR(6);
		assertEquals(13, calRabbit.getResult());
	}

}
