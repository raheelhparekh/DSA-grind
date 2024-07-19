package Math;

import java.util.ArrayList;
import java.util.List;
/*
 * LeetCode 1380. Lucky Numbers in a Matrix
 * Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * TC: O(m*n)
 * SC: O(1)
 * 
 * Approach:
 * 
 * First found minimuum element in each row ;
 * uska index nikal liya;
 * value of that index in all the rows check kiya;
 * Then check if the minimum element is the maximum element in the column;
 * If yes, then add it to the ans;
 */

public class lucky_numbers_in_matrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 0; j < n; j++) {

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;

                }

            }
            boolean flag = true;
            for (int row = 0; row < m; row++) {
                if (matrix[row][index] > min) {
                    flag = false;
                }
            }
            if (flag) {
                ans.add(min);
            }
        }

        return ans;
    }
}
