public class Subarrays {
    public static void printSubarrays(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){       //start
            for(int j=i;j<n;j++){      //end
                for(int k=i;k<=j;k++){      //print all elements b/w starting point and ending point
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        printSubarrays(arr);
    }
}
