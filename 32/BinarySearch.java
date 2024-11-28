//32. ii)binary search


import java.util.Scanner;

public class BinarySearch {

    // Method to perform Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller, search in the left half
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, search in the right half
            else {
                low = mid + 1;
            }
        }

        // If target is not present
        return -1;
    }

    // Method to sort the array using Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // One by one move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declaring and populating the array
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array using Selection Sort
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reading target value to search for
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();

        // Performing binary search
        int result = binarySearch(arr, target);

        // Displaying the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}


//Enter the number of elements: 5
//Enter the elements:
//30
//20
//10
//50
//40
//Sorted array: 
//10 20 30 40 50 

//Enter the value to search: 30
//Element found at index: 2
