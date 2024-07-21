package Hashing;
import java.util.HashMap;

/*
 * LeetCode: 383. Ransom Note
 * Link: https://leetcode.com/problems/ransom-note/
 * TC: O(n)
 * SC: O(n)
 */

public class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch: ransomNote.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int size=map.size();

        for(char c: magazine.toCharArray()){

            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                    size--;
                }
                if(size==0){
                    return true;
                }
            }

        }
        return false;
    }
}
