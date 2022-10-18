package medium21.merge_intervals;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest {
    @Test
    public void simple_test() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] arrays = mergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        int[][] expected = {{1,6},{8,10},{15,18}};
        Assert.assertArrayEquals(expected, arrays);
    }

    @Test
    public void simple_test_alt() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] arrays = mergeIntervals.merge(new int[][]{{1,4},{4,5}});
        int[][] expected = {{1,5}};
        Assert.assertArrayEquals(expected, arrays);
    }
}
