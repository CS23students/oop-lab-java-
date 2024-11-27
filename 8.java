//8. Write a java program to throw an exception(checked) for an employee details.     
//   a) If the name is given as a number,an exception should be thrown.  
//   b) If the age is greater than 50, an exception should be thrown.   
//   c) Or else an object should be created for the given employee details.

import java.util.Scanner;

// Custom Exception for Invalid Name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

public class EmployeeExceptionHandling {
    // Method to validate employee details and create an object if valid
    public static Employee createEmployee(String name, int age) throws InvalidNameException, InvalidAgeException {
        // Check if name contains any digit
        if (name.matches(".*\\d.*")) {
            throw new InvalidNameException("Name should not contain numbers.");
        }

        // Check if age is greater than 50
        if (age > 50) {
            throw new InvalidAgeException("Age should not be greater than 50.");
        }

        // If both conditions are met, create and return the Employee object
        return new Employee(name, age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input employee name
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            // Input employee age
            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            // Try to create an Employee object
            Employee employee = createEmployee(name, age);
            System.out.println("\nEmployee created successfully.");
            employee.displayEmployeeDetails();

        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}


// OUTPUT :
// Enter Employee Name: John123
// Enter Employee Age: 30
// Error: Name should not contain numbers.

// Enter Employee Name: John
// Enter Employee Age: 55
// Error: Age should not be greater than 50.

// Enter Employee Name: John
// Enter Employee Age: 30
// Employee created successfully.
// Employee Name: John
// Employee Age: 30
