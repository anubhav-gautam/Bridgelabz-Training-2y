import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length); // will throw exception when out of bounds
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // when charAt goes out of bounds, stop counting
        }
        return length;
    }

    // Method to find unique characters in string using charAt()
    public static char[] findUniqueChars(String str) {
        int len = findLength(str);
        char[] temp = new char[len]; // temp array to store unique chars
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;

            // Check if character already exists in temp array
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }

        // Create a new array of exact size to store unique chars
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
