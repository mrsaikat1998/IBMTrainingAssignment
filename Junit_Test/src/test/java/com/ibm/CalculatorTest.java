package com.ibm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator cal;

	@BeforeEach
	public void beforeEach() {
		cal = new Calculator();
	}

	@Test
	public void testSum() {
		int a = 20, b = 30;
		int expectedResult = 50;
		int result = cal.add(a, b);
		Assertions.assertEquals(expectedResult, result);
	}

	@Test
	public void testSub() {
		int a = 30, b = 20;
		int expectedResult = 10;
		int result = cal.substract(a, b);
		Assertions.assertEquals(expectedResult, result);
	}

	@Test
	public void testMulti() {
		int a = 20, b = 30;
		int expectedResult = 600;
		int result = cal.multiplication(a, b);
		Assertions.assertEquals(expectedResult, result);
	}
}
