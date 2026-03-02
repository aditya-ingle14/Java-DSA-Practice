//Take a matrix as input from the user. Search for a
// given number x and print the indices at which it occurs.


import java.util.*;

public class prog53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[cols] [rows];

        //input
        for(int i = 0 ; i<rows;i++){
            for(int j = 0 ; j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //input number to search
        int x = sc.nextInt();

        // search element

        boolean found = false;

        for(int i=0; i<rows;i++){
            for(int j=0 ;j<cols;j++){
                if(numbers[i][j] == x){
                    System.out.println("Found at index:("+ i + ", " +j + ")");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

    }
    
}
