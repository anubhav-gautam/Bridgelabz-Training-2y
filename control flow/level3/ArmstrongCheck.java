import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNumber = num;  // keep the original number
        int sum = 0;               // to store sum of cubes

        // Step c: loop until originalNumber becomes 0
        while (num != 0) {
            // Step d: extract last digit
            int digit = num % 10;

            // cube of digit and add to sum
            sum += digit * digit * digit;

            // Step e: remove last digit
            num /= 10;
        }

        // Step f: check Armstrong condition
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}
