package Hashing;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode: 13. Roman to Integer
 * Link: https://leetcode.com/problems/roman-to-integer/
 * TC: O(n)
 * SC: O(1)
 * 
 * Logic 
 * we are moving from left to right
   if it is suppose IX ie 1 is less than 10 (left one is less than right one)--> we have to subtract 1 from 10
   like wise if it was XI ie (left one 10 is greater than 1 ) --> we just need to add to ans.
 */

public class roman_to_integer {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && map.get(s.charAt(i))< map.get(s.charAt(i+1))){
                ans-=map.get(s.charAt(i));
            }
            else{
                ans+=map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
