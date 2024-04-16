package Math;
/*
 * Leetcode: 66. Plus One
 * TC: O(n)
 * SC: O(1) // ANS array is not considered as extra space
 * 
 * Approach: we start from end. If it is 9, we make it 0 and move to next digit. If it is not 9, we add 1 to it and return the array.
 * If we reach the start of array, we create a new array of size n+1 and set first element as 1.
 * 
 * 
 */

public class plus_one {
    public int[] plusOne(int[] digits) {
        int s = digits.length; 
        int i = s-1; // start from end
        while(i>=0){
            if (digits[i]==9){ 
                digits[i] = 0;
                i--;
            }
            else{
                digits[i] = digits[i] + 1;
                return digits; 
            }
           
        }
        int[] ans = new int[s+1];
        ans[0]=1;
        return ans;
    }
    
}
