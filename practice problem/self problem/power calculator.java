import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Input exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power using Math.pow()
        double result = Math.pow(base, exponent);

        // Output result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
