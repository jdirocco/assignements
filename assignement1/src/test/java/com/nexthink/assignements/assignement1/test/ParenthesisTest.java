package com.nexthink.assignements.assignement1.test;



import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Before;
import org.junit.Test;

import com.nexthink.assigments.assignement1.Parentesis;

public class ParenthesisTest {
	
	private Parentesis calc;
	
	@Before
	public void init() {
		calc = new Parentesis();
	}

	
	@Test
	public void calculateOK1Test() {
		assertTrue(calc.validate("(())"));		
	}
	@Test
	public void calculateOK2Test() {
		assertTrue(calc.validate("()"));		
	}
	
	
	
	
	@Test (expected = ParseCancellationException.class)
	public void calculateKO1Test() {
		assertTrue(calc.validate("(()"));		
	}
	
	@Test (expected = ParseCancellationException.class)
	public void calculateKO2Test() {
		assertTrue(calc.validate("())"));		
	}
	
	@Test(expected = ParseCancellationException.class)
	public void calculateKO3Test() {
		assertTrue(calc.validate("()()"));		
	}
}
