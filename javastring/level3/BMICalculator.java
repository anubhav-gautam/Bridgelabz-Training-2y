import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and get status based on height and weight
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4]; // height, weight, BMI, status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100; // convert to meters

            double bmi = weight / (heightM * heightM);
            String status = getBMIStatus(bmi);

            // Store as strings in the result array
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to get BMI status based on BMI value
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the 2D string array in tabular form
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------");

        for (String[] person : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeightData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight (kg): ", i + 1);
            heightWeightData[i][0] = sc.nextDouble();

            System.out.printf("Person %d - Height (cm): ", i + 1);
            heightWeightData[i][1] = sc.nextDouble();
        }

        String[][] results = calculateBMI(heightWeightData);

        System.out.println("\nBMI Results:");
        displayResults(results);

        sc.close();
    }
}
