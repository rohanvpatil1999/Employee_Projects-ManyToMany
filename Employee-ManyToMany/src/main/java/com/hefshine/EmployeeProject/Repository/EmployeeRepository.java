package com.hefshine.EmployeeProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hefshine.EmployeeProject.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
