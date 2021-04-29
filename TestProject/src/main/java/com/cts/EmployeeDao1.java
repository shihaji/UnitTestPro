package com.cts;

import java.util.List;

public interface EmployeeDao1 {
	
	public List<Employee> getEmployeeByDesg(String desg);
	
	public List<Employee> getEmployeeBySalary(int salary);

}
