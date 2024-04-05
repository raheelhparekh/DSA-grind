import java.util.Stack;
/*
 * Leetcode 1544. Make The String Great
 * https://leetcode.com/problems/make-the-string-great/
    TC: O(N) where N is the length of the string
    SC: O(N)
    Input: s = "leEeetcode"
    Output: "leetcode"

    Input: s = "abBAcC"
    Output: ""

    Approach:  Using Stacks
    1. We will push the first character of the string into the stack.
    2. We will iterate through the string and check if the top of the stack and the current character are same but differ by 32.
    3. If they are same, we will pop the top of the stack.
    4. If they are not same, we will push the current character into the stack.
    5. Finally, we will pop all the elements from the stack and return the string.
    

 */

public class make_string_great {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        String ans = "";
        st.push(s.charAt(0));
        char[] arr = s.toCharArray();
        for (int i = 1; i < n; i++) {
            if (!st.isEmpty() && (st.peek() - arr[i] == 32 || st.peek() - arr[i] == -32)) {
                st.pop();
            } else {
                st.push(arr[i]);
            }

        }
        while (!st.empty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}
