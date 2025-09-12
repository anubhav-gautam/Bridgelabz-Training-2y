// Student.java
public class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Riya Sharma", 101, 87.5);
        Student student2 = new Student("Aman Verma", 102, 72.0);

        // Display details for each student
        student1.displayDetails();
        System.out.println(); // For spacing
        student2.displayDetails();
    }
}
