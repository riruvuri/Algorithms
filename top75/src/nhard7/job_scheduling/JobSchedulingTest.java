package nhard7.job_scheduling;

import org.junit.Assert;
import org.junit.Test;

public class JobSchedulingTest {
    @Test
    public void simple_test() {
        JobScheduling jobScheduling = new JobScheduling();
        int maxProfit = jobScheduling.jobScheduling(new int[]{1,2,3,3},
                                        new int[]{3,4,5,6},
                                        new int[]{50,10,40,70});

        Assert.assertTrue(maxProfit == 120);
    }

    @Test
    public void simple_test_alt() {
        JobScheduling jobScheduling = new JobScheduling();
        int maxProfit = jobScheduling.jobScheduling(new int[]{1,2,3,4,6},
                new int[]{3,5,10,6,9},
                new int[]{20,20,100,70,60});

        Assert.assertTrue(maxProfit == 150);
    }
}
