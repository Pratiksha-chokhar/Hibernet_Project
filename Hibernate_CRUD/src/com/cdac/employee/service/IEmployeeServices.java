package com.cdac.employee.service;

import java.util.List;

import com.cdac.employee.Exception.employeeException;
import com.cdac.employee.model.Employee;

public interface IEmployeeServices {

	
	
	public Employee addEmployee(Employee employee)throws employeeException;
	public Employee getEmployeeBId(Integer empId)throws employeeException;
	
	public Employee updateEmplyee(Employee employee)throws employeeException;
	public Employee deleteEmployee(Integer empId)throws employeeException;
	
	public List<Employee> listAllEmployee()throws employeeException;
	
	
}
