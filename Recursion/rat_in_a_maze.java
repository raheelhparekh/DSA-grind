package Recursion;
/*
   Rat in a Maze Problem : Recursion + Backtracking
 * Link: https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
 * Tc - O(4^(n*n)) // bcoz for each we will checkin 4 directions
 * Sc - O(n*n) //  incase all cells visited worst case
 */

import java.util.ArrayList;

public class rat_in_a_maze {
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        int n=mat.size();
        int vis[][]=new int[n][n];
        ArrayList<String> ans=new ArrayList<>();
        
        solve(0,0,"",ans,n,vis,mat);
        return ans;
    }
    
    public void solve(int i,int j,String ds,ArrayList<String> ans,int n,int vis[][],ArrayList<ArrayList<Integer>> mat){
        // Base case
        if(i==n-1 && j==n-1){
            ans.add(ds);
            return;
        }
        
        // Down
        if (i + 1 < n && vis[i + 1][j] == 0 && mat.get(i + 1).get(j) == 1) {
            vis[i][j] = 1; // marked as visited
            solve(i + 1, j, ds + "D", ans, n, vis, mat);
            vis[i][j] = 0; // backtracking and unmarked as not visited
        }

        // Left
        if (j - 1 >= 0 && vis[i][j-1] == 0 && mat.get(i).get(j-1) == 1) {
            vis[i][j] = 1;
            solve(i , j-1, ds + "L", ans, n, vis, mat);
            vis[i][j] = 0;
        }

        // Right
        if (j + 1 < n && vis[i][j + 1] == 0 && mat.get(i).get(j + 1) == 1) {
            vis[i][j] = 1;
            solve(i, j + 1, ds + "R", ans, n, vis, mat);
            vis[i][j] = 0;
        }

        // Up
        if (i - 1 >= 0 && vis[i-1][j] == 0 && mat.get(i-1).get(j) == 1) {
            vis[i][j] = 1;
            solve(i-1, j, ds + "U", ans, n, vis, mat);
            vis[i][j] = 0;
        }
    }
    
}
