// Abstraction

// Abstraction is the process of hiding implementation details and showing only essential features to the user.

// 👉 In simple words:

// You use something
// You don’t know how it works internally

// 🔥 Real-Life Example

// ATM:

// You press withdraw
// Money comes out

// 👉 You don’t know:

// database
// server logic
// transaction system

// Still works. That’s abstraction.

// ⚡ How Java achieves abstraction

// 👉 2 ways:

// Abstract Class
// Interface
// 🧩 1. Abstract Class

// 👉 Contains:

// abstract methods (no body)
// normal methods (with body)



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

public class prog103 {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setName("Aditya");
        acc.setBalance(50000);

        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());
    }
}