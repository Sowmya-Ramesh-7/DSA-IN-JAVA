import java.util.*;
public class primeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int div=2, flag=0;
        if(num==0||num==1){
            flag=1;
        }
        while(div<num){
            if(num%div==0){
                flag=1;
                break;
            }
            else{
                div++;
            }
        }
        if(flag==0){
            System.out.println("The number "+num+" is prime");
        }else{
            System.out.println("The number "+num+" is not prime");
        }
    } 
}