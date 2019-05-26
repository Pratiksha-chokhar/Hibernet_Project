package com.cdac.employee.service;

import java.util.List;

import com.cdac.employee.Exception.employeeException;
import com.cdac.employee.dao.EmployeeDao;
import com.cdac.employee.dao.IEmployeeDao;
import com.cdac.employee.model.Employee;

public class EmployeeService implements IEmployeeServices {
	
	private IEmployeeDao employeeDao;
	
	

	public EmployeeService() {

		employeeDao=new EmployeeDao();
	}

	@Override
	public Employee addEmployee(Employee employee) throws employeeException {
		employeeDao.beginTx();
		Employee addedEmployee=employeeDao.addEmployee(employee);
		employeeDao.commitTx();
		return addedEmployee;
	}

	@Override
	public Employee getEmployeeBId(Integer empId) throws employeeException {
		return employeeDao.getEmployeeBId(empId);
	}

	@Override
	public Employee updateEmplyee(Employee employee) throws employeeException {
		employeeDao.beginTx();
		Employee updatedEmployee=employeeDao.updateEmplyee(employee);
		employeeDao.commitTx();
		return updatedEmployee;
	}

	@Override
	public Employee deleteEmployee(Integer empId) throws employeeException {
		employeeDao.beginTx();
		Employee deleteEmployee=employeeDao.deleteEmployee(empId);
		employeeDao.commitTx();
		return deleteEmployee;
	}

	@Override
	public List<Employee> listAllEmployee() throws employeeException {
		// TODO Auto-generated method stub
		return employeeDao.listAllEmployee();
	}

}
