// We use StringBuilder when we need to modify strings multiple 
// times because String objects are immutable in Java. StringBuilder is mutable and avoids creating multiple objects in memory, 
// making it more efficient and faster, especially inside loops.

// What is StringBuilder?

// StringBuilder is a mutable class.

// Mutable = it can change the same object without creating new ones
// StringBuilder sb = new StringBuilder("Hello");
// sb.append(" World");
// Here:
// 1) No new object created
// 2) Same object modified
// 3) Faster
// 4) Memory efficient

public class prog57 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));   //Output : T

        sb.setCharAt(0,'p');
        System.out.println(sb);            // Output : Pony

        sb.insert(0,'S');
        System.out.println(sb);    // Output : SPony

        sb.insert(3,'n');
        System.out.println(sb);       // Output : Sponny

        sb.delete(3,5);
        System.out.println(sb);           //Output : Spoy
 
    }
}
 