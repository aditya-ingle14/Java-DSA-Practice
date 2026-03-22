public class prog90 {

    public static void conquer(int arr[] , int si , int mid , int ei){    // new merged array create kr rhe hai 
        int mergeArr[] = new int[ei - si +1];

        int idx1 = si;    // first divided array index
        int idx2 = mid +1;   // second divided array index
        int x = 0;           // new Array index 

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                mergeArr[x] = arr[idx1];    // or  mergeArr[x++] = arr[idx1++]  yeh line likhne ke bad next line likhne ki jarurat nhi hai 
                x++ ; 
                idx1++; 
            }else{
                mergeArr[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            mergeArr[x++] = arr[idx1++];   // sab compaare element hone ke bad joh first divided array me left hai woh aayenge
        }

        while(idx2<=ei){
            mergeArr[x++] = arr[idx2++];
        }

        for(int i=0, j=si ; i<mergeArr.length; i++, j++){     // orginal array ke aandar merge ke element ke copy krna hai
            arr[j] = mergeArr[i];
        }   
    }
    
    public static void divide(int arr[] , int si , int ei){  // array ko divide kr rhe hai ....si = starting index0,  ei = ending index
        
        //Base case 
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si) / 2;

        divide(arr , si , mid);    // first divided array ke liye start index si and ending index mid hoga 
        divide(arr , mid+1 , ei);

        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]){
        int arr[] = {6 , 3 , 9 , 2 , 8};
        int n = arr.length;    // array size de rhe hai
        
        divide(arr,0, n-1);

        // print
        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
}