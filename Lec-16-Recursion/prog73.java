// print x^n (stack height = log n)
import java.util.*;

public class prog73 {

    public static int power(int x, int n){

        // Base Case
        if(n == 0)
            return 1;

        int halfPower = power(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // if n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println(result);
    }
}