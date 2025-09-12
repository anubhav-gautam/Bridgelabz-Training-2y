import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return as 2D array
    // Each row: [character, frequency as string]
    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256]; // frequency array for all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }

        // Count how many unique characters are there
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array for character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store characters and their frequency in result array
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency table
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

        String[][] frequency = findCharFrequency(input);

        System.out.println("\nCharacter Frequency:");
        displayFrequency(frequency);

        sc.close();
    }
}
