package Package.Package_1.college.student;

public class Student {
	private String name;
	private int rollno;
	public void details(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll No.: " + rollno);
	}
}
