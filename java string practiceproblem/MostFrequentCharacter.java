import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find most frequent character
        char mostFrequent = findMostFrequentChar(input);

        // Output
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    // Method to find the most frequent character
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // For all ASCII characters
        char maxChar = '\0';
        int maxFreq = 0;

        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }

        return maxChar;
    }
}
