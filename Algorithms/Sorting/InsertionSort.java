public class InsertionSort {
    /*
     Inertion sort: pick an element from unsorted part and place in the right position in sorted part

     TC=O(n2)
     */
    public static void InsertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={43,-1,34,-23,42};

        InsertSort(arr);

        System.out.println("Array {43,-1,34,-23,42} After sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
