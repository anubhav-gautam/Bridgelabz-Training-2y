import java.util.Arrays;

public class RandomValues {

    // Generates an array of 'size' random 4-digit integers (1000 to 9999)
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000); // 1000 to 9999 inclusive
        }
        return arr;
    }

    // Returns an array with average at index 0, min at index 1, max at index 2
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            // Update min and max using Math.min and Math.max
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));

        double[] results = findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
    }
}
