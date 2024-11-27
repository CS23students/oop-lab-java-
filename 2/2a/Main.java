// 2-a. Replace the 'WORD1' by 'WORD2' in file 1 and write the output to file 2 and display the no. Of replacement.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for file names and words
        System.out.println("Enter the input file name (File 1): ");// input.txt  (include .txt while enter file name)
        String inputFile = scanner.nextLine();

        System.out.println("Enter the output file name (File 2): ");// output.txt  (include .txt while enter file name)
        String outputFile = scanner.nextLine();

        System.out.println("Enter the word to be replaced (WORD1): ");
        String word1 = scanner.nextLine();

        System.out.println("Enter the replacement word (WORD2): ");
        String word2 = scanner.nextLine();

        try {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(outputFile);

            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String replacedLine = line.replace(word1, word2);
                fw.write(replacedLine + "\n");

                // Count the number of replacements in the current line
                count += (line.length() - line.replace(word1, "").length()) / word1.length();
            }

            br.close();
            fw.close();

            System.out.println("Number of replacements: " + count);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
