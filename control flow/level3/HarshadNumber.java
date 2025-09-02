import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        // Step d & e: Extract digits and find sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // Step f & g: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        sc.close();
    }
}
