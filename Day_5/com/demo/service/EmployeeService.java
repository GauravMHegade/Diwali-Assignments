package Day_5.com.demo.service;

import java.util.List;


import Day_5.com.demo.beans.Employee;


public interface EmployeeService {
	 boolean addNewEmp();

	    List<Employee> showAllEmp();

	    boolean deleteById(int id);

	    List<Employee> sortedEmp();

	    List<Employee> findByName(String name);

	    boolean saveAllEmp();
	}
    