import java.util.Scanner;

public class ShortestLongestWords {

    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split string into words without using split()
    public static String[] customSplit(String str) {
        int length = findLength(str);

        // Count words using flag to handle multiple spaces
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = -1;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && start == -1) {
                start = i;
            }

            if ((ch == ' ' || i == length - 1) && start != -1) {
                int end = (ch == ' ') ? i : i + 1;
                StringBuilder word = new StringBuilder();
                for (int j = start; j < end; j++) {
                    word.append(str.charAt(j));
                }
                words[wordIndex++] = word.toString();
                start = -1;
            }
        }
        return words;
    }

    // Method to create 2D String array with word and length as String
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word indexes
    // Returns int[] {shortestIndex, longestIndex}
    public static int[] findShortestLongest(String[][] wordsWithLengths) {
        if (wordsWithLengths.length == 0) {
            return new int[]{-1, -1}; // handle empty array case
        }

        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = shortestLength;

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = customSplit(input);
        String[][] wordsWithLengths = wordsWithLengths(words);
        int[] shortestLongestIndexes = findShortestLongest(wordsWithLengths);

        if (shortestLongestIndexes[0] == -1) {
            System.out.println("No words found in the input.");
        } else {
            int shortestIndex = shortestLongestIndexes[0];
            int longestIndex = shortestLongestIndexes[1];

            System.out.println("\nShortest word: \"" + wordsWithLengths[shortestIndex][0] + "\" with length " + wordsWithLengths[shortestIndex][1]);
            System.out.println("Longest word: \"" + wordsWithLengths[longestIndex][0] + "\" with length " + wordsWithLengths[longestIndex][1]);
        }

        scanner.close();
    }
}
