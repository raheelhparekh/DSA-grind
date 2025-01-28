package Recursion;
/*
 * Leet Prob 51: N-Queens
 * Link: https://leetcode.com/problems/n-queens/
 * Approach: the search operation to check for the queen in left, left upper diagnol, left  lower diagnol using while loop takes O(n) time.
 * Time Complexity: O(n! *n)
 * Space Complexity: O(n)+O(n)+O(n)=O(n)
 */

import java.util.ArrayList;
import java.util.List;
public class n_queens_approach1 {
    public List<List<String>> solveNQueens(int n) {
        List < List < String >> ans= new ArrayList<> ();
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        function(0, board, ans,n);
        return ans;
        
    }

    public void function(int col,char board[][],List < List < String >> ans,int n){

        if(col==n){
            ans.add(construct(board));
            return;
        }

        // checking a row where to place the queen therefore row=0->n
        for(int row=0;row<n;row++){
            if(canPlaceTheQueen(col,row,board)){
                board[row][col]='Q';
                function(col+1,board,ans,n); // recursive call
                board[row][col]='.'; // backtrack to before state
            }
        }

    }

    // checking the correct place to place the queen function
    public boolean canPlaceTheQueen(int col,int row, char[][] board){
        int dupRow=row;
        int dupCol=col;
        // for upper left diagnol
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        
        // checking for left sleeping line
        row=dupRow;
        col=dupCol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }

        // for lower left diagnol
        row=dupRow;
        col=dupCol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }

        return true;
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
