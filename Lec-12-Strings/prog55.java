
//comparing strings

public class prog55 {
    public static void main(String args[]){
        String name1 = "Aditya";
        String name2 = "Ingle";

        //1) s1>s2 :+ve value
        //2) s1==s2 : 0
        //3) s1<s2 : -ve value
        if(name1.compareTo(name2) == 0){
            System.out.println("Stirngs are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
