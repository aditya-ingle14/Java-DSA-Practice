public class prog84 {
    
    public static int countPaths(int i, int j, int n, int m){

        // Base case: reached destination
        if(i == n-1 && j == m-1){
            return 1;
        }

        // Out of bounds
        if(i == n || j == m){
            return 0;
        }

        // Move down
        int downPaths = countPaths(i+1, j, n, m);
        
        // Move right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String args[]){
        int n = 3, m = 3;

        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}