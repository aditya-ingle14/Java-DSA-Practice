//constructor ...... same name as a class name 



class Pen{
    String color;          //  this both are data members
    String type;     // ballpoint or gel like this 

    public void write (){                          // Member 3
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name ;
    int age;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name , int age){    // parameterized constructor
        this.age = age; // 2nd age hai woh parameter hai and 1st joh hai woh object name 
        this.name = name ; 
    }
}
public class prog94 {
    public static void main(String args[]){
        Student s1 = new Student("Aditya" , 21);
        s1.printInfo();
    }
} 
