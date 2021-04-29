package com.cts;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
	
	
	
	//EmployeeDao employeeDao=mock(EmployeeDao.class);
	
	@Mock
	EmployeeDao employeeDao;
	
	@InjectMocks
	EmployeeService empService;

	@Before
	public void setUp() throws Exception {
		
	//	empService=new EmployeeService(new EmployeeDao());
		
		//empService=new EmployeeService(employeeDao);
		
	}

	

	@Test
	public void testIncrementSalary() {
		
		List<Employee> mockList=new ArrayList<Employee>();
		mockList.add(new Employee(100,"abc",50000,"prg"));
		mockList.add(new Employee(200,"def",60000,"prg"));
				
		when(employeeDao.getEmployeeByDesg("prg")).thenReturn(mockList);
	
		List<Employee> list=empService.incrementSalary("prg");
			
		List<Employee> exList=new ArrayList<Employee>();
		
		exList.add(new Employee(100,"abc",53000,"prg"));
		exList.add(new Employee(200,"def",63000,"prg"));
		
		assertEquals(exList,list);
		
		verify(employeeDao).getEmployeeByDesg(anyString());
		verify(employeeDao,atLeast(1)).getEmployeeByDesg("prg");
		verify(employeeDao,atMost(10)).getEmployeeByDesg("prg");
		
		verify(employeeDao,never()).getEmployeeBySalary(anyInt());
		
	}

	
	@After
	public void tearDown() throws Exception {
		
		
	}
	
	
}
