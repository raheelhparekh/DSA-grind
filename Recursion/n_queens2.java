package Recursion;

/*
 * Leet Prob 52. N-Queens II
 * Link: https://leetcode.com/problems/n-queens-ii/
 * Tc: O(n!*n)
 * Sc: O(n)
 */

import java.util.ArrayList;
import java.util.List;
public class n_queens2 {
    public int sum;
    public int totalNQueens(int n) {
        List < List < String >> ans= new ArrayList<> ();
        char[][] board=new char[n][n];
        int[] leftRow=new int[n];
        int[] leftLowerDiagnol=new int[2*n-1];
        int[] leftUpperDiagnol=new int[2*n-1];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        function(0, board, ans,n,leftRow,leftLowerDiagnol,leftUpperDiagnol);
        return sum;

    }

    public void function(int col,char board[][],List < List < String >> ans,int n,int[] leftRow,int[] leftLowerDiagnol, int[] leftUpperDiagnol){

        if(col==n){
            sum++;
            return;
        }

        for(int row=0;row<n;row++){
            if(leftRow[row]==0 && leftLowerDiagnol[row+col]==0 && leftUpperDiagnol[(n-1)+(col-row)]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                leftLowerDiagnol[row+col]=1;
                leftUpperDiagnol[(n-1)+(col-row)]=1;
                function(col+1,board,ans,n,leftRow,leftLowerDiagnol,leftUpperDiagnol);

                // backtrack
                board[row][col]='.';
                leftRow[row]=0;
                leftLowerDiagnol[row+col]=0;
                leftUpperDiagnol[(n-1)+(col-row)]=0;
            }
        }
    }
}
