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
}

public class prog93 {
    public static void main(String args[]){

        Pen p1 = new Pen ();     // object creation  // new keyword use kiya matalab memory heap ke aandar jagah allocate ho jayegi usme sare object store ho jayegi
        p1.color = "Red";                 
        p1.type = "Gel";
        p1.write();

        Pen p2 = new Pen ();
        p2.color = "Black";
        p2.type = "ballpoint";

        p1.printColor();
        p2.printColor();

        Student s1 = new Student();      // object creation    ... agar uppar constuctor nhi banaya toh by default isko constructor man leta hai java      
        s1.name = "Aditya";
        s1.age = 21;
        s1.printInfo();
    }
} 
