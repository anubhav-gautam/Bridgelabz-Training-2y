import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        // Remove the character
        String modified = removeCharacter(input, toRemove);

        // Output
        System.out.println("Modified String: \"" + modified + "\"");
    }

    // Method to remove all occurrences of a specific character
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char current : str.toCharArray()) {
            if (current != ch) {
                result.append(current);
            }
        }

        return result.toString();
    }
}
