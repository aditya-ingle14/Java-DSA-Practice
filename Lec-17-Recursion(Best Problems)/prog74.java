// What is Tower of Hanoi? 🧩

// Tower of Hanoi is a classic recursion puzzle used to understand how recursive algorithms work.

// The puzzle has:

// 3 rods (or pegs)

// N disks of different sizes

// All disks start on the source rod in decreasing order (largest at bottom).

// The goal is to move all disks from the source rod to the destination rod using the helper rod.

// Rules of Tower of Hanoi ⚠️

// 1️⃣ Only one disk can be moved at a time.
// 2️⃣ A larger disk cannot be placed on a smaller disk.
// 3️⃣ Only the top disk of a rod can be moved.

// Recursion Idea :

// To move n disks from source → destination:

// Move n-1 disks from source → helper

// Move nth disk from source → destination

// Move n-1 disks from helper → destination

// This recursive pattern continues until n = 1



import java.util.Scanner;

public class prog74 {

    public static void TowerOfHanoi(int n, String src, String helper, String dest) {

        // Base case
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Step 1: move n-1 disks from source to helper
        TowerOfHanoi(n-1, src, dest, helper);

        // Step 2: move nth disk
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Step 3: move n-1 disks from helper to destination
        TowerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TowerOfHanoi(n, "S", "H", "D");
    }
}