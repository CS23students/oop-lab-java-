//37. Java program create a abstract class Eatable and abstract method eat() and create a child class fruit and add abstract method taste().
// Create a child class to fruit as nameofFruit (class name) and call the function eat() and taste()in test class

// Abstract class Eatable
abstract class Eatable {
    // Abstract method eat
    abstract void eat();
}

// Abstract class Fruit extending Eatable
abstract class Fruit extends Eatable {
    // Abstract method taste
    abstract void taste();
}

// Subclass NameOfFruit extending Fruit
class NameOfFruit extends Fruit {
    private String fruitName;

    // Constructor to initialize fruit name
    public NameOfFruit(String fruitName) {
        this.fruitName = fruitName;
    }

    // Implementing the eat method
    @Override
    void eat() {
        System.out.println("Eating the " + fruitName + ".");
    }

    // Implementing the taste method
    @Override
    void taste() {
        System.out.println("The " + fruitName + " tastes sweet and juicy.");
    }
}

// Test class to call eat() and taste() methods
public class Test {
    public static void main(String[] args) {
        // Creating an object of NameOfFruit
        NameOfFruit mango = new NameOfFruit("Mango");

        // Calling the eat() and taste() methods
        mango.eat();
        mango.taste();
    }
}



// OUTPUT:
// Eating the Mango.
// The Mango tastes sweet and juicy.

