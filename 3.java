// 3. create abstract class employee use method getamount() to display the amount.
// Reuse the class and calculate the amount for weekly and monthly employee by total no of weeks for weekly employee and total no of hours for hourly employee

import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    String name;
    int empId;

    // Constructor to initialize employee details
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract method to calculate and display the amount
    abstract void getAmount();
}

// Class for weekly employee, extending Employee
class WeeklyEmployee extends Employee {
    double weeklyPay;
    int totalWeeks;

    public WeeklyEmployee(String name, int empId, double weeklyPay, int totalWeeks) {
        super(name, empId);
        this.weeklyPay = weeklyPay;
        this.totalWeeks = totalWeeks;
    }

    @Override
    void getAmount() {
        double totalAmount = weeklyPay * totalWeeks;
        System.out.println("Weekly Employee:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Total Amount: " + totalAmount);
    }
}

// Class for hourly employee, extending Employee
class HourlyEmployee extends Employee {
    double hourlyPay;
    int totalHours;

    public HourlyEmployee(String name, int empId, double hourlyPay, int totalHours) {
        super(name, empId);
        this.hourlyPay = hourlyPay;
        this.totalHours = totalHours;
    }

    @Override
    void getAmount() {
        double totalAmount = hourlyPay * totalHours;
        System.out.println("Hourly Employee:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Total Amount: " + totalAmount);
    }
}

// Main class to run the application
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.println("Choose Employee Type:\n1. Weekly Employee\n2. Hourly Employee");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Weekly Pay: ");
                double weeklyPay = sc.nextDouble();
                System.out.println("Enter Total Number of Weeks: ");
                int totalWeeks = sc.nextInt();
                WeeklyEmployee weeklyEmployee = new WeeklyEmployee(name, empId, weeklyPay, totalWeeks);
                weeklyEmployee.getAmount();
                break;

            case 2:
                System.out.println("Enter Hourly Pay: ");
                double hourlyPay = sc.nextDouble();
                System.out.println("Enter Total Number of Hours: ");
                int totalHours = sc.nextInt();
                HourlyEmployee hourlyEmployee = new HourlyEmployee(name, empId, hourlyPay, totalHours);
                hourlyEmployee.getAmount();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}



// SAMPLE OUTPUT:
// Enter Employee Name: John
// Enter Employee ID: 101
// Choose Employee Type:
// 1. Weekly Employee
// 2. Hourly Employee
// 1
// Enter Weekly Pay: 1000
// Enter Total Number of Weeks: 4
// Weekly Employee:
// Employee Name: John
// Employee ID: 101
// Total Amount: 4000.0
