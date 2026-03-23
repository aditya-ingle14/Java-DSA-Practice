// ⚡ How Java achieves abstraction

// 👉 2 ways:

// Abstract Class
// Interface
// 🧩 1. Abstract Class

// 👉 Contains:

// abstract methods (no body)
// normal methods (with body)

// 🔍 Key Points
// Cannot create object of abstract class ❌
// Must override abstract methods in child class ✔️


abstract class Animal {

    abstract void sound();   // no body

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class prog105 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}