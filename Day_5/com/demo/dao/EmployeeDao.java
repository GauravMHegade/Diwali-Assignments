package Day_5.com.demo.dao;

import java.util.List;

import Day_5.com.demo.beans.Employee;

public interface EmployeeDao {

	boolean addNewEmployee(Employee emp);

    List<Employee> showAll();

    boolean removebyid( int id);

    List<Employee> sortedEmployee();

    List<Employee> findByEmpName(String name);

    boolean saveToFile();
}
