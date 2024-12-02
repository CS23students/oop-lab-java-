//19. Create an interface vehicle with getcolor(),getnumber(),getconsumption()methods.calculate the fuel consumption of vehicle,name and color of two-wheeler and four wheeler implement the vehicle interface

// Interface Vehicle
interface Vehicle {
    String getColor();           // Method to get the color of the vehicle
    String getNumber();          // Method to get the vehicle number
    double getConsumption();     // Method to calculate fuel consumption
}

// TwoWheeler Class implementing Vehicle
class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double distance;     // Distance traveled (in km)
    private double fuelUsed;     // Fuel used (in liters)

    // Constructor
    public TwoWheeler(String color, String number, double distance, double fuelUsed) {
        this.color = color;
        this.number = number;
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return distance / fuelUsed;  // Return fuel consumption (km per liter)
    }
}

// FourWheeler Class implementing Vehicle
class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double distance;     // Distance traveled (in km)
    private double fuelUsed;     // Fuel used (in liters)

    // Constructor
    public FourWheeler(String color, String number, double distance, double fuelUsed) {
        this.color = color;
        this.number = number;
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return distance / fuelUsed;  // Return fuel consumption (km per liter)
    }
}

// Main Class to Test
public class VehicleTest {
    public static void main(String[] args) {
        // Creating a Two-Wheeler instance
        TwoWheeler bike = new TwoWheeler("Red", "TN45-B1234", 150, 5);
        System.out.println("Two-Wheeler Details:");
        System.out.println("Color: " + bike.getColor());
        System.out.println("Number: " + bike.getNumber());
        System.out.println("Fuel Consumption: " + bike.getConsumption() + " km/l");

        // Creating a Four-Wheeler instance
        FourWheeler car = new FourWheeler("Blue", "TN01-C5678", 400, 25);
        System.out.println("\nFour-Wheeler Details:");
        System.out.println("Color: " + car.getColor());
        System.out.println("Number: " + car.getNumber());
        System.out.println("Fuel Consumption: " + car.getConsumption() + " km/l");
    }
}



// OUTPUT
// Two-Wheeler Details:
// Color: Red
// Number: TN45-B1234
// Fuel Consumption: 30.0 km/l

// Four-Wheeler Details:
// Color: Blue
// Number: TN01-C5678
// Fuel Consumption: 16.0 km/l

