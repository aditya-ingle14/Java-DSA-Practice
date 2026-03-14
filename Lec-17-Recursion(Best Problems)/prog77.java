// check if an array is sorted(Strictly increasing)

public class prog77 {

    public static boolean isSorted(int arr[] , int idx){
        // Base case
        if(idx == arr.length - 1){
            return true;
        }
        // Check condition
        if(arr[idx]>= arr[idx+1]){
            return false;
        }
        // recursive call
        return isSorted(arr, idx+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr,0));

    }
}
