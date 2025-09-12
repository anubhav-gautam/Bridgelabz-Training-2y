import java.util.Scanner;

public class CharArrayCompare {

    // User-defined method to convert string to char array without using toCharArray()
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get char array using user-defined method
        char[] charsFromMethod = getChars(input);

        // Get char array using built-in toCharArray()
        char[] charsFromBuiltIn = input.toCharArray();

        // Compare the two char arrays
        boolean arraysEqual = compareCharArrays(charsFromMethod, charsFromBuiltIn);

        // Display the arrays and result
        System.out.print("Characters from user-defined method: ");
        for (char c : charsFromMethod) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Characters from built-in toCharArray(): ");
        for (char c : charsFromBuiltIn) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both char arrays equal? " + arraysEqual);

        scanner.close();
    }
}
