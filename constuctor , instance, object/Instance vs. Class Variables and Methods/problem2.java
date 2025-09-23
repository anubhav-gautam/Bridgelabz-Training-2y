public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks or months
    private double fee;

    // Class variable (shared by all Course objects)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.printf("Fee: $%.2f\n", fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}
