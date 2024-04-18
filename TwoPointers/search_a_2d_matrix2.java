package TwoPointers;
/*
 * LeetCode: 240. Search a 2D Matrix II
 * TC=0(m+n) and not 0(m*n) since we can max move only m rows and n columns
 * SC=0(1)
 * Approach: Start from top right corner and move left if target is greater than matrix element else move down
 * We can also start from bottom left corner and move right if target is greater than matrix element else move up
 * BUT we cannot start from top left or bottom right corner since we cannot decide which direction to move
 * If no element is found ie it will go out of matrix then return false
 * 
 */

public class search_a_2d_matrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (target > matrix[i][j]) {
                // move left if target is greater
                i++;

            } else {
                // move down if target is less
                j = j - 1;
            }
        }

        return false;
    }
}
