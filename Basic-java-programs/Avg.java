import java.util.*;
public class Avg {
    public static void main(String args[]){
        System.out.print("Enter the 3 numbers:");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println("The average of 3 numbers "+a+", "+b+" and "+c+" is "+avg);
    }
}
