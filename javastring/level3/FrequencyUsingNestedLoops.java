import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    // Method to find frequency of characters using nested loops and toCharArray()
    // Returns a 1D String array where each element is "character:frequency"
    public static String[] findFrequency(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Initialize frequency array to 1
        for (int i = 0; i < length; i++) {
            freq[i] = 1;
        }

        // Nested loop to count frequencies and mark duplicates as '0'
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                continue; // already counted duplicate
            }
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate character
                }
            }
        }

        // Count unique characters to create output array of correct size
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Prepare output array with unique characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + ": " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Method to display frequency results
    public static void displayFrequency(String[] freqArray) {
        System.out.println("Character : Frequency");
        System.out.println("---------------------");
        for (String entry : freqArray) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = findFrequency(input);

        System.out.println("\nFrequency of characters:");
        displayFrequency(frequencies);

        sc.close();
    }
}
