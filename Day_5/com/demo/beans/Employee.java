package Day_5.com.demo.beans;

public class Employee {
	String empName;
	int empID;
	String empRole;
	
	public Employee() {
		super();
	}

	public Employee(int empID, String empName) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole = "Employee";
	}

	public Employee(int empID, String empName, String empRole) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", empRole=" + empRole + "]";
	}

	public int getEmpId() {
		return empID;
	}

	public Object getEmpName() {
		// TODO Auto-generated method stub
		return empName;
	}
	
	
}
