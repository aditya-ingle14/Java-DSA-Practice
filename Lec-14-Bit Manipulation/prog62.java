// 3) Clear Bit

public class prog62 {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int notBitMask = ~(bitmask);

        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}
