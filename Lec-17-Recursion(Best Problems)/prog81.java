//print all unique subseuences

import java.util.*;
public class prog81 {
    
    public static void UniqueSubseq(String str , int idx, String newString, HashSet<String> set){
        //Base  Case
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        // include character
        UniqueSubseq(str,idx+1,newString + currChar,set);

        // exclude character
        UniqueSubseq(str, idx+1, newString, set);
    }


    public static void main(String args []){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        UniqueSubseq(str , 0 , "",set);
    }
}
