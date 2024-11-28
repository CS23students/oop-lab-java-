//33. To develop a application for currency covertor (Dollar to INR,EURO to INR,Yen to INR)using packages


import  currencyconverter.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options for the user
        System.out.println("Currency Converter");
        System.out.println("1. Dollar to INR");
        System.out.println("2. Euro to INR");
        System.out.println("3. Yen to INR");
        System.out.print("Select the currency to convert: ");
        int choice = scanner.nextInt();

        // Input amount to be converted
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Create objects for conversion
        double result = 0;
        switch (choice) {
            case 1:
                DollarToINR dollarConverter = new DollarToINR();
                result = dollarConverter.convert(amount);
                System.out.println(amount + " Dollars is equal to " + result + " INR");
                break;
            case 2:
                EuroToINR euroConverter = new EuroToINR();
                result = euroConverter.convert(amount);
                System.out.println(amount + " Euros is equal to " + result + " INR");
                break;
            case 3:
                YenToINR yenConverter = new YenToINR();
                result = yenConverter.convert(amount);
                System.out.println(amount + " Yen is equal to " + result + " INR");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}



//Currency Converter
//1. Dollar to INR
//2. Euro to INR
//3. Yen to INR
//Select the currency to convert: 1
//Enter the amount to convert: 10000
//10000.0 Dollars is equal to 826000.0 INR