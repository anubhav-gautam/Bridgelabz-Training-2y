import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Accessing index beyond the string length - will throw exception
        System.out.println("Character at invalid index: " + str.charAt(str.length()));
    }

    // Method to demonstrate handling StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Character at invalid index: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call method that generates exception (unhandled)
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: StringIndexOutOfBoundsException occurred.");
        }

        System.out.println("\nNow demonstrating exception handling inside method:");

        // Call method that handles the exception internally
        handleException(input);

        scanner.close();
    }
}
