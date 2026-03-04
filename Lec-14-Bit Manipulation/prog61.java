// 2) Set Bit


public class prog61 {
    public static void main(String args[]){
        int n = 5;   // 0101
        int pos = 1;
        int bitmask = 1<<pos;

        int newNumber = bitmask | n;
        System.out.println(newNumber);   // output = 7
    }
}
