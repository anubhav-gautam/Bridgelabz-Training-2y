import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get salary input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Get years of service input
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("You are eligible for a bonus of: $" + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        scanner.close();
    }
}
