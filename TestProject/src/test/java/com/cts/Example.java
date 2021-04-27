package com.cts;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Example {

	public static void main(String[] args) {
		
		Result result=JUnitCore.runClasses(CalculatorTest.class,CalculatorTest2.class);
		
		for(Failure f:result.getFailures()) {
			
			System.out.println(f.toString());
		}
		
		System.out.println(result.wasSuccessful());
		

	}

}
