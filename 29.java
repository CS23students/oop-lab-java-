//29. Abstract class 
// PrintArea(),triangle,rectangle,circle

// Abstract class Shape
abstract class Shape {
    // Abstract method to print area
    abstract void printArea();
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double base, height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing the abstract method to calculate and print the area of a triangle
    @Override
    void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method to calculate and print the area of a rectangle
    @Override
    void printArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate and print the area of a circle
    @Override
    void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the Shape subclasses
public class ShapeTest {
    public static void main(String[] args) {
        // Create objects of Triangle, Rectangle, and Circle
        Shape triangle = new Triangle(5, 10);
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(3);

        // Call printArea() for each shape
        triangle.printArea();
        rectangle.printArea();
        circle.printArea();
    }
}



// OUTPUT:
// Area of Triangle: 25.0
// Area of Rectangle: 24.0
// Area of Circle: 28.274333882308138

