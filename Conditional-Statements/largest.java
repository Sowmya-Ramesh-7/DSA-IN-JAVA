import java.util.*;

public class largest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 3 Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+" is Largest"); 
        }else if(b>=c && b>=a){
            System.out.println(b+" is Largest");    
        }
        else{
            System.out.println(c+" is Largest");  
        }
    }
    
}
