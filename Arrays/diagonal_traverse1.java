package Arrays;
/*
    Leetcode Problem 498: Diagonal Traverse
    Link: https://leetcode.com/problems/diagonal-traverse/
    Approach: 2 cases: 1) Upward direction 2) Downward direction
    1) Upward direction: 
        a) If j==n-1 meaning j is at the end and we need to increase i . NOTE: This condition should be checked first as we need to check this before i==0.
        b) If i==0 meaning i is at the start and we need to increase j
        c) General case: i-- and j++
    2) Downward direction:
        a) If i==m-1 meaning i is at the end and we need to increase j . NOTE: This condition should be checked first as we need to check this before j==0.
        b) If j==0 meaning j is at the start and we need to increase i
        c) General case: i++ and j--
    3) We will keep on traversing the array until we reach the end of the array
    4) We will keep on updating the result array with the elements in the diagonal order
    5) Finally return the result array
 *  TC = O(m*n): traversing the m*n array
    SC=0(1)
    Solved by me: Yes Reference S30
 */

public class diagonal_traverse1 {
    class Solution {
        
        public int[] findDiagonalOrder(int[][] mat) {
            if (mat == null || mat.length == 0)
                return new int[] {};
    
            int m = mat.length;
            int n = mat[0].length;
            int result[] = new int[m * n];
            int index = 0;
            int i = 0;
            int j = 0;
            int d = 1; // 1 means upward direction and -1 meaning downward direction
    
            while (index < m * n) {
    
                result[index] = mat[i][j];
                index++;
    
                // upward direction
                if (d == 1) {
                    // changing to downward direction if j==n-1 meaning j is at the end and we need
                    // to increase i
                    if (j == n - 1) {
                        d = -1;
                        i++;
    
                    }
                    // changing to downward direction if i becomes 0
                    else if (i == 0) {
                        d = -1;
                        j++;
    
                    }
                    // general case
                    else {
                        i--;
                        j++;
    
                    }
    
                }
                // downward direction
                else {
                    if (d == -1) {
    
                        // changing to upward direction if i==m-1 meaning i is at the end and we need to
                        // increase j
                        if (i == m - 1) {
                            d = 1;
                            j++;
    
                        }
                        // changing to upward direction if j becomes 0
                        else if (j == 0) {
                            d = 1;
                            i++;
    
                        }
                        // general case
                        else {
                            i++;
                            j--;
    
                        }
                    }
    
                }
    
            }
    
            return result;
        }
    }
}
