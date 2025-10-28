package com.rahul.rk;

public class App {
	public static void main(String[] args) {
		App app = new App();
		int maxNumber = app.maxNum(10, 20);
		System.out.println(maxNumber);
	}
	public int maxNum(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else if (num1 < num2) {
			return num2;
		}
		else {
			return 0;
		}
	}
}
