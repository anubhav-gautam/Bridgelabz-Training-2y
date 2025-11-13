package Package.Package_1;
import Package.Package_1.college.faculty.*;
import Package.Package_1.college.student.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student's Roll Number: ");
		int studroll = input.nextInt();
		input.nextLine();
		System.out.println("Enter Student's Name: ");
		String studname = input.nextLine();
		System.out.print("Enter Faculty's Name: ");
		String facultyname = input.nextLine();
		System.out.print("Enter Subject Name: ");
		String subject = input.nextLine();
		Student newstud = new Student();
		newstud.details(studname, studroll);
		newstud.display();
		Faculty newfac = new Faculty();
		newfac.detailsfaculty(facultyname, subject);
		newfac.displayfaculty();
	}
}
