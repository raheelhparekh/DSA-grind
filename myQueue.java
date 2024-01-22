// Leetcode: https://leetcode.com/problems/implement-queue-using-stacks/description/
// 232. Implement Queue using Stacks
// push - O(1)
// pop - O(1) amortized
// peek - O(1) amortized
// empty - O(1) : empty when both stacks are empty
// Space: O(1): since given in question create queue using 2 stacks 

import java.util.Stack;

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();

    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */