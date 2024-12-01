//46. Create class A and class B. The class B should rethrow an exception to the class A. The class A should be called from the main class.


// Class A that calls Class B and handles the exception
class A {
    public void methodA() {
        try {
            // Creating an object of class B
            B b = new B();
            b.methodB();  // Call methodB() which throws an exception
        } catch (Exception e) {
            // Handling the rethrown exception
            System.out.println("Exception caught in Class A: " + e.getMessage());
        }
    }
}

// Class B that throws an exception and rethrows it
class B {
    public void methodB() throws Exception {
        try {
            // Simulating an exception
            throw new Exception("Exception thrown from Class B");
        } catch (Exception e) {
            System.out.println("Exception caught in Class B, rethrowing to Class A...");
            throw e;  // Rethrowing the exception
        }
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create an object of class A and call methodA
        A a = new A();
        a.methodA();
    }
}



// OUTPUT:
// Exception caught in Class B, rethrowing to Class A...
// Exception caught in Class A: Exception thrown from Class B

