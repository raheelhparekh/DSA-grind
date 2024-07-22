package Sorting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Leetcode 2418. Sort the People
 * Link: https://leetcode.com/problems/sort-the-people/
 * TC: O(NlogN)
 * SC: O(N)
 * 
 *  // pehle sab heights aur names ko map me dala
    // heights array ko sort kiya
    // sabse bada wala element would be last in heights array
    // index=0 kiya initialise and ran loop from end to beginning and extracted value of the names of that height
 */

public class sort_the_people {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int index=0;

        for(int i=heights.length-1;i>=0;i--){
            String ans=map.get(heights[i]);
            names[index++]=ans;
        }
        return names;   
    }
}
