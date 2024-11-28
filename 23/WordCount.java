import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Class to count words in a file
class WordCounter extends Thread {
    private String fileName;

    public WordCounter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");  // Split the line into words
                wordCount += words.length;
            }
            System.out.println("File: " + fileName + " | Word Count: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}

// Main class to read multiple files
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of files
        System.out.print("Enter the number of files: ");
        int numFiles = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input

        // Create an array to store file names
        String[] files = new String[numFiles];

        // Get file names from the user
        for (int i = 0; i < numFiles; i++) {
            System.out.print("Enter the name of file " + (i + 1) + ": ");
            files[i] = scanner.nextLine();
        }

        // Create and start a thread for each file
        for (String fileName : files) {
            WordCounter counter = new WordCounter(fileName);
            counter.start();
        }

        scanner.close();
    }
}