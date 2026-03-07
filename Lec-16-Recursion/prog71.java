// print the fibonacci sequence till nth term

import java.util.*;

public class prog71 {

    public static int fibonacci(int n){
        // Base case
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        // recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n;i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
}




// working

// fib(5)
// = fib(4) + fib(3)
// = (fib(3)+fib(2)) + (fib(2)+fib(1))