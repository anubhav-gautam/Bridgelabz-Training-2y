import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar
        if (year >= 1582) {
            // Single if condition with logical operators
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("The program works only for year >= 1582.");
        }

        sc.close();
    }
}
