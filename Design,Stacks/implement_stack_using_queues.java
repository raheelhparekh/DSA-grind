import java.util.LinkedList;
import java.util.Queue;

/*
 * Leetcode 225: Implement Stack using Queues
 * https://leetcode.com/problems/implement-stack-using-queues/
 * Time Complexity: O(n) for push, O(1) for pop and top
 * Space Complexity: O(n)
 */
public class implement_stack_using_queues {
    class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();

    }

    public void push(int x) {
        q.add(x);
        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll());
        }

    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();

    }
}
}
