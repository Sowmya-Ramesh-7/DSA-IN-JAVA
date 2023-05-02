import java.util.*;
public class Operators {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int a=sc.nextInt(),b=sc.nextInt();

        //ARITHMETIC OPERATORS -BINARY
        System.out.println("--------------ARITHMETIC OPERATORS--------------");
        System.out.println("+ : Addition of "+a+" & "+b+"         "+(a+b));
        System.out.println("- : Subtraction "+a+" & "+b+"         "+(a-b));
        System.out.println("* : Multiplication "+a+" & "+b+"      "+(a*b));
        System.out.println("/ : Division "+a+" & "+b+"            "+(a/b));
        System.out.println("% : Remainder/Modulo "+a+" & "+b+"    "+(a%b));
        
        //UNARY OPERATORS - ++/--
        System.out.println("\n----------------UNARY OPERATORS------------------");
        System.out.println("Before a++ ="+a+", a++ ="+(a++)+" and after a++ ="+a);
        System.out.println("Before ++a ="+a+", ++a ="+(++a)+" and after ++a ="+a);
        System.out.println("Before a-- ="+a+", a-- ="+(a--)+" and after a-- ="+a);
        System.out.println("Before --a ="+a+", --a ="+(--a)+" and after --a ="+a);

        //RELATIONAL OPERATORS
        System.out.println("\n--------------RELATIONAL OPERATORS----------------");
        System.out.println("a==b : "+(a==b));
        System.out.println("a<=b : "+(a<=b));
        System.out.println("a>=b : "+(a>=b));
        System.out.println("a>b  : "+(a>b));
        System.out.println("a<b  : "+(a<b));
        System.out.println("a!=b : "+(a!=b));
        
        //ASSIGNMENT OPERATORS
        System.out.println("\n--------------ASSIGNMENT OPERATORS----------------");
        System.out.println("a=b  : "+(a=b));
        System.out.println("a+=b : "+(a+=b));
        System.out.println("a-=b : "+(a-=b));
        System.out.println("a/=b : "+(a/=b));
        System.out.println("a%=b : "+(a%=b));
        System.out.println("a*=b : "+(a*=b));

        //Bitwise operator later

        System.out.println("-------------------------------------------------");

    }
    
}
