import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the number of rounds needed to complete 5km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000.0; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Check for valid triangle (optional but good practice)
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            // Calculate rounds
            double rounds = calculateRounds(side1, side2, side3);

            // Display the result rounded to 2 decimal places
            System.out.printf("The athlete needs to complete %.2f rounds to complete a 5 km run.%n", rounds);
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
