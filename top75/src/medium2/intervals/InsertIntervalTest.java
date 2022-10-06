package medium2.intervals;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {

    @Test
    public void simple_test() {
        int[][] intervals = new int[][]{{1,3}, {6,9}};
        int[] newInterval = {2,5};
        InsertInterval insertInterval = new InsertInterval();
        int[][] result = insertInterval.insert(intervals, newInterval);
        Assert.assertArrayEquals(new int[][]{{1,5}, {6,9}}, result);
    }

    @Test
    public void simple_test_alt() {
        int[][] intervals = new int[][]{{1,2}, {3,5}, {6,7}, {8, 10}, {12,16}};
        int[] newInterval = {4,8};
        InsertInterval insertInterval = new InsertInterval();
        int[][] result = insertInterval.insert(intervals, newInterval);

    }
}
