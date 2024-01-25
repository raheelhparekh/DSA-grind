package BinarySearch;
/*
 * Leetcode 162. Find Peak Element
 * Description: https://leetcode.com/problems/find-peak-element/
 * 
 * Time complexity: O(logn)
 * Space complexity: O(1)
 * 
 * Mid element dhunda , agar left aur right se bada hua toh sidha return mid. isme agar mid==0 aur mid==nums.length-1 bhi check karna padega kyu ki agar mid==0 aur mid==nums.length-1 hoga toh mid-1 aur mid+1 index out of bound exception dega.
 * agar right element bada hua toh low=mid+1 
 * agar left bada hua toh high=mid-1
 */

class PeakElement {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length==0) return -1;

        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if( (mid==0||nums[mid]>nums[mid-1]) &&(mid==nums.length-1||nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(mid!=nums.length-1 && nums[mid+1]>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
}
