//31.  To write a java program to perform the following operations based upon user input 
//a) Reading input from a file 
//B)Display number  Of characters lines and words in text file



import java.io.*;
import java.util.Scanner;

public class FileAnalysis {

    // Method to read the file and count characters, lines, and words
    public static void analyzeFile(String filePath) {
        // Variables to count lines, words, and characters
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read line by line
            while ((line = br.readLine()) != null) {
                lineCount++;  // Increment line count
                charCount += line.length();  // Count characters in the line
                
                // Split the line into words and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            // Display the results
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Call the method to analyze the file
        analyzeFile(filePath);

        // Close the scanner
        scanner.close();
    }
}









//Enter the file path: file1.txt
//Number of lines: 3
//Number of words: 8
//Number of characters: 40