// 47. b)Write a Java program to convert days into months and days.
//  Take the total number of days as input and display the result as "X months and Y days".


import java.util.Scanner;

public class DaysToMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for total number of days
        System.out.print("Enter the total number of days: ");
        int totalDays = sc.nextInt();

        // Convert days to months and remaining days
        int months = totalDays / 30;  // Assuming 1 month = 30 days
        int days = totalDays % 30;

        // Display the result
        System.out.println(totalDays + " days is equal to " + months + " months and " + days + " days.");

        sc.close();
    }
}




// OUTPUT:
// Enter the total number of days: 75
// 75 days is equal to 2 months and 15 days.
