package com.cdac.employee.client;

import java.util.List;

import com.cdac.employee.Exception.employeeException;
import com.cdac.employee.model.Employee;
import com.cdac.employee.service.EmployeeService;
import com.cdac.employee.service.IEmployeeServices;

public class EmployeeMain {
	
	
	private static IEmployeeServices employeeService;
	static
	{
		employeeService= new EmployeeService();
	}

	public static void main(String[] args) throws employeeException {
		
		
		System.out.println("\n    Adding the employee  record ");
		
		Employee employee=new Employee(111,"Shitu","sp@g.com");
		//Employee employee1=new Employee(112,"pratu","sp@g.com");
		
		
		
		employeeService.addEmployee(employee);
		
		System.out.println("\n    Addeedddeed ");

		
		System.out.println("\n    Retrieve the customer record  by id");
		
		System.out.println("found " + employeeService.getEmployeeBId(employee.getEmpId()));
		
		

		System.out.println("\n 		Update the employee record ");
		
		employee.setEmpName("prati");
		System.out.println("emp updated :"+employeeService.updateEmplyee(employee));
		
		
		
		System.out.println("\n 		Listing the employee record ");
		
		List<Employee> empList=employeeService.listAllEmployee();
		empList.forEach((emp1)->System.out.println(emp1));
		
		
		System.out.println("\n 		Delete the employee record ");
		System.out.println("employee deleted :"+employeeService.deleteEmployee(employee.getEmpId()));
		
		
	}

}
