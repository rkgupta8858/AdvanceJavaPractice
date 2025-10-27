package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void EmployeDataIntString() {
		App app = new App();
		app.EmployeData(101, "Rahul");
		String expected = "Employee Id : 101" + System.lineSeparator() + "Employee Name : Rahul"
				+ System.lineSeparator();
		assertEquals(expected, outContent.toString());

	}
}
