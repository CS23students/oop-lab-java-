//18. Create an interface payable with getamount() method. Calculate the amount to be paid to invoice and employee by implementing interface

// Payable Interface
interface Payable {
    double getAmount();
}

// Invoice Class implementing Payable Interface
class Invoice implements Payable {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}

// Employee Class implementing Payable Interface
class Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public Employee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getAmount() {
        return hourlyRate * hoursWorked;
    }
}

// Main Class to test the implementation
public class PayableTest {
    public static void main(String[] args) {
        // Create an invoice object with a specified amount
        Invoice invoice = new Invoice(5000.75);
        System.out.println("Amount to be paid for invoice: " + invoice.getAmount());

        // Create an employee object with hourly rate and hours worked
        Employee employee = new Employee(50.0, 160);
        System.out.println("Amount to be paid to employee: " + employee.getAmount());
    }
}


// OUTPUT:
// Amount to be paid for invoice: 5000.75
// Amount to be paid to employee: 8000.0
