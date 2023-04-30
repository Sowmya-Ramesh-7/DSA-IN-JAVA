import java.util.*;
public class IncomeTaxCalc {
    public static void main(String args[]){
        int income,tax;
        System.out.print("Enter Your Salary: ");
        Scanner sc=new Scanner(System.in);
        income=sc.nextInt();
        if(income<500000){
            tax=0;
        }else if(income>=500000 && income<1000000){
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("Your Tax is Rs."+tax);


    }
}
