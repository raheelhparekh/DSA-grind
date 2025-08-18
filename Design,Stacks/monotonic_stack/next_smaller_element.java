package monotonic_stack;
import java.util.Stack;

/*
 * Problem : Next Smaller Element
 * Link : https://takeuforward.org/plus/dsa/problems/next-smaller-element
 * 
 */

public class next_smaller_element {
    public int[] nextSmallerElements(int[] arr) {
    // Your code goes here
    Stack<Integer> st = new Stack<>();

    int nse[] = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() >= arr[i]) {
        st.pop();
      }

      if (st.isEmpty()) {
        nse[i] = -1;
      } else {
        nse[i] = st.peek();
      }

      st.push(arr[i]);
    }

    return nse;
  }
}
