package Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*
 Leetcode Problem 49 : Group Anagrams
 Description: https://leetcode.com/problems/group-anagrams/
 Time Complexity: O(nklogk) where n is the length of the array and k is the length of the longest string in the array and log because the best sorting algorithm takes O(log n) time
 * Space Complexity: O(nk) because we are using a hashmap to store the strings
 * 
 * 
 * 
  Pehle string liya usko char array me convert kiya then sort kiya then string me convert kiya and then hashmap me key nai hoga toh we add the key and assign a list to it and then add the string to the list. agar already key hai toh we add the string to the list.
 */

class group_anagrams {
    //Approach 1 : where we sort the characters in the string and then put them as key 
    // TC needs to be discussed O(nklogk)
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

}


/*      More OPTIMAL since reduced from nklogk to nk

    // Approach 2 : where we assign first 26 alphabets as fixed prime numbers and we multiple and whenever two words with same charater multiple thier product will be the same.
    // TC needs to be discussed O(nk)
 * class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
           
            double prime_product = primeProduct(str);
            if (!map.containsKey(prime_product)) {
                map.put(prime_product, new ArrayList<>());
            }
            map.get(prime_product).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s){
        double result=1;
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};

        for(int i=0;i< s.length(); i++){
            char c=s.charAt(i);
            result=result*primes[c-'a'];

        }
        return result;

    }

}
 */