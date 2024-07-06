package Math;
/*
 * Leetcode Problem: 2582 Pass the Pillow
 * Link: https://leetcode.com/problems/pass-the-pillow/
 * TC: O(1)
 * SC: O(1)
 * 
 * Input: n = 4, time = 5
    Output: 2
    Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
    After five seconds, the 2nd person is holding the pillow.

    Example 2:

    Input: n = 3, time = 2
    Output: 3
    Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
    After two seconds, the 3rd person is holding the pillow.

    Referred the soln--> Tricky part is to find the effective time in the oscillation cycle

 */

public class pass_pillow {
    public int passThePillow(int n, int time) {
        // Calculate the effective time in the oscillation cycle
        int cycleLength = 2 * (n - 1);
        int effectiveTime = time % cycleLength;

        // Determine the position based on effectiveTime
        if (effectiveTime < n) {
            // Moving forward direction
            return effectiveTime + 1;
        } else {
            // Moving backward direction
            return cycleLength - effectiveTime + 1;
        }
    }
}
