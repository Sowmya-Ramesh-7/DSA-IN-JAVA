
import java.util.*;
public class primeNUsingFor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int flag=0;

        //prime starts from 2
        if(n==0||n==1){
            flag=1;
        }


        // all num is divisible by num itself and 1 so checked only for(2 to n-1)
        for(int i=2;i<n-1;i++){
            if ((n%i)==0){
                flag=1;
                break;
            }
        }
       if(flag==0){
        System.out.println(n+ " is Prime number");
       }
       else{
        System.out.println(n+" is not a prime number");
       }
    }
    
}
