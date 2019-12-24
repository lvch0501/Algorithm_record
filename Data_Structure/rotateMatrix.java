import java.util.Arrays;

public class rotateMatrix {
    // 给定一个n*n矩阵，要求在原数组上将其顺时针旋转90度
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        rotate(matrix);
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    public static void rotate(int[][] matrix){
        int row1 = 0;
        int col1 = 0;
        int row2 = matrix.length-1;
        int col2 = matrix[0].length-1;

        while(row1<=row2&&col1<=col2){
            rotateEdge(matrix, row1++, col1++, row2--, col2--);
        }
    }
    public static void rotateEdge(int[][] matrix, int row1, int col1, int row2, int col2){
        int times = row2 - row1;
        for(int i=col1; i!=col2;i++){
            int temp = matrix[row1][i];
            matrix[row1][i] = matrix[row1+i-col1][col2];
            matrix[row1+i-col1][col2] = matrix[row2][col2-(i-col1)];
            matrix[row2][col2-(i-col1)] = matrix[row2-(i-col1)][col1];
            matrix[row2-(i-col1)][col1] = temp;
        }

    }
}
