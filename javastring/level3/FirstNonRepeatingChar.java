import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // frequency array for all ASCII chars

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }

        // If no non-repeating character found, return a special char (e.g., '\0')
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character is: " + result);
        }

        sc.close();
    }
}
