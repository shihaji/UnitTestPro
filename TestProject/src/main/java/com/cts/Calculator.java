package com.cts;

public class Calculator {
	
	public int addMethod(int a,int b) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a+b;
		
	}
	
	
	public int substractMethod(int a, int b) {
		
		if(a<b) {
			throw new RuntimeException();
		}
		
		return a-b;
	}
	
	
	public int multiplyMethod(int a , int b) {
		
		return a*b;
	}
	
	public int divideMethod(int a,int b) {
		
		if(b==0) {
			throw new ArithmeticException();
		}
		
		return a/b;
	}
	

}
