package Hashing;
import java.util.HashMap;

/*
 * LeetCode Problem 1460. Make Two Arrays Equal by Reversing Sub-arrays
 * Link: https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * TC: O(n)
 * SC: O(n) 
    Note: We are not looking to find the subarray, we are looking to find if we can make two arrays equal by reversing subarrays , so two arrays can be equal if they have same elements in them and same frequency of elements in them.
    we adding all elements from first array in target array and then we will remove all element of arr array.incase MAP is not empty means return false, else map will be empty and answer is true
 */

public class make_two_arrays_equal_with_reversing_subarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int val=0;

        if(target.length!=arr.length) return false; //if two arrays length not same, means they cannot be equal
        if(target.length==1 && arr.length==1 && target[0]==arr[0]) return true; // if two arrays have 1 element and both element are same 

        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:target){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int nums:arr){
            if(map.containsKey(nums)){
                val=map.get(nums);
                val--;
                if(val==0){
                    map.remove(nums);
                }
                else{
                    map.put(nums,val);

                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
