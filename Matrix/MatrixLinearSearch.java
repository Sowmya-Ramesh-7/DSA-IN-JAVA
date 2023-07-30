import java.util.*;

public class MatrixLinearSearch {
    public static void matrixSearch(int matrix[][],int key){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.print("The Element is found at row "+(i+1)+" and col "+(j+1));
                    return;
                }
            }
        }
        System.out.print("The search element is not found.");

    }

    public static void printMatrix(int matrix[][]){
        System.out.print("Matrix :");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and cols : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        System.out.print("Enter the elements :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printMatrix(matrix);
        System.out.print("Enter the Search element : ");
        int key=sc.nextInt();
        matrixSearch(matrix, key);

    }
}
