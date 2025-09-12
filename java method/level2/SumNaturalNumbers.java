import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Input is not a natural number. Please enter a positive integer.");
            sc.close();
            return;
        }
        
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);
        
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods give the same result. Calculation is correct.");
        } else {
            System.out.println("Results differ. Check the implementation.");
        }
        
        sc.close();
    }
}
