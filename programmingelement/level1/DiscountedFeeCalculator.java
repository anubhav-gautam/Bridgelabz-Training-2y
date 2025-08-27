import java.util.Scanner;

public class DiscountedFeeCalculator {
    public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Take user input for fee
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Step 3: Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Step 4: Compute the discount amount
        double discount = (fee * discountPercent) / 100;

        // Step 5: Compute the final fee after discount
        double finalFee = fee - discount;

        // Step 6: Display the result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        // Step 7: Close Scanner
        input.close();
    }
}
