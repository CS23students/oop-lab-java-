//44.  Write the  java program for user to the radius , used to method called circlearea calculate to area of the circle
// and used to method called circleperimeter calculate to perimeter of the circle

import java.util.Scanner;

public class CircleCalculator {

    // Method to calculate the area of the circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate the area and perimeter using the methods
        double area = circleArea(radius);
        double perimeter = circlePerimeter(radius);

        // Display the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

        sc.close();
    }
}



// OUTPUT: 
// Enter the radius of the circle: 5
// Area of the circle: 78.53981633974483
// Perimeter of the circle: 31.41592653589793
