public class countIsland {

    public int numIslands(char[][] grid) {
        if(grid.length==0)return 0;
        int row2 = grid.length-1;
        int column2 = grid[0].length-1;
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    spread(row2, column2, i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public static void spread(int row2, int column2, int i, int j, char[][] grid){
        if(i<0||i>row2||j<0||j>column2||grid[i][j]!='1'){
            return;
        }
        grid[i][j] = '2';
        spread(row2, column2, i-1, j, grid);
        spread(row2, column2, i+1, j, grid);
        spread(row2, column2, i, j-1, grid);
        spread(row2, column2, i, j+1, grid);
    }
}
