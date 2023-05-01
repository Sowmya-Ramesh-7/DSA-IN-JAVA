
import java.util.*;
public class CalcUsingSwitch {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("------------------------------I AM A CALCULATOR-----------------------\nI CAN DO ADDITION, SUBTRACTION, MULTIPLLICATION, DIVISION AND MODULO");
        System.out.println("Enter the 2 number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the Operation to be performed");
        char op=sc.next().charAt(0);
        System.out.print("Your Answer =");
        switch(op){
            case '+':System.out.print(a+b);
            break;
            case '-':System.out.print(a-b);
            break;
            case '*':System.out.print(a*b);
            break;
            case '/':System.out.print(a/b);
            break;
            case '%':System.out.print(a%b);
            break;
            default:System.out.print("!!!!!!!! Invaild Operator !!!!!!!!!");
        }
    }
    
}
