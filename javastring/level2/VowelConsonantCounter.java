import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is vowel, consonant or not a letter
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + ('a' - 'A'));
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {
            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    // Returns int array: [0] = vowel count, [1] = consonant count
    public static int[] countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        int index = 0;
        while (true) {
            try {
                char ch = str.charAt(index++);
                String result = checkChar(ch);
                if (result.equals("Vowel")) {
                    vowelCount++;
                } else if (result.equals("Consonant")) {
                    consonantCount++;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }
}
