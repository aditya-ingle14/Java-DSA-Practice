//  Insertion Sort :it performs very fast when data is almost sorted.

// How Insertion Sort Works ?

// Insertion Sort works the same way you arrange playing cards in your hand.

// When you pick cards one by one, you insert each card into the correct position among the already sorted cards. The same idea is used in the algorithm.

public class prog66 {

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args []){
    
        int arr[] = {7,8,3,1,2};

        for(int i = 1;i<arr.length;i++){ 
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
