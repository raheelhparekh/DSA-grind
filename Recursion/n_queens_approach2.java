package Recursion;
/*
 * Leet Prob 51: N-Queens
 * Link: https://leetcode.com/problems/n-queens/
 * Approach: maintaining a hashing frequency array for leftRow, leftLowerDiagnol and leftUpperDiagnol reduces the space complexity
 * Time Complexity: O(n! *n)
 * Space Complexity: O(n)
 * 
 */

import java.util.ArrayList;
import java.util.List;
public class n_queens_approach2 {
    public List<List<String>> solveNQueens(int n) {
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
        return ans;
        
    }

    public void function(int col,char board[][],List < List < String >> ans,int n,int[] leftRow,int[] leftLowerDiagnol, int[] leftUpperDiagnol){

        if(col==n){
            ans.add(construct(board));
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
    // constructing the board which is to be added to the answer
    public List<String> construct(char[][] board){
        List<String> resultantBoard=new ArrayList<>();

        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            resultantBoard.add(s);
        }
        return resultantBoard;

    }
}
