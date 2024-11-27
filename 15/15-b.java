//15-b)Create a outer class which contains function display()  and create a inner class inside the outer class which has the function display () and call  both the function in the main function.

// Outer class
class OuterClass {
    void display() {
        System.out.println("Display method from Outer Class");
    }

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Display method from Inner Class");
        }
    }
}

public class InnerOuterClassExample {
    public static void main(String[] args) {
        // Create an object of OuterClass
        OuterClass outer = new OuterClass();
        outer.display(); // Call display method of OuterClass

        // Create an object of InnerClass using OuterClass object
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Call display method of InnerClass
    }
}


// OUTPUT:
// Display method from Outer Class
// Display method from Inner Class

