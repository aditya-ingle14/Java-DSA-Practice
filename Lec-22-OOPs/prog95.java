// Copy constructor

class Student{
    String name ;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){    // copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){     // default constructor banana pdega nhi toh copy constructor ka output nhi aagyega
  
    }
}


public class prog95 {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "aditya";
        s1.age = 21;

        Student s2 = new Student(s1);  /// s1 ki property s2 ko assign kr diya s2 ki property define hi nhi kiya 
        s2.printInfo();
    }
}
