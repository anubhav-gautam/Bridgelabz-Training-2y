import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    void show() { System.out.println(" - " + name); }
}

class Department {
    String name;
    List<Employee> emps = new ArrayList<>();
    Department(String name) { this.name = name; }
    void add(String emp) { emps.add(new Employee(emp)); }
    void show() {
        System.out.println("Department: " + name);
        for (Employee e : emps) e.show();
    }
}

class Company {
    String name;
    List<Department> depts = new ArrayList<>();
    Company(String name) { this.name = name; }
    void add(Department d) { depts.add(d); }
    void show() {
        System.out.println("Company: " + name);
        for (Department d : depts) d.show();
    }
}

public class Test {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department hr = new Department("HR");
        hr.add("Alice"); hr.add("Bob");

        Department it = new Department("IT");
        it.add("Charlie"); it.add("Dana");

        c.add(hr); c.add(it);
        c.show();

        c = null;
        System.gc();
        System.out.println("\nCompany deleted. Departments and employees removed.");
    }
}
