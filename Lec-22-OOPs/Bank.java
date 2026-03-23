// access modifiers

package bank;

public class Account {
    public String name;        // public
    private int balance;       // private
    String type;               // default
    protected String branch;   // protected

    public void showDetails() {
        System.out.println(name + " " + balance + " " + type + " " + branch);
    }

    // getter    for private access modifiers only
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int bal){
        this.balance = bal;
    }

}

public class Bank{
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.name = "Aditya";
        acc1.balance = 20000;    /// access nhi kr payega visisble hai hi nhi agar access krna hai toh getters and setters use 

        acc1.setBalance(50000);
        System.out.println(acc1.getBalance());
    }
}


// name → anyone can change (public)
// balance → only Account controls (private)
// type → only bank package knows (default)
// branch → bank + subclasses (protected)




// In this example, different access modifiers control the visibility of variables. 
// The public variable can be accessed from anywhere, private is restricted to the same class, default allows access within the same package, 
// and protected allows access within the package and also to subclasses in other packages. 
// This helps in data hiding and secure access control.




// Modifier	Same Class	Same Package	Subclass	Other Package
// public	       ✅	      ✅	           ✅	        ✅
// protected	   ✅	      ✅	           ✅	        ❌
// default	       ✅	      ✅	           ❌	        ❌
// private	       ✅	      ❌	           ❌	         ❌
