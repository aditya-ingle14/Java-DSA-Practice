// 2. Multilevel Inheritance = Grandparent → Parent → Child

class Shape{
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(0.5 * l * h);    // aab yeh run nhi hoga bcz of Method Overriding 
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l , int h){
        System.out.println(0.5 * l *h);
    }
}


public class prog100 {
    public static void main(String args[]){
        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area();     // from shape 
        e1.area(10,20);    // from EquilateralTriangle (overrides Triangle)
        // calls EquilateralTriangle’s method, not Triangle’s
    }
}
