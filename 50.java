//50.  Develop a java application with an Employee class with Emp_name, Emp_id, Address, Mail_id,
// Mobile_no as members. Inherit the classes, Programmer, Assistant Professor,
// Associate Professor and Professor from employee class. Add Basic Pay (BP) as the member
// of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of
// BP as PF, 0.1% of BP for staff club funds. Generate pay slips for the employees with their gross
// and net salary. 


import java.util.Scanner;

// Base class: Employee
class Employee {
    String empName;
    String empId;
    String address;
    String mailId;
    String mobileNo;
    double basicPay;

    // Constructor to initialize Employee details
    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    // Method to calculate DA (97% of Basic Pay)
    double calculateDA() {
        return basicPay * 0.97;
    }

    // Method to calculate HRA (10% of Basic Pay)
    double calculateHRA() {
        return basicPay * 0.10;
    }

    // Method to calculate PF (12% of Basic Pay)
    double calculatePF() {
        return basicPay * 0.12;
    }

    // Method to calculate Staff Club Fund (0.1% of Basic Pay)
    double calculateStaffClubFund() {
        return basicPay * 0.001;
    }

    // Method to calculate Gross Salary
    double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    // Method to calculate Net Salary
    double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF() - calculateStaffClubFund();
    }

    // Method to display the pay slip
    void displayPaySlip() {
        System.out.println("\n--- Pay Slip ---");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Email: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Basic Pay: ₹" + basicPay);
        System.out.println("DA: ₹" + calculateDA());
        System.out.println("HRA: ₹" + calculateHRA());
        System.out.println("PF: ₹" + calculatePF());
        System.out.println("Staff Club Fund: ₹" + calculateStaffClubFund());
        System.out.println("Gross Salary: ₹" + calculateGrossSalary());
        System.out.println("Net Salary: ₹" + calculateNetSalary());
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass: AssistantProfessor
class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass: AssociateProfessor
class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass: Professor
class Professor extends Employee {
    public Professor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Main class
public class EmployeePaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get Employee Details
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Email ID: ");
        String mailId = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobileNo = sc.nextLine();
        System.out.print("Enter Basic Pay: ₹");
        double basicPay = sc.nextDouble();

        // Select the type of employee
        System.out.println("\nSelect Employee Type:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Employee employee = null;

        switch (choice) {
            case 1:
                employee = new Programmer(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case 2:
                employee = new AssistantProfessor(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case 3:
                employee = new AssociateProfessor(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case 4:
                employee = new Professor(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        // Display Pay Slip
        employee.displayPaySlip();

        sc.close();
    }
}




// OUTPUT:
// Enter Employee Name: John Doe
// Enter Employee ID: EMP123
// Enter Address: 123 Street, City
// Enter Email ID: john@example.com
// Enter Mobile Number: 9876543210
// Enter Basic Pay: ₹50000

// Select Employee Type:
// 1. Programmer
// 2. Assistant Professor
// 3. Associate Professor
// 4. Professor
// Enter your choice: 1

// --- Pay Slip ---
// Employee Name: John Doe
// Employee ID: EMP123
// Address: 123 Street, City
// Email: john@example.com
// Mobile No: 9876543210
// Basic Pay: ₹50000.0
// DA: ₹48500.0
// HRA: ₹5000.0
// PF: ₹6000.0
// Staff Club Fund: ₹50.0
// Gross Salary: ₹103500.0
// Net Salary: ₹97450.0
