import java.util.Stack;
/*
 * Leetcode 232: Implement Queue using Stacks
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * Time Complexity: O(n) for push, O(1) for pop and peek
 * Space Complexity: O(n)
 */

public class implement_queues_using_stack {
    class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();

    }

    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }

    }

    public int pop() {
        return s1.pop();

    }

    public int peek() {
        return s1.peek();

    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
}
