package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void OddTest() {
		App app = new App();
		String actual = app.evenOdd(11);
		String expected = "Odd Number";
		assertEquals(expected, actual);
	}
	@Test
	public void evenTest() {
		App app = new App();
		String actual = app.evenOdd(10);
		String expected = "Even Number";
		assertEquals(expected, actual);
	}
}
