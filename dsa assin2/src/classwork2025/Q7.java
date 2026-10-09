package classwork2025;

class Shape1 {
    String color;

    Shape1(String color) {
        this.color = color;
    }
}

class Circle1 extends Shape1 {
    double radius;

    Circle1(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape1 {
    double length, breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
    }
}

public class Q7 {
    public static void main(String[] args) {
        Circle1 c = new Circle1("Red", 3);
        c.display();

        Rectangle r = new Rectangle("Green", 2, 6);
        r.display();
    }
}
