package org.netjs.account.service;
import java.util.List;
import org.netjs.account.dao.EmployeeDao;
import org.netjs.account.dto.Employee;



public class EmployeeServiceImpl implements EmployeeService 
{

    EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	@Override
	public Employee getEmployeeById(int empId) {
		Employee emp = empDao.findEmployeeById(empId);
		return emp;
	}
	
	@Override
	public List<Employee> getEmployees() {
		System.out.println("Service- In getEmployees");
		List<Employee> empList = empDao.getEmployees();
		return empList;
	}
	
	@Override
	public List<Employee> getEmployeesByDept() {
		  
		return null;
	}
	
	@Override
	public void deleteEmployee(int empId) {
		
		
	}

}
