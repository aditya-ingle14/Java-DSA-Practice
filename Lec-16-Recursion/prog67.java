// Print numbers from 5 to 1 

public class prog67 {

    public static void printNumb(int n){
        if(n==0){          // Base Case
            return;
        }
        System.out.println(n);      // print
        printNumb(n-1);   // recursion
    }
    
    public static void main(String[] args) {
        int n = 5;
        printNumb(n);     // n=5
    }
}
