package com.nexthink.assignements.assignement2.test;



import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Before;
import org.junit.Test;

import com.nexthink.assigments.assignement2.Calculator;

public class CalculatorTest {
	
	private Calculator calc;
	
	@Before
	public void init() {
		calc = new Calculator();
	}

	@Test
	public void calculateOKTest() {
		long value = calc.calculate("((10-5)*5)+(21/7)").longValue();
		assertEquals(28, value);
		System.out.println(value);
	}
	@Test
	public void calculateOK2Test() {
		long value = calc.calculate("((10 - 5 ) *5) + (21 / 7)").longValue();
		assertEquals(28, value);
		System.out.println(value);
	}
	
	@Test (expected = ParseCancellationException.class)
	public void calculateKOTest() {
		long value = calc.calculate("(10 - (5))-4)").longValue();
		assertEquals(5, value);
		System.out.println(value);
	}
}
