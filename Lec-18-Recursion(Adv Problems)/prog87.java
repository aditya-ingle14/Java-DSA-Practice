// print all the subsets of a set of first n natural numbers 


import java.util.ArrayList;

public class prog87 {

    public static void printSubsets(int n, int i, ArrayList<Integer> subset){

        // Base case
        if(i > n){
            System.out.println(subset);
            return;
        }

        // include current number
        subset.add(i);
        printSubsets(n, i+1, subset);

        // backtrack (remove)
        subset.remove(subset.size() - 1);

        // exclude current number
        printSubsets(n, i+1, subset);
    }

    public static void main(String args[]){
        int n = 3;

        printSubsets(n, 1, new ArrayList<>());
    }
}