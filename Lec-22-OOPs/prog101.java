// 2. Multilevel Inheritance

// Grandparent → Parent → Child


class A{
    void showA(){
        System.out.println("A");
    }
}

class B extends A{
    void showB(){
        System.out.println("B");
    }
}

class C extends B{
    void showC(){
        System.out.println("C");
    }
}



public class prog101 {
    public static void main(String args[]){
        C c1 = new C();
        c1.showC();     // from class c
        c1.showB();     // from class B
        c1.showA();     // from class A
    }
}
