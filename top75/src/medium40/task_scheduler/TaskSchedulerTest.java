package medium40.task_scheduler;

import org.junit.Assert;
import org.junit.Test;

public class TaskSchedulerTest {
    @Test
    public void simple_test() {
        TaskScheduler taskScheduler = new TaskScheduler();
        int result = taskScheduler.leastInterval(new char[]{'A','A','A','B','B','B'}, 2);

        Assert.assertTrue(result == 8);
    }

    @Test
    public void simple_test_alt() {
        TaskScheduler taskScheduler = new TaskScheduler();
        int result = taskScheduler.leastInterval(new char[]{'A','A','A','B','B','B'}, 0);

        Assert.assertTrue(result == 6);
    }
}
