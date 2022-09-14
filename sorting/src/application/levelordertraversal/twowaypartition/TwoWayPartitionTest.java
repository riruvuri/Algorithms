package application.levelordertraversal.twowaypartition;

import org.junit.Assert;
import org.junit.Test;

public class TwoWayPartitionTest {

    @Test
    public void test_simplePartition() {
        int[] arr = {1,2,3,4};

        TwoWayPartition twoWayPartition = new TwoWayPartition();
        int[] output = twoWayPartition.partition(arr);
        Assert.assertArrayEquals(new int[]{2,4,3,1}, output);
    }
}
