package Basic;
/*
 * LeetCode 2540. Minimum Common Value
 * Link: https://leetcode.com/problems/minimum-common-value/
 * TC: O(n+m)
 * SC: O(1)
 * Example 1:

    Input: nums1 = [1,2,3], nums2 = [2,4]
    Output: 2
    Explanation: The smallest element common to both arrays is 2, so we return 2.
    Example 2:

    Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
    Output: 2
    Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 * 
 */

public class minimum_common_value {
    public int getCommon(int[] nums1, int[] nums2) {

        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else{
                j++;
            }
        }
        return -1;    
    }
}
