package Algorithm.medium.DP;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 *
 * Example:
 *
 * Input:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * Output: 4
 */
public class maximalSquare {
     /** 通用解法 这个方法还可以用来求矩阵里面正方形的最大值和最小值
      * https://www.youtube.com/watch?v=vkFUB--OYy0&t=734s
      * */
    public int maximalSquare(char[][] matrix) {

        if (matrix ==null || matrix.length==0|| matrix[0].length==0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] sums =new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                sums[i][j] = matrix[i-1][j-1]-'0'
                        +sums[i-1][j]
                        +sums[i][j-1]
                        -sums[i-1][j-1];
            }
        }
        int ans = 0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                for(int k=Math.min(m-i+1,n-j+1);k>0;k--){
                    int sum = sums[i+k-1][j+k-1]
                            -sums[i+k-1][j-1]
                            -sums[i-1][j+k-1]
                            +sums[i-1][j-1];
                    if(sum==k*k){
                        ans=Math.max(ans,sum);
                        break;
                    }
                }
            }
        }
        return ans;
    }
    /** 一种简单的做法
     * https://www.youtube.com/watch?v=_Lf1looyJMU
     * */
    public int maximalSquare2(char[][] a) {
        if(a.length == 0) return 0;
        int m = a.length, n = a[0].length, result = 0;
        int[][] b = new int[m+1][n+1];
        for (int i = 1 ; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(a[i-1][j-1] == '1') {
                    b[i][j] = Math.min(Math.min(b[i][j-1] , b[i-1][j-1]), b[i-1][j]) + 1;
                    result = Math.max(b[i][j], result); // update result
                }
            }
        }
        return result*result;
    }
}
