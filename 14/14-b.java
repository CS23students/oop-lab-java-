// 14-b) write a java program by creating a package named mypack and import it in circle

// Save this file as Circle.java in the parent directory
import mypack.CircleCalculator;

public class Circle {
    public static void main(String[] args) {
        double radius = 5.0;

        // Using CircleCalculator from the mypack package
        double area = CircleCalculator.calculateArea(radius);
        double circumference = CircleCalculator.calculateCircumference(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}



// OUTPUT :
// Radius: 5.0
// Area: 78.53981633974483
// Circumference: 31.41592653589793
