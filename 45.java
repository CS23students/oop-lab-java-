//45. Write a java program for user defined exception. Get name(your prefered name) writing the university exam.
//check whether if he or she says corona test is positive then show not eligible for attending the exam.
// check whether if he or she says corona test is negative then show eligible for attending the exam.

import java.util.Scanner;

// User-defined exception for positive COVID-19 test result
class PositiveCoronaTestException extends Exception {
    public PositiveCoronaTestException(String message) {
        super(message);
    }
}

public class ExamEligibility {

    // Method to check exam eligibility
    public static void checkEligibility(String name, String testResult) throws PositiveCoronaTestException {
        if (testResult.equalsIgnoreCase("positive")) {
            throw new PositiveCoronaTestException(name + " is NOT eligible to attend the exam due to a positive COVID-19 test.");
        } else if (testResult.equalsIgnoreCase("negative")) {
            System.out.println(name + " is eligible to attend the exam.");
        } else {
            System.out.println("Invalid test result. Please enter 'positive' or 'negative'.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the student's name and COVID-19 test result
        System.out.print("Enter the student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter the COVID-19 test result (positive/negative): ");
        String testResult = sc.nextLine();

        // Check the student's eligibility for the exam
        try {
            checkEligibility(name, testResult);
        } catch (PositiveCoronaTestException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}




// OUTPUT:
// Enter the student's name: John
// Enter the COVID-19 test result (positive/negative): positive
// John is NOT eligible to attend the exam due to a positive COVID-19 test.


// Enter the student's name: Alice
// Enter the COVID-19 test result (positive/negative): negative
// Alice is eligible to attend the exam.
