package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void maxNum1() {
		App app = new App();
		int expected = 20;
		int result = app.maxNum(20, 10);
		assertEquals(expected, result);
	}
	
	@Test
	public void maxNum2() {
		App app = new App();
		int expected = 20;
		int result = app.maxNum(10, 20);
		assertEquals(expected, result);
	}
	@Test
	public void maxNum3() {
		App app = new App();
		int expected = 0;
		int result = app.maxNum(20, 20);
		assertEquals(expected, result);
	}
	@Test
	public void maxNumFirstNegative() {
		App app = new App();
		int expected = 20;
		int result = app.maxNum(-10, 20);
		assertEquals(expected, result);
	}
	@Test
	public void maxNumSecondNegative() {
		App app = new App();
		int expected = 10;
		int result = app.maxNum(10, -20);
		assertEquals(expected, result);
	}
	@Test
	public void maxNumBothNegative() {
		App app = new App();
		int expected = -10;
		int result = app.maxNum(-10, -20);
		assertEquals(expected, result);
	}
}