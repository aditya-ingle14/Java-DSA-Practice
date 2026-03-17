// Print all permutations of a string " abc "
 


public class prog83 {

    public static void perm(String str ,String perm){

        // Base class

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i = 0 ; i<str.length();i++){
            char curr = str.charAt(i);

            // remove current cahracter 
            String newStr = str.substring(0,i) + str.substring(i+1);

            perm(newStr, perm + curr);
        }
    }


    public static void main(String args[]){
        String str = "abc";
        perm(str,"");

    }
}
