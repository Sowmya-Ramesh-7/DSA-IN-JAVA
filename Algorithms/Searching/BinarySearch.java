import java.util.*;
public class BinarySearch{
    //BINARY SEARCH ALGORIHTM 
    //TIME COMPLEXTITY = O(log N)
    public static void binarySearch(int arr[],int key){
        int start=0,mid;
        int end=arr.length-1;

        while(start<=end){
            mid=(start+end)/2;

            if(arr[mid]==key){
                System.out.println(key+" is found at position "+(mid+1));
                return;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(key+" is not found");
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the sorted array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element :");
        int key=sc.nextInt();
        binarySearch(arr, key);

    }
}
