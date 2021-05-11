package org.netjs.account.service;

import java.util.List;
import org.netjs.account.dto.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeesByDept();
	public void deleteEmployee(int empId);


}
