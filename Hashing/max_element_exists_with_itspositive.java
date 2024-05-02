package Hashing;
import java.util.HashSet;

/*
 * Leetcode Problem 2411:Largest Positive Integer That Exists With Its Negative
   Link : https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/
   TC : O(N)
   SC : O(N)
   Approach: set me sab numbers ko add kiya. wapas iterate set pe joh number hai uska negative hai ya nahi check kiya.agar he toh usko max me store kiya
 */

public class max_element_exists_with_itspositive {
    public int findMaxK(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);   
        }
        for(int i:set){
            if(set.contains(-i)){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}

/* Sort kiya . Two pointer approach
    TC: O(NlogN) SC: O(1)
    public int findMaxK(int[] nums) {
     Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(((-1)*nums[i])==nums[j]){
                return nums[j];
            }
            else if(nums[j] > ((-1)*nums[i])){
                j--;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
 */