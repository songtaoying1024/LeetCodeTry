package Algorithm.medium.Stack;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example 1:
 *
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * Output
 * [null,null,null,null,-3,null,0,-2]
 *
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 *
 *
 * Constraints:
 *
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 *
 * 做法！！！！！看下一行
 * use two stacks.  one of them is used specifically to store the minimum value
 */
public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {


    }

    public void push(int x) {
        stack.push(x);
        if(min.empty()) min.push(x);
        else if(min.peek()>=x) min.push(x);
    }

    public void pop() {
        int popped = stack.pop();
        if(!min.empty()&&min.peek()==popped){
            min.pop();
        }

    }

    public int top() {
        return  stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
