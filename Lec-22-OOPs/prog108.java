// static 
// Static. The keyword that basically says:

// “This belongs to the class, not your individual objects



class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class prog108 {
    public static void main(String args[]) {

        Student.school = "ABC";

        Student student1 = new Student();
        student1.name = "tony";

        System.out.println(student1.school);
    }
}


// 🧠 What is static?

// 👉 static means:
// Variable/method belongs to class
// Not to individual objects


// ⚠️ Rules of static
// Static variable → shared among all objects
// Static method → called using class name
// Static method cannot access non-static variables directly

// 🎯 Why we use static
// Save memory (one copy instead of many)
// Common data (like school, company, country)
// Utility methods (like Math.sqrt())

// 🧠 Viva Answer
// Static keyword is used to create class-level variables and methods which are shared among all objects. It helps in memory efficiency and provides a common property for all instances.

// ⚡ One-line memory trick
// static = one copy for entire class