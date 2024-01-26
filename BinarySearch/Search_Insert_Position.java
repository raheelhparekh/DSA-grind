package BinarySearch;

/*  Leetcode: https://leetcode.com/problems/search-insert-position/
    Leetcode Problem: 35. Search Insert Position

    Time Complexity: O(logn)
    Space Complexity: O(1)
    
*/

class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        if(target>nums[high]) return high+1;
        if(target<nums[low]) return 0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
                
            }
        }
        return low;
    }
}
