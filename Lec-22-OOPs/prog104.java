// Abstraction

abstract class Animal{       // iska koi object nhi bana sakte hai jaroort nhi hai bcz iski sab property child class me aa gye hai aur aab bs yeh yek concept / blueprint /abstract hai 
    abstract void  walk();
    public void eat(){     // non - abstract / normal method 
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}


public class prog104 {
    public static void main(String args[]){
       Chicken c1 = new Chicken();
       c1.walk();

       c1.eat();
    }
}
