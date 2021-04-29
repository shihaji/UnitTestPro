package com.cts;

public class Example {

	public static void main(String[] args) {
		
		
		
		EmployeeDao empDao=new EmployeeDao();
		
		EmployeeService empServ=new EmployeeService(empDao);
		
		System.out.println(empServ.incrementSalary("prg"));

	}

}
