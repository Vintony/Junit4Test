package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import service.ChickAndRabbit;

public class ChickAndRabbitTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		ChickAndRabbit chickAndRabbit = new ChickAndRabbit();
		chickAndRabbit.cal(10, 30);
		assertEquals(5, chickAndRabbit.getChick());
		assertEquals(5, chickAndRabbit.getRabbit());
	}

}
