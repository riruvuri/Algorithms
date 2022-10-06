package easy13.queue_on_stack;

import org.junit.Assert;
import org.junit.Test;

public class SQueueTest {

    @Test
    public void simple_test() {
        SQueue sQueue = new SQueue();
        sQueue.push(3);
        sQueue.push(4);
        sQueue.push(5);

        Assert.assertTrue(sQueue.peek() == 3);
        Assert.assertTrue(sQueue.pop() == 3);
    }
}
