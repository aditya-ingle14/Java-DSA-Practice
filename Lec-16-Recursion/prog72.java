// print x^n(stack height = n)

import java.util.*;

public class prog72 {
    
    public static int power(int x, int n){
        // Base case
        if(n==0){
            return 1;
        }
        return x *power(x,n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = power(x,n);
        System.out.println(result);
    }
}



// working 

// power(2,5)
// = 2 * power(2,4)
// = 2 * 2 * power(2,3)
// = 2 * 2 * 2 * power(2,2)
// = 2 * 2 * 2 * 2 * power(2,1)
// = 2 * 2 * 2 * 2 * 2 * power(2,0)
// = 32