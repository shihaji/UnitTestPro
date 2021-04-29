package com.cts;

import java.util.List;

public class EmployeeService {
	
	EmployeeDao employeeDao;
	
	public EmployeeService(EmployeeDao employeeDao) {
		this.employeeDao=employeeDao;
	}
	
	
	public List<Employee> incrementSalary(String desg){
		
		List<Employee> empList=employeeDao.getEmployeeByDesg(desg);
		
		
		for(Employee e:empList) {
			e.setSalary(e.getSalary()+3000);
		}
		
		
		return empList;
		
	}
	
	
	
	

}
