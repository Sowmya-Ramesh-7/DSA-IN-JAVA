import java.util.*;
public class TotalBill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pen=10,pencil=5,eraser=5;
        System.out.println("Items Available are:\n1.Pen\n2.Pencil\n3.Eraser\nEnter the quantity you require in each item:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double tot=(a*pen)+(b*pencil)+(c*eraser);
        double tax=tot*0.18;
        System.out.println("-----------------Your Bill-------------------");
        System.out.println("          Item Name | Qty | Price |   Total");
        System.out.println("          Pen          "+a+"   "+pen+"     "+(a*pen)+"\n          Pencil       "+b+"   "+pencil+"      "+(b*pencil)+"\n          Eraser       "+c+"   "+eraser+"      "+(c*eraser));
        System.out.println("-----------------------------------------------");
        System.out.println("                  TOTAL = "+tot+"\n                    TAX = "+tax+"\n   TOTAL BILL(incl. GST)= "+(tot+tax));
        System.out.println("\n-----------THANK YOU FOR YOUR ORDER-----------");

    }
    
}
