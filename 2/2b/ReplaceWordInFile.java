import java.io.*;
import java.util.Scanner;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the file name and words from the user
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.println("Enter the word to be replaced (WORD1): ");
        String word1 = scanner.nextLine();

        System.out.println("Enter the replacement word (WORD2): ");
        String word2 = scanner.nextLine();

        try {
            // Read the file and store its content in a String
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                // Count occurrences of WORD1 in the line
                int lineCount = (line.length() - line.replace(word1, "").length()) / word1.length();
                count += lineCount;

                // Replace WORD1 with WORD2 in the current line
                line = line.replace(word1, word2);
                content.append(line).append("\n");
            }
            reader.close();

            // Write the updated content back to the same file
            FileWriter writer = new FileWriter(fileName);
            writer.write(content.toString());
            writer.close();

            System.out.println("Number of replacements: " + count);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}