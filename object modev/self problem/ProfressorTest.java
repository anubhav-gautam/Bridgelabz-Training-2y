import java.util.*;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) { this.name = name; }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.title);
    }
}

class Course {
    String title;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String title) { this.title = title; }

    void assignProfessor(Professor p) {
        professor = p;
        System.out.println("Professor " + p.name + " assigned to " + title);
    }

    void addStudent(Student s) {
        students.add(s);
    }
}
public class ProfressorTest {
    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Jane");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        math.assignProfessor(prof1);
        physics.assignProfessor(prof2);

        s1.enrollCourse(math);
        s1.enrollCourse(physics);
        s2.enrollCourse(physics);
    }
}
