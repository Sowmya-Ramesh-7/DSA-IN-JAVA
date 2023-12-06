import java.util.*;
public class Array1DProblem {
    public static void main(String argrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n*3];
        for(int i=0;i<(n*3);i=i+3){
            arr[i]=sc.nextInt();
            arr[i+1]=(int)Math.pow(arr[i],2);
            arr[i+2]=(int)Math.pow(arr[i],3);
        }
        for(int i=0;i<(n*3);i++){
            System.out.print(arr[i]);
            if(i%3==2){
                System.out.print("@");
            }else{
                System.out.print("-");
            }
        }
    }
}
