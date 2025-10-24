package Day_5.com.demo.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Day_5.com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> empl;
    static {
        empl= new ArrayList<>();
        Employee e1 = new Employee(101, "Saurabh", "HR");
        Employee e2 = new Employee(102, "kunal", "Manager");
        empl.add(e1);
        empl.add(e2);
    }
   public boolean addNewEmployee(Employee emp) {
       return empl.add(emp);
   }

   public List<Employee> showAll() {
        return  empl;
   }

   public boolean removebyid(int id) {
       for (Employee e: empl){
           if(e.getEmpId()==id){
               empl.remove(e);
               return true;
           }
       }
       return false;
   }

   public List<Employee> sortedEmployee() {
        List<Employee>temp = new ArrayList<>();
        for(Employee e :empl){
            temp.add(e);
        }
       Comparator<Employee> c = (o1,o2)-> {
           return o1.getEmpId() - o2.getEmpId();
            };
           temp.sort(c);
           return temp;

}

   public List<Employee> findByEmpName(String name) {
        List<Employee>temp = new ArrayList<>();
        for(Employee e : empl){
            if(e.getEmpName().equals(name)){
                temp.add(e);
            }
        }
       return temp;
   }

   public boolean saveToFile() {
	   try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.txt"))){
            for(Employee emp : empl){
            oos.writeObject(emp);
            return true;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

       return false;
   }

}