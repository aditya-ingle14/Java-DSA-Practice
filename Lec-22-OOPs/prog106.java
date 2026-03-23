// 🧩 2. Interface

// 👉 Pure abstraction (almost)

// 🔍 Key Points
// No method body (by default)
// Uses implements
// Supports multiple inheritance


interface Animal {
    void sound();   // automatically abstract
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class prog106 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}



// ⚖️ Abstract Class vs Interface
// Feature	Abstract Class	Interface
// Methods	Abstract + normal	Only abstract (mostly)
// Keyword	extends	implements
// Multiple inheritance	❌	✅
// Constructor	✔️	❌
// 🎯 Why Abstraction?
// Hide complexity
// Improve security
// Reduce code dependency
// Easy maintenance
// 💣 Encapsulation vs Abstraction (don’t mix)

// Concept	        vs      Meaning
// Encapsulation	        Hide data
// Abstraction	            Hide implementation

// 🧠 Viva Questions
// Q1: What is abstraction?

// 👉 Hiding implementation details

// Q2: How is it achieved?

// 👉 Abstract class & interface

// Q3: Can we create object of abstract class?

// 👉 ❌ No

// Q4: Which supports multiple inheritance?

// 👉 Interface

// 🧠 One-line memory trick

// Abstraction = what to do
// Encapsulation = how to protect data