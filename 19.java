//19. Create an interface vehicle with getcolor(),getnumber(),getconsumption()methods.calculate the fuel consumption of vehicle,name and color of two-wheeler and four wheeler implement the vehicle interface

// Vehicle Interface
interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption(); // Method to calculate fuel consumption
}

// TwoWheeler Class implementing Vehicle Interface
class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double fuelConsumption; // in km per liter

    public TwoWheeler(String color, String number, double fuelConsumption) {
        this.color = color;
        this.number = number;
        this.fuelConsumption = fuelConsumption;
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
        return fuelConsumption; // Returns fuel consumption in km/liter
    }
}

// FourWheeler Class implementing Vehicle Interface
class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double fuelConsumption; // in km per liter

    public FourWheeler(String color, String number, double fuelConsumption) {
        this.color = color;
        this.number = number;
        this.fuelConsumption = fuelConsumption;
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
        return fuelConsumption; // Returns fuel consumption in km/liter
    }
}

// Main Class to test the implementation
public class VehicleTest {
    public static void main(String[] args) {
        // Create a TwoWheeler object
        Vehicle bike = new TwoWheeler("Red", "BIKE123", 40.0);
        System.out.println("Two-Wheeler Details:");
        System.out.println("Color: " + bike.getColor());
        System.out.println("Number: " + bike.getNumber());
        System.out.println("Fuel Consumption: " + bike.getConsumption() + " km/l");

        // Create a FourWheeler object
        Vehicle car = new FourWheeler("Blue", "CAR456", 15.0);
        System.out.println("\nFour-Wheeler Details:");
        System.out.println("Color: " + car.getColor());
        System.out.println("Number: " + car.getNumber());
        System.out.println("Fuel Consumption: " + car.getConsumption() + " km/l");
    }
}


// OUTPUT
// Two-Wheeler Details:
// Color: Red
// Number: BIKE123
// Fuel Consumption: 40.0 km/l

// Four-Wheeler Details:
// Color: Blue
// Number: CAR456
// Fuel Consumption: 15.0 km/l
