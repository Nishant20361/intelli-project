// Base class
class PointType {
    protected double x;
    protected double y;

    // Constructor to initialize point
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to set coordinates
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to print coordinates
    public void printCoordinates() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
// Derived class
class CircleType extends PointType {
    private double radius;

    // Constructor
    public CircleType(double x, double y, double radius) {
        super(x, y);  // Call base class constructor to set center
        this.radius = radius;
    }

    // Method to set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and print area
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    // Method to calculate and print circumference
    public void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }

    // Method to print full circle details
    public void printCircleDetails() {
        System.out.println("Circle Details:");
        printCoordinates();  // From base class
        System.out.println("Radius: " + radius);
        printArea();
        printCircumference();
    }
}
public class ppr {
    public static void main(String[] args) {
        // Creating a circle at (3, 4) with radius 5
        CircleType circle = new CircleType(3, 4, 5);

        // Displaying full details
        circle.printCircleDetails();

        // Updating center and radius
        circle.setCoordinates(7, 8);
        circle.setRadius(10);

        System.out.println("\nAfter updating center and radius:");
        circle.printCircleDetails();
    }
}