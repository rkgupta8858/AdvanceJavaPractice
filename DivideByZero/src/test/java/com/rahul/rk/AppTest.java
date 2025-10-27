package com.rahul.rk;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class AppTest {

//	@Test // JUnit 5
//	public void divideByZeroTest() {
//		App app = new App();
//		assertThrows(ArithmeticException.class,()-> app.divideByZero(10, 0));
//	}
	
	
	// Junit 4
	@Test(expected = ArithmeticException.class)
	public void divideByZeroTest1() {
		App app = new App();
		app.divideByZero(10, 0);
	}
}
