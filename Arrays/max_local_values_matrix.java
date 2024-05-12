package Arrays;
/*
 * LeetCode 2373 Maximum Local Values Matrix
 * Link: https://leetcode.com/problems/maximum-local-values-matrix/
 * Time Complexity: O(n*m)
 * Space Complexity: O(n)
 */

public class max_local_values_matrix {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length; 
        int m=grid[0].length; 
        int[][] ans=new int[n-2][m-2]; 

        for(int i=0;i<n-2;i++){ 
            for(int j=0;j<m-2;j++){ 
                ans[i][j]=findLargestGrid(grid,i,j); 
            }
        }
    return ans;
    }

    private int findLargestGrid(int[][] grid, int row,int col){
        int best=grid[row][col];
        for(int i=row;i<row+3;i++){ 
            for(int j=col;j<col+3;j++){ 
                best=Math.max(best,grid[i][j]); 
            }
        }
        return best;
    }
}
