class NumberOfClosedIslands {
    public int closedIsland(int[][] grid) {
        int ans = 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if( grid[i][j] == 0 ){
                    boolean temp = helper(grid,i,j);
                    if( temp ) ans++;
                }
            }
        }
        
        return ans;
    }
    
    public boolean helper(int[][] grid, int row , int col){
        if( row < 0 || row >= grid.length || col < 0 || col >= grid[0].length ) return false;
        
        if( row == 0 || row == grid.length-1 || col == 0 || col == grid[0].length-1 ){
            if( grid[row][col] == 0 ) return false;
        }
        
        if( grid[row][col] == 1 ) return true;
        
        grid[row][col] = 1;
        
        return helper(grid,row-1,col) & helper(grid,row+1,col) & helper(grid,row,col-1) & helper(grid,row,col+1);
    }
}