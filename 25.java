//25. Find the smallest element in the array by creating a one dimensional and a two dimensional with a new operator

import java.util.Scanner;

public class SmallestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // One-dimensional array
        System.out.print("Enter the size of the one-dimensional array: ");
        int size1D = sc.nextInt();
        int[] oneDArray = new int[size1D];
        System.out.println("Enter " + size1D + " elements for the one-dimensional array:");
        for (int i = 0; i < size1D; i++) {
            oneDArray[i] = sc.nextInt();
        }
        int smallest1D = findSmallestIn1D(oneDArray);
        System.out.println("Smallest element in the one-dimensional array: " + smallest1D);

        // Two-dimensional array
        System.out.print("\nEnter the number of rows for the two-dimensional array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the two-dimensional array: ");
        int cols = sc.nextInt();
        int[][] twoDArray = new int[rows][cols];
        System.out.println("Enter elements for the two-dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }
        int smallest2D = findSmallestIn2D(twoDArray);
        System.out.println("Smallest element in the two-dimensional array: " + smallest2D);

        sc.close();
    }

    // Method to find the smallest element in a one-dimensional array
    public static int findSmallestIn1D(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    // Method to find the smallest element in a two-dimensional array
    public static int findSmallestIn2D(int[][] array) {
        int smallest = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < smallest) {
                    smallest = array[i][j];
                }
            }
        }
        return smallest;
    }
}



// OUTPUT:
// Enter the size of the one-dimensional array: 5
// Enter 5 elements for the one-dimensional array:
// 12 45 7 34 56
// Smallest element in the one-dimensional array: 7

// Enter the number of rows for the two-dimensional array: 2
// Enter the number of columns for the two-dimensional array: 3
// Enter elements for the two-dimensional array:
// 15 28 6
// 33 5 18
// Smallest element in the two-dimensional array: 5
