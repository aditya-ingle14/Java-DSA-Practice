//substring     //strings are immutable
//if we are not passing ending index by default it will take string length 
public class prog56 {
    public static void main(String args[]){
        String sentence = "My name is tony";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
