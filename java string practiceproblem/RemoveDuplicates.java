import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates
        String result = removeDuplicates(input);

        // Output
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters
    public static String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }
}
