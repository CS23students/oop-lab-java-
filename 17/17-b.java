//17-B) Write a Java program to read from an input file and convert the words to lower case and write it in another file.

import java.io.*;

public class FileConverter {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Create input and output streams
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Convert each line to lowercase and write it to the output file
                writer.write(line.toLowerCase());
                writer.newLine(); // Add a new line in the output file
            }

            System.out.println("Content converted to lowercase and written to output.txt.");
        } catch (IOException e) {
            System.out.println("Error while reading or writing files: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing file resources: " + e.getMessage());
            }
        }
    }
}

