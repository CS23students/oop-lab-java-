//27. Write a java programe using four threads and get input from user
//  1-print N numbers
// 2- print prime number 
// 3- print a number is divisible by 5 or not
// 4-print average


import java.util.Scanner;

public class MultiThreadedApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array and elements from the user
        System.out.print("Enter the number of elements (N): ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Creating and starting the threads
        Thread printNumbersThread = new Thread(new PrintNumbers(numbers));
        Thread primeNumbersThread = new Thread(new PrintPrimeNumbers(numbers));
        Thread divisibleBy5Thread = new Thread(new CheckDivisibleBy5(numbers));
        Thread averageThread = new Thread(new CalculateAverage(numbers));

        printNumbersThread.start();
        primeNumbersThread.start();
        divisibleBy5Thread.start();
        averageThread.start();
    }
}

// Thread to print all numbers
class PrintNumbers implements Runnable {
    private int[] numbers;

    public PrintNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("\n1. Printing all numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

// Thread to print prime numbers
class PrintPrimeNumbers implements Runnable {
    private int[] numbers;

    public PrintPrimeNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("\n2. Prime numbers are:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Thread to check if numbers are divisible by 5
class CheckDivisibleBy5 implements Runnable {
    private int[] numbers;

    public CheckDivisibleBy5(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("\n3. Numbers divisible by 5:");
        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}

// Thread to calculate and print the average
class CalculateAverage implements Runnable {
    private int[] numbers;

    public CalculateAverage(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("\n4. Average of the numbers: " + average);
    }
}




// OUTPUT:
// Enter the number of elements (N): 5
// Enter 5 numbers:
// 10
// 13
// 25
// 7
// 45

// 1. Printing all numbers:
// 10 13 25 7 45 

// 2. Prime numbers are:
// 13 7 

// 3. Numbers divisible by 5:
// 10 25 45 

// 4. Average of the numbers: 20.0
