import java.util.Scanner;

public class CustomTrim {

    // Method to find start and end indexes after trimming leading/trailing spaces
    // Returns int array: [startIndex, endIndexExclusive]
    public static int[] findTrimIndexes(String str) {
        int length = 0;
        // Find string length without length()
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // length found
        }

        int start = 0;
        // Find first non-space from start
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }

        int end = length - 1;
        // Find first non-space from end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // end + 1 for exclusive end index
        return new int[]{start, end + 1};
    }

    // Method to create substring from string using charAt(), start inclusive, end exclusive
    public static String substringCustom(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt(), return boolean
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedCustom = substringCustom(input, indexes[0], indexes[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Custom trimmed string: \"" + trimmedCustom + "\"");
        System.out.println("Built-in trimmed string: \"" + trimmedBuiltIn + "\"");

        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
