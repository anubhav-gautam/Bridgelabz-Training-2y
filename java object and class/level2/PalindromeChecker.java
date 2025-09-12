// PalindromeChecker.java
public class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Text: \"" + text + "\"");
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test examples
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        PalindromeChecker checker3 = new PalindromeChecker("A man, a plan, a canal: Panama");

        checker1.displayResult();
        System.out.println();

        checker2.displayResult();
        System.out.println();

        checker3.displayResult();
    }
}
