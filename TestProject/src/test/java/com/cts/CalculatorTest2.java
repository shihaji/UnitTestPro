package com.cts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {

	Calculator calc=null;

	@Before
	public void setUp() throws Exception {  // precondition
		
	calc=new Calculator();
	
	}
	
	
	@Test
	public void testSubstractMethod() {
	
		assertEquals(5,calc.substractMethod(10, 5));
		
	}
	
	@Test(expected = Exception.class)
	public void testSubstractMethodTest2() {
	
		calc.substractMethod(5, 10);
		
	}

	
			
	
	
	

}
