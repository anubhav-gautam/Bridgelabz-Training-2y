import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month (non-leap year)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to get month name from month number (1-12)
    public static String getMonthName(int month) {
        if (month < 1 || month > 12) return "Invalid Month";
        return months[month - 1];
    }

    // Method to check if a year is leap year
    public static boolean isLeapYear(int year) {
        // Leap year if divisible by 400 or divisible by 4 but not 100
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to get number of days in a given month and year
    public static int getNumberOfDays(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        int d = 1; // first day of the month

        // Gregorian calendar formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        if (numDays == -1) {
            System.out.println("Invalid month!");
            return;
        }

        System.out.printf("      %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for each day
        }

        // Print all days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method to take input and show calendar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
