//42. Vehicle parking invoice with entry time, exit time, type of the vehicle, vehicle number and vehicle fee amount calculate fee amount
// For bikes
// First 6hours ₹15
// After 6 hours ₹2 for per 1 hour
// For cars
// First 6 hours ₹ 25
// After 6 hours ₹5 for per 1 hour


import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;

class VehicleParkingInvoice {
    private String vehicleNumber;
    private String vehicleType;
    private LocalTime entryTime;
    private LocalTime exitTime;
    private double feeAmount;

    // Constructor
    public VehicleParkingInvoice(String vehicleNumber, String vehicleType, LocalTime entryTime, LocalTime exitTime) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.feeAmount = calculateFee();
    }

    // Method to calculate parking fee based on vehicle type and duration
    private double calculateFee() {
        long totalMinutes = Duration.between(entryTime, exitTime).toMinutes();
        double totalHours = Math.ceil(totalMinutes / 60.0); // Convert minutes to hours and round up

        double fee = 0;

        if (vehicleType.equalsIgnoreCase("bike")) {
            if (totalHours <= 6) {
                fee = 15;
            } else {
                fee = 15 + (totalHours - 6) * 2;
            }
        } else if (vehicleType.equalsIgnoreCase("car")) {
            if (totalHours <= 6) {
                fee = 25;
            } else {
                fee = 25 + (totalHours - 6) * 5;
            }
        } else {
            System.out.println("Invalid vehicle type!");
        }

        return fee;
    }

    // Method to display invoice details
    public void displayInvoice() {
        System.out.println("\n---- Vehicle Parking Invoice ----");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.println("Total Fee Amount: ₹" + feeAmount);
    }
}

// Main class to test VehicleParkingInvoice
public class ParkingInvoiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get vehicle details from user
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Type (bike/car): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Entry Time (HH:mm): ");
        String entryTimeStr = sc.nextLine();
        LocalTime entryTime = LocalTime.parse(entryTimeStr);

        System.out.print("Enter Exit Time (HH:mm): ");
        String exitTimeStr = sc.nextLine();
        LocalTime exitTime = LocalTime.parse(exitTimeStr);

        // Create VehicleParkingInvoice object
        VehicleParkingInvoice invoice = new VehicleParkingInvoice(vehicleNumber, vehicleType, entryTime, exitTime);

        // Display invoice details
        invoice.displayInvoice();

        sc.close();
    }
}




// OUTPUT :
// Enter Vehicle Number: TN01AB1234
// Enter Vehicle Type (bike/car): bike
// Enter Entry Time (HH:mm): 09:00
// Enter Exit Time (HH:mm): 17:00

// ---- Vehicle Parking Invoice ----
// Vehicle Number: TN01AB1234
// Vehicle Type: bike
// Entry Time: 09:00
// Exit Time: 17:00
// Total Fee Amount: ₹19.0
