package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	App app;
	@Before
	public void setup() {
		app = new App();
		System.out.println("AppTest.setup()");
	}
	@After
	public void cleanUp() {
		System.out.println("AppTest.cleanUp()");
	}
	
	@Test
	public void oddNumTest() {
		System.out.println("AppTest.oddNumTest()--> Start Method");
		String expected = "Odd Number";
		String result = app.oddNumber(101);
		assertEquals(expected, result);
		System.out.println("AppTest.oddNumTest()--> End Method");
	}
	@Test
	public void oddNumTest1() {
		System.out.println("AppTest.oddNumTest1()--> Start Method");
		String expected = "Odd Number";
		String result = app.oddNumber(105);
		assertEquals(expected, result);
		System.out.println("AppTest.oddNumTest1()--> End Method");
	}
	@Test
	public void oddNumTest2() {
		System.out.println("AppTest.oddNumTest2()--> Start Method");
		String expected = "This number is not Odd !!";
		String result = app.oddNumber(10);
		assertEquals(expected, result);
		System.out.println("AppTest.oddNumTest2()--> End Method");
	}
	
	
}