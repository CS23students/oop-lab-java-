// 1. Create java application to create three thread to do the operations 1. Get N numbers 2. Find the minimum 3. Find the maximum

import java.util.Scanner;

class NumberGenerator extends Thread {
    int[] numbers;

    public NumberGenerator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class FindMinimum extends Thread {
    int[] numbers;

    public FindMinimum(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum: " + min);
    }
}

class FindMaximum extends Thread {
    int[] numbers;

    public FindMaximum(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        NumberGenerator generator = new NumberGenerator(numbers);
        FindMinimum minThread = new FindMinimum(numbers);
        FindMaximum maxThread = new FindMaximum(numbers);

        generator.start();
        minThread.start();
        maxThread.start();
    }
}


// OUTPUT :
// Enter the number of elements: 
// 3
// Enter the numbers: 
// 10 20 30
// Numbers: Minimum: 10
// Maximum: 30
// 10 20 30
