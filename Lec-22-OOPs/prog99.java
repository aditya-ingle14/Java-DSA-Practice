// Method Overriding : 👉 One class copies a method from another class
// 👉 Then changes its behavior

// when we inherate a method from base class to child class and we don't want a method as it is in the child class
// we change the method in the child class according to our choice  



class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public void area(){
        System.out.println("Don't Display");
    }
}


public class prog99 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();

        t1.area();     // calling method 
    }
}
