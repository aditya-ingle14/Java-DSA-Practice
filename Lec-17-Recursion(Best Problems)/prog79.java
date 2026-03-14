//Remove all duplicates in string 

public class prog79 {

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {

        // base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a']) {  // map index calculating 
            // already present
            removeDuplicates(str, idx + 1, newString);
        } 
        else {
            // first time appearing
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {

        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}