//12-b) Write a java program to  find the maximum value of the give data types using generic //function

public class MaximumValueFinder {

    // Function to find maximum of three integers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // Function to find maximum of three doubles
    public static double findMaximum(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of 3, 7, 5 (int): " + findMaximum(3, 7, 5));
        System.out.println("Maximum of 3.5, 2.1, 4.8 (double): " + findMaximum(3.5, 2.1, 4.8));
    }
}


// OUTPUT:
// Maximum of 3, 7, 5 (int): 7  
// Maximum of 3.5, 2.1, 4.8 (double): 4.8

