import java.util.*;

public class AgeElseif {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        } else if(age>=13 && age<18){             //logical && and
            System.out.println("Teen");
        }else{
            System.out.println("Child");
        }
    }
}