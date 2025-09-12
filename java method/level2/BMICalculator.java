import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate BMI column in data array
    // data[i][0] = weight (kg), data[i][1] = height (cm), data[i][2] = BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status for each person and return as String array
    // Using common BMI categories:
    // BMI < 18.5: Underweight
    // 18.5 <= BMI < 25: Normal weight
    // 25 <= BMI < 30: Overweight
    // BMI >= 30: Obese
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] teamData = new double[10][3]; // 10 persons, 3 columns (weight, height, BMI)

        // Input weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI and fill BMI column
        calculateBMI(teamData);

        // Get BMI status for each person
        String[] bmiStatus = getBMIStatus(teamData);

        // Display the details
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                              i + 1, teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }

        sc.close();
    }
}
