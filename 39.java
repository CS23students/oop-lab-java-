//39. Create a class using members Consumername, ConsumerNumber , and NoOfCalls
// And create a phonebill  using the following rules
// Upto 99 rs 50
// 100-199 rs 50 paise per call
// 200-299 rs 75 paise per call
// 300-399 rs 1 per call

// Class to represent a consumer's phone bill
class PhoneBill {
    String consumerName;  // Consumer's name
    String consumerEmail;
    int consumerNumber;   // Consumer's number
    int noOfCalls;        // Number of calls made
    double billAmount;    // Total bill amount

    // Constructor to initialize consumer details
    public PhoneBill(String consumerName,  String consumerEmail, int consumerNumber, int noOfCalls) {
        this.consumerName = consumerName;
        this.consumerEmail=consumerEmail;
        this.consumerNumber = consumerNumber;
        this.noOfCalls = noOfCalls;
        this.billAmount = calculateBill(noOfCalls);
    }

    // Method to calculate the phone bill based on the number of calls
    private double calculateBill(int noOfCalls) {
        double amount = 0;
        if (noOfCalls <= 99) {
            amount = 50;  // Fixed charge for up to 99 calls
        } else if (noOfCalls <= 199) {
            amount = 50 + (noOfCalls - 99) * 0.50;  // 50 paise per call after 99
        } else if (noOfCalls <= 299) {
            amount = 50 + (100 * 0.50) + (noOfCalls - 199) * 0.75;  // 75 paise per call after 199
        } else if (noOfCalls <= 399) {
            amount = 50 + (100 * 0.50) + (100 * 0.75) + (noOfCalls - 299) * 1.00;  // 1 rupee per call after 299
        } else {
            amount = 50 + (100 * 0.50) + (100 * 0.75) + (100 * 1.00) + (noOfCalls - 399) * 1.25; // Additional if required
        }
        return amount;
    }

    // Method to display the phone bill details
    public void displayBill() {
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Consumer Email: " + consumerEmail);
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Number of Calls: " + noOfCalls);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

// Main class to test the PhoneBill program
public class PhoneBillCalculator {
    public static void main(String[] args) {
        // Get user input for consumer details
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Consumer Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Consumer Number: ");
        int number = sc.nextInt();

        System.out.print("Enter Number of Calls Made: ");
        int calls = sc.nextInt();

        // Create PhoneBill object and calculate the bill
        PhoneBill phoneBill = new PhoneBill(name, email, number, calls);

        // Display the phone bill details
        phoneBill.displayBill();

        sc.close();
    }
}


// OUTPUT:
// Enter Consumer Name: John Doe
// Enter Consumer Number: 12345
// Enter Number of Calls Made: 150
// Consumer Name: John Doe
// Consumer Number: 12345
// Number of Calls: 150
// Total Bill Amount: Rs. 75.5
