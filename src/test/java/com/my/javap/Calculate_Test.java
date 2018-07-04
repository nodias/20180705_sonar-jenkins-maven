package com.my.javap;

import org.junit.Test;
import org.junit.*;

public class Calculate_Test {

	@Test
	public void test_success() {
		Calculate calculate = new Calculate();
		calculate.factorial(10);
	}
	
	@Test
	public void test_fail() {
		Calculate calculate = new Calculate();
		calculate.factorial(0);
	}

}
