package org.netjs;
import java.util.List;


import org.netjs.account.dao.EmployeeDao;
import org.netjs.account.dao.EmployeeDaoImpl;
import org.netjs.account.dto.Employee;
import org.netjs.account.service.EmployeeService;
import org.netjs.account.service.EmployeeServiceImpl;


public class EmployeeDriver {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);
		
		List<Employee> empList = employeeService.getEmployees();
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}


}
