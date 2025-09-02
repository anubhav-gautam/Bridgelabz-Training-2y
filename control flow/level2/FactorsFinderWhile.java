import java.util.Scanner;

public class FactorsFinderWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Factors of " + number + " are:");
                int i = 1;

                // Run while loop till i <= number
                while (i <= number) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                    i++; // increment counter
                }
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        scanner.close();
    }
}
