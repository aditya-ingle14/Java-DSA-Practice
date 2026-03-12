public class prog75 {

    public static void printRev(String str, int idx) {

        // Base case
        if(idx < 0){
            return;
        }

        System.out.print(str.charAt(idx));

        // Recursive call
        printRev(str, idx - 1);
    }

    public static void main(String args[]){
        String str = "abcd";
        printRev(str, str.length() - 1);
    }
}