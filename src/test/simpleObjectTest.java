package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.simpleObject;

public class simpleObjectTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSimpleObject() {
		int count=0;
		simpleObject object1 = new simpleObject(count);
		simpleObject object2 = new simpleObject(count);
		simpleObject object3 = new simpleObject(count);
		int[] result= {object1.getCount(),object2.getCount(),object3.getCount()};
		int[] temp = {1,1,1};
		assertArrayEquals(temp, result);
	}

}
