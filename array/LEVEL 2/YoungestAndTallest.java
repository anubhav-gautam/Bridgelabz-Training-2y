import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter age of " + names[i] + ": ");
                scanner.next();
            }
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter height of " + names[i] + ": ");
                scanner.next();
            }
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}
