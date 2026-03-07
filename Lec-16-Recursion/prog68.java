// Print numbers from 1 to 5 

public class prog68 {
    
    public static void printNumb(int n){
        //Base case
        if(n==6){
            return ;
        }
        System.out.println(n);
        // recursive case
        printNumb(n+1);
    }
    public static void main(String args[]){
        int n =1;

        printNumb(n);
    }
}
 