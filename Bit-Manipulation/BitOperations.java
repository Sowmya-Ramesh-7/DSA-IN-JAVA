import java.util.Scanner;

public class BitOperations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Get Bit at the ith positon(zero based index)");
        System.out.println("Enter the number and position of bit :");
        int n=sc.nextInt();
        int i=sc.nextInt();

        int bitmask=1<<i;
        
        if((n&bitmask)==0){
            System.out.println("Bit is 0");
        }else{
            System.out.println("Bit is 1");
        }

        System.out.println("Set Bit at the ith positon");
        n=n|bitmask;
        System.out.println("n after Set operation= "+n);

        System.out.println("clear Bit at the ith positon");
        n=n&(~bitmask);
        System.out.println("n after clear operation= "+n);

        System.out.println("Update Bit at the ith positon");
        System.out.println("Enter the new bit : ");
        int newbit=sc.nextInt();
        if(newbit==0){
            n=n&(~bitmask);
        }else{
            n=n|bitmask;
        }
        System.out.println("n after update operation= "+n);

        

    }
    
}
