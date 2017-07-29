package com.stackroute.test.continousIntegration;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AddTest {

	private static App app;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new App();
	}

	@Test
	public void test() {
		assertEquals(100,app.add(50, 50));
	}

}
