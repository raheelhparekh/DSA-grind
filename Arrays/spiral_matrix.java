package Arrays;
/*
 * Leetcode Prob No 54 : https://leetcode.com/problems/spiral-matrix/
 * TC=O(m*n) SC=O(1)
 * Approach: 4 pointers left, right, top, bottom
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
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
