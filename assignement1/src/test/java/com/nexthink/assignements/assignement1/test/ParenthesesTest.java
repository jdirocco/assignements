package com.nexthink.assignements.assignement1.test;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Before;
import org.junit.Test;

import com.nexthink.assigments.assignement1.Parentheses;

public class ParenthesesTest {
	
	private Parentheses calc;
	
	@Before
	public void init() {
		calc = new Parentheses();
	}

	
	@Test
	public void calculateOK1Test() {
		assertTrue(calc.validate("(())"));		
	}
	@Test
	public void calculateOK2Test() {
		assertTrue(calc.validate("()"));		
	}
	
	@Test
	public void calculateOK3Test() {
		assertTrue(calc.validate(""));		
	}
	
	
	@Test 
	public void calculateKO1Test() {
		assertFalse(calc.validate("(()"));		
	}
	
	@Test 
	public void calculateKO2Test() {
		assertFalse(calc.validate("())"));		
	}
	
	@Test
	public void calculateKO3Test() {
		assertFalse(calc.validate("()()"));		
	}
}
