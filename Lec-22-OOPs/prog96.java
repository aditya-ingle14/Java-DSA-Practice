// Polymorphism = one name, many forms

// This is Example of Compile - Time Polymorphism (Method Overloading)

// 💣 Important Rules (interview people love these)
// For Overloading:
// Method name same
// Parameters must change (type/number/order) ....
// public void printInfo(String name){       

// }
// public void printInfo(String name , int age){  ... chalega function overloading hai bcz extra argument hai age bolke 

// }

// For Overriding:
// Same method name
// Same parameters
// Same return type (or subtype)
// Cannot reduce access level

// ⚡ Key Differences
// Feature	         Overloading	    Overriding
// Time	             Compile-time	    Runtime
// Parameters	     Must differ	    Must be same
// Inheritance	     Not required	    Required
// Return type	     Can differ	        Same (or covariant)

// same function bar bar use kr rahe hai 

//function overloading = same nam ke function ko yek hi class me create krna 

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class prog96 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 21;

        s1.printInfo(s1.name , s1.age);  // calling function
    }

}
