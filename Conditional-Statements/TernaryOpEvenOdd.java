import java.util.*;
import java.io.*;

public class TernaryOpEvenOdd{ 
    public static void main(String args[]) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number :");
        int num = Integer.parseInt(br.readLine());
        String type=(num%2==0)?"Number is even":"Number is odd";
        System.out.println(type);
    }
}
