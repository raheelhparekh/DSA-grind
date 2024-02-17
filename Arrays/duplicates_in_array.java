package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
 *  LeetCode: 442. Find All Duplicates in an Array
 *  Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *  TC=O(n) SC=O(n)
 */

public class duplicates_in_array {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(!set.add(arr[i])){
                list.add(arr[i]);
            }
            
        }
        // if(list.isEmpty()){
        //     list.add(-1);
        // }
        // else{
        //     Collections.sort(list);
        // }
        return list;
    }
}
