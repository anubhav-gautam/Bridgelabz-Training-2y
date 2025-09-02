import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height as input (in inches)
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInSqInches = 0.5 * base * height;

        // Convert area to square centimeters (1 sq inch = 6.4516 sq cm)
        double areaInSqCm = areaInSqInches * 6.4516;

        // Print the results
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.", areaInSqInches, areaInSqCm);

        input.close();
    }
}
