import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validate input
        if (numberOfStudents < 2) {
            System.out.println("At least two students are required for a handshake.");
        } else {
            // Calculate handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("The maximum number of handshakes possible among " +
                               numberOfStudents + " students is: " + handshakes);
        }

        scanner.close();
    }
}
