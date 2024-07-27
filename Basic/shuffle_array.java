package Basic;
/*
 * LeetCode 1470. Shuffle the Array
 * Link: https://leetcode.com/problems/shuffle-the-array/
 * TC: O(n)
 * SC: O(n)
 */

public class shuffle_array {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=nums.length/2;

        int[] ans=new int[nums.length];
        int index=0;

        for(int x=0;x<nums.length;x++){
            if(x%2==0){
                ans[index++]=nums[i++];
            }
            else{
                ans[index++]=nums[j++];
            }
        }
        return ans;
        
    }
}
