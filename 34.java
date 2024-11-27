//24. Create a class named Shape.Inside that class create three subclasses named Circle,Rectangle,Triangle and
// create two member functions named draw() and erase().Create using polymorphism concepts.

// Base class Shape
class Shape {
    // Method to draw the shape
    void draw() {
        System.out.println("Drawing a shape.");
    }

    // Method to erase the shape
    void erase() {
        System.out.println("Erasing a shape.");
    }
}

// Subclass Circle extending Shape
class Circle extends Shape {
    // Overriding the draw method
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    // Overriding the erase method
    @Override
    void erase() {
        System.out.println("Erasing a Circle.");
    }
}

// Subclass Rectangle extending Shape
class Rectangle extends Shape {
    // Overriding the draw method
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    // Overriding the erase method
    @Override
    void erase() {
        System.out.println("Erasing a Rectangle.");
    }
}

// Subclass Triangle extending Shape
class Triangle extends Shape {
    // Overriding the draw method
    @Override
    void draw() {
        System.out.println("Drawing a Triangle.");
    }

    // Overriding the erase method
    @Override
    void erase() {
        System.out.println("Erasing a Triangle.");
    }
}

// Main class to demonstrate polymorphism
public class ShapeTest {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[3];

        // Instantiate Circle, Rectangle, and Triangle objects
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        // Iterate through the array and call draw() and erase() methods
        for (Shape shape : shapes) {
            shape.draw();  // Polymorphic call to draw()
            shape.erase(); // Polymorphic call to erase()
            System.out.println();
        }
    }
}


// OUTPUT: 
// Drawing a Circle.
// Erasing a Circle.

// Drawing a Rectangle.
// Erasing a Rectangle.

// Drawing a Triangle.
// Erasing a Triangle.
