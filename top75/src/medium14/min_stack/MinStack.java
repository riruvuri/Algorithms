package medium14.min_stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    public MinStack() {

    }

    public void push(int val) {
        Stack<Integer> tempStack = new Stack<>();
        if (!stack.isEmpty() && stack.peek() < val) {
            tempStack.push(stack.pop());
        }

        stack.push(val);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.firstElement();
    }

    public int getMin() {
        return stack.peek();
    }
}
