package Package.Package_8.com.bank.util;
import static java.lang.Math.*;

public class InterestCalculator {
	public void calculateSimpleInterest(int p,int r,int t){
		double si = (p*r*t)/100;
		System.out.println("Simple Interest: "+si);
	}
	public void calculateCompoundInterest(int p,int r,int t) {
		double ci = p*pow(1+r/100.0,t)-p;
		System.out.println("Compound Interest: "+ci);
	}
}
