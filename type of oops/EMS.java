import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String n, double s) {
        this.employeeId = id;
        this.name = n;
        this.baseSalary = s;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double s) { if(s>=0) this.baseSalary = s; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String n, double s) { super(id, n, s); }
    public double calculateSalary() { return getBaseSalary(); }
}

class PartTimeEmployee extends Employee {
    private int hours;
    private double rate;
    public PartTimeEmployee(int id, String n, int h, double r) {
        super(id, n, 0);
        this.hours = h; this.rate = r;
    }
    public double calculateSalary() { return hours * rate; }
}

interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}

class EmployeeWithDept extends FullTimeEmployee implements Department {
    private String dept;
    public EmployeeWithDept(int id, String n, double s) { super(id, n, s); }
    public void assignDepartment(String d) { this.dept = d; }
    public void getDepartmentDetails() { System.out.println(getName() + " works in " + dept + " department."); }
}

public class EMS {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(1,"Amit",50000));
        list.add(new PartTimeEmployee(2,"Raj",40,200));

        for(Employee e : list) e.displayDetails();

        EmployeeWithDept ed = new EmployeeWithDept(3,"Priya",60000);
        ed.assignDepartment("HR");
        ed.displayDetails();
        ed.getDepartmentDetails();
    }
}
