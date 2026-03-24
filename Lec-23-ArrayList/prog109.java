// ArrayList only stores the objects
// The ArrayList class is one of the most commonly used collections in Java. 
// It implements the List interface and is part of the Java Collections Framework. 
// It provides a resizable array implementation, allowing you to store and manipulate a dynamic list of elements.


import java.util.ArrayList;
import java.util.Collections;


public class prog109 {
    public static void main(String args []){
        
        ArrayList<Integer> list = new ArrayList<>();    // or    ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add elements in ArrayList
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);     // 0th index pe konsa element hai dikh jayega 
        System.out.println(element);

        //add element in between
        list.add(1,1);        //..... 1st index pe 1 add kr diya 
        System.out.println(list);
        
        //set element 
        list.set(0,5);     // 0th index pe joh element tha usse replace kr diya 
        System.out.println(list);
        
        // delete element 
        list.remove(3);   // last index kon delete kr rhe hai 
        System.out.println(list);

        // size 
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  // konse index pe konsa element store hai woh aayega 
        }
        System.out.println();

        //Sorting 
        Collections.sort(list);   // ascending order
        System.out.println(list);

    }    
}
