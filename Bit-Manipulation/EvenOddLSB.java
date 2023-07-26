import java.util.*;
public class EvenOddLSB {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        //for odd numbers LSB is 1
        //to find LSB bitmask=1
        int bitmask=1;
        if((n&bitmask)==1){
            System.out.println(n+ " is Odd number");
        }else{
             System.out.println(n+ " is Even number");
        }
    }
}
