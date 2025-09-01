import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        // Handle division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is undefined.");
        }

        // Print all results in a single line
        System.out.printf(
            "The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f",
            number1, number2, addition, subtraction, multiplication, division
        );

        input.close();
    }
}
