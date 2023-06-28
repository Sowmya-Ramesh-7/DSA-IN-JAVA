import java.util.Scanner;
public class StringOperation{
    public static void main(String args[]){
        //Strings are immutable
        Scanner sc=new Scanner(System.in);
        String name;
        String name1;
        System.out.println("Enter the Name for input using nextLine():");
        name=sc.nextLine();
        System.out.println("(entire line is store into string) Name: "+name+"\nEnter the Name for input using next():");
        name1=sc.next();
        System.out.println("(String is considered only till space) Name: "+name1);
        //Concatenation "+" 

        //to access a specific character in the string
        System.out.println("charAt(index=2): "+name.charAt(2));

        //to find length of string :length()-function
        System.out.println("String length is "+name.length());

    }
}
