package com.olivesoft.internship.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.olivesoft.internship.main.*;

public class CalculatorImplTest {

	/**
	 * testing the addition of two values
	 */
	@Test
	public final void testAdd() {
		Calculator calc = new CalculatorImpl();
		int a = Integer.MAX_VALUE;
		int b = 1;
		long expectedResult = (long) Integer.MAX_VALUE + 1;
		int calculatedResult = calc.addition(a, b);
		assertEquals(expectedResult, calculatedResult);
	}

	/**
	 *testing the substract method 
	 */
	@Test
	public void testSubstract() {

		Calculator calculator = new CalculatorImpl();
		int a = Integer.MAX_VALUE;
		int b = 1;
		long expectedResult = (long) Integer.MAX_VALUE - 1;
		int calculatedResult = calculator.substract(a, b);
		assertEquals(expectedResult, calculatedResult);
	}

	/**
	 * Testing the multiply method
	 */
	@Test
	public void testMultiply() {

		Calculator calculator = new CalculatorImpl();
		int a = Integer.MAX_VALUE;
		int b = 2;
		long expectedResult = (long) Integer.MAX_VALUE * 2;
		int calculatedResult = calculator.multiply(a, b);
		assertEquals(expectedResult, calculatedResult);
	}

	/**
	 * testing the divide method
	 */
	@Test
	public void testDivide() {

		Calculator calculator = new CalculatorImpl();
		int a = Integer.MAX_VALUE;
		int b = 2;
		long expectedResult = (long) Integer.MAX_VALUE / 2;
		int calculatedResult = calculator.divide(a, b);
		assertEquals(expectedResult, calculatedResult);
	}

	@Test(expected = ArithmeticException.class)

	public void testDivideByZero() {

		Calculator calculator = new CalculatorImpl();
		int a = Integer.MAX_VALUE;
		int b = 0;
		int expectedResult = 0;
		if (calculator.divide(a, b) != expectedResult) {
			fail("on a divise par 0!");
		}
		a = 0;
		b = 0;
		expectedResult = 0;
		if (calculator.divide(a, b) != expectedResult) {
			fail("a et b sont nuls");
		}
	}

}