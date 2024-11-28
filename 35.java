//35. Exception handling 
// a) To create a user defined exception whenever user input the word ' hello '.
// b)To add two integers and raise exception when any other character exceptnunber(0-9) is given as input.

import java.util.Scanner;

// User-defined exception class for inputting the word "hello"
class HelloInputException extends Exception {
    public HelloInputException(String message) {
        super(message);
    }
}

// User-defined exception class for invalid integer input
class InvalidIntegerInputException extends Exception {
    public InvalidIntegerInputException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Handle "hello" as input
        try {
            System.out.print("Enter a word: ");
            String inputWord = scanner.nextLine();

            if (inputWord.equalsIgnoreCase("hello")) {
                throw new HelloInputException("The word 'hello' is not allowed!");
            } else {
                System.out.println("You entered: " + inputWord);
            }
        } catch (HelloInputException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // b) Handle invalid integer input when adding two numbers
        try {
            System.out.print("Enter the first number: ");
            String firstInput = scanner.nextLine();
            System.out.print("Enter the second number: ");
            String secondInput = scanner.nextLine();

            // Check if both inputs are numeric
            if (!isNumeric(firstInput) || !isNumeric(secondInput)) {
                throw new InvalidIntegerInputException("Both inputs must be numbers!");
            }

            int num1 = Integer.parseInt(firstInput);
            int num2 = Integer.parseInt(secondInput);

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        } catch (InvalidIntegerInputException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid number format!");
        } finally {
            scanner.close();
        }
    }

    // Helper method to check if a string is numeric
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}




// OUTPUT:
// Enter a word: hello
// Exception: The word 'hello' is not allowed!


// Enter the first number: 10
// Enter the second number: abc
// Exception: Both inputs must be numbers!

// Enter the first number: 10
// Enter the second number: 20
// The sum of 10 and 20 is: 30

