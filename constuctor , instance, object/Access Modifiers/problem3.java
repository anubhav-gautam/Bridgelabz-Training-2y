// Base class
public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to modify salary
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Display employee info
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f\n", salary);
    }
}

// Subclass
public class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerInfo() {
        // Accessing protected and public members from superclass
        System.out.println("Manager Employee ID (public): " + employeeID);
        System.out.println("Manager Department (protected): " + department);
        System.out.println("Team Size: " + teamSize);
    }
}
