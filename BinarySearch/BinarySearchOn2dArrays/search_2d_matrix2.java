package BinarySearch.BinarySearchOn2dArrays;
/*
 * Leetcode 240: Search a 2D Matrix II
 * Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
 * 
 * TC= O(n+m) max case goes through all rows and columns
 * SC= O(1)
 * You can only start from top right/ bottom left corners
   Bcoz we can eliminate one side and make decisions
 */
public class search_2d_matrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;

            }
        }
        return false;
    }
}
