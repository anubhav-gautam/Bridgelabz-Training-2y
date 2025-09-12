import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    // Method to find unique characters using nested loops and charAt()
    public static char[] uniqueCharacters(String str) {
        int length = str.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;

            // Check if the character already appeared before i
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }

        // Copy unique characters to exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters and return a 2D array [character, frequency]
    public static String[][] findFrequency(String str) {
        int[] freq = new int[256]; // frequency array for ASCII chars

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(str);

        // Create 2D array for unique chars and frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayFrequency(String[][] freqArray) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------");
        for (String[] row : freqArray) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequency = findFrequency(input);

        System.out.println("\nFrequency of Unique Characters:");
        displayFrequency(frequency);

        sc.close();
    }
}
