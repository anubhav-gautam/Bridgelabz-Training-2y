import java.util.Scanner;

public class CustomSplitString {

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

        // Count words (words = number of spaces + 1 if not empty)
        int wordCount = 1; // assuming at least 1 word if string not empty
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes in an array
        int[] spaceIndexes = new int[wordCount - 1]; // spaces count = wordCount - 1
        int spaceIndexPos = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceIndexPos++] = i;
            }
        }

        // Create an array to hold the words
        String[] words = new String[wordCount];

        // Extract words using the space indexes
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i == wordCount - 1) {
                end = length; // last word goes till end of string
            } else {
                end = spaceIndexes[i];
            }
            // Build each word character by character
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }

        return words;
    }

    // Method to compare two String arrays for equality
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1 == null || arr2 == null) return false;

        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Call custom split method
        String[] customSplitWords = customSplit(input);

        // Call built-in split method
        String[] builtInSplitWords = input.split(" ");

        // Display words from custom method
        System.out.println("Words from customSplit method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        // Display words from built-in split method
        System.out.println("\nWords from built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        // Compare arrays and display result
        boolean arraysEqual = compareStringArrays(customSplitWords, builtInSplitWords);
        System.out.println("\nDo both split methods produce the same result? " + arraysEqual);

        scanner.close();
    }
}
