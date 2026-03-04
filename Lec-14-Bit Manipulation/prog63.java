// 4) Update Bit
import java.util.*;

public class prog63 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        // oper = 1 : set oper = 0 : clear
        int n = 5;  //0101
        int pos = 1;
        int bitmask = 1<<pos;
        
        if(oper == 1){
            //set Bit
            int newNum = bitmask | n;
            System.out.println(newNum);
        }else{
            // clear Bit
            int newBitMask = ~(bitmask);
            int newNum = newBitMask & n;
            System.out.println(newNum);
        }
    }
}
