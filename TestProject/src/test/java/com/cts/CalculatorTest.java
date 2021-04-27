package com.cts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc=null;

	@Before
	public void setUp() throws Exception {  // precondition
		
	calc=new Calculator();
	
	}
			
                                                        
	@Test(timeout = 4000)
	public void testAddMethod() {                          
                 	  
            int result=calc.addMethod(5, 5);
            
            assertEquals(10, result);
	}
	
	@Test
	public void testAddMethodNegative() {                          
                 	  
            int result=calc.addMethod(5, 5);
            
            assertNotEquals(100, result);
	}

	
	
	@Test
	public void testMultiplyMethod() {
		assertEquals(50,calc.multiplyMethod(10, 5));
	}
	
	@Test
    public void testdivideMethod() {
		
    	assertEquals(2,calc.divideMethod(10, 5));
	}
	
	@Test(expected = ArithmeticException.class)
    public void testdivideMethod2() {
		
    	calc.divideMethod(10, 0);
	}
	
	
	@After
	public void tearDown() throws Exception { // fixtures  postcondition
		
		calc=null;
	}
	
	
	
	

}
