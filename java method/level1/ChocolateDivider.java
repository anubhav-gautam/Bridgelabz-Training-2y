import java.util.Scanner;

public class ChocolateDivider {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Chocolates per child
        result[1] = number % divisor;  // Remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Input: number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Handle division by zero
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get " + result[0] + " chocolate(s).");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}
