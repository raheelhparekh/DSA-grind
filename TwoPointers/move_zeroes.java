package TwoPointers;
/*
 * Leetcode 283. Move Zeroes to end of the array
 * Link: https://leetcode.com/problems/move-zeroes/
 * TC: O(N)
 * SC: O(1)
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

public class move_zeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            } else {
                count++;
            }
        }
        while (count != 0) {
            nums[j] = 0;
            count--;
            j++;
        }

    }
}
/*
 * public void moveZeroes(int[] nums) {

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }

        }
        for(int j=index;j<nums.length;j++){
            nums[index]=0;
            index++;
        }
        
    }
 */