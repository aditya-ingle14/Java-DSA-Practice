// 1. Single Inheritance = One parent → one child    


class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public void area(int l ,int h){
        System.out.println(0.5 * l * h);
    }
}


public class prog98 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.area();    // parent method
        t1.area(10,20);
    }
}
