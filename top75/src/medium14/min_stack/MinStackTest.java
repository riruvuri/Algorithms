package medium14.min_stack;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {
    @Test
    public void simple_test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        int min = minStack.getMin();
        Assert.assertTrue(min == -3);

        minStack.pop();
        int top = minStack.top();
        Assert.assertTrue(top == 0);

        Assert.assertTrue(minStack.getMin() == -2);
    }
}
