class Employee {
    static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;

    private String name;
    private String designation;
    private final int id;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
}

public class EmployeeSystemTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "Software Engineer");
        Employee emp2 = new Employee("Jane Smith", 102, "Project Manager");

        emp1.displayDetails();
        System.out.println("-------------------");
        emp2.displayDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}
