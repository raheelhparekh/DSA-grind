package Hashing;

import java.util.HashMap;
/*
 * LeetCode 2965 : Find the Missing and Repeating Number
 * Link: https://leetcode.com/problems/find-the-missing-and-repeating-number/
 * TC: O(n)
 * SC: O(n)
 * The approach is to flatten the 2d array to a single d array and then use a hashmap to store the frequency of each element.
 * Then we iterate from 1 to n and check if the element is present in the hashmap or not. If it is present then we check if the frequency is 2 or not.
 * If the frequency is 2 then it is the repeated element and if the element is not present in the hashmap then it is the missing element.
 * We return the repeated and missing element in an array.
 * 
 * Example 1: Input: grid = [[1,2,2],[3,4,5],[6,7,8]]
 *           Output: [2,9]
 *          Explanation: The missing number is 9 and the repeating number is 2.
 */
public class missing_and_repeating_number {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int arr[]=new int[n*m];
        int index=0;
        int x=arr.length;
        int[] ans=new int[2];
    
        // flattening the 2d array to a single d array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[index++]=grid[i][j];

            }
        }
        int repeated =-1;
        int missing=-1;
        HashMap<Integer,Integer> map=new HashMap<>();

        //putting all the values in hashmap
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        //hashmap fnction
        for(int i=1;i<=x;i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    repeated=i;
                }
            }
            else{
                 missing=i;
            }
        }
        ans[0]=repeated;
        ans[1]=missing;
        return ans;
    }
}
