package com.rahul.rk;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		String name = scanner.next();
		
		App app = new App();
		app.EmployeData(id, name);

	}

	public void EmployeData(int id, String name) {
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
	}
}
