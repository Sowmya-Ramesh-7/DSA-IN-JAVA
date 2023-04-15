import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      float rad=sc.nextFloat();
       double area=3.142*rad*rad;
      System.out.println("\n The area of the circle with radius "+rad+" is :"+area);
    }
}
