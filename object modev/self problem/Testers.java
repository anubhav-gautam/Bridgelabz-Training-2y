import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
    void show() { System.out.println("Faculty: " + name); }
}

class Dept {
    String name;
    Dept(String name) { this.name = name; }
    void show() { System.out.println("Department: " + name); }
}

class University {
    String name;
    List<Dept> depts = new ArrayList<>();
    List<Faculty> facultyList = new ArrayList<>();
    University(String name) { this.name = name; }

    void addDepartment(String deptName) {
        depts.add(new Dept(deptName));
    }

    void addFaculty(Faculty f) {
        facultyList.add(f);
    }

    void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Dept d : depts) d.show();
        System.out.println("Faculties:");
        for (Faculty f : facultyList) f.show();
    }
}

public class Testers {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Prof. Bob");

        University u = new University("Global University");
        u.addDepartment("Computer Science");
        u.addDepartment("Physics");

        u.addFaculty(f1); // Aggregation: faculty added to university
        u.addFaculty(f2);

        u.showDetails();

        // Simulate deletion
        u = null;
        System.gc();

        System.out.println("\nUniversity deleted. Faculties still exist:");
        f1.show();
        f2.show();
    }
}
