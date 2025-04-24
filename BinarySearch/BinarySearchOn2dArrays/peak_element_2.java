package BinarySearch.BinarySearchOn2dArrays;
/*
 * Leetcode 1901. Find a Peak Element II
 * Link : https://leetcode.com/problems/find-a-peak-element-ii/
 * TC = O(logm * n)
 * SC = O(1)
 * 
 * Approach : Keep low and high for the column and find the mid column.
 * Find the maximum element in that column. 
 * check and comare the left and right element of that maximum element.
 * If the maximum element is greater than both left and right, then return that element.
 * If the maximum element is less than left, then move to the left side of the column.
 * If the maximum element is less than right, then move to the right side of the column.
 * Repeat the process until you find the peak element.
 */

public class peak_element_2 {
    public int[] findPeakGrid(int[][] mat) {

        int n=mat.length;
        int m=mat[0].length;

        int low=0;
        int high=m-1;
        

        while(low<=high){
            int mid=low+(high-low)/2;
            int max=Integer.MIN_VALUE;
            int index=0;

            for(int i=0;i<n;i++){
                if(mat[i][mid]>max){
                    max=mat[i][mid];
                    index=i;
                }
            }

            int left=mid-1>=0 ? mat[index][mid-1] : -1;
            int right=mid+1<m ? mat[index][mid+1] :-1;

            if(max>left && max>right){
                return new int[]{index,mid};
            }

            if(max<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}
