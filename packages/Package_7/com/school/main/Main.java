package Package.Package_7.com.school.main;
import Package.Package_7.com.school.data.*;
import Package.Package_7.com.school.util.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of student: ");
		String name = input.nextLine();
		
		Student stud =new Student();
		Analyzer ana = new Analyzer();
		
		System.out.print("Enter the marks of Science: ");
		int m1=input.nextInt();
		
		System.out.print("Enter the marks of Maths: ");
		int m2=input.nextInt();
		
		System.out.print("Enter the marks of English: ");
		int m3=input.nextInt();
		
		stud.name(name);
		stud.marks(m1, m2, m3);
		stud.displaymarks();
		System.out.println("Average (%): " + ana.calculateAverage(stud));
		System.out.println("Grade: " + ana.findGrade(stud));

	}
}