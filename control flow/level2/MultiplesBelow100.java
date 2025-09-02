import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer less than 100: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0 && number < 100) {
                System.out.println("Multiples of " + number + " below 100 (from 100 down to 1):");
                
                // Loop backward from 100 to 1
                for (int i = 100; i >= 1; i--) {
                    if (i % number == 0) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Please enter a positive integer less than 100.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        scanner.close();
    }
}
