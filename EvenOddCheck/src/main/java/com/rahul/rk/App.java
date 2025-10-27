package com.rahul.rk;

public class App {
	public static void main(String[] args) {
		App app = new App();
		String status = app.evenOdd(201);
		System.out.println(status);

	}

	public String evenOdd(int status) {

		if (status % 2 == 0) {
			return "Even Number";
		}
		else {
			return "Odd Number";
		}
	}
}
