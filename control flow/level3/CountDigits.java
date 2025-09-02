import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;  // Step 2: initialize count

        // Step 3: handle 0 separately (since it has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: loop until number becomes 0
            while (number != 0) {
                number = number / 10; // remove last digit
                count++;              // increase count
            }
        }

        // Step 5: display result
        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
