import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When charAt throws exception, count holds the length
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Length calculated by custom method: " + customLength);
        System.out.println("Length calculated by built-in length(): " + builtInLength);

        scanner.close();
    }
}
