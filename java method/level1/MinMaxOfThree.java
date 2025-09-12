import java.util.Scanner;

public class MinMaxOfThree {

    // Method to find the smallest and largest among three numbers
    public static void findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        // Check for smallest
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        // Check for largest
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        // Output results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for 3 numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Call method to find smallest and largest
        findSmallestAndLargest(num1, num2, num3);

        scanner.close();
    }
}
