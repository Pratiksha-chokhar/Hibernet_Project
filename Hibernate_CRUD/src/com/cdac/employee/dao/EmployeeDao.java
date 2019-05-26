package com.cdac.employee.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdac.employee.Exception.employeeException;
import com.cdac.employee.model.Employee;

public class EmployeeDao implements IEmployeeDao {
	
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query query;
	
	public EmployeeDao()
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}
	

	@Override
	public Employee addEmployee(Employee employee) throws employeeException {
		//DML -so begin  transaction before save method and  after  commit tx
		session.save(employee);
		
		
		return employee;
	}

	@Override
	public Employee getEmployeeBId(Integer empId) throws employeeException {
		
		
		
		return (Employee)session.get(Employee.class,empId);
	}

	@Override
	public Employee updateEmplyee(Employee employee) throws employeeException {
		session.update(employee);
		
		
		return employee;
	}

	@Override
	public Employee deleteEmployee(Integer empId) throws employeeException {
		Employee employee=getEmployeeBId(empId);
		if(employee!=null)
		{
			session.delete(employee);
		}
		else
			employee=null;
		
		return employee;
	}

	@Override
	public List<Employee> listAllEmployee() throws employeeException {

		return session.createQuery("From Employee").list();
	}


	@Override
	public Transaction beginTx() throws employeeException {
		transaction =session.beginTransaction();
		return transaction;
	}


	@Override
	public void commitTx() throws employeeException {
		transaction.commit();
		
	}
	

}
