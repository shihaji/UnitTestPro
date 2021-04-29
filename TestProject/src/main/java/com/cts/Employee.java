package com.cts;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String desg;
	
		
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + salary + ", " + desg + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		
		Employee emp=(Employee)obj;
		
		if(this.id==emp.id) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
	
	

}
