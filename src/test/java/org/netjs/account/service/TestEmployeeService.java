package org.netjs.account.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.netjs.account.dao.EmployeeDao;
import org.netjs.account.dto.Employee;

@RunWith(MockitoJUnitRunner.class)
class TestEmployeeService {
	static EmployeeService employeeService = null;
	static EmployeeDao mockEmpDao = null;
	private static Employee emp1;
	private static Employee emp2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mockEmpDao = Mockito.mock(EmployeeDao.class);
		employeeService = new EmployeeServiceImpl(mockEmpDao);
		emp1  = new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("xxxxxxxxx");
		emp1.setHireDate(LocalDate.of(2021, 04, 20));
		emp1.setSalary(100000);
		emp1.setJob("Developer");
		
		emp2 = new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("yyyyyyyy");
		emp2.setHireDate(LocalDate.of(2021, 04, 23));
		emp2.setSalary(500000);
		emp2.setJob("Analyst");
		Mockito.when(mockEmpDao.getEmployees()).thenReturn(Arrays.asList(emp1,emp2));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	List<Employee>	emp =employeeService.getEmployees();
	System.out.println(emp);
	assertEquals(2, emp.size());
	}

}
