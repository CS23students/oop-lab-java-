// 11-a Java Program to Copy Contents from One File to Another

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Reading source file from user input
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the source file path: ");
            String sourceFile = inputReader.readLine();
            System.out.print("Enter the destination file path: ");
            String destFile = inputReader.readLine();

            // Open source file for reading
            reader = new BufferedReader(new FileReader(sourceFile));

            // Open destination file for writing
            writer = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line after each line copied
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}