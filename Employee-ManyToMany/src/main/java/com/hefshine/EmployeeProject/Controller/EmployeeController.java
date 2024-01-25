package com.hefshine.EmployeeProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.EmployeeProject.Model.Employee;
import com.hefshine.EmployeeProject.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	public List<Employee> showEmployee()
	{
		return employeeService.findAll();
	}

}
