package test;

import org.junit.Before;
import org.junit.Test;

import service.timeFormat;

public class timeFormatTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("��ʼ����");
	}

	@Test
	public void testFormat() {
		timeFormat tFormat=new timeFormat();
		tFormat.format();
	}

}
