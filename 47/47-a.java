// 47. a)Write a Java program to add two complex numbers using a class. Define a class Complex with data members for the real and imaginary parts, and methods to take input, perform addition, and display the result in the form of a+bi.
// The program should allow the user to input two complex numbers, add them, and display their sum.


import java.util.Scanner;

// Class representing a complex number
class Complex {
    private int real;  // Real part
    private int imaginary;  // Imaginary part

    // Constructor to initialize complex number
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    // Static method to take input from the user
    public static Complex inputComplexNumber(Scanner sc) {
        System.out.print("Enter the real part: ");
        int real = sc.nextInt();
        System.out.print("Enter the imaginary part: ");
        int imaginary = sc.nextInt();
        return new Complex(real, imaginary);
    }
}

// Main class to test the Complex class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.println("Enter the first complex number:");
        Complex c1 = Complex.inputComplexNumber(sc);

        // Input second complex number
        System.out.println("Enter the second complex number:");
        Complex c2 = Complex.inputComplexNumber(sc);

        // Add the two complex numbers
        Complex sum = c1.add(c2);

        // Display the result
        System.out.print("The sum of the two complex numbers is: ");
        sum.display();

        sc.close();
    }
}



// OUTPUT:
// Enter the first complex number:
// Enter the real part: 3
// Enter the imaginary part: 4
// Enter the second complex number:
// Enter the real part: 5
// Enter the imaginary part: 6
// The sum of the two complex numbers is: 8 + 10i

