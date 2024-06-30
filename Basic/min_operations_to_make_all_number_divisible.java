package Basic;
/*
 * 3190. Find Minimum Operations to Make All Elements Divisible by Three
 * Link: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
 * TC: O(N)
 * SC: O(1)
 * Input: nums = [1,2,3,4]
    Output: 3

    Explanation:

    All array elements can be made divisible by 3 using 3 operations:

    Subtract 1 from 1.
    Add 1 to 2.
    Subtract 1 from 4.
 */

public class min_operations_to_make_all_number_divisible {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num%3==0){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
