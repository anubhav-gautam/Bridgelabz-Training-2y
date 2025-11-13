package Package.Package_6.com.company.main;
import Package.Package_6.com.company.hr.*;
import Package.Package_6.com.company.payroll.*;
import java.util.*;

public class MainApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee id: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.print("Enter employee name: ");
		String name = input.nextLine();
		System.out.print("Enter the department: ");
		String depart = input.nextLine();
		System.out.print("Enter the salary: ");
		int salary = input.nextInt();
		Employee emp = new Employee();
		emp.details(id, name, depart, salary);
		emp.displaydetails();
		Payroll bonus = new Payroll();
		System.out.print("Salary after 10% hike = "+bonus.bonusedsalary(emp));
	}
}
