package com.cts;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao implements EmployeeDao1{

	public Employee[] empAr = new Employee[] {

			new Employee(100, "abc", 50000, "prg"), 
			new Employee(200, "def", 45000, "tester"),
			new Employee(300, "mno", 55000, "manager"),
			new Employee(400, "pqr", 65000, "analyst"),
			new Employee(500, "pqtr", 55000, "analyst"),
			
	};

	public List<Employee> getEmployeeByDesg(String desg) {

		List<Employee> eList = new ArrayList<Employee>();

		for (Employee e : empAr) {

			if (e.getDesg().equals(desg)) {
				eList.add(e);
			}

		}

		return eList;

	}

	public List<Employee> getEmployeeBySalary(int salary) {
		List<Employee> eList = new ArrayList<Employee>();

		for (Employee e : empAr) {

			if (e.getSalary()==salary) {
				eList.add(e);
			}

		}

		return eList;
	}

}
