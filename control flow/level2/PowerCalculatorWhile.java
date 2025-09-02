import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number (integer): ");
        int number = scanner.nextInt();

        // Input power/exponent
        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        if (power >= 0) {
            int result = 1;
            int counter = 0;

            // Loop until counter equals power
            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter a non-negative integer for power.");
        }

        scanner.close();
    }
}
