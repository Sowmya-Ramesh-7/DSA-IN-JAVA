import java.util.*;
//using array
public class LinearSearch {
    //Linear Search [TC=O(n)]
    public static void linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("\n"+key+" is found at index :"+i+" or position : "+(i+1));
                return;
            }
        }
        System.out.println("\nKey not found");
        return;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the search element :");
        int key=sc.nextInt();
        System.out.println("Array elements are :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }
        linearSearch(arr,key);
    }
    
}
