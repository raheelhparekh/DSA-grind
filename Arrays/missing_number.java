package Arrays;
/*
 * Leetcode: 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 * TC: O(n)
 * SC: O(1)
 * Most Optimal Solution using XOR
 */
public class missing_number {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor1 ^= nums[i]; // 3^0^1
            xor2 ^= i; // 0^1^2
        }

        xor2 ^= n; // 0^1^2^3

        return xor1 ^ xor2; // ans=2
    }
    /* 
    Second Method: using math formula
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=n*(n+1)/2;
        int count=0;
        
        for(int i=0;i<n-1;i++){
             count=count+array[i];
        }
        return sum-count;
        
    }
    */
    
}
