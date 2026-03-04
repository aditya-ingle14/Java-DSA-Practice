// In bit manipulation, sometimes we need to access or modify a specific bit in a number. 
// For this purpose programmers use four very common operations:

// Get Bit

// Set Bit

// Clear Bit

// Update Bit

// 1. Get Bit  :
// The Get Bit operation is used to check whether a bit at a particular position is 0 or 1.

// 2. Set Bit  :
// The Set Bit operation is used to make a bit 1 at a particular position.

// 3. Clear Bit :
// The Clear Bit operation is used to make a specific bit 0.

// 4. Update Bit  :
// The Update Bit operation is used to change a bit to either 0 or 1.



// 1) Get Bit

public class prog60 {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
