import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generates age between 0 and 99 inclusive (adjust if you want min age > 0)
            ages[i] = rand.nextInt(100); 
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array of [age, canVote]
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            // Validate age and voting eligibility
            if (age < 0) {
                result[i][1] = "false";  // negative age can't vote
            } else if (age >= 18) {
                result[i][1] = "true";   // can vote
            } else {
                result[i][1] = "false";  // can't vote
            }
        }
        return result;
    }

    // Method to display the 2D array in a table format
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s | %-12s%n", "Age", "Can Vote");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %-12s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10; // number of students

        // If you want to take ages from user instead of random generation:
        // int[] ages = new int[n];
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Enter age of student " + (i+1) + ": ");
        //     ages[i] = scanner.nextInt();
        // }

        // Or generate random ages for demonstration
        int[] ages = generateRandomAges(n);

        String[][] eligibility = checkVotingEligibility(ages);

        displayTable(eligibility);

        scanner.close();
    }
}
