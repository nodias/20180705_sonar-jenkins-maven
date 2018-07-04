package com.my.javap;

public class Calculate {
	public void factorial(int x) {
		int result = x;
		if (x > 0) {
			for (int i = x; i > 1; i--) {
				result = result * (i - 1);
			}
		} else {
			System.out.println("sorry");
		}
		
	}
}
