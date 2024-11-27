//13. write a java program to perform the employee payroll 

import java.util.Scanner;

class Employee {
    String empName;
    String empId;
    double basicPay;
    double da;       // Dearness Allowance
    double hra;      // House Rent Allowance
    double pf;       // Provident Fund
    double tax;      // Tax Deduction

    // Constructor to initialize Employee details
    public Employee(String empName, String empId, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.basicPay = basicPay;
        calculateAllowancesAndDeductions();
    }

    // Method to calculate allowances and deductions
    private void calculateAllowancesAndDeductions() {
        da = 0.80 * basicPay;     // DA is 80% of basic pay
        hra = 0.20 * basicPay;    // HRA is 20% of basic pay
        pf = 0.12 * basicPay;     // PF is 12% of basic pay
        tax = 0.10 * (basicPay + da + hra); // Tax is 10% of gross salary
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicPay + da + hra;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        return calculateGrossSalary() - (pf + tax);
    }

    // Method to display employee payroll details
    public void displayPayrollDetails() {
        System.out.println("\nEmployee Payroll Details:");
        System.out.println("Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();
        
        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        // Create an Employee object
        Employee emp = new Employee(name, empId, basicPay);

        // Display payroll details
        emp.displayPayrollDetails();

        sc.close();
    }
}


// OUTPUT :
// Enter Employee Name: John Doe
// Enter Employee ID: E123
// Enter Basic Pay: 50000

// Employee Payroll Details:
// Name: John Doe
// Employee ID: E123
// Basic Pay: 50000.0
// Dearness Allowance (DA): 40000.0
// House Rent Allowance (HRA): 10000.0
// Provident Fund (PF): 6000.0
// Tax Deduction: 10000.0
// Gross Salary: 100000.0
// Net Salary: 84000.0

