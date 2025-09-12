import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String subString = scanner.nextLine();

        // Count occurrences
        int count = countOccurrences(mainString, subString);

        // Output
        System.out.println("The substring occurs " + count + " times.");
    }

    // Method to count substring occurrences (including overlaps)
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index++; // move forward by one to allow overlapping matches
        }

        return count;
    }
}
