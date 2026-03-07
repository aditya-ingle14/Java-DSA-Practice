// Print sum of first n natural numbers


import java.util.*;
public class prog69 {

    public static int printNaturalSum(int n){
        //Base case
        if(n==1){
            return 1;
        }

        // recursive case 
        return n + printNaturalSum(n-1);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = printNaturalSum(n);
        System.out.println(sum);
    }
}


// working

// sum(5)
// = 5 + sum(4)
// = 5 + 4 + sum(3)
// = 5 + 4 + 3 + sum(2)
// = 5 + 4 + 3 + 2 + sum(1)
// = 15


// public class Recursion1 {

//     public static void printSum(int i, int n, int sum) {
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }

//         sum += i;
//         printSum(i + 1, n, sum);
//     }

//     public static void main(String args[]) {
//         printSum(1, 5, 0);
//     }
// }
