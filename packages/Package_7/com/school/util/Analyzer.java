package Package.Package_7.com.school.util;
import Package.Package_7.com.school.data.*;

public class Analyzer {
    public float calculateAverage(Student s) {
        return (s.totalmarks() / 300.0f) * 100;
    }

    public String findGrade(Student s) {
        float percent = (s.totalmarks() / 300.0f) * 100;

        if (percent > 90) return "A";
        else if (percent > 80) return "B";
        else if (percent > 70) return "C";
        else if (percent > 60) return "D";
        else if (percent > 50) return "E";
        else return "F";
    }
}