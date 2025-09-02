import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer greater than 1: ");
        int number = scanner.nextInt();

        int greatestFactor = 1;       // Initialize greatest factor
        int counter = number - 1;     // Start from number - 1

        // Loop until counter reaches 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;  // Break on first greatest factor found
            }
            counter--;  // Decrement counter
        }

        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        scanner.close();
    }
}
