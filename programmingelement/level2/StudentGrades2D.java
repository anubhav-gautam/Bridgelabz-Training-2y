import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];  // 0=Physics, 1=Chemistry, 2=Maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int subj = 0; subj < 3; subj++) {
                int mark;
                do {
                    System.out.print("Enter marks for " + (subj == 0 ? "Physics" : subj == 1 ? "Chemistry" : "Maths") + ": ");
                    mark = scanner.nextInt();
                    if (mark < 0) {
                        System.out.println("Invalid input. Marks must be positive.");
                    }
                } while (mark < 0);
                marks[i][subj] = mark;
            }

            int total = 0;
            for (int subj = 0; subj < 3; subj++) {
                total += marks[i][subj];
            }
            percentages[i] = (total / 300.0) * 100;

            double p = percentages[i];
            if (p >= 90) grades[i] = 'A';
            else if (p >= 80) grades[i] = 'B';
            else if (p >= 70) grades[i] = 'C';
            else if (p >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.printf("%-8s %-8s %-8s %-12s %-6s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-8d %-8d %-12.2f %-6c\n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
