// 49. To write details of employees and calculate tax paid by employee based on income.
// Male income<150000 no tax,>200000-10%tax,>300000-20%tax,>500000-30% tax. 
// Female income<150000 notax, >200000 notax, >300000 10%tax, >500000 20%tax

import java.util.Scanner;

// Employee class to store details and calculate tax
class Employee {
    private String name;
    private String gender;
    private double income;

    // Constructor to initialize employee details
    public Employee(String name, String gender, double income) {
        this.name = name;
        this.gender = gender.toLowerCase(); // Convert to lowercase for easier comparison
        this.income = income;
    }

    // Method to calculate tax based on gender and income
    public double calculateTax() {
        double tax = 0;
        
        if (gender.equals("male")) {
            if (income <= 150000) {
                tax = 0; // No tax
            } else if (income > 150000 && income <= 200000) {
                tax = 0; // No tax
            } else if (income > 200000 && income <= 300000) {
                tax = income * 0.10; // 10% tax
            } else if (income > 300000 && income <= 500000) {
                tax = income * 0.20; // 20% tax
            } else if (income > 500000) {
                tax = income * 0.30; // 30% tax
            }
        } else if (gender.equals("female")) {
            if (income <= 150000) {
                tax = 0; // No tax
            } else if (income > 150000 && income <= 300000) {
                tax = 0; // No tax
            } else if (income > 300000 && income <= 500000) {
                tax = income * 0.10; // 10% tax
            } else if (income > 500000) {
                tax = income * 0.20; // 20% tax
            }
        }

        return tax;
    }

    // Method to display employee details and tax
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Income: ₹" + income);
        System.out.println("Tax Paid: ₹" + calculateTax());
    }
}

// Main class to test the Employee tax calculation
public class EmployeeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get employee details from user
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.nextLine();

        System.out.print("Enter Annual Income: ₹");
        double income = sc.nextDouble();

        // Create an Employee object and calculate the tax
        Employee employee = new Employee(name, gender, income);
        employee.displayDetails();

        sc.close();
    }
}



// OUTPUT:
// Enter Employee Name: John Doe
// Enter Gender (Male/Female): Male
// Enter Annual Income: ₹450000

// Employee Name: John Doe
// Gender: male
// Income: ₹450000.0
// Tax Paid: ₹90000.0



// Enter Employee Name: Jane Doe
// Enter Gender (Male/Female): Female
// Enter Annual Income: ₹350000

// Employee Name: Jane Doe
// Gender: female
// Income: ₹350000.0
// Tax Paid: ₹35000.0
