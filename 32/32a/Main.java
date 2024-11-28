import temperatureconversion.TemperatureConverter;  // Import the package

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu for user selection
        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature, result;

        // Handling the user choice
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                result = TemperatureConverter.celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius is equal to " + result + " Fahrenheit.");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                result = TemperatureConverter.fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit is equal to " + result + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}