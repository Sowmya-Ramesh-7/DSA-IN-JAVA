import java.util.*;
public class sumOfNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.print("Sum="+sum);
    }
    
}
