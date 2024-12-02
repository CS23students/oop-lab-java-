//12-b) Write a java program to  find the maximum value of the give data types using generic //function

public class GenericMaxFinder {

    // Generic function to find the maximum value
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Finding maximum for Integer array
        Integer[] intArray = {10, 25, 3, 50, 7};
        System.out.println("Maximum Integer value: " + findMax(intArray));

        // Finding maximum for Double array
        Double[] doubleArray = {2.5, 7.8, 1.3, 9.4, 5.6};
        System.out.println("Maximum Double value: " + findMax(doubleArray));

        // Finding maximum for String array (based on lexicographical order)
        String[] stringArray = {"Apple", "Orange", "Banana", "Peach", "Mango"};
        System.out.println("Maximum String value: " + findMax(stringArray));
    }
}


// OUTPUT:
// Maximum Integer value: 50
// Maximum Double value: 9.4
// Maximum String value: Peach



// OUTPUT:
// Maximum of 3, 7, 5 (int): 7  
// Maximum of 3.5, 2.1, 4.8 (double): 4.8

