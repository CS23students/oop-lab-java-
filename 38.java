//38. Write a java program a)Create a user defined exception b) Handle the exception a=1,b=0 by c=a/b

// User-defined exception class
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message); // Call the constructor of the parent Exception class
    }
}

// Main class to handle the exception
public class DivisionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            // Call the divide method and handle exception
            int c = divide(a, b);
            System.out.println("Result: " + c);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Method to perform division and throw user-defined exception
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            // Throw user-defined exception if divisor is zero
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// OUTPUT:
//Exception: Division by zero is not allowed.
