package Package.Package_1.college.faculty;

public class Faculty {
	private String facultyname;
	private String subject;
	public void detailsfaculty(String facultyname,String subject) {
		this.facultyname=facultyname;
		this.subject=subject;
	}
	public void displayfaculty() {
		System.out.println("Faculty Name: " + facultyname);
		System.out.println("Subject tought by the faculty: " + subject);
	}
}
