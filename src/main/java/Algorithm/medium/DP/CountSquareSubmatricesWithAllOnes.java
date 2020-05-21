package Algorithm.medium.DP;

/**
 * leecode 1227
 * Dynamic programming
 *
 */
public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int row = matrix.length,col = matrix[0].length,res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]>0&&i>0&&j>0){
                    matrix[i][j]=Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i][j-1]))+1;
                }
                res+=matrix[i][j];
            }
        }
        return res;
    }
}
