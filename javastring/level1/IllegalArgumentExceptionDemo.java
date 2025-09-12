import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        // This will throw IllegalArgumentException because start > end
        System.out.println("Substring: " + str.substring(5, 2));
    }

    // Method to demonstrate handling IllegalArgumentException
    public static void handleException(String str) {
        try {
            System.out.println("Substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call method that generates the exception (unhandled)
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: IllegalArgumentException occurred.");
        }

        System.out.println("\nNow demonstrating exception handling inside method:");

        // Call method that handles the exception internally
        handleException(input);

        scanner.close();
    }
}
