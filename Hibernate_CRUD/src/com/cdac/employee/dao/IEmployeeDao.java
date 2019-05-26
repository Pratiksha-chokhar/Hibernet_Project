package com.cdac.employee.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.cdac.employee.Exception.employeeException;
import com.cdac.employee.model.Employee;

public interface IEmployeeDao {
	
	
	public Employee addEmployee(Employee employee)throws employeeException;
	public Employee getEmployeeBId(Integer empId)throws employeeException;
	
	public Employee updateEmplyee(Employee employee)throws employeeException;
	public Employee deleteEmployee(Integer empId)throws employeeException;
	
	public List<Employee> listAllEmployee()throws employeeException;
	
	public Transaction beginTx() throws employeeException;
	public void commitTx() throws employeeException;
	

}
