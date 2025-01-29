package Recursion;
/*
 * Leet Prob 37: Sudoku Solver
 * Link: https://leetcode.com/problems/sudoku-solver/
 * 
 */

public class sudoku_solver {
    public void solveSudoku(char[][] board) {
        solve(board);
        return;
    }

    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                // if you find an empty space
                if(board[i][j]=='.'){

                    //loop from characters 1->9 to fit 
                    for(char c='1';c<='9';c++){

                        if(valid(board,i,j,c)){
                            board[i][j]=c;

                            if(solve(board)==true){
                                return true;
                            }
                            else{
                                //backtack
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        // we never find any empty spaces since it never went inside the valid condition in the sudoku that means sudoku is already completed
        return true; 
    }
    public boolean valid(char[][] board,int row,int col,char c){

        for(int i=0;i<9;i++){

            // checking for straight line
            if(board[i][col]==c){
                return false;
            }

            // checking for sleeping line
            if(board[row][i]==c){
                return false;
            }

            // to check the 3*3 matrix inside the 9*9.
            // this is the formula to calculate the row,col
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;
    }
}
