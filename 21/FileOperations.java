//21. To write a java program to perform the following operation given by the users choice                                                     
// a.Reading the input of F1,F2 and display it in the console     
// b.concatenation of files (F1,F2)->F3

import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu for user choice
        System.out.println("Choose an option:");
        System.out.println("a. Read and display the contents of two files (F1 and F2).");
        System.out.println("b. Concatenate the contents of two files (F1 and F2) and write to F3.");
        System.out.print("Enter your choice (a/b): ");
        char choice = sc.next().charAt(0);

        sc.nextLine();  // Consume newline

        // Input file names from the user
        System.out.print("Enter the name of file F1: ");
        String file1 = sc.nextLine();
        System.out.print("Enter the name of file F2: ");
        String file2 = sc.nextLine();

        switch (choice) {
            case 'a':
                // Read and display the contents of F1 and F2
                System.out.println("\nContents of File F1:");
                readFileAndDisplay(file1);

                System.out.println("\nContents of File F2:");
                readFileAndDisplay(file2);
                break;

            case 'b':
                // Concatenate contents of F1 and F2 into F3
                System.out.print("Enter the name of file F3 (to store concatenated data): ");
                String file3 = sc.nextLine();
                concatenateFiles(file1, file2, file3);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // Method to read and display the contents of a file
    public static void readFileAndDisplay(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName + ": " + e.getMessage());
        }
    }

    // Method to concatenate two files and write to a third file
    public static void concatenateFiles(String file1, String file2, String file3) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file3))) {
            // Read and write contents of file1
            writeFileContents(file1, bw);

            // Read and write contents of file2
            writeFileContents(file2, bw);

            System.out.println("Contents of " + file1 + " and " + file2 + " have been concatenated into " + file3);
        } catch (IOException e) {
            System.out.println("Error writing to file " + file3 + ": " + e.getMessage());
        }
    }

    // Helper method to write file contents to a BufferedWriter
    public static void writeFileContents(String fileName, BufferedWriter bw) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        }
    }
}