package Patterns;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 54. Spiral Matrix 1
 * Link: https://leetcode.com/problems/spiral-matrix/
 * 
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 * 4 pointers to keep track of the boundaries of the matrix
 * 
 *  
 */

class spiral {

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int i = top;

        while (top <= bottom && left <= right) {

            for (i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {

                for (i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;

            }

        }
        return list;

    }
}
