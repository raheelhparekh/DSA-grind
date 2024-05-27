package Arrays;
/*
 * LeetCode 1608. Special Array With X Elements Greater Than or Equal X
 * Link : https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
 * TC : O(n^2)
 * SC : O(1)
 * 
 * Input: nums = [3,5]
 * Output: 2
 * Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
 * 
 * Input: nums = [0]
 * Output: 0
 * Explanation: There are no values that are greater than or equal to 1.
 * 
 * Input: nums = [0,4,3,0,4]
 * Output: 3
 * Explanation: There are 3 values that are greater than or equal to 3.
 */
class special_array_with_element_greater_than_x{
    public int specialArray(int[] nums) {
        int len=nums.length;
        int count;
        int i;
        int x=1;
        
        do{
            count=0;

            for(i=0;i<len;i++){
                if(nums[i]>=x){
                    count++;
                }
            }
            if(count==x){
                return count;
            }
            x++;
            
        }while(x<=len);


        return -1;
        
    }
}

