package Recursion;

/*
 *  Approach 2: using a swap strategy
 *  Tc: O(n*n!)
 *  Sc: O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class permutations_approach2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        function(0, nums, ans);
        return ans;
    }

    public void function(int index, int[] arr, List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);

            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(index, i, arr);
            function(index + 1, arr, ans);
            swap(index, i, arr); // backtrack

        }
    }

    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}