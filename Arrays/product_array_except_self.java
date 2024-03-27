package Arrays;
/*
    Leetcode Problem 238: Product of Array Except Self
 *  Leetcode: https://leetcode.com/problems/product-of-array-except-self/
 *  TC: O(n) SC: O(1)
 *  Approach:
 *  1) We will first calculate the product of all elements to the left of the element initialsing the result array with 1 at 0th index
 * 2) Then we will calculate the product of all elements to the right of the element and multiply it with the result array
 * 
 */

public class product_array_except_self {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums==null || nums.length==0) return new int[]{};
        int res[]=new int[nums.length];

        int rp=1;
        res[0]=1;
        // moving left to write
        for(int i=1;i<nums.length;i++){
            rp=rp*nums[i-1];
            res[i]=rp;

        }

        rp=1;
        // moving right to left now
        for(int i=nums.length-2;i>=0;i--){
            rp*=nums[i+1];
            res[i]*=rp;
        }

        return res;
    }
}

/*

    Using extra space SC=0(n)
    Find the product of all elements to the left of the element and store it in left array
    Find the product of all elements to the right of the element and store it in right array
    Multiply left[i]*right[i] and store it in result array


 * public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;

        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=left[i]*right[i];
        }

        return res;
    }
 */