// Employee.java
public class Employee {
    // Attributes
    String name;
    String id;
    double salary;

    // Constructor
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : $" + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("Alice Johnson", "E102", 55000);

        // Displaying details
        emp1.displayDetails();
    }
}
