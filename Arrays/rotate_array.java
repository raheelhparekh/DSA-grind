package Arrays;
/*
    Leetcode: 189. Rotate Array
    Link: https://leetcode.com/problems/rotate-array/
    TC: O(n)
    SC: O(1)

    Example: 
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class rotate_array {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n; //  V IMPPP: In case k is greater than the length of the array
        // Because rotating an array of size 3 by 3 times will bring it to same array

        reverse(nums, 0, n - 1);   // Reverse the entire array
        reverse(nums, 0, k - 1);   // Reverse the first k elements
        reverse(nums, k, n - 1);         // Reverse the rest of the array
    }

    private void reverse(int nums[],int start,int end){

        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    
}
