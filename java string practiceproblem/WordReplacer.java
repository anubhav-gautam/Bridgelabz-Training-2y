import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence and words
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Enter the new word: ");
        String newWord = scanner.next();

        // Replace words
        String replacedSentence = replaceWord(sentence, oldWord, newWord);

        // Output
        System.out.println("Modified sentence: " + replacedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // If the word matches oldWord, replace it
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
