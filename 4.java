//4. Write a java program for    i)NullPointerException   ii)StringIndexOutOfBoundsException   iii) FileNotFoundException  iv) InputMismatchException

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. NullPointerException
        try {
            String str = null;
            System.out.println("Length of the string: " + str.length());  // Accessing length on null object
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // 2. StringIndexOutOfBoundsException
        try {
            String str = "Java";
            System.out.println("Character at index 5: " + str.charAt(5));  // Accessing invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 3. FileNotFoundException
        try {
            File file = new File("non_existent_file.txt");
            Scanner fileScanner = new Scanner(file);  // File does not exist
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }

        // 4. InputMismatchException
        try {
            System.out.println("Enter an integer:");
            int number = sc.nextInt();  // Entering non-integer will trigger exception
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}



// SAMPLE OUTPUT: 
// i) NullPointerException caught: Cannot invoke "String.length()" because "str" is null
// ii)StringIndexOutOfBoundsException caught: String index out of range: 5
// iii)FileNotFoundException caught: non_existent_file.txt (No such file or directory)
// Enter an integer:
// abc
// iv) InputMismatchException caught: For input string: "abc"

