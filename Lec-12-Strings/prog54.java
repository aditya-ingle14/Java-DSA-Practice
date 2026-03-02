//Each charcter print from the string 


public class prog54 {
    public static void main(String args[]){
        // Stirng Declaration
        String name = "Aditya";
        String lastname = "Ingle";
        String fullname = name + "@" + lastname;

        System.out.println(fullname.length());

        //charAt
        for(int i=0 ; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
