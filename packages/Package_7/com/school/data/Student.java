package Package.Package_7.com.school.data;

public class Student {
	public void name(String name) {
		System.out.println("Student's name: "+name);
	}
	public int marks1;
	public int marks2;
	public int marks3;
	public void marks(int m1, int m2, int m3) {
		this.marks1=m1;
		this.marks2=m2;
		this.marks3=m3;
	}
	public void displaymarks() {
		System.out.println("Science: "+marks1);
		System.out.println("Maths: "+marks2);
		System.out.println("English: "+marks3);
	}
	public int totalmarks() {
		return marks1+marks2+marks3;
	}
}