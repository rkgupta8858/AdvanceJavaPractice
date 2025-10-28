package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	@Test
	public void nullCheck() {
		App app = new App();
		String result = app.returnNull(null);
		String expected = null;
		assertEquals(expected, result);
	}
	
}