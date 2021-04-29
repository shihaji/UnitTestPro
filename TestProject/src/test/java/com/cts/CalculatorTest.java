package com.cts;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	
	int input1;
	int input2;
	int output;
	
	public CalculatorTest(int input1,int input2, int output) {
		this.input1=input1;
		this.input2=input2;
		this.output=output;
	}

	@Parameters
	public static Collection testDatas() {
		
		return Arrays.asList(new Object[][] {{5,5,15},{10,10,20},{3,3,6}});
		
	}
	
	
	Calculator calc=null;
	
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	

	@Test
	public void testAddMethod() {
	
		assertEquals(output,calc.addMethod(input1, input2));
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
