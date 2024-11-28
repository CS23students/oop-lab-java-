//30-b linear search

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Get the array elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Get the element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform linear search
        int index = linearSearch(array, key);

        // Display the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Return the index if element is found
            }
        }
        return -1;  // Return -1 if element is not found
    }
}




// OUTPUT:
// Enter the number of elements: 5
// Enter the elements:
// 10 20 30 40 50
// Enter the element to search: 30
// Element found at index: 2
