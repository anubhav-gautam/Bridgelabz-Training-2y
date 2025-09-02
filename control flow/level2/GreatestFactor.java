import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer greater than 1: ");
        int number = scanner.nextInt();

        int greatestFactor = 1;  // Initialize greatest factor as 1

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;  // Break once greatest factor is found
            }
        }

        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        scanner.close();
    }
}
