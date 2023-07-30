public class CountSort {
    public static void countSort(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            large=Math.max(large, arr[i]);
        }
        int count[]=new int[large+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();

    }

    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        System.out.print("Array before sorting : ");
        printArr(arr);
        countSort(arr);
        System.out.print("Array after sorting : ");
        printArr(arr);
    }
}
