package Patterns;
/*
 * LeetCode 59. Spiral Matrix 2
 * Link: https://leetcode.com/problems/spiral-matrix-ii/
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * 
 * 4 pointers to keep track of the boundaries of the matrix
 * 
 *  
 */

public class spiral2 {
    
        public int[][] generateMatrix(int n) {
            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = n - 1;
            int c = 1;
    
            int m[][] = new int[n][n];
    
            while (c <= n * n) {
    
                for (int i = left; i <= right; i++) {
                    m[top][i] = c;
                    c++;
    
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    m[i][right] = c;
                    c++;
    
                }
                right--;
    
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        m[bottom][i] = c;
                        c++;
    
                    }
                    bottom--;
    
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        m[i][left] = c;
                        c++;
    
                    }
                    left++;
    
                }
    
            }
    
            return m;
    
        }
    
    
}
