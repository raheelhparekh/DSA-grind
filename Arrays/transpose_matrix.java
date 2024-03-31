package Arrays;
/*
 * LeetCode Problem 867 : Transpose Matrix
 * Link : https://leetcode.com/problems/transpose-matrix/
 * TC : O(m*n)
 * SC : O(1)
 * 
 *    NOTE: m x n matrix -> n x m matrix
 *          i,j -> j,i
 * 
 * 
 */

public class transpose_matrix {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] res=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=matrix[j][i];
            }
        }
        return res;
    }
}
