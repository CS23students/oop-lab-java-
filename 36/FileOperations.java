//36. To write a java pro-gram to do the following operations on  file based on user choice
//1.Reading an input from the file(f1) and display it in console
//2.Read an input from the program itself and write it in the file(f2)


import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu for the user to select an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Read input from file (f1) and display it.");
        System.out.println("2. Write input from user to file (f2).");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        switch (choice) {
            case 1:
                // Read from file f1 and display it in the console
                readFromFile();
                break;
            case 2:
                // Write user input to file f2
                writeToFile();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        scanner.close();
    }

    // Method to read from file and display contents in console
    public static void readFromFile() {
        // Name of the file to read from
        String fileName = "f1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Display each line from the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }

    // Method to write user input to a file
    public static void writeToFile() {
        // Name of the file to write to
        String fileName = "f2.txt";
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to write to the file (f2):");
        String userInput = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(userInput);  // Write the user input to the file
            writer.newLine();  // Add a newline after the input
            System.out.println("Text has been written to the file (f2).");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}





//Choose an operation:
//1. Read input from file (f1) and display it.
//2. Write input from user to file (f2).
//Enter your choice (1 or 2): 1
//hello world this is java programming
//we are the programers
//thank you!!
