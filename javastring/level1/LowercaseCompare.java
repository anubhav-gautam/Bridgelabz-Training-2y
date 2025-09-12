import java.util.Scanner;

public class LowercaseCompare {

    // Method to convert string to lowercase using charAt() and ASCII logic
    public static String toLowerCaseCustom(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if uppercase letter (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32 to ASCII value
                ch = (char) (ch + 32);
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
        String lowerCustom = toLowerCaseCustom(input);

        // Convert using built-in method
        String lowerBuiltIn = input.toLowerCase();

        // Compare the two lowercase strings
        boolean areEqual = compareStrings(lowerCustom, lowerBuiltIn);

        // Display results
        System.out.println("Lowercase (Custom): " + lowerCustom);
        System.out.println("Lowercase (Built-in): " + lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + areEqual);

        scanner.close();
    }
}
