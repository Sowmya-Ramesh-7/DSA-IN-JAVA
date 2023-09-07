
public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow=0,startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        System.out.print("Spiral Matrix :");
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){

                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startCol+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        }
        public static void printMatrix(int matrix[][]){
            System.out.println("Matrix :");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            int matrix[][]={{14,6,7},{2, 4,5},{1,2,3}};
            printMatrix(matrix);
            printSpiral(matrix);
    }
}
