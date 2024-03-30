package Arrays;
/*
 * Leetcode Prob No 2319 :https://leetcode.com/problems/check-if-matrix-is-x-matrix/
 */

public class check_xmatrix {
    public boolean checkXMatrix(int[][] grid) {
        if(grid==null || grid.length==0) return false;

        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(i==j || i+j==n-1){
                    if(grid[i][j]>=1){
                        continue;

                    }
                    else{
                        return false;
                    }
                }

                else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
