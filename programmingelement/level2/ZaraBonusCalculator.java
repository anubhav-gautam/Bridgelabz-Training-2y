import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;
        double[][] employeeData = new double[EMPLOYEE_COUNT][2]; // [][0]=Salary, [][1]=Years of Service
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        Scanner scanner = new Scanner(System.in);

        // Input loop
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee #" + (i + 1));
            double salary = -1, years = -1;

            // Salary validation
            while (salary <= 0) {
                System.out.print("Enter salary (positive number): ");
                if (scanner.hasNextDouble()) {
                    salary = scanner.nextDouble();
                    if (salary <= 0) {
                        System.out.println("Invalid salary. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // clear invalid input
                }
            }

            // Years of service validation
            while (years < 0) {
                System.out.print("Enter years of service (non-negative number): ");
                if (scanner.hasNextDouble()) {
                    years = scanner.nextDouble();
                    if (years < 0) {
                        System.out.println("Invalid years of service. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // clear invalid input
                }
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        // Bonus calculation loop
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            double empBonus;
            if (years > 5) {
                empBonus = salary * 0.05;
            } else {
                empBonus = salary * 0.02;
            }

            bonus[i] = empBonus;
            newSalary[i] = salary + empBonus;

            totalOldSalary += salary;
            totalBonus += empBonus;
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee #%d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), employeeData[i][0], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Summary ---");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        scanner.close();
    }
}
