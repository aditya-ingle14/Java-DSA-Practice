// find the number of ways in which you can invite n people to your party,single or in pairs
// n =4

public class prog86 {
    public static int callGuests(int n){
        // base case
        if(n==1){
            return 1;
        }
        //single
        int ways1 = callGuests(n-1);

        //pair 
        int ways = (n-1)* callGuests(n-2);
        return ways1 + ways;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(callGuests(n));
    }

}
