import java.util.Scanner;
public class ReverseOfNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int rem,rev=0;
        int num=n;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("The Reverse of "+num+" is "+rev);
    }
}
