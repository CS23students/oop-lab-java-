//7. Java program for implementation of a) Sequential search   b) Binary search.      #Input array is given

import java.util.Arrays;
import java.util.Scanner;

public class SearchProgram {

    // Method to perform Sequential Search
    public static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Return index if key is found
            }
        }
        return -1;  // Return -1 if key is not found
    }

    // Method to perform Binary Search (Array must be sorted)
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;  // Return index if key is found
            } else if (array[mid] < key) {
                left = mid + 1;  // Search the right half
            } else {
                right = mid - 1;  // Search the left half
            }
        }
        return -1;  // Return -1 if key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();

        // Display menu for search options
        System.out.println("Choose search method:");
        System.out.println("1. Sequential Search");
        System.out.println("2. Binary Search");
        int choice = sc.nextInt();

        int result = -1;
        switch (choice) {
            case 1:
                result = sequentialSearch(array, key);
                break;
            case 2:
                // Sort the array for Binary Search
                Arrays.sort(array);
                System.out.println("Sorted Array: " + Arrays.toString(array));
                result = binarySearch(array, key);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Display result
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}



// OUTPUT :
// Enter the size of the array: 
// 5
// Enter the elements of the array: 
// 4 2 8 6 1
// Enter the key to search: 
// 6
// Choose search method:
// 1. Sequential Search
// 2. Binary Search
// 1
// Key found at index: 3
// Choose search method:
// 1. Sequential Search
// 2. Binary Search
// 2
// Sorted Array: [1, 2, 4, 6, 8]
// Key found at index: 3

