import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid integer!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to parse as integer: ");
        String input = scanner.next();

        // Call method that generates exception (unhandled)
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: NumberFormatException occurred.");
        }

        System.out.println("\nNow demonstrating exception handling inside method:");

        // Call method that handles exception internally
        handleException(input);

        scanner.close();
    }
}
