package Basic;
/*
 * LeetCode: 1486. XOR Operation in an Array
 * Link: https://leetcode.com/problems/xor-operation-in-an-array/
 * TC: O(n)
 * SC: O(1)
 */

public class xor_operation_in_array {
    public int xorOperation(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= (start + (2 * i));
        }
        return a;

    }
}
