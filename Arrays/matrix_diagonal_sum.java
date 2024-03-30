package Arrays;
/*
 * Leetcode Prob No 1572 : https://leetcode.com/problems/matrix-diagonal-sum/
 * TC=O(m*n) SC=O(1)
 * If i==j or i+j==n-1 then add the element to the sum
 * 
 */

public class matrix_diagonal_sum {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int i = 0;
        int j = 0;
        int count = 0;

        // Iterate over the matrix
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                // Check if current cell is on the main diagonal or secondary diagonal
                if (i == j || i + j == n - 1) {
                    count += mat[i][j];
                }
            }
        }

        return count;
    }
    
}
