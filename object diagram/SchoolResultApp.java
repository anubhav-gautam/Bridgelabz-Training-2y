class Subject {
    String subjectName;
    int marks;

    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
}

class Student {
    String name;
    int rollNo;
    Subject[] subjects;

    Student(String name, int rollNo, Subject[] subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.subjects) {
            total += s.marks;
        }
        double avg = total / (double) student.subjects.length;

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }
}

public class SchoolResultApp {
    public static void main(String[] args) {
        Subject[] subs = { new Subject("Maths", 90), new Subject("Science", 85) };
        Student student = new Student("John", 1, subs);
        GradeCalculator calc = new GradeCalculator();
        String grade = calc.calculateGrade(student);

        System.out.println("Student: " + student.name);
        System.out.println("Grade: " + grade);
    }
}
