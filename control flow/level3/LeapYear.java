import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Gregorian calendar check
        if (year < 1582) {
            System.out.println("The program works only for year >= 1582.");
        } 
        else {
            // ---------- PART 1: Multiple if-else ----------
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            // ---------- PART 2: ----------
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("(Logical check) " + year + " is a Leap Year.");
            } else {
                System.out.println("(Logical check) " + year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}
