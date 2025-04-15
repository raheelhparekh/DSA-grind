package BinarySearch.BinarySearchOn2dArrays;
// Leetcode problem: 74. Search a 2D Matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/
// Idea: Binary Search

// Time Complexity: O(log(m*n))
// Space Complexity: O(1)

/* Approach: Consider the 2D matrix as a 1D array in head
 high=n*m-1
 formula to convert mid to 2d coordinates
 row=mid/n
  column=mid%n
*/



class Search_2d_matrix {
    public boolean search_2d_matrix(int[][] matrix, int target) {
        if(matrix== null || matrix.length==0) return false;
        int m=matrix.length;
        int n=matrix[0].length;

        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid= low+(high-low) /2;
            int row= mid/n;
            int column=mid%n;
            if(matrix[row][column]==target){
                return true;
            }
            else if(target<matrix[row][column]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }


        }
        return false;
        
    }
}