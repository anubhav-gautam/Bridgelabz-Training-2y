import java.util.Random;

public class StudentGrades {

    // Generate random 2-digit scores for Physics, Chemistry, Maths for n students
    // Returns 2D array: [n][3]
    public static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            // random marks between 0 and 99 inclusive
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Maths
        }

        return scores;
    }

    // Calculate total, average, and percentage for each student
    // Returns 2D double array: [n][3] -> total, average, percentage
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Calculate grades based on percentage
    // Returns 2D String array: [n][1] with grade strings
    public static String[][] calculateGrades(double[][] percentages) {
        int n = percentages.length;
        String[][] grades = new String[n][1];

        for (int i = 0; i < n; i++) {
            double percentage = percentages[i][2]; // percentage column

            if (percentage >= 90) {
                grades[i][0] = "A";
            } else if (percentage >= 80) {
                grades[i][0] = "B";
            } else if (percentage >= 70) {
                grades[i][0] = "C";
            } else if (percentage >= 60) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    // Main method to test the flow
    public static void main(String[] args) {
        int numberOfStudents = 5;

        int[][] scores = generateRandomScores(numberOfStudents);

        System.out.println("Physics | Chemistry | Maths");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%7d | %9d | %5d%n", scores[i][0], scores[i][1], scores[i][2]);
        }

        double[][] totalsAndPercentages = calculateTotalsAndPercentages(scores);

        System.out.println("\nTotal | Average | Percentage");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%5.0f | %7.2f | %10.2f%n",
                    totalsAndPercentages[i][0],
                    totalsAndPercentages[i][1],
                    totalsAndPercentages[i][2]);
        }

        String[][] grades = calculateGrades(totalsAndPercentages);

        System.out.println("\nGrades");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: %s%n", i + 1, grades[i][0]);
        }
    }
}
