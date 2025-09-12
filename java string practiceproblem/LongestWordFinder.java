import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find the longest word
        String longestWord = findLongestWord(sentence);

        // Output
        System.out.println("Longest word: " + longestWord);
    }

    // Method to find the longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // split by whitespace
        String longest = "";

        for (String word : words) {
            // Remove punctuation from word
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
