package Arrays;
/*
 * LeetCode 1299 Replace Elements with Greatest Element on Right Side
 * Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
   Started from the end of the array and kept track of the maximum element seen so far.
 */

public class replace_with_greatest_element_on_right {
    public int[] replaceElements(int[] arr) {
        int n=arr.length-1;
        int max_seen=arr[n];
        int temp=0;


        for(int i=arr.length-2;i>=0;i--){
            temp=arr[i];
            arr[i]=max_seen;
            if(temp>max_seen){
                max_seen=temp;
            }
        }
        arr[n]=-1;


    return arr;
        
    }
}
