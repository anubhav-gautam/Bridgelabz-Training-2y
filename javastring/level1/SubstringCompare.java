import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();

        // Extract substring character by character from start to end-1
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
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

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Input start and end indices
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Validate indices
        if (start < 0 || end > inputString.length() || start > end) {
            System.out.println("Invalid indices!");
            scanner.close();
            return;
        }

        // Create substring using charAt()
        String substringCharAt = substringUsingCharAt(inputString, start, end);

        // Create substring using built-in substring()
        String substringBuiltIn = inputString.substring(start, end);

        // Compare the two substrings using charAt() comparison method
        boolean areEqual = compareUsingCharAt(substringCharAt, substringBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
