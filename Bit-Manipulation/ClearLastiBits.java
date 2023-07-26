import java.util.*;

public class ClearLastiBits {
    public static int clearibits(int n, int i){
        int bitmask=(~0<<i);
        return n&bitmask;
    }
    public static int clearRangeOfBits(int n, int i, int j){
        int left=(~0<<(j+1));
        int right=~(~0<<(i)); //or (1<<i)-1
        int b=(1<<i)-1;
        int bitmask=left|b;
        return n&bitmask;

    }
    public static void main(String args[]){
        int n=10;
        int i=2;
        int j=4;
        System.out.println(clearibits(n,i));
        System.out.println(clearRangeOfBits(n,i,j));
    }
}
