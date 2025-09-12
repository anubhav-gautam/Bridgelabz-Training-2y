import java.util.Scanner;

public class LeapYearChecker {

    // Method to check leap year based on conditions a and b
    public static boolean isLeapYear(int year) {
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);
        boolean conditionB = (year % 400 == 0);
        return conditionA || conditionB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year should be 1582 or later (Gregorian calendar).");
            sc.close();
            return;
        }

        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}
