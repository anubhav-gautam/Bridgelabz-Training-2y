public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle info
    public void displayInfo() {
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.2f\n", getArea());
        System.out.printf("Circumference: %.2f\n", getCircumference());
    }
}
