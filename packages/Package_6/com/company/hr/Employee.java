package Package.Package_6.com.company.hr;

public class Employee {
	private int employeeId;
	private String name;
	private String department;
	private double salary;
	public void details(int employeeId,String name,String department,double salary) {
		this.employeeId=employeeId;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displaydetails() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
	}
}
