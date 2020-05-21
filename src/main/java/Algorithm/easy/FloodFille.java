package Algorithm.easy;

/**
 * Flood fill
 *
 */
public class FloodFille {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        dfs(image,sr,sc,n,m,newColor,image[sr][sc]);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int n, int m, int nC, int oC){
        if (i < 0 || j < 0 || i >= n || j >= m || image[i][j] != oC || image[i][j]==nC) return;
        image[i][j] = nC;
        dfs(image,i-1,j,n,m,nC,oC);
        dfs(image,i,j-1,n,m,nC,oC);
        dfs(image,i+1,j,n,m,nC,oC);
        dfs(image,i,j+1,n,m,nC,oC);
    }
}
