package Package.Package_8;
import Package.Package_8.com.bank.util.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InterestCalculator c = new InterestCalculator();
		System.out.print("Enter the principle amount: ");
		int p = input.nextInt();
		System.out.print("Enter the rate of the loan: ");
		int r = input.nextInt();
		System.out.print("Enter the duration of the loan: ");
		int t = input.nextInt();
		System.out.println("For finding simple interest enter 0 or to find compund interest enter 1");
		int in = input.nextInt();
		if(in==0) {
			c.calculateSimpleInterest(p, r, t);
		}
		else if(in==1) {
			c.calculateCompoundInterest(p, r, t);
		}
		else {
			System.out.print("Invalid input");
		}
	}
}
