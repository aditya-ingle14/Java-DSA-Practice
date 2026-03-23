// Encapsulation is the process of wrapping data (variables) and methods (functions) together into a single unit and restricting direct access to the data.

// In simple words:

// Hide data
// Control access
// Use methods to interact


class Account {

    private String name;
    private int balance;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for balance
    public void setBalance(int balance) {
        if(balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setName("Aditya");
        acc.setBalance(50000);

        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());
    }
}




// What this code is doing ?
// private variables → hidden data
// setName() / setBalance() → write access
// getName() / getBalance() → read access