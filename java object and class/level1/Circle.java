// Circle.java
public class Circle {
    // Attribute
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a circle with radius 5.0
        Circle circle1 = new Circle(5.0);

        // Display area and circumference
        circle1.displayDetails();
    }
}
