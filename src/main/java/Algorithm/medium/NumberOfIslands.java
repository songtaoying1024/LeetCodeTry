package Algorithm.medium;

/**
 * Given a 2d grid map of ''1''s (land) and ''0''s (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example '1':
 *
 * Input:
 * '1''1''1''1''0'
 * '1''1''0''1''0'
 * '1''1''0''0''0'
 * '0''0''0''0''0'
 *
 * Output: '1'
 * Example 2:
 *
 * Input:
 * '1''1''0''0''0'
 * '1''1''0''0''0'
 * '0''0''1''0''0'
 * '0''0''0''1''1'
 *
 * Output 3;
 */
public class NumberOfIslands {
    /**
     * use DFS search algorithm
     * find one island firstly
     * change all the adjacent to zero
     * @param grid
     * @return
     */
    public static int numIslands(char[][] grid) {
        int count =0;
        int n = grid.length;
        if(n ==0 )return 0;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    DFSMarking(grid,i,j,n,m);
                    count++;

                }
            }
        }
        return count;
    }
    public static void DFSMarking (char[][] grid, int i, int j, int n, int m){
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] ='0';
        DFSMarking(grid,i-1,j,n,m);
        DFSMarking(grid,i+1,j,n,m);
        DFSMarking(grid,i,j+1,n,m);
        DFSMarking(grid,i,j-1,n,m);
    }
    public static void main(String[] args) {
        char[][] test = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        int res =numIslands(test);
        System.out.println(res);
    }
}
