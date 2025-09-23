class Person{
    protected String name;
    protected int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }
    public void displayRole(){
        System.out.println("Role: Teacher - Teaches " + subject);
    }
}
class Student extends Person{
    private String grade;
    public Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
    public void displayRole(){
        System.out.println("Role: Student - Studies in grade " + grade);
    }
}
class Staff extends Person{
    private String department;
    public Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
    public void displayRole(){
        System.out.println("Role: Staff - Works in " + department + " department");
    }
}

class SchoolManagement{
    public static void main(String[] args){
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 20, "A");
        Staff staff = new Staff("Charlie", 40, "Administration");

    teacher.displayInfo();
    teacher.displayRole();
    student.displayInfo();
    student.displayRole();
    staff.displayInfo();
    staff.displayRole();
    }
}