public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", 8.5);
        student.displayStudentInfo();

        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.2, "Machine Learning");
        pgStudent.displayStudentInfo();      // inherited method
        pgStudent.displayPostgraduateInfo(); // subclass method

        System.out.println();

        // Accessing public rollNumber directly
        System.out.println("PG Student Roll Number (public): " + pgStudent.rollNumber);

        // Accessing protected name via subclass method
        // Direct access from outside is NOT allowed:
        // System.out.println(pgStudent.name); // ERROR!

        // Accessing private CGPA via getter and setter
        System.out.println("PG Student CGPA (via getter): " + pgStudent.getCGPA());
        pgStudent.setCGPA(9.5);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
