
public class BubbleSort {
    /* 
       BUBBLE SORT:
       Time complexity=O(n2)

       Simple
       Unnecessary Swaps

        >logic
        compare with next ,Swap and push larger elements to the end 

        for(int turns=0 to n-2)
            for(j=0 to n-2-turns)
     
     */
    public static void bubbleSort(int arr[]){
        int n=arr.length-1;

        //number of turns
        for(int i=0;i<n;i++){   
            
            //number of comparisions
            for(int j=0;j<n-i;j++){

                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return;

    }

    public static void main(String args[]){
        int arr[]={43,-1,34,-23,42};

        bubbleSort(arr);

        System.out.println("Array {43,-1,34,-23,42} After sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
