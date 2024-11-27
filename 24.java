//24. Create a java application of multi threaded using three threads one is generated a random number every 1 second ,
// if the value is even then second thread calculate the square of a number and
// print it and if the value is odd then calculate the cube of a number and print it

import java.util.Random;

// Thread to generate random numbers every second
class RandomNumberGenerator extends Thread {
    private final NumberProcessor numberProcessor;

    public RandomNumberGenerator(NumberProcessor numberProcessor) {
        this.numberProcessor = numberProcessor;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                // Generate a random integer between 0 and 99
                int randomNumber = random.nextInt(100);
                System.out.println("Generated number: " + randomNumber);
                numberProcessor.processNumber(randomNumber);
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Random number generator interrupted.");
            }
        }
    }
}

// Class to process the number
class NumberProcessor {
    public synchronized void processNumber(int number) {
        if (number % 2 == 0) {
            // If number is even, calculate square
            SquareCalculator squareCalculator = new SquareCalculator(number);
            squareCalculator.start();
        } else {
            // If number is odd, calculate cube
            CubeCalculator cubeCalculator = new CubeCalculator(number);
            cubeCalculator.start();
        }
    }
}

// Thread to calculate the square of a number
class SquareCalculator extends Thread {
    private final int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

// Thread to calculate the cube of a number
class CubeCalculator extends Thread {
    private final int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

// Main class to start the application
public class MultiThreadedRandomNumberApp {
    public static void main(String[] args) {
        NumberProcessor numberProcessor = new NumberProcessor();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(numberProcessor);
        randomNumberGenerator.start(); // Start the random number generator thread
    }
}



// OUTPUT: 
// Generated number: 45
// Cube of 45 is: 91125
// Generated number: 62
// Square of 62 is: 3844
// Generated number: 33
// Cube of 33 is: 35937
// Generated number: 28
// Square of 28 is: 784
// Generated number: 55
// Cube of 55 is: 166375

