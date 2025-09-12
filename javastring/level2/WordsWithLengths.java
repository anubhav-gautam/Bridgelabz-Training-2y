import java.util.Scanner;

public class WordsWithLengths {

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

        // Count words (words = number of spaces + 1 if string not empty)
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
                int end = (ch == ' ') ? i : i + 1; // include last char if last word
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

    // Method to create 2D String array with word and its length as String
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = customSplit(input);
        String[][] wordLengths = wordsWithLengths(words);

        System.out.println("\nWord\tLength");
        System.out.println("---------------");

        for (int i = 0; i < wordLengths.length; i++) {
            String word = wordLengths[i][0];
            int length = Integer.parseInt(wordLengths[i][1]); // convert length string back to int
            System.out.println(word + "\t" + length);
        }

        scanner.close();
    }
}
