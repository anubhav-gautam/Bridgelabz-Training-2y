import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();

        // Input power/exponent
        System.out.print("Enter the power (positive integer): ");
        int power = scanner.nextInt();

        if (number > 0 && power >= 0) {  // Allow power = 0 (number^0 = 1)
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter positive integers (power can be zero).");
        }

        scanner.close();
    }
}
