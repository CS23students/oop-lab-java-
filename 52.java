//52. Create a superclass Vehicle with methods getConsumption() and displayConsumption().
// Derive two subclasses, TwoWheeler and FourWheeler, with methods maintenance() to display maintenance and average() to display average.

// Superclass Vehicle
class Vehicle {
    private double fuelConsumed; // Fuel consumed in liters
    private double distanceCovered; // Distance covered in kilometers

    // Constructor to initialize fuel consumption and distance
    public Vehicle(double fuelConsumed, double distanceCovered) {
        this.fuelConsumed = fuelConsumed;
        this.distanceCovered = distanceCovered;
    }

    // Method to calculate and return fuel consumption (km per liter)
    public double getConsumption() {
        if (fuelConsumed == 0) {
            return 0;
        }
        return distanceCovered / fuelConsumed;
    }

    // Method to display the fuel consumption
    public void displayConsumption() {
        double consumption = getConsumption();
        if (consumption == 0) {
            System.out.println("Fuel consumption cannot be calculated.");
        } else {
            System.out.println("Fuel consumption: " + consumption + " km/l");
        }
    }
}

// Subclass TwoWheeler
class TwoWheeler extends Vehicle {
    public TwoWheeler(double fuelConsumed, double distanceCovered) {
        super(fuelConsumed, distanceCovered);
    }

    // Method to display maintenance information for TwoWheeler
    public void maintenance() {
        System.out.println("TwoWheeler requires basic maintenance every 3000 km.");
    }

    // Method to display average mileage for TwoWheeler
    public void average() {
        System.out.println("Average mileage of TwoWheeler: 45-60 km/l.");
    }
}

// Subclass FourWheeler
class FourWheeler extends Vehicle {
    public FourWheeler(double fuelConsumed, double distanceCovered) {
        super(fuelConsumed, distanceCovered);
    }

    // Method to display maintenance information for FourWheeler
    public void maintenance() {
        System.out.println("FourWheeler requires maintenance every 5000 km.");
    }

    // Method to display average mileage for FourWheeler
    public void average() {
        System.out.println("Average mileage of FourWheeler: 10-15 km/l.");
    }
}

// Main class to test the program
public class VehicleTest {
    public static void main(String[] args) {
        // Creating a TwoWheeler object
        TwoWheeler bike = new TwoWheeler(5, 200); // 5 liters of fuel for 200 km
        System.out.println("TwoWheeler:");
        bike.displayConsumption();
        bike.maintenance();
        bike.average();

        System.out.println();

        // Creating a FourWheeler object
        FourWheeler car = new FourWheeler(20, 300); // 20 liters of fuel for 300 km
        System.out.println("FourWheeler:");
        car.displayConsumption();
        car.maintenance();
        car.average();
    }
}



// OUTPUT:
// TwoWheeler:
// Fuel consumption: 40.0 km/l
// TwoWheeler requires basic maintenance every 3000 km.
// Average mileage of TwoWheeler: 45-60 km/l.

// FourWheeler:
// Fuel consumption: 15.0 km/l
// FourWheeler requires maintenance every 5000 km.
// Average mileage of FourWheeler: 10-15 km/l.
