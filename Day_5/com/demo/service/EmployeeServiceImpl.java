package Day_5.com.demo.service;

import java.util.List;
import java.util.Scanner;

import Day_5.com.demo.beans.Employee;
import Day_5.com.demo.dao.EmployeeDao;
import Day_5.com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner sc = new Scanner(System.in);
    EmployeeDao edao;
    public EmployeeServiceImpl(){
        edao = new EmployeeDaoImpl();
    }

    public boolean addNewEmp() {
        System.out.println("enter employee id");
        int id = sc.nextInt();
        System.out.println("enter employee name");
        String name = sc.next();
        System.out.println("enter employee role");
        String role = sc.next();
        Employee emp = new Employee(id,name,role);
        return edao.addNewEmployee(emp);
    }

    public List<Employee> showAllEmp() {
        return edao.showAll();
    }

    public boolean deleteById(int id) {
        return edao.removebyid(id);
    }

    public List<Employee> sortedEmp() {
        return edao.sortedEmployee();
    }

    public List<Employee> findByName(String name) {
        return edao.findByEmpName(name);
    }

    public boolean saveAllEmp() {
        return edao.saveToFile();
    }
}
