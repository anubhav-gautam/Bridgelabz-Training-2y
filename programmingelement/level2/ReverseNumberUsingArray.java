import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] originalDigits = new int[count];
        int[] reversedDigits = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            originalDigits[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            reversedDigits[i] = originalDigits[i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        scanner.close();
    }
}
