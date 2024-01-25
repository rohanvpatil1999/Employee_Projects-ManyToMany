package com.hefshine.EmployeeProject.Service;

import java.util.List;

import com.hefshine.EmployeeProject.Model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> findAll();

}
