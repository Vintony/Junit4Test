package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.calRegularPolygon;

public class calRegularPolygonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCal() {
		calRegularPolygon calRegularPolygon=new calRegularPolygon();
		calRegularPolygon.cal(4, 10);
		assertEquals(100, calRegularPolygon.getResult(),0.001);
	}

}
