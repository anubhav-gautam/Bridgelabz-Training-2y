import java.util.Scanner;

public class UppercaseCompare {

    // Method to convert string to uppercase using charAt() and ASCII logic
    public static String toUpperCaseCustom(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if lowercase letter (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                ch = (char) (ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take complete text input (including spaces)
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Convert using custom method
        String upperCustom = toUpperCaseCustom(input);

        // Convert using built-in method
        String upperBuiltIn = input.toUpperCase();

        // Compare the two uppercase strings
        boolean areEqual = compareStrings(upperCustom, upperBuiltIn);

        // Display results
        System.out.println("Uppercase (Custom): " + upperCustom);
        System.out.println("Uppercase (Built-in): " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + areEqual);

        scanner.close();
    }
}
