// print all subsequences


public class prog80 {

    public static void printSubseq(String str, int idx, String newString){

        // Base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // include character
        printSubseq(str, idx+1, newString + currChar);

        // exclude character
        printSubseq(str, idx+1, newString);
    }

    public static void main(String args[]){

        String str = "abc";

        printSubseq(str, 0, "");
    }
}