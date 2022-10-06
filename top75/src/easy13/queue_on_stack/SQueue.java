package easy13.queue_on_stack;

import java.util.Stack;

public class SQueue {
    private Stack<Integer> data = new Stack<>();

    public void push(int x) {
        Stack<Integer> reverse = new Stack<>();
        while(!data.isEmpty()) {
            reverse.push(data.pop());
        }

        data.push(x);
        while(!reverse.isEmpty()) {
            data.push(reverse.pop());
        }
    }

    public int pop() {
        return data.pop();
    }

    public int peek() {
        return data.peek();
    }

    public boolean empty() {
        return data.isEmpty();
    }

}
