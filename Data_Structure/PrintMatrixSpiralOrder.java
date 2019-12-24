public class PrintMatrixSpiralOrder {


    // 顺时针打印矩阵中的所有元素

    public static void main(String[] args) {
        int[][] matrix = {{1}};
        spoiralOrderPrint(matrix);
    }
    public static void spoiralOrderPrint(int[][] matrix){
        int row1 = 0;
        int col1 = 0;
        int row2 = matrix.length-1;
        int col2 = matrix[0].length-1;
        while (row1<=row2&&col1<=col2){
            printEdge(matrix, row1++, col1++, row2--, col2--);
        }

    }

    public static void printEdge(int[][] matrix, int row1, int col1, int row2, int col2){
        if(row1==row2){
            while(col1<=col2){
                System.out.print(matrix[row1][col1++]+" ");
            }
        }else if(col1==col2){
            while (row1<=row2){
                System.out.print(matrix[row1++][col1]+" ");
            }
        }else {
            int newrow1 = row1;
            int newcol1 = col1;
            while(col1<col2){
                System.out.print(matrix[row1][col1++]+" ");
            }
            while(row1<row2){
                System.out.print(matrix[row1++][col2]+" ");
            }
            while(col2>newcol1){
                System.out.print(matrix[row2][col2--]+" ");
            }
            while(row2>newrow1) {
                System.out.print(matrix[row2--][newcol1]+" ");
            }
        }
    }

}
