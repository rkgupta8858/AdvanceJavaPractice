package com.rahul.EvenCheck;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	static App app;

	@BeforeClass
	public static void setup() {
		app = new App();
		System.out.println("AppTest.setup()");
	}

	@AfterClass
	public static void cleanUp() {
		System.out.println("AppTest.cleanUp()");
	}

	@Test
	public void oddNumTest() {
		System.out.println("AppTest.oddNumTest()--> Start Method");
		String expected = "Even Number";
		String result = app.oddNumber(10);
		assertEquals(expected, result);
		System.out.println("AppTest.oddNumTest()--> End Method");
	}

	@Test
	public void oddNumTest1() {
		System.out.println("AppTest.oddNumTest1()--> Start Method");
		String expected = "Even Number";
		String result = app.oddNumber(100);
		assertEquals(expected, result);
		System.out.println("AppTest.oddNumTest1()--> End Method");
	}

	@Test
	public void oddNumTest2() {
		System.out.println("AppTest.oddNumTest2()--> Start Method");
		String expected = "This number is not Even !!";
		String result = app.oddNumber(105);
		assertEquals(expected, result);
		System.out.println("AppTest.oddNumTest2()--> End Method");
	}
}