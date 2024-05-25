package Arrays;
/*
 * Leetcode 1929 : Concatenation of Array
 * Link : https://leetcode.com/problems/concatenation-of-array/
 * TC : O(n)
 * SC : O(n)
 * Input: nums = [1,2,1]
   Output: [1,2,1,1,2,1]
 * 
 */

public class concatenation_arrays {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int index = 0;
        int count = 2;

        while (count != 0) {
            for (int i = 0; i < nums.length; i++) {
                ans[index] = nums[i];
                index++;
            }

            count--;

        }
        return ans;

    }
}
/*  Better Method.
 *  public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }
 */