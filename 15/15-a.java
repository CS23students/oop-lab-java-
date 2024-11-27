//15-a) Write a program for example of abstract class

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Providing implementation for abstract method
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog();

        // Call methods
        dog.sound(); // Calls the overridden method
        dog.sleep(); // Calls the inherited method
    }
}



// OUTPUT:
// Dog barks: Woof Woof
// Animal is sleeping...

