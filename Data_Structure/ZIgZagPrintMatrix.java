public class ZIgZagPrintMatrix {


    // 给定一个矩阵，之字形打印其中所有元素
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        printMatrixZigZag(matrix);
    }

    public static void printMatrixZigZag(int[][] matrix){
        int row1 = 0;
        int row2 = 0;
        int col1 = 0;
        int col2 = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        boolean flag = false;
        while (row2<=endrow){
            printLevel(matrix, row1, col1, row2, col2, flag);
            col1 = row1==endrow?col1+1:col1;
            row1 = row1==endrow?row1:row1+1;
            row2 = col2==endcol?row2+1:row2;
            col2 = col2==endcol?col2:col2+1;
            flag=!flag;
        }

    }

    public static void printLevel(int[][] matrix, int row1, int col1, int row2, int col2, boolean flag){
        if(flag){
            while(row2<=row1){
                System.out.print(matrix[row2++][col2--]+" ");
            }
        }else {
            while(row1>=row2){
                System.out.print(matrix[row1--][col1++]+" ");
            }
        }
    }
}
