class Student {
    static String universityName = "Global Tech University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Student)
            System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Grade: " + grade + ", University: " + universityName);
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student)
            this.grade = newGrade;
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        s1.display();
        s2.display();

        s2.updateGrade("A+");
        System.out.println("\nAfter grade update:");
        s2.display();

        Student.displayTotalStudents();
    }
}
