package org.netjs.account.dao;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import org.netjs.account.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	List<Employee> empList = new ArrayList<Employee>();
	@Override
	public Employee findEmployeeById(int empId) {
		
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("In EmployeeDao");
		Employee employee  = new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("xxxxxxxxx");
		employee.setHireDate(LocalDate.of(2021, 04, 20));
		employee.setSalary(100000);
		employee.setJob("Developer");
		empList.add(employee);
		
		employee = new Employee();
		employee.setEmpNo(2);
		employee.setEmpName("yyyyyyyy");
		employee.setHireDate(LocalDate.of(2021, 04, 23));
		employee.setSalary(500000);
		empList.add(employee);
		employee.setJob("Analyst");
		return empList;
	}

	@Override
	public List<Employee> findEmployeesByDept() {
		
		return null;
	}

	@Override
	public void deleteEmployee(Employee empId) {
		
	}
}


