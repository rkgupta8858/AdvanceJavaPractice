package com.rahul.rk;

public class App {
	

	public static String palindromeCheck(String name) {
		String str = name;
//	
		int length = str.length()-1;
		
		for (int i = 0; i <= length; i++) {
			if (str.charAt(i)==str.charAt(length)) {
				length--;
			}
			else {
				return"Not Palindrome";
			}
		}
		return "Palindrome";
//	
		
	}
}
