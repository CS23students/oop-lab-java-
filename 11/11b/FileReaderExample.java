// 11-b) Java Program to Read a File from the User and Display its Contents

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Reading file name from user input
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file path to read: ");
            String filePath = inputReader.readLine();

            // Open file for reading
            reader = new BufferedReader(new FileReader(filePath));

            String line;
            System.out.println("\nContents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

sample output 
-------------


Contents of the file:
hello world
object oriented programming
