// Leetcode: https://leetcode.com/problems/min-stack/description/
// 155. Implement Min Stack
// push - O(1)
// pop - O(1) 
// peek - O(1) 
// Space: O(n) 
// Approach 1: Using 1 stack and 1 variable to store min value
import java.util.Stack;

class MinStack {
    Stack<Integer> s;
    int min;

    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
        s.push(min);

    }

    public void push(int val) {
        if (val <= min) {
            s.push(min);
            min = val;

        }
        s.push(val);

    }

    public void pop() {
        int popped = s.pop();
        if (popped == min) {
            min = s.pop();
        }
    }

    public int top() {
        return s.peek();

    }

    public int getMin() {
        return min;

    }
}

//Approach 2: Using 2 stacks

// class MinStack {
//     Stack<Integer> s;
//     Stack<Integer> minStack;
//     int min;

//     public MinStack() {
//         s = new Stack<>();
//         minStack = new Stack<>();
//         min = Integer.MAX_VALUE;
//         minStack.push(min);
//     }

//     public void push(int val) {
//         s.push(val);
//         min=Math.min(min,val);
//         minStack.push(min);

//     }

//     public void pop() {
//         s.pop();
//         minStack.pop();
//         min = minStack.peek();
//     }

//     public int top() {
//         return s.peek();

//     }

//     public int getMin() {
//         return min;

//     }
// }
