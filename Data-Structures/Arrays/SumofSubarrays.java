public class SumofSubarrays {
    public static void subArray(int numbers[]){
        int n=numbers.length;
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                System.out.println("sum="+sum);
                if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }
            }
            System.out.println();
        }
        System.out.println("max and min="+max+" "+min);
    }

    public static void main(String args[]){
        int numbers[]={4,3,1};
        subArray(numbers);
        
    }
}
