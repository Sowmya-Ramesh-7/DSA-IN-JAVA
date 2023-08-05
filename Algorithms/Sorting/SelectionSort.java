public class SelectionSort{

/*
 Selection sort : Pick the smallest element from unsorted part and put it in the begining 
 TC=O(n2)

 Number of swaps is reduced 
 Simple than Bubble Sort
 */
    public static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int[] arr ={32,34,23,24,22};
        System.out.println("Array {32,34,23,24,22} After sorting:");
        Selection(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}