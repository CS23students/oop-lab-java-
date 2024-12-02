//20. Queue operation using interface

import java.util.Scanner;

// Queue Interface
interface Queue {
    void enqueue(int item);  // Method to add an item to the queue
    int dequeue();           // Method to remove an item from the queue
    int peek();              // Method to get the front item of the queue
    boolean isEmpty();       // Method to check if the queue is empty
    int size();              // Method to get the size of the queue
    void display();          // Method to display all elements of the queue
}

// Queue Implementation using a simple array (Linear Queue)
class QueueImplementation implements Queue {
    private int[] queueArray;  // Array to hold queue elements
    private int front, rear, capacity;

    public QueueImplementation(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    // Enqueue operation to add an element at the rear of the queue
    @Override
    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        queueArray[++rear] = item;
        System.out.println("Enqueued: " + item);
    }

    // Dequeue operation to remove an element from the front of the queue
    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;  // Returning -1 for empty queue
        }
        int item = queueArray[front++];
        return item;
    }

    // Peek operation to get the front element of the queue
    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;  // Returning -1 for empty queue
        }
        return queueArray[front];
    }

    // Check if the queue is empty
    @Override
    public boolean isEmpty() {
        return front > rear;
    }

    // Get the size of the queue
    @Override
    public int size() {
        return rear - front + 1;
    }

    // Display all elements of the queue
    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test Queue operations
public class QueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Set a fixed queue size
        int capacity = 5;
        Queue queue = new QueueImplementation(capacity);

        // Display the queue operations menu only once
        System.out.println("Queue Operations:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Display all elements");
        System.out.println("5. Exit");

        // Menu for user input
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Enqueue operation
                    System.out.print("Enter the element to enqueue: ");
                    int item = sc.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    // Dequeue operation
                    int dequeuedItem = queue.dequeue();
                    if (dequeuedItem != -1) {
                        System.out.println("Dequeued: " + dequeuedItem);
                    }
                    break;
                case 3:
                    // Peek operation
                    int frontItem = queue.peek();
                    if (frontItem != -1) {
                        System.out.println("Front of the queue: " + frontItem);
                    }
                    break;
                case 4:
                    // Display all elements in the queue
                    queue.display();
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}




// OUTPUT:
// Queue Operations:
// 1. Enqueue
// 2. Dequeue
// 3. Peek
// 4. Display all elements
// 5. Exit
// Enter your choice: 1
// Enter the element to enqueue: 10
// Enqueued: 10

// Enter your choice: 1
// Enter the element to enqueue: 20
// Enqueued: 20

// Enter your choice: 4
// Queue elements: 10 20 

// Enter your choice: 2
// Dequeued: 10

// Enter your choice: 4
// Queue elements: 20 

// Enter your choice: 5
// Exiting...
