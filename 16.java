// 16. Using generic class perform the following operation on an array
// 1.add element at beginning/middle/end.
// 2.delete an element at the given position.

import java.util.ArrayList;
import java.util.Scanner;

// Generic class for Array Operations
class ArrayOperations<T> {
    private ArrayList<T> array;

    // Constructor to initialize the array list
    public ArrayOperations() {
        array = new ArrayList<>();
    }

    // Method to add element at a specific position
    public void addElement(T element, int position) {
        if (position < 0 || position > array.size()) {
            System.out.println("Invalid position!");
        } else {
            array.add(position, element);
            System.out.println("Element added at position " + position);
        }
    }

    // Method to delete an element at a specific position
    public void deleteElement(int position) {
        if (position < 0 || position >= array.size()) {
            System.out.println("Invalid position!");
        } else {
            array.remove(position);
            System.out.println("Element removed from position " + position);
        }
    }

    // Method to display the array
    public void displayArray() {
        if (array.isEmpty()) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Current Array: " + array);
        }
    }
}

public class GenericArrayOperations {
    public static void main(String[] args) {
        ArrayOperations<Integer> arrayOps = new ArrayOperations<>();
        Scanner sc = new Scanner(System.in);

            System.out.println("1. Add Element at Beginning");
            System.out.println("2. Add Element in Middle");
            System.out.println("3. Add Element at End");
            System.out.println("4. Delete Element");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");

        while (true) {
            System.out.println("\nChoose an operation:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add element at the beginning
                    System.out.println("Enter element to add:");
                    int element1 = sc.nextInt();
                    arrayOps.addElement(element1, 0);
                    break;

                case 2: // Add element in the middle
                    System.out.println("Enter element to add:");
                    int element2 = sc.nextInt();
                    int middle = arrayOps.size() / 2;
                    arrayOps.addElement(element2, middle);
                    break;

                case 3: // Add element at the end
                    System.out.println("Enter element to add:");
                    int element3 = sc.nextInt();
                    arrayOps.addElement(element3, arrayOps.size());
                    break;

                case 4: // Delete an element
                    System.out.println("Enter position to delete:");
                    int position = sc.nextInt();
                    arrayOps.deleteElement(position);
                    break;

                case 5: // Display the array
                    arrayOps.displayArray();
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}



// OUTPUT:
// Choose an operation:
// 1. Add Element at Beginning
// 2. Add Element in Middle
// 3. Add Element at End
// 4. Delete Element
// 5. Display Array
// 6. Exit
// 1
// Enter element to add:
// 10
// Element added at position 0

// Choose an operation:
// 5
// Current Array: [10]

