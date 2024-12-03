// 51. To develop an application to implement length converter(meter, miles and vice versa to km)


import java.util.Scanner;

public class LengthConverter {
    
    // Method to convert meters to kilometers
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    // Method to convert kilometers to meters
    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    // Method to convert miles to kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Method to convert kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length Converter Application");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("4. Kilometers to Miles");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            double value, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter length in meters: ");
                    value = sc.nextDouble();
                    result = metersToKilometers(value);
                    System.out.println("Length in kilometers: " + result + " km");
                    break;
                case 2:
                    System.out.print("Enter length in kilometers: ");
                    value = sc.nextDouble();
                    result = kilometersToMeters(value);
                    System.out.println("Length in meters: " + result + " m");
                    break;
                case 3:
                    System.out.print("Enter length in miles: ");
                    value = sc.nextDouble();
                    result = milesToKilometers(value);
                    System.out.println("Length in kilometers: " + result + " km");
                    break;
                case 4:
                    System.out.print("Enter length in kilometers: ");
                    value = sc.nextDouble();
                    result = kilometersToMiles(value);
                    System.out.println("Length in miles: " + result + " miles");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 5);

        sc.close();
    }
}



// OUTPUT:
// Length Converter Application
// 1. Meters to Kilometers
// 2. Kilometers to Meters
// 3. Miles to Kilometers
// 4. Kilometers to Miles
// 5. Exit

// Enter your choice: 1
// Enter length in meters: 1000
// Length in kilometers: 1.0 km

// Enter your choice: 3
// Enter length in miles: 5
// Length in kilometers: 8.0467 km

// Enter your choice: 5
// Exiting...
