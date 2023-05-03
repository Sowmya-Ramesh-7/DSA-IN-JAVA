import java.util.*;
public class OperationInArray{
public static void main(String args[]){

    //array declaration and instantiation
    int marks[]=new int[10];
    Scanner sc =new Scanner(System.in);

    /*OPERATIONS IN ARRAY :
     CREATE
     INPUT
     OUTPUT
     UPDATE
     */
    System.out.println("Enter the 1st element of array: ");
    //INDIVIDUAL VALUES INPUT & STORED
    marks[0]=sc.nextInt();             
    System.out.println("The 1st element in array is: "+marks[0]);


    //new keyword allocates memory initializes the array elements with 0
    System.out.println("Initial value before insertion of 2nd element is :"+marks[1]);


    //Instead of accessing each index individually it can be done using any loop
    System.out.println("Enter the remaining elements of the array");
    for(int i=1;i<marks.length;i++){
        marks[i]=sc.nextInt();
    }


    //printing all the elements in an array
    for(int i=0;i<marks.length;i++){
        System.out.println("Element"+i+" = "+marks[i]);
    }

    //update the value of the intex 2 & 3
    marks[0]=15;
    System.out.println("updated marks at index 0 is :"+marks[0]);
    marks[9]=marks[9]+10;
    System.out.println("updated marks at index 9 is :"+marks[9]);


    //Loop is used to update all the value
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
        System.out.println("updated marks at "+i+" is "+marks[i]);
    }
}
}