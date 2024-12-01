//48. write a java program including generic class method  1.Print odd numbers
// 2.To rearrange two elements of a range in his position 
// 3.To find maximum element in a array 
// 4.To find minimum element in a array(must include generic class these 4)

import java.util.Scanner;

class GenericOperations<T> {
    private T[] array;

    public GenericOperations(T[] array) {
        this.array = array;
    }

    // Method to print odd numbers (for Integer type)
    public void printOddNumbers() {
        System.out.print("Odd numbers in the array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer && ((Integer) array[i]) % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // Method to swap two elements in the array
    public void swapElements(int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Invalid indices! Cannot swap.");
        }
    }

    // Method to find the maximum element (for Integer type)
    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] instanceof Integer && (Integer) array[i] > (Integer) max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to find the minimum element (for Integer type)
    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] instanceof Integer && (Integer) array[i] < (Integer) min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method to display the array
    public void displayArray() {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class GenericOperationsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the array of integers
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        Integer[] array = new Integer[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        GenericOperations<Integer> operations = new GenericOperations<>(array);

        // 1. Display the array
        System.out.println("\nOriginal Array:");
        operations.displayArray();

        // 2. Print Odd Numbers
        operations.printOddNumbers();

        // 3. Swap two elements
        System.out.print("Enter the first index to swap: ");
        int index1 = sc.nextInt();
        System.out.print("Enter the second index to swap: ");
        int index2 = sc.nextInt();
        operations.swapElements(index1, index2);
        System.out.println("Array after swapping:");
        operations.displayArray();

        // 4. Find the maximum element
        System.out.println("Maximum element in the array: " + operations.findMax());

        // 5. Find the minimum element
        System.out.println("Minimum element in the array: " + operations.findMin());

        sc.close();
    }
}




// OUTPUT:
// Enter the number of elements in the array: 5
// Enter the elements of the array:
// 10 15 8 3 7

// Original Array:
// Array: 10 15 8 3 7 

// Odd numbers in the array: 15 3 7 

// Enter the first index to swap: 1
// Enter the second index to swap: 3
// Array after swapping:
// Array: 10 3 8 15 7 

// Maximum element in the array: 15
// Minimum element in the array: 3
