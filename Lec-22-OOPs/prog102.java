// 3. Hierarchical Inheritance

// One parent → multiple children

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5 * l * h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
} 


public class prog102 {
    public static void main(String[] args){
        Triangle s1 = new Triangle();
        s1.area();
        s1.area(10,20);

        Circle c1 = new Circle();
        c1.area(5);

    }
}
