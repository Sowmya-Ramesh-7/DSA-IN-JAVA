public class MaxSubarrysSum12 {
    //BRUTE FORCE APPROACH
    public static void subArray(int numbers[]){
        int n=numbers.length;
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=numbers[k];
                }
                System.out.println("sum from index "+i+" to "+j+" = "+sum);
                if(max<sum){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum of Sub arrays using Brute force approach is "+max);
    }

    //PREFIX SUM ARRAY
    public static void psMaxSubarraySum(int numbers[]){
        int n=numbers.length;
        int prefix[]=new int[n];
        int max=Integer.MIN_VALUE;
        prefix[0]=numbers[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=(i==0) ? prefix[j] : prefix[j]-prefix[i-1];
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("\nMax Subarray sum using Prefix Sum = "+max+"\n");
    }
    

    public static void main(String args[]){
        int numbers[]={4,3,-3,-2,1};
        subArray(numbers);
        psMaxSubarraySum(numbers);
        
    }
}

