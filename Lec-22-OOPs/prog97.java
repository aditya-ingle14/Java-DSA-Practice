// Inheritance  : use extends keyword

// Inheritance is a mechanism in Java where one class acquires the properties and behaviors of another class.

// Parent class → Superclass
// Child class → Subclass

// 👉 It helps in:

// Code reuse
// Reducing redundancy
// Creating relationships between classes



class Shape{
    String color;
}

class Triangle extends Shape{

}


public class prog97 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "Red";     // humne color ko define nhi kiya Triangle class me and error bhi nhi aaya bcz shape class se property inherit kr rha hai 
    }
}
