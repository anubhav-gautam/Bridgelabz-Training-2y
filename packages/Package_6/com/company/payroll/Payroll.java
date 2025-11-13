package Package.Package_6.com.company.payroll;
import Package.Package_6.com.company.hr.*;

public class Payroll {
	public double bonusedsalary(Employee e) {
		double salary = e.getSalary();
		double bonus = (10*salary)/100;
		return salary+bonus;
	}
}
