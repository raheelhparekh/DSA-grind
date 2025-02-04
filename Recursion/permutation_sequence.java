package Recursion;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode: 60. Permutation Sequence
 * Link: https://leetcode.com/problems/permutation-sequence/
 * Tc - O(n)*O(n) = O(n^2)
 * Sc - O(n)
 * 
 * Brute force- recursion,find all permutations, store in a data structure and sort it and return k-1 th element.
 * 
 * optimised way- maths logic used
 */

public class permutation_sequence {
    public String getPermutation(int n, int k) {

        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);

        }
        String ans = "";
        k = k - 1;
        numbers.add(n);

        while (true) {
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);
            k = k % fact;

            if (numbers.size() == 0) {
                break;
            }
            fact = fact / numbers.size();

        }
        return ans;

    }
}
