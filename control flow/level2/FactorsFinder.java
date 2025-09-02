import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Factors of " + number + " (excluding itself) are:");
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
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
