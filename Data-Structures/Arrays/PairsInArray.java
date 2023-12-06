public class PairsInArray {
    public static void printPairs(int[] arr){
        int n= arr.length;
        System.out.println("Pairs in Arrays:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
    public static void main(String args[]){
        int[] arr={2,4,6,8,10};
        printPairs(arr);
    }
    
}
