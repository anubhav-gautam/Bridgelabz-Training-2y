import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        // Convert string to lowercase to make comparison easier
        input = input.toLowerCase();

        // Iterate through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Output
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    // Helper method to check for vowels
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
