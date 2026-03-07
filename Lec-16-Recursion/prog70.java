// print factorial of a number n

import java.util.*;

public class prog70 {
    
    public static int factorial(int n){
        //Base case
        if(n==0 || n==1){
            return 1;
        }
        //recursive case 
        return n * factorial(n-1);
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }
}


// working

// factorial(5)
// = 5 * factorial(4)
// = 5 * 4 * factorial(3)
// = 5 * 4 * 3 * factorial(2)
// = 5 * 4 * 3 * 2 * factorial(1)
// = 120