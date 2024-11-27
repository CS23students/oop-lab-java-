// 17-A) Write a Java program to demonstrate that as a high-priority thread executes, it will delay the execution of all lower-prioity threads.

class HighPriorityThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("High Priority Thread - Step " + i);
                Thread.sleep(1000); // Simulate work
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class LowPriorityThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Low Priority Thread - Step " + i);
                Thread.sleep(1000); // Simulate work
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        HighPriorityThread highPriorityThread = new HighPriorityThread();
        LowPriorityThread lowPriorityThread = new LowPriorityThread();

        // Set thread priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // High priority
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // Low priority

        // Start threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}



// OUTPUT
// High Priority Thread - Step 1
// High Priority Thread - Step 2
// High Priority Thread - Step 3
// High Priority Thread - Step 4
// High Priority Thread - Step 5
// Low Priority Thread - Step 1
// Low Priority Thread - Step 2
// Low Priority Thread - Step 3
// Low Priority Thread - Step 4
// Low Priority Thread - Step 5




// Low Priority Thread - Step 1
// High Priority Thread - Step 1
// High Priority Thread - Step 2
// Low Priority Thread - Step 2
// High Priority Thread - Step 3
// Low Priority Thread - Step 3
// High Priority Thread - Step 4
// Low Priority Thread - Step 4
// High Priority Thread - Step 5
// Low Priority Thread - Step 5
