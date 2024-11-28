//40.b To develop a queue using class and objects



import java.util.Scanner;

class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full, cannot enqueue item.");
        } else {
            queueArray[++rear] = item;
            System.out.println("Enqueued: " + item);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue item.");
            return -1;
        } else {
            return queueArray[front++];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public int size() {
        return rear - front + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue contents:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = sc.nextInt();
        Queue queue = new Queue(capacity);

        // Display menu once
        System.out.println("\nQueue Operations:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Display Queue");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int item = sc.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    System.out.println("Dequeued: " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Front element: " + queue.peek());
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}



//Enter the capacity of the queue: 5

//Queue Operations:
//1. Enqueue
//2. Dequeue
//3. Peek
//4. Display Queue
//5. Exit

//Enter your choice: 1
//Enter the element to enqueue: 5
//Enqueued: 5

//Enter your choice: 1
//Enter the element to enqueue: 8
//Enqueued: 8

//Enter your choice: 1
//Enter the element to enqueue: 9
//Enqueued: 9

//Enter your choice: 1
//Enter the element to enqueue: 3
//Enqueued: 3

//Enter your choice: 2
//Dequeued: 5

//Enter your choice: 3
//Front element: 8

//Enter your choice: 4
//Queue contents:
//8 9 3

//Enter your choice: 5
//Exiting...