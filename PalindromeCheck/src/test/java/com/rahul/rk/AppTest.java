package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	App app = new App();

	@Test
	public void palindromeCheckTest1() {
		String expected = "Palindrome";
		String result = app.palindromeCheck("madam");
		assertEquals(expected, result);
	}
	@Test
	public void palindromeCheckTest2() {
		String expected = "Palindrome";
		String result = app.palindromeCheck("1234321");
		assertEquals(expected, result);
	}
	@Test
	public void palindromeCheckTest3() {
		String expected = "Not Palindrome";
		String result = app.palindromeCheck("Madam");
		assertEquals(expected, result);
	}
}