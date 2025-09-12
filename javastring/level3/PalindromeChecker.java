import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Helper method for Logic 3: reverse a string using charAt()
    public static char[] reverseString(String str) {
        int length = str.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = str.charAt(length - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Check palindrome by comparing original and reversed char arrays
    public static boolean isPalindromeUsingArrays(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method to test all three methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text to check palindrome: ");
        String input = sc.nextLine();

        System.out.println("\nChecking palindrome using different methods:");

        boolean iterativeResult = isPalindromeIterative(input);
        System.out.println("Iterative method: " + (iterativeResult ? "Palindrome" : "Not Palindrome"));

        boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Recursive method: " + (recursiveResult ? "Palindrome" : "Not Palindrome"));

        boolean arrayResult = isPalindromeUsingArrays(input);
        System.out.println("Using char arrays method: " + (arrayResult ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
