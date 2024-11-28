//40.a To Develop a  stack using class and objects


import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, cannot push item.");
        } else {
            stackArray[++top] = item;
            System.out.println("Pushed: " + item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop item.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = sc.nextInt();
        Stack stack = new Stack(capacity);

        // Display menu once
        System.out.println("\nStack Operations:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display Stack");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    System.out.println("Popped: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top element: " + stack.peek());
                    break;
                case 4:
                    stack.display();
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



//Enter the capacity of the stack: 5

//Stack Operations:
//1. Push
//2. Pop
//3. Peek
//4. Display Stack
//5. Exit

//Enter your choice: 1
//Enter the element to push: 10
//Pushed: 10

//Enter your choice: 1
//Enter the element to push: 20
//Pushed: 20

//Enter your choice: 4
//Stack contents:
//10 20 

//Enter your choice: 2
//Popped: 20

//Enter your choice: 5
//Exiting...